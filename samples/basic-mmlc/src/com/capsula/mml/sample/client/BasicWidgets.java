package com.capsula.mml.sample.client;

import com.capsula.mml.client.DefaultNodeContentType;
import com.capsula.mml.client.NodeContentType;
import com.capsula.mml.client.TemplateWidget;
import com.capsula.mml.client.WidgetBuilder;

public interface BasicWidgets extends WidgetBuilder {

	@DefaultNodeContentType(NodeContentType.TEXT)
	TemplateWidget helloWorld();
	
}
