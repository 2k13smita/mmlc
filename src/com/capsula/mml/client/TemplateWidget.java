package com.capsula.mml.client;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class TemplateWidget<T> extends Composite  {
	
	private Map<String, Widget> idToWidgetMap;
	private Map<String, Widget> fieldToWidgetMap;
	
	public TemplateWidget (Widget w) {
		idToWidgetMap = new HashMap<String, Widget>();
		fieldToWidgetMap = new HashMap<String, Widget>();
		initWidget(w);
	}
	
	public void addChild (Widget w) {
		String id = w.getElement().getId();
		if(id != null && !id.isEmpty()) {
			idToWidgetMap.put(id, w);
		}
	}
	
	public void addBindedWidget(String fieldName, Widget w) {
		fieldToWidgetMap.put(fieldName, w);
	}
	
	public Widget getChildById (String id) {
		return idToWidgetMap.get(id);
	}
	
	public Widget getChildByField (String field) {
		return fieldToWidgetMap.get(field);
	}
	
	public Widget getRoot () {
		return this.getWidget();
	}

	public void bind(T target) {
		
	}
}
