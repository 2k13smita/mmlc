package com.capsula.mml.client.widget;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

public class Paragraph extends ComplexPanel {

	public Paragraph() {
		setElement(Document.get().createPElement());
	}

	public Paragraph(String text) {
		this();
		setText(text);
	}

	public Paragraph(String text, boolean asHtml) {
		this();
		setText(text, asHtml);
	}
	
	public Paragraph(String text, String id){
		this(text);
		this.getElement().setId(id);
	}

	public Paragraph(Widget w) {
		this();
		add(w);
	}
	
	public void setText(String text) {
		setText(text, false);
	}

	public void setText(String text, boolean asHtml) {
		if (asHtml) {
			getElement().setInnerHTML(text);
		} else {
			getElement().setInnerText(text);
		}
	}
	
	public void add(Widget child) {
		add(child, getElement());
	}

}
