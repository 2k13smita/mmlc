package com.capsula.mml.client.widget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public class Header extends Panel {

	private Widget widget;
	
	public Header(int level) {
		setElement(Document.get().createHElement(level));
	}

	public Header(int level, Widget child) {
		this(level);
		setWidget(child);
	}

	public Header (int level, String text) {
		this(level);
		setText(text);
	}

	public void setText(String text) {
		getElement().setInnerText(text);
	}
	
	public void add(Widget w) {
		setWidget(w);
	}
	
	public void setWidget(Widget newChild) {
	    // Validate
	    if (newChild == widget) {
	      return;
	    }

	    // Detach new child.
	    if (newChild != null) {
	      newChild.removeFromParent();
	    }

	    // Remove old child.
	    if (widget != null) {
	      remove(widget);
	    }

	    // Logical attach.
	    widget = newChild;

	    if (newChild != null) {
	      // Physical attach.
	      DOM.appendChild(getElement(), widget.getElement());

	      adopt(newChild);
	    }

	}

	public boolean remove(Widget child) {
	    // Validate.
	    if (widget != child) {
	      return false;
	    }

	    // Orphan.
	    orphan(child);

	    // Physical detach.
	    getElement().removeChild(child.getElement());

	    // Logical detach.
	    widget = null;
	    return true;
	}

	public Iterator<Widget> iterator() {
		List<Widget> l = new ArrayList<Widget>();
		if (widget != null) {
			l.add(widget);
		}
		return l.iterator();
	}
}
