package com.capsula.mml.client.widget;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;


public class HTMLList extends ComplexPanel {

	public HTMLList() {
		this(false);
	}
	
	public HTMLList(boolean ordered) {
		Element root = (ordered ? Document.get().createOLElement() : Document.get().createULElement());
		setElement(root);
	}

	public void addListItem(ListItem li) {
		add(li, getElement());
	}
	
	public void add(Widget w) {
		addListItem(wrapListItem(w));
	}

	private ListItem wrapListItem(Widget w) {
		ListItem li = null;
		if (w instanceof ListItem) {
			li = (ListItem) w;
		} else {
			li = new ListItem(w);
		}
		return li;
	}
	
	public void add(Widget w, String style) {
		ListItem li = wrapListItem(w);
		li.setStyleName(style);
		addListItem(li);
	}
	
	public void add(Widget ... w) {
		addListItem(new ListItem(w));
	}
}
