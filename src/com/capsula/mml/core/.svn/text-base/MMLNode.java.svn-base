/**
 * 
 */
package com.capsula.mml.core;

import java.util.ArrayList;
import java.util.List;

public class MMLNode {
	private Tag tag;
	private String id;
	private List<String> classes;
	private List<Property> properties;
	private StringBuffer innerHtml;
	private List<MMLNode> children;
	
	public MMLNode(Tag tag) {
		this.tag = tag;
		this.classes = new ArrayList<String>();
		this.children = new ArrayList<MMLNode>();
		this.properties = new ArrayList<Property>();
		this.innerHtml = new StringBuffer();
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Tag getTag() {
		return tag;
	}
	
	public List<String> getClasses() {
		return classes;
	}
	
	public void addClass (String styleClass) {
		this.classes.add(styleClass);
	}
	
	public List<MMLNode> getChildren() {
		return children;
	}
	
	public void addChild (MMLNode newChild) {
		this.children.add(newChild);
	}
	
	public String getInnerHtml() {
		return innerHtml.toString();
	}
	
	public void appendText (String text) {
		innerHtml.append(text);
	}

	public List<Property> getProperties() {
		return properties;
	}
	
	public void addProperty (Property newProp) {
		this.properties.add(newProp);
	}
	
	public void accept(MMLVisitor visitor) {
		switch(tag) {
		case DIV:
			visitor.visitDiv(this); break;
		case SPAN:
			visitor.visitSpan(this); break;
		case PARAGRAPH:
			visitor.visitParagraph(this); break;
		case ANCHOR:
			visitor.visitAnchor(this); break;
		case FORM:
			visitor.visitForm(this); break;
		case FIELDSET:
			visitor.visitFieldset(this); break;
		case STRONG:
			visitor.visitStrong(this); break;
		case EMPHASIS:
			visitor.visitEmphasis(this); break;
		case H1:
			visitor.visitHeader(1, this); break;
		case H2:
			visitor.visitHeader(2, this); break;
		case H3:
			visitor.visitHeader(3, this); break;
		case H4:
			visitor.visitHeader(4, this); break;
		case H5:
			visitor.visitHeader(5, this); break;
		case H6:
			visitor.visitHeader(6, this); break;
		case UL:
			visitor.visitList(false, this); break;
		case LI:
			visitor.visitListItem(this); break;
		case INPUT:
			String widget = getProperty("widget");
			if (widget == null) {
				visitor.visitInput(this);
			} else if (widget.equals("radio")) {
				visitor.visitRadioButton(this);
			} else if (widget.equals("check")) {
				visitor.visitCheckBox(this);
			} else {
				visitor.visitWidget(this, widget);
			}
			break;
		}
	}
	
	public String getProperty(String propertyName) {
		String value = null;
		for (Property prop : properties) {
			if (prop.getName().equals(propertyName)) {
				value = prop.getValue();
			}
		}
		return value;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.getTag());
		if(this.getId() != null) {
			buffer.append("#");
			buffer.append(this.getId());
		}
		buffer.append(printStyles(this));
		buffer.append(" \"");
		buffer.append(this.getInnerHtml());
		buffer.append("\"");
		return buffer.toString();
	}

	private String printStyles(MMLNode node) {
		String styleNames = "";
		for (String styleName : node.getClasses()) {
			styleNames += "." + styleName; 
		}
		return styleNames;
	}
	
	public static class Property {
		private String name;
		private String value;
		
		public Property(String name, String value) {
			this.name = name;
			this.value = value;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
}