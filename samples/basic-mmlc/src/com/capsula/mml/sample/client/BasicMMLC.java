package com.capsula.mml.sample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class BasicMMLC implements EntryPoint {

	@Override
	public void onModuleLoad() {
		BasicWidgets bw = GWT.create(BasicWidgets.class);
		RootPanel.get().add(bw.helloWorld());
	}

}
