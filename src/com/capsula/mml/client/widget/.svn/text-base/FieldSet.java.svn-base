package com.capsula.mml.client.widget;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

public class FieldSet extends ComplexPanel {

	private Element legendElem;

	public FieldSet () {
		setElement(Document.get().createFieldSetElement());
	}
	
	public FieldSet(String legend) {
		this();
		setLegend(legend);
	}
	
	public void setLegend(String legend) {
		if (legendElem == null || !getElement().isOrHasChild(legendElem)) {
			legendElem = Document.get().createLegendElement();
			getElement().insertBefore(legendElem, getElement().getFirstChild());
		}
		legendElem.setInnerText(legend);
	}

	@Override
	public void add(Widget child) {
		add(child, getElement());
	}
	
	public void add(String label, Widget child) {
		add(new FieldLabel(label), getElement());
		add(child, getElement());
	}
	
	private class FieldLabel extends Widget {
		FieldLabel (String label) {
			setElement(Document.get().createLabelElement());
			getElement().setInnerText(label);
		}
	}
}
