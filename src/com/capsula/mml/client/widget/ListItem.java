/**
 * 
 */
package com.capsula.mml.client.widget;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

public class ListItem extends ComplexPanel {

	public ListItem () {
		setElement(Document.get().createLIElement());
	}

	public ListItem (String text) {
		this();
		getElement().setInnerText(text);
	}

	
	public ListItem (Widget w) {
		this();
		add(w, getElement());
	}
	
	public ListItem (Widget ... ws) {
		this();
		for (Widget w : ws) {
			add(w, getElement());
		}
	}
	
	public void add (Widget w) {
		add(w, getElement());
	}
}