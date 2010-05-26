package com.capsula.mml.rebind;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.capsula.mml.client.Bound;
import com.capsula.mml.client.DefaultNodeContentType;
import com.capsula.mml.client.NodeContentType;
import com.capsula.mml.client.WidgetClass;
import com.capsula.mml.client.WidgetPackages;
import com.capsula.mml.core.MHTMLLexer;
import com.capsula.mml.core.MHTMLParser;
import com.capsula.mml.core.MMLNode;
import com.google.gwt.core.ext.BadPropertyValueException;
import com.google.gwt.core.ext.ConfigurationProperty;
import com.google.gwt.core.ext.Generator;
import com.google.gwt.core.ext.GeneratorContext;
import com.google.gwt.core.ext.PropertyOracle;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.TreeLogger.Type;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.core.ext.typeinfo.JField;
import com.google.gwt.core.ext.typeinfo.JMethod;
import com.google.gwt.core.ext.typeinfo.JParameter;
import com.google.gwt.core.ext.typeinfo.JParameterizedType;
import com.google.gwt.core.ext.typeinfo.JType;
import com.google.gwt.core.ext.typeinfo.NotFoundException;
import com.google.gwt.core.ext.typeinfo.TypeOracle;
import com.google.gwt.user.rebind.ClassSourceFileComposerFactory;
import com.google.gwt.user.rebind.SourceWriter;

public class MMLFactoryGenerator extends Generator {

	/** Simple name of class to be generated */
	private String className = null;

	/** Package name of class to be generated */
	private String packageName = null;
	
	/** Fully qualified class name passed into GWT.create() */
	private String typeName = null;

	/** Methods in source interface */
	private JMethod[] classMethods;

	// inherited generator method
	public String generate(TreeLogger logger, GeneratorContext context,
			String typeName) throws UnableToCompleteException {
		
		this.typeName = typeName;
		TypeOracle typeOracle = context.getTypeOracle();
		
		try {
			// get classType and save instance variables
			JClassType classType = typeOracle.getType(typeName);
			packageName = classType.getPackage().getName();
			className = classType.getSimpleSourceName() + "Wrapper";
			classMethods = classType.getMethods();
			
			// Generate class source code
			generateClass(logger, context);
		} catch (Exception e) {
			// record to logger that Map generation threw an exception
			logger.log(TreeLogger.ERROR, "PropertyMap ERROR!!!", e);
		}
		// return the fully qualifed name of the class generated
		return packageName + "." + className;
	}

	private void generateClass(TreeLogger logger, GeneratorContext context) throws NotFoundException {
        // get print writer that receives the source code 
        PrintWriter printWriter = null; 
        printWriter = context.tryCreate(logger, packageName, className); 
        // print writer if null, source code has ALREADY been generated, return 
        if (printWriter == null) return; 
        // init composer, set class properties, create source writer	 
        ClassSourceFileComposerFactory composer = null; 
        composer = new ClassSourceFileComposerFactory(packageName, className);
        composer.addImplementedInterface(typeName);
        
        addImports(logger, context, composer);

		SourceWriter sourceWriter = null; 
        sourceWriter = composer.createSourceWriter(context, printWriter);
        
		classPrologue(logger, context, sourceWriter);

        generateMethods(logger, context, sourceWriter); 
        
        // close generated class 
        sourceWriter.outdent(); 
        sourceWriter.println("}"); 
        // commit generated class 
        context.commit(logger, printWriter); 
	}
	
	private void addImports(TreeLogger logger,
			GeneratorContext context, ClassSourceFileComposerFactory composer) throws NotFoundException {
		TypeOracle typeOracle = context.getTypeOracle();
		JClassType classType = typeOracle.getType(typeName);
		WidgetPackages widgetPackages = classType.getAnnotation(WidgetPackages.class);
		String[] packageNames = {};
		if (widgetPackages != null) {
			packageNames = widgetPackages.value();
		}
		
		composer.addImport("com.google.gwt.user.client.ui.*");
		composer.addImport("com.google.gwt.core.client.*");
		composer.addImport("com.capsula.mml.client.*");
		composer.addImport("com.capsula.mml.client.widget.*");
		for (String packageName : packageNames) {
			composer.addImport(packageName +	".*");
		}
	}

	private void classPrologue(TreeLogger logger, GeneratorContext context,
			SourceWriter sourceWriter) {
		PropertyOracle propOracle = context.getPropertyOracle();
		try {
			ConfigurationProperty msgSourceClass = propOracle.getConfigurationProperty("i18nSource");
			String msgSourceClassName = msgSourceClass.getValues().get(0);
			sourceWriter.println("private final " + msgSourceClassName + " WM = GWT.create(" + msgSourceClassName + ".class);");
		} catch (BadPropertyValueException e) {
			logger.log(Type.WARN,
					"No internationalization source set. " +
					"Use @DefaultNodeContentType(NodeContentType.TEXT) to avoid errors " +
					"or set i18nsource property on your module file.");
		}
	}

