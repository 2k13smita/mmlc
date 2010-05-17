package com.capsula.mml.core;

public interface MMLVisitor {
	
	void visitDiv(MMLNode node); 
	void visitSpan(MMLNode node); 
	void visitParagraph(MMLNode node); 
	void visitAnchor(MMLNode node); 
	void visitForm(MMLNode node); 
	void visitFieldset(MMLNode node); 
	void visitStrong(MMLNode node); 
	void visitEmphasis(MMLNode node);
	void visitHeader(int i, MMLNode node);
	void visitInput(MMLNode node);
	void visitRadioButton(MMLNode node);
	void visitCheckBox(MMLNode node);
	void visitList(boolean ordered, MMLNode node);
	void visitListItem(MMLNode node);
	void visitWidget(MMLNode mmlNode, String widget);
	
}
