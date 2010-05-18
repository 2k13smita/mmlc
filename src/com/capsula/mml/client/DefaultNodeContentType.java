package com.capsula.mml.client;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface DefaultNodeContentType {

	NodeContentType value() default NodeContentType.I18N;
	
}