	private void generateMethods(TreeLogger logger,GeneratorContext context, SourceWriter sourceWriter) {
		Map<String, WidgetClass> externalWidgets = getExternalWidgets(context, logger);
		
		 // init resource bundle 
        ResourceBundle bundle = ResourceBundle.getBundle(typeName); 

        for (Enumeration<String> keys = bundle.getKeys(); 
                    keys.hasMoreElements();) { 
        	String key = keys.nextElement(); 
        	
        	JMethod method = null;
        	for(JMethod tmpMethod : classMethods) {
        		if (tmpMethod.getName().equals(key)) {
        			method = tmpMethod;
        			break;
        		}
        	}
        	if (method == null) {
        		logger.log(TreeLogger.ERROR, "No corresponding method found for template " + key);
        	} else {
        		JClassType typeArg = getTypeArgument(method);
        		List<JField> fieldsToBind = null;
        		if (typeArg != null) {
        			fieldsToBind = getBoundFields(typeArg);
        		}
        		
        		DefaultNodeContentType nodeContentType = method.getAnnotation(DefaultNodeContentType.class);
        		NodeContentType contentType = NodeContentType.TEXT;
        		if (nodeContentType != null) {
        			contentType = nodeContentType.value();
        		}
        		
        		generateMethod(logger, sourceWriter, bundle, key, method,
						typeArg, fieldsToBind, contentType, externalWidgets); 
        	}
        	
        } 
	}

	private Map<String, WidgetClass> getExternalWidgets(GeneratorContext context, TreeLogger logger) {
		Map<String, WidgetClass> externalWidgets = new HashMap<String, WidgetClass>();
		PropertyOracle propOracle = context.getPropertyOracle();
		try {
			ConfigurationProperty msgSourceClass = propOracle.getConfigurationProperty("widgetFactory");
			String msgSourceClassName = msgSourceClass.getValues().get(0);
			JClassType widgetFactory = context.getTypeOracle().getType(msgSourceClassName);
			for(JMethod method : widgetFactory.getMethods()){
				String widgetName = method.getName();
				WidgetClass annotation = method.getAnnotation(WidgetClass.class);
				if (annotation != null) {
					externalWidgets.put(widgetName, annotation);
				}
			}
			
		} catch (BadPropertyValueException e) {
			logger.log(Type.WARN, "No widgetFactory set. You will not be able to instantiate external widgets.");
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return externalWidgets;
	}

	private JClassType getTypeArgument(JMethod method) {
		JType returnType = method.getReturnType();
		JParameterizedType parameterizedType = returnType.isParameterized();

		JClassType typeArg = null;
		if (parameterizedType != null) {
			typeArg = parameterizedType.getTypeArgs()[0];
		}
		return typeArg;
	}

	private List<JField> getBoundFields(JClassType typeArg) {
		List<JField> fieldsToBind = new ArrayList<JField>();
		for(JField field : typeArg.getFields()){
			Bound binded = field.getAnnotation(Bound.class);
			if (binded != null) {
				fieldsToBind.add(field);
			}
		}
		return fieldsToBind;
	}

	private void generateMethod(TreeLogger logger, SourceWriter sourceWriter,
			ResourceBundle bundle, String key, JMethod method,
			JClassType typeArg, List<JField> fieldsToBind,
			NodeContentType contentType, Map<String, WidgetClass> externalWidgets) {
		sourceWriter.print("public TemplateWidget");
		if (typeArg != null) {
			sourceWriter.print("<");
			sourceWriter.print(typeArg.getSimpleSourceName()); 
			sourceWriter.print(">"); 
		}
		sourceWriter.print(" "); 
		sourceWriter.print(Generator.escape(key)); 
		sourceWriter.print(" (");
		printParameters(sourceWriter, method);
		sourceWriter.println(") {"); 
		sourceWriter.indent();
		try {
			String mmlCode = bundle.getString(key);
			MMLNode mmlRoot = parse(mmlCode); 
			
			String typeArgClassName = typeArg != null ? typeArg.getSimpleSourceName() : null;
			MMLStatementGenerator visitor = new MMLStatementGenerator(
					sourceWriter, typeArgClassName,
					fieldsToBind, contentType, externalWidgets);
			mmlRoot.accept(visitor);
			sourceWriter.println("return root;");
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(TreeLogger.ERROR, "Could not parse MML code. Reason: " + e.getMessage());
		}
		sourceWriter.outdent(); 
		sourceWriter.println("}");
	}

	private MMLNode parse(String mmlCode) throws RecognitionException {
		MHTMLLexer lexer = new MHTMLLexer(new ANTLRStringStream(mmlCode));
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		MHTMLParser parser = new MHTMLParser(tokenStream);
		parser.node();
		MMLNode mmlRoot = parser.getRoot();
		return mmlRoot;
	}

	private void printParameters(SourceWriter sourceWriter, JMethod method) {
		JParameter[] parameters = method.getParameters();
		for (int paramCount = 0; paramCount < parameters.length; paramCount++) {
			JParameter param = parameters[paramCount];
			sourceWriter.print(param.getType().getQualifiedSourceName());
			sourceWriter.print(" param");
			sourceWriter.print(String.valueOf(paramCount));
			if (paramCount < parameters.length - 1) {
				sourceWriter.print(", ");
			}
		}
	}

}
