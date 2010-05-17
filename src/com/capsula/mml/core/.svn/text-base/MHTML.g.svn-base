grammar MHTML;

@parser::header { 
	package com.capsula.mml.core; 
	import java.util.Stack;	
	//import com.capsula.mml.core.MMLNode.Property;
}

@lexer::header { package com.capsula.mml.core; }

@members {
	private Stack<MMLNode> parents = new Stack<MMLNode>();
	private MMLNode root = null;
	private MMLNode presentNode = null;
	
	public MMLNode getRoot () {
		return this.root;
	}
	/*
	public enum Tag {
		DIV , SPAN , PARAGRAPH , ANCHOR , FORM , FIELDSET , STRONG , EMPHASIS,
		H1, H2, H3, H4, H5, H6, INPUT, MAP, UL, LI
	}
	
	public class MMLNode {
		public MMLNode(Tag t){}
		public void appendText(String s){}
		public void setId(String s){}
		public void addClass(String s){}
		public void addChild(MMLNode child){}				
		public void addProperty(Property p){}
	}
	
	public class Property {
		public Property(String s, String s1){}
	}
	*/
}

node		: 	'<' tag (' ' nodeAttributes)? '>' 
				{ 
					if (root == null) {root = presentNode; } 
					if (!parents.isEmpty()) { parents.peek().addChild(presentNode); } 
					parents.add(presentNode); 
				}
				(nodeList | htmlText)
				{
					parents.pop();
				}
			'</' tag '>' 
		;

nodeList	:	node*;
htmlText	:	(' ' {presentNode.appendText(" ");} )*
			textFrag=WORD {presentNode.appendText($textFrag.text);} 
			(
				(' ' {presentNode.appendText(" ");})+
				textFrag=WORD { presentNode.appendText($textFrag.text); }
			)*
			(' ' {presentNode.appendText(" ");})*
			;

nodeAttributes 	: 	nodeAttribute (' ' nodeAttribute)*;
nodeAttribute	:	nodeIdAttr | nodeClassAttr | genericProperty;
nodeIdAttr	:	ATTR_ID '=' QUOTE nodeId=WORD { presentNode.setId($nodeId.text); } QUOTE;
nodeClassAttr	:	ATTR_CLASS '=' QUOTE nodeStyle=WORD { presentNode.addClass($nodeStyle.text); } 
				    (' ' nodeStyle=WORD { presentNode.addClass($nodeStyle.text); } )*  QUOTE ;
				    
genericProperty	:	propId=WORD '=' QUOTE propValue=WORD QUOTE { presentNode.addProperty(new MMLNode.Property($propId.text, $propValue.text)); };

tag			:	DIV 		{ presentNode = new MMLNode(Tag.DIV); }
			|	SPAN		{ presentNode = new MMLNode(Tag.SPAN); }
			| 	PARAGRAPH 	{ presentNode = new MMLNode(Tag.PARAGRAPH); }
			| 	ANCHOR 		{ presentNode = new MMLNode(Tag.ANCHOR); }
			| 	FORM 		{ presentNode = new MMLNode(Tag.FORM); }
			| 	FIELDSET 	{ presentNode = new MMLNode(Tag.FIELDSET); }
			| 	STRONG 		{ presentNode = new MMLNode(Tag.STRONG); }
			|	EMPHASIS	{ presentNode = new MMLNode(Tag.EMPHASIS); }
			|	HEADER1		{ presentNode = new MMLNode(Tag.H1); }
			|	HEADER2		{ presentNode = new MMLNode(Tag.H2); }
			|	HEADER3		{ presentNode = new MMLNode(Tag.H3); }
			|	HEADER4		{ presentNode = new MMLNode(Tag.H4); }
			|	HEADER5		{ presentNode = new MMLNode(Tag.H5); }
			|	HEADER6		{ presentNode = new MMLNode(Tag.H6); }
			| 	INPUT		{ presentNode = new MMLNode(Tag.INPUT); }
			| 	UL			{ presentNode = new MMLNode(Tag.UL); }
			| 	LI			{ presentNode = new MMLNode(Tag.LI); }
			| 	IMG			{ presentNode = new MMLNode(Tag.IMAGE); }			
			;

DIV		:	'div';
SPAN		:	'span';
PARAGRAPH	:	'p';
ANCHOR		:	'a';
FORM		:	'form';
FIELDSET	:	'fieldset';
STRONG		:	'strong';
EMPHASIS	:	'em';
HEADER1		:	'h1';
HEADER2		:	'h2';
HEADER3		:	'h3';
HEADER4		:	'h4';
HEADER5		:	'h5';
HEADER6		:	'h6';
INPUT		:	'input';
UL		:	'ul';
LI		:	'li';
IMG		:	'img';

ATTR_ID		: 	'id';
ATTR_CLASS	:	'class';

QUOTE		:	'\"';

WORD		:	('a'..'z'|'A'..'Z'|'0'..'9'|'\u00C0'..'\u00FF'|'_' | '!'|':'|';'|'$'|'+'|'/'|'.'|','|'-')* ;
HTMLTEXT	:	~('<' | '>'|'\r'|'\n');

WS		:	(' '|'\r'|'\t'|'\n'|'\u000C') {$channel=HIDDEN;} ;
