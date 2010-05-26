package com.capsula.mmlc.i18nsample.client;

import com.capsula.mml.client.TemplateWidget;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class I18nSample implements EntryPoint {

	@Override
	public void onModuleLoad() {
		MyWidgets mw = GWT.create(MyWidgets.class);
		TemplateWidget mainMenu = mw.mainMenu();
		RootPanel.get().add(mainMenu);
	}


}
