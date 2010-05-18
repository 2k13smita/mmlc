package com.capsula.mml.rebind;

import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.capsula.mml.client.NodeContentType;
import com.capsula.mml.client.WidgetClass;
import com.capsula.mml.core.MMLNode;
import com.capsula.mml.core.MMLVisitor;
import com.google.gwt.core.ext.typeinfo.JField;
import com.google.gwt.user.rebind.SourceWriter;

public class MMLStatementGenerator implements MMLVisitor {

	private int varCount;
	private SourceWriter sourceWriter;
	private Stack<String> parents;
	private String bindedTypeName;
	private List<JField> fields;
	private NodeContentType nodeContentType;
	private Map<String, WidgetClass> externalWidgets;

	public MMLStatementGenerator(SourceWriter writer) {
		this.sourceWriter = writer;
		this.parents = new Stack<String>();
	}
	
	public MMLStatementGenerator(SourceWriter writer, String bindedType,
			List<JField> fields, NodeContentType contentType,
			Map<String, WidgetClass> externalWidgets) {
		this(writer);
		this.bindedTypeName = bindedType;
		this.fields = fields;
		this.nodeContentType = contentType;
		this.externalWidgets = externalWidgets;
	}
	
	@Override
	public void visitAnchor(MMLNode node) {
		defaultNodeGeneration(node, "Anchor");
	}

	@Override
	public void visitDiv(MMLNode node) {
		defaultNodeGeneration(node, "FlowPanel");
	}

	@Override
	public void visitEmphasis(MMLNode node) {
		node.addClass("emphasis");
		defaultNodeGeneration(node, "InlineHTML");
	}

	@Override
	public void visitFieldset(MMLNode node) {
		defaultNodeGeneration(node, "FieldSet");
	}

	@Override
	public void visitForm(MMLNode node) {
		defaultNodeGeneration(node, "FormPanel");
	}

	@Override
	public void visitParagraph(MMLNode node) {
		defaultNodeGeneration(node, "Paragraph");
	}

	@Override
	public void visitSpan(MMLNode node) {
		defaultNodeGeneration(node, "InlineHTML");
	}
	
	@Override
	public void visitInput(MMLNode node) {
		String varName = defaultNodeGeneration(node, "TextBox");
		emitSetEnabled(node, varName);
	}

	@Override
	public void visitStrong(MMLNode node) {
		node.addClass("strong");
		defaultNodeGeneration(node, "InlineHTML");
	}
	
	@Override
	public void visitHeader(int i, MMLNode node) {
		defaultNodeGeneration(node, "Header", "new Header(" + i + ")");
	}
	
	@Override
	public void visitRadioButton(MMLNode node) {
		String name = node.getProperty("name");
		String label = node.getInnerHtml();
		String widgetInstantiation;
		if (label == null || label.isEmpty()) {
			widgetInstantiation = "new RadioButton(\"" + name + "\")"; 
		} else {
			widgetInstantiation = "new RadioButton(\"" + name + "\", WM." + label + "())"; 
		}
		String varName = defaultNodeGeneration(node, "RadioButton", widgetInstantiation, false);
		
		emitSetValue(node, varName);
	}
	
	@Override
	public void visitCheckBox(MMLNode node) {
		String label = node.getInnerHtml();
		String widgetInstantiation;
		if (label == null || label.isEmpty()) {
			widgetInstantiation = "new CheckBox()"; 
		} else {
			widgetInstantiation = "new CheckBox(WM." + label + "())"; 
		}
		String varName = defaultNodeGeneration(node, "CheckBox", widgetInstantiation, false);
		emitSetValue(node, varName);
	}
	
	@Override
	public void visitList(boolean ordered, MMLNode node) {
		defaultNodeGeneration(node, "HTMLList");
	}
	
	@Override
	public void visitListItem(MMLNode node) {
		defaultNodeGeneration(node, "ListItem");
	}
	
	@Override
	public void visitWidget(MMLNode mmlNode, String widget) {
		WidgetClass externalDef = externalWidgets.get(widget);
		String widgetClass = externalDef.value();
		String widgetInstantiation = externalDef.instantiation();
		boolean shouldEmitText = externalDef.shouldEmitText();
		widgetInstantiation = widgetInstantiation.replaceAll("\\{innerHtml\\}", mmlNode.getInnerHtml());
		defaultNodeGeneration(mmlNode, widgetClass, widgetInstantiation, shouldEmitText);
	}
	
	private String defaultNodeGeneration(MMLNode node, String widgetClass) {
		String widgetInstantiation = "new " + widgetClass + "()";
		return defaultNodeGeneration(node, widgetClass, widgetInstantiation);
	}

	private String defaultNodeGeneration(MMLNode node, String widgetClass,
			String widgetInstantiation) {
		return defaultNodeGeneration(node, widgetClass, widgetInstantiation,
				true);
	}

