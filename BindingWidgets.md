Let's pick up now from where we ended in the [practical MML](PracticalMML.md) page.

MyWidgets.java:
```
public interface MyWidgets extends WidgetBuilder {

   TemplateWidget aNotSoMeaningfulPanel();

}
```

MyWidgets.properties:
```
aNotSoMeaningfulPanel=<div id="xyz" class="abc def"><a id="clickable-link">Click Me!</a></div>
```

And MyEntryPoint.java, where the action begins:
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

### Quick Q&A ###
**Question:** if I have lots of widgets whose behaviour I need to define, will I need to add an id to each one of them, and fetch them all before I can refer to them?

**Answer:** No! Keep reading and we'll tell you.

### Binding widgets ###
Through a merely declarative mechanism, you can bind widgets defined in MML code to fields in any other object. Here's everything you need to do:
  * In the interface, add the class which fields are to be bound as a type argument to the `TemplateWidget`. In our example, this class is the MyEntryPoint - so, we rewrite the method definition in the interface as:
```
public interface MyWidgets extends WidgetBuilder {

   TemplateWidget<MyEntryPoint> aNotSoMeaningfulPanel();

}
```

  * In the properties file, we add a `field` property to the widget that will be bound. The value of this property must be the name of the field to which the widget will be bound. We can even remove the id, now.
```
aNotSoMeaningfulPanel=<div id="xyz" class="abc def"><a field="clickableLink">Click Me!</a></div>
```

  * Finally, in the MyEntryPoint class, we add a field of the type `Anchor` and with the name we put on the `field` property. To this field we add the `@Bound` annotation. **Important: the field must not be private**.

After that, we can replace our call (or calls) to getChildById to a call to `panel.bind(this)`. This method will bind every field that has the `@Bound` annotation to a widget with the corresponding `field` value.

```
public class MyEntryPoint implements EntryPoint {

	@Bound Anchor clickableField;

	@Override
	public void onModuleLoad() {
		MyWidgets mw = GWT.create(MyWidgets.class);
		TemplateWidget<MyEntryPoint> panel = mw.aNotSoMeaningfulPanel()
		RootPanel.get().add(panel);

		panel.bind(this);
		link.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Hey! Don't click me! I'm a bound widget!");
			}
		});
	}

}
```