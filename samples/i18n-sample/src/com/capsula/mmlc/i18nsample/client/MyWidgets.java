package com.capsula.mmlc.i18nsample.client;

import com.capsula.mml.client.DefaultNodeContentType;
import com.capsula.mml.client.NodeContentType;
import com.capsula.mml.client.TemplateWidget;
import com.capsula.mml.client.WidgetBuilder;

public interface MyWidgets extends WidgetBuilder {

	@DefaultNodeContentType(NodeContentType.I18N)
	TemplateWidget mainMenu();
	
}
