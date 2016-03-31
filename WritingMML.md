MML (aka MHTML) is an enriched subset of HTML, which means that it does not support all HTML tags and rules, and that it adds a few elements to this subset.

### Syntax ###

  * Every document has only one root node.
  * Each node may contain properties.
  * Each node may contain either HTML text or a node list in its subtree.

### Elements ###

MML is a markup language supporting the following tags:

| Tag | Default GWT Widget |
|:----|:-------------------|
| DIV | `FlowPanel`        |
| SPAN | `InlineHTML`       |
| P   | `Paragraph`¹       |
| A   | `Anchor`           |
| FORM | `FormPanel`        |
| FIELDSET | `FieldSet`¹        |
| STRONG | `InlineHTML + addStyleName("strong")` |
| EM  | `InlineHTML + addStyleName("emphasis")` |
| H1, H2, H3... | `Header`¹          |
| UL, LI | `HTMLList` and `ListItem`¹ |
| IMG | `Image`            |
| INPUT | `TextBox`          |

¹ Some widgets are not part of the defaul GWT package, and have a custom implementation bundled with this project. They can be found in the package `com.capsula.mml.client.widget`.

### Semantics ###

The `id` and `class` work as expected in MML, but we need a `widget` property to make our generator extensible.

#### ID ####
If a node defines an `id` property, the corresponding widget id will be set by calling
```
widget.getElement().setId(...);
```

#### Classes ####
If a node defines a `class` property as a space-separated list of class names, the `addStyleName` will be called on the widget for each element on the list.
```
<span class="red-text warning-sign"></span>
```
```
InlineHTML widget = new InlineHTML();
widget.addStyleName("red-text");
widget.addStyleName("warning-sign");
```


#### Widget ####
The `widget` property provides the generator with a hint to which widget should be instantiated at this point in the tree. **Important note: this property is only processed on nodes with the tag `INPUT`.**

The default mapping to this property is shown below. If you are using your own widgets, please refer to the [extensibility](ExtensibleMML.md) page.

| property value | GWT widget |
|:---------------|:-----------|
| radio          | `RadioButton` |
| check          | `CheckBox` |

#### Any other properties ####
At the moment, any other properties defined in MML are ignored.