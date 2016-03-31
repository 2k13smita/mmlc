Let's resume from the example used on the [about](AboutMMLC.md) page. We have three files in our project and, when we run it, a `<div>` with the specified properties is added to the page.

MyWidgets.java: the interface.
```
public interface MyWidgets extends WidgetBuilder {

   TemplateWidget aNotSoMeaningfulPanel();

}
```

MyWidgets.properties: the properties file.
```
aNotSoMeaningfulPanel=<div id="xyz" class="abc def"></div>
```

MyEntryPoint.java: where we actually use our widget.
```
public class MyEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		MyWidgets mw = GWT.create(MyWidgets.class);
		RootPanel.get().add(mw.aNotSoMeaningfulPanel());
	}

}
```

#### Adding handlers to widgets ####

Let's add a clickable link inside this panel, and try to make it a little more meaningful. To do this, we add an `<a>` node inside the `div`, and give it an unique `id`. After instantiating the widget, we retrieve the node by the id, and add the desired `ClickHandler` to it.

So, our interface remains unchanged (unless you'd like to rename the widget).
```
public interface MyWidgets extends WidgetBuilder {

   TemplateWidget aNotSoMeaningfulPanel();

}
```

In the properties file, we need to add the link with the specified id.
```
aNotSoMeaningfulPanel=<div id="xyz" class="abc def"><a id="clickable-link">Click Me!</a></div>
```

Finally, after the widget instantiation, we pick it by the id, and add the desired behaviour:
```
public class MyEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		MyWidgets mw = GWT.create(MyWidgets.class);
		TemplateWidget panel = mw.aNotSoMeaningfulPanel()
		RootPanel.get().add(panel);

		Anchor link = (Anchor) panel.getChildById("clickable-link");
		link.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Hey! Don't click me, bro!");
			}
		});
	}

}
```

Simple, isn't it? But that's not all.

#### It gets even better! ####
The MMLc is best used when developing large but light-weight pages. And on large pages, there must be LOTS of widgets to which you might need to add all kinds of handlers. In that case, fetching all these widgets by the id gets cumbersome, ugly, dislikable in every sense.

There's [a solution](BindingWidgets.md), though.