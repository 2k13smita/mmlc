# MMLc: team-friendly GWT #

MMLc is a tool for web development teams using GWT to build large web pages, where coordinating the works of designers and programmers has become difficult owing to the unusual workflow imposed by the tool.

## Motivation ##
Usually, on web applications development, we have programmers and designers. The latters program the UI, usually as a set of HTML and CSS files, while the formers develop the back-end of the application, and integrate it on the UI (usually through some kind of template technology).

However, using GWT, this division is not so clear, since programmers themselves need to write the code that, at runtime, will create the UI. This is a real problem for designers because the feedback cycle of their work is slowed down. Also, programmers need to waste a lot of time reprogramming the "contractual" UI.

We may assume too that either you have already a huge codebase in GWT, or that you simply cannot live without the nifty widgets and the familiar programming model.

Unless you're lucky enough to find a designer who can write good Java code, you should know what I'm talking about.

## The Solution ##

At my company, we asked ourselves: what if we could instantiate GWT widgets directly from an HTML (or an HTML-like) document? It would allow us to keep our present codebase while easening the communication between designer-programmer.

Then we came up with this little tool that we call MMLc (standing for `Miglis Markup Language Compiler`. Miglis is our designer). Basically, it does the following: if you give it an HTML-like code such as:

```
<div id="xyz" class="abc def"></div>
```

It generates the following code:

```
FlowPanel root = new FlowPanel();
root.getElement().setId("xyz");
root.addStyleName("abc");
root.addStyleName("def");
```

To add this widget to your page, we used a similar approach as GWT's i18n support: create an interface and a properties file where the interface's method names match with keys on the properties file. Therefore, you would write:

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

Ah! Let's not forget to inherit the MML module in your project.
```
<module>
   ...
   <inherits name='com.capsula.mml.MML'/>
   ...
```

And we're done! The outcomes are:
  * Programmers don't waste time instantiating widgets, setting ids or style names. They can focus on improving the user interaction by programming only how widgets respond to events.
  * Designers don't need to wait to see how their changes fit into the product visual. They can implement them, test, fix and even commit them to a shared code repository.
  * Smaller, prettier and easier to debug code.

Right now, you might be itching to:
  * [Download](http://code.google.com/p/mmlc/downloads/list) the jar and start using it.
  * Learn more about [writing MML](WritingMML.md).
  * Take a closer look at our [samples](SeeTheSamples.md)
  * Read about how it [compares with UiBinder](ComparisonToUIBinder.md).