	private String defaultNodeGeneration(MMLNode node, String widgetClass,
			String widgetInstantiation, boolean shouldEmitText) {
		String varName = nextVarName();
		sourceWriter.println(widgetClass + " " + varName + " = " + widgetInstantiation + ";");
		emitAddToParent(varName);
		emitSetId(node, varName);
		emitAddStyleCommands(node, varName);
		emitPropertyAsWM(node, varName, "title");
		if (shouldEmitText) {
			emitText(node, varName);
		}
		sourceWriter.println("root.addChild(" + varName + ");");
		emitAddBindedWidget(node, varName);
		visitChildren(node, varName);
		return varName;
	}

	private void emitAddBindedWidget(MMLNode node, String varName) {
		String fieldName = node.getProperty("field");
		if (fieldName != null && !fieldName.isEmpty()) {
			sourceWriter.println("root.addBindedWidget(\"" + fieldName + "\", " + varName + ");");
		}
	}

	private void emitPropertyAsWM(MMLNode node, String varName,
			String propertyName) {
		emitProperty(varName, propertyName, node.getProperty(propertyName), "WM." + node.getProperty(propertyName) + "()");
	}
	
	private void emitSetValue(MMLNode node, String varName) {
		String value = node.getProperty("value");
		if(value != null && !value.isEmpty()) {
			sourceWriter.println(varName + ".setValue(" + value + ");");
		}
	}
	
	private void emitSetEnabled(MMLNode node, String varName) {
		String value = node.getProperty("enabled");
		if(value != null && !value.isEmpty()) {
			sourceWriter.println(varName + ".setEnabled(" + value + ");");
		}
	}

	private void emitProperty(String varName, String propertyName,
			String propertyValue, String outputValue) {
		if (propertyValue != null && !propertyValue.isEmpty()) {
			sourceWriter.println(varName + ".getElement().setPropertyString(\"" + propertyName + "\", " + outputValue + ");");
		}
	}

	private void emitAddToParent(String varName) {
		if (!parents.isEmpty()) {
			sourceWriter.println(parents.peek() + ".add(" + varName + ");");
		} else {
			if (fields == null || fields.isEmpty()) {
				if (bindedTypeName != null) {
					sourceWriter.println("TemplateWidget<" +
							bindedTypeName +
							"> root = new TemplateWidget<" +
							bindedTypeName +
							">(" + varName + ");");
				} else {
					sourceWriter.println(
							"TemplateWidget root = new TemplateWidget(" + varName + ");");
				}
			} else {
				sourceWriter.println("TemplateWidget<" +
						bindedTypeName +
						"> root = new TemplateWidget<" +
						bindedTypeName +
						">(" + varName + ") {");
				sourceWriter.indent();
				sourceWriter.print("public void bind (");
				sourceWriter.print(bindedTypeName);
				sourceWriter.println(" target) {");
				sourceWriter.indent();
				for (JField field : fields) {
					sourceWriter.print("target.");
					sourceWriter.print(field.getName());
					sourceWriter.print(" = (");
					sourceWriter.print(field.getType().getSimpleSourceName());
					sourceWriter.print(") getChildByField(\"");
					sourceWriter.print(field.getName());
					sourceWriter.println("\");");
				}
				
				sourceWriter.outdent();
				sourceWriter.println("}");
				sourceWriter.outdent();
				sourceWriter.println("};");
			}
		}
	}

	private void emitText(MMLNode node, String varName) {
		NodeContentType contentType = getContentType(node);
		String innerHtml = node.getInnerHtml();
		if (innerHtml != null && !innerHtml.isEmpty()) {
			if (contentType == NodeContentType.TEXT) {
				sourceWriter.println(varName + ".getElement().setInnerText(\"" + innerHtml + "\");");
			} else if (contentType == NodeContentType.I18N) {
				sourceWriter.println(varName + ".getElement().setInnerHTML(WM." + innerHtml + "());");
			} else if (contentType == NodeContentType.PARAM) {
				sourceWriter.println(varName + ".getElement().setInnerText(" + innerHtml + ");");
			}
		}
	}

	private NodeContentType getContentType(MMLNode node) {
		NodeContentType value = (this.nodeContentType != null ? this.nodeContentType : NodeContentType.I18N);
		String typeParam = node.getProperty("as");
		if (typeParam != null) {
			if (typeParam.equals("text")) {
				value = NodeContentType.TEXT;
			} else if (typeParam.equals("WM")) {
				value = NodeContentType.I18N;
			} else if (typeParam.equals("param")) {
				value = NodeContentType.PARAM;
			}
		}
		return value;
	}
	
	private void visitChildren(MMLNode node, String varName) {
		sourceWriter.println("//adding " + varName + " to the stack.");
		parents.add(varName);
		for (MMLNode child : node.getChildren()) {
			child.accept(this);
		}
		sourceWriter.println("//popping " + parents.peek() + " from the stack.");
		parents.pop();
	}

	private void emitSetId(MMLNode node, String varName) {
		if(node.getId() != null && !node.getId().isEmpty()) {
			sourceWriter.println(varName + ".getElement().setId(\"" + node.getId() + "\");");
		}
	}

	private void emitAddStyleCommands(MMLNode node, String varName) {
		if (node.getClasses() != null) {
			for (String styleName : node.getClasses()) {
				sourceWriter.println(varName + ".addStyleName(\"" + styleName + "\");");
			}
		}
	}
	
	private String nextVarName() {
		return "var"+varCount++;
	}

}
