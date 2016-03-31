# MMLc and UiBinder #

If you don't know what is UiBinder, [read this first](http://code.google.com/intl/pt-BR/webtoolkit/doc/latest/DevGuideUiBinder.html).

Here's a quick comparison between both tools.

| **Feature** | **MMLc** | **UiBinder** |
|:------------|:---------|:-------------|
| Internationalization support | x        | x            |
| Supports custom widgets | x        | x            |
| Binding widgets to an object's fields | x        | x            |
| HTML-like language | x        |              |
|Declarative binding of [event handlers](http://code.google.com/intl/pt-BR/webtoolkit/doc/latest/DevGuideUiBinder.html#Simple_binding) |          | x            |
| Support to [CssResource](http://google-web-toolkit.googlecode.com/svn/javadoc/2.0/com/google/gwt/resources/client/CssResource.html) |          | x            |
| Accessing external resources within templates | sort of  | x            |

When are both tools virtually feature-equal?
  * Internationalization support.
  * Extensible to custom widgets.
  * Binding widgets to an object's fields.

UiBinder, however, supports some features which, up to this point, are **not supported by MMLc**, such as:
  * Declarative binding of [event handlers](http://code.google.com/intl/pt-BR/webtoolkit/doc/latest/DevGuideUiBinder.html#Simple_binding).
  * Support to [CssResource](http://google-web-toolkit.googlecode.com/svn/javadoc/2.0/com/google/gwt/resources/client/CssResource.html)
  * Accessing external resources within templates (you can pass them as parameters, though).

But there are some deeper differences.

## Style ##
First, there's the style. MMLc tries really hard to look like HTML. This has the great advantage that the designer's products (HTML and CSS files) can be seamlessly integrated into the project. We found UiBinder a little too XML-ish for that.

## Power ##
As has been said, GWT's UiBinder has much better integration with others GWT tools. Therefore, it is more powerful than MMLc, and highly recommended if you are already working with CssResource or ClientBundles.
On the other hand, if you use simple CSS files, stored along with your HTML files, you may find that MMLc offers a more appropriate balance between power and simplicity.