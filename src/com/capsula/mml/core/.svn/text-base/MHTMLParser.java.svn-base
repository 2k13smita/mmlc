// $ANTLR 3.2 Sep 23, 2009 12:02:23 src/com/capsula/mml/core/MHTML.g 2010-05-14 11:56:07
 
	package com.capsula.mml.core; 
	import java.util.Stack;	
	//import com.capsula.mml.core.MMLNode.Property;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MHTMLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WORD", "ATTR_ID", "QUOTE", "ATTR_CLASS", "DIV", "SPAN", "PARAGRAPH", "ANCHOR", "FORM", "FIELDSET", "STRONG", "EMPHASIS", "HEADER1", "HEADER2", "HEADER3", "HEADER4", "HEADER5", "HEADER6", "INPUT", "UL", "LI", "IMG", "HTMLTEXT", "WS", "'<'", "' '", "'>'", "'</'", "'='"
    };
    public static final int FIELDSET=13;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int INPUT=22;
    public static final int EMPHASIS=15;
    public static final int EOF=-1;
    public static final int ATTR_ID=5;
    public static final int ANCHOR=11;
    public static final int WORD=4;
    public static final int T__30=30;
    public static final int HEADER6=21;
    public static final int T__31=31;
    public static final int QUOTE=6;
    public static final int HEADER5=20;
    public static final int T__32=32;
    public static final int WS=27;
    public static final int PARAGRAPH=10;
    public static final int UL=23;
    public static final int HEADER4=19;
    public static final int HEADER3=18;
    public static final int HEADER2=17;
    public static final int SPAN=9;
    public static final int STRONG=14;
    public static final int HEADER1=16;
    public static final int ATTR_CLASS=7;
    public static final int FORM=12;
    public static final int DIV=8;
    public static final int LI=24;
    public static final int HTMLTEXT=26;
    public static final int IMG=25;

    // delegates
    // delegators


        public MHTMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MHTMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return MHTMLParser.tokenNames; }
    public String getGrammarFileName() { return "src/com/capsula/mml/core/MHTML.g"; }


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



    // $ANTLR start "node"
    // src/com/capsula/mml/core/MHTML.g:40:1: node : '<' tag ( ' ' nodeAttributes )? '>' ( nodeList | htmlText ) '</' tag '>' ;
    public final void node() throws RecognitionException {
        try {
            // src/com/capsula/mml/core/MHTML.g:40:7: ( '<' tag ( ' ' nodeAttributes )? '>' ( nodeList | htmlText ) '</' tag '>' )
            // src/com/capsula/mml/core/MHTML.g:40:10: '<' tag ( ' ' nodeAttributes )? '>' ( nodeList | htmlText ) '</' tag '>'
            {
            match(input,28,FOLLOW_28_in_node36); 
            pushFollow(FOLLOW_tag_in_node38);
            tag();

            state._fsp--;

            // src/com/capsula/mml/core/MHTML.g:40:18: ( ' ' nodeAttributes )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // src/com/capsula/mml/core/MHTML.g:40:19: ' ' nodeAttributes
                    {
                    match(input,29,FOLLOW_29_in_node41); 
                    pushFollow(FOLLOW_nodeAttributes_in_node43);
                    nodeAttributes();

                    state._fsp--;


                    }
                    break;

            }

            match(input,30,FOLLOW_30_in_node47); 
             
            					if (root == null) {root = presentNode; } 
            					if (!parents.isEmpty()) { parents.peek().addChild(presentNode); } 
            					parents.add(presentNode); 
            				
            // src/com/capsula/mml/core/MHTML.g:46:5: ( nodeList | htmlText )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28||LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==WORD||LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // src/com/capsula/mml/core/MHTML.g:46:6: nodeList
                    {
                    pushFollow(FOLLOW_nodeList_in_node61);
                    nodeList();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // src/com/capsula/mml/core/MHTML.g:46:17: htmlText
                    {
                    pushFollow(FOLLOW_htmlText_in_node65);
                    htmlText();

                    state._fsp--;


                    }
                    break;

            }


            					parents.pop();
            				
            match(input,31,FOLLOW_31_in_node77); 
            pushFollow(FOLLOW_tag_in_node79);
            tag();

            state._fsp--;

            match(input,30,FOLLOW_30_in_node81); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "node"


    // $ANTLR start "nodeList"
    // src/com/capsula/mml/core/MHTML.g:53:1: nodeList : ( node )* ;
    public final void nodeList() throws RecognitionException {
        try {
            // src/com/capsula/mml/core/MHTML.g:53:10: ( ( node )* )
            // src/com/capsula/mml/core/MHTML.g:53:12: ( node )*
            {
            // src/com/capsula/mml/core/MHTML.g:53:12: ( node )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==28) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/com/capsula/mml/core/MHTML.g:53:12: node
            	    {
            	    pushFollow(FOLLOW_node_in_nodeList93);
            	    node();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nodeList"


    // $ANTLR start "htmlText"
    // src/com/capsula/mml/core/MHTML.g:54:1: htmlText : ( ' ' )* textFrag= WORD ( ( ' ' )+ textFrag= WORD )* ( ' ' )* ;
    public final void htmlText() throws RecognitionException {
        Token textFrag=null;

        try {
            // src/com/capsula/mml/core/MHTML.g:54:10: ( ( ' ' )* textFrag= WORD ( ( ' ' )+ textFrag= WORD )* ( ' ' )* )
            // src/com/capsula/mml/core/MHTML.g:54:12: ( ' ' )* textFrag= WORD ( ( ' ' )+ textFrag= WORD )* ( ' ' )*
            {
            // src/com/capsula/mml/core/MHTML.g:54:12: ( ' ' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/com/capsula/mml/core/MHTML.g:54:13: ' '
            	    {
            	    match(input,29,FOLLOW_29_in_htmlText102); 
            	    presentNode.appendText(" ");

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            textFrag=(Token)match(input,WORD,FOLLOW_WORD_in_htmlText114); 
            presentNode.appendText((textFrag!=null?textFrag.getText():null));
            // src/com/capsula/mml/core/MHTML.g:56:4: ( ( ' ' )+ textFrag= WORD )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // src/com/capsula/mml/core/MHTML.g:57:5: ( ' ' )+ textFrag= WORD
            	    {
            	    // src/com/capsula/mml/core/MHTML.g:57:5: ( ' ' )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==29) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // src/com/capsula/mml/core/MHTML.g:57:6: ' '
            	    	    {
            	    	    match(input,29,FOLLOW_29_in_htmlText129); 
            	    	    presentNode.appendText(" ");

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    textFrag=(Token)match(input,WORD,FOLLOW_WORD_in_htmlText141); 
            	     presentNode.appendText((textFrag!=null?textFrag.getText():null)); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // src/com/capsula/mml/core/MHTML.g:60:4: ( ' ' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/com/capsula/mml/core/MHTML.g:60:5: ' '
            	    {
            	    match(input,29,FOLLOW_29_in_htmlText155); 
            	    presentNode.appendText(" ");

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "htmlText"


    // $ANTLR start "nodeAttributes"
    // src/com/capsula/mml/core/MHTML.g:63:1: nodeAttributes : nodeAttribute ( ' ' nodeAttribute )* ;
    public final void nodeAttributes() throws RecognitionException {
        try {
            // src/com/capsula/mml/core/MHTML.g:63:17: ( nodeAttribute ( ' ' nodeAttribute )* )
            // src/com/capsula/mml/core/MHTML.g:63:20: nodeAttribute ( ' ' nodeAttribute )*
            {
            pushFollow(FOLLOW_nodeAttribute_in_nodeAttributes173);
            nodeAttribute();

            state._fsp--;

            // src/com/capsula/mml/core/MHTML.g:63:34: ( ' ' nodeAttribute )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/com/capsula/mml/core/MHTML.g:63:35: ' ' nodeAttribute
            	    {
            	    match(input,29,FOLLOW_29_in_nodeAttributes176); 
            	    pushFollow(FOLLOW_nodeAttribute_in_nodeAttributes178);
            	    nodeAttribute();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nodeAttributes"


    // $ANTLR start "nodeAttribute"
    // src/com/capsula/mml/core/MHTML.g:64:1: nodeAttribute : ( nodeIdAttr | nodeClassAttr | genericProperty );
    public final void nodeAttribute() throws RecognitionException {
        try {
            // src/com/capsula/mml/core/MHTML.g:64:15: ( nodeIdAttr | nodeClassAttr | genericProperty )
            int alt9=3;
            switch ( input.LA(1) ) {
            case ATTR_ID:
                {
                alt9=1;
                }
                break;
            case ATTR_CLASS:
                {
                alt9=2;
                }
                break;
            case WORD:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // src/com/capsula/mml/core/MHTML.g:64:17: nodeIdAttr
                    {
                    pushFollow(FOLLOW_nodeIdAttr_in_nodeAttribute187);
                    nodeIdAttr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // src/com/capsula/mml/core/MHTML.g:64:30: nodeClassAttr
                    {
                    pushFollow(FOLLOW_nodeClassAttr_in_nodeAttribute191);
                    nodeClassAttr();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // src/com/capsula/mml/core/MHTML.g:64:46: genericProperty
                    {
                    pushFollow(FOLLOW_genericProperty_in_nodeAttribute195);
                    genericProperty();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nodeAttribute"


    // $ANTLR start "nodeIdAttr"
    // src/com/capsula/mml/core/MHTML.g:65:1: nodeIdAttr : ATTR_ID '=' QUOTE nodeId= WORD QUOTE ;
    public final void nodeIdAttr() throws RecognitionException {
        Token nodeId=null;

        try {
            // src/com/capsula/mml/core/MHTML.g:65:12: ( ATTR_ID '=' QUOTE nodeId= WORD QUOTE )
            // src/com/capsula/mml/core/MHTML.g:65:14: ATTR_ID '=' QUOTE nodeId= WORD QUOTE
            {
            match(input,ATTR_ID,FOLLOW_ATTR_ID_in_nodeIdAttr202); 
            match(input,32,FOLLOW_32_in_nodeIdAttr204); 
            match(input,QUOTE,FOLLOW_QUOTE_in_nodeIdAttr206); 
            nodeId=(Token)match(input,WORD,FOLLOW_WORD_in_nodeIdAttr210); 
             presentNode.setId((nodeId!=null?nodeId.getText():null)); 
            match(input,QUOTE,FOLLOW_QUOTE_in_nodeIdAttr214); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nodeIdAttr"


    // $ANTLR start "nodeClassAttr"
    // src/com/capsula/mml/core/MHTML.g:66:1: nodeClassAttr : ATTR_CLASS '=' QUOTE nodeStyle= WORD ( ' ' nodeStyle= WORD )* QUOTE ;
    public final void nodeClassAttr() throws RecognitionException {
        Token nodeStyle=null;

        try {
            // src/com/capsula/mml/core/MHTML.g:66:15: ( ATTR_CLASS '=' QUOTE nodeStyle= WORD ( ' ' nodeStyle= WORD )* QUOTE )
            // src/com/capsula/mml/core/MHTML.g:66:17: ATTR_CLASS '=' QUOTE nodeStyle= WORD ( ' ' nodeStyle= WORD )* QUOTE
            {
            match(input,ATTR_CLASS,FOLLOW_ATTR_CLASS_in_nodeClassAttr221); 
            match(input,32,FOLLOW_32_in_nodeClassAttr223); 
            match(input,QUOTE,FOLLOW_QUOTE_in_nodeClassAttr225); 
            nodeStyle=(Token)match(input,WORD,FOLLOW_WORD_in_nodeClassAttr229); 
             presentNode.addClass((nodeStyle!=null?nodeStyle.getText():null)); 
            // src/com/capsula/mml/core/MHTML.g:67:9: ( ' ' nodeStyle= WORD )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/com/capsula/mml/core/MHTML.g:67:10: ' ' nodeStyle= WORD
            	    {
            	    match(input,29,FOLLOW_29_in_nodeClassAttr243); 
            	    nodeStyle=(Token)match(input,WORD,FOLLOW_WORD_in_nodeClassAttr247); 
            	     presentNode.addClass((nodeStyle!=null?nodeStyle.getText():null)); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,QUOTE,FOLLOW_QUOTE_in_nodeClassAttr255); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nodeClassAttr"


    // $ANTLR start "genericProperty"
    // src/com/capsula/mml/core/MHTML.g:69:1: genericProperty : propId= WORD '=' QUOTE propValue= WORD QUOTE ;
    public final void genericProperty() throws RecognitionException {
        Token propId=null;
        Token propValue=null;

        try {
            // src/com/capsula/mml/core/MHTML.g:69:17: (propId= WORD '=' QUOTE propValue= WORD QUOTE )
            // src/com/capsula/mml/core/MHTML.g:69:19: propId= WORD '=' QUOTE propValue= WORD QUOTE
            {
            propId=(Token)match(input,WORD,FOLLOW_WORD_in_genericProperty274); 
            match(input,32,FOLLOW_32_in_genericProperty276); 
            match(input,QUOTE,FOLLOW_QUOTE_in_genericProperty278); 
            propValue=(Token)match(input,WORD,FOLLOW_WORD_in_genericProperty282); 
            match(input,QUOTE,FOLLOW_QUOTE_in_genericProperty284); 
             presentNode.addProperty(new MMLNode.Property((propId!=null?propId.getText():null), (propValue!=null?propValue.getText():null))); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "genericProperty"


    // $ANTLR start "tag"
    // src/com/capsula/mml/core/MHTML.g:71:1: tag : ( DIV | SPAN | PARAGRAPH | ANCHOR | FORM | FIELDSET | STRONG | EMPHASIS | HEADER1 | HEADER2 | HEADER3 | HEADER4 | HEADER5 | HEADER6 | INPUT | UL | LI | IMG );
    public final void tag() throws RecognitionException {
        try {
            // src/com/capsula/mml/core/MHTML.g:71:7: ( DIV | SPAN | PARAGRAPH | ANCHOR | FORM | FIELDSET | STRONG | EMPHASIS | HEADER1 | HEADER2 | HEADER3 | HEADER4 | HEADER5 | HEADER6 | INPUT | UL | LI | IMG )
            int alt11=18;
            switch ( input.LA(1) ) {
            case DIV:
                {
                alt11=1;
                }
                break;
            case SPAN:
                {
                alt11=2;
                }
                break;
            case PARAGRAPH:
                {
                alt11=3;
                }
                break;
            case ANCHOR:
                {
                alt11=4;
                }
                break;
            case FORM:
                {
                alt11=5;
                }
                break;
            case FIELDSET:
                {
                alt11=6;
                }
                break;
            case STRONG:
                {
                alt11=7;
                }
                break;
            case EMPHASIS:
                {
                alt11=8;
                }
                break;
            case HEADER1:
                {
                alt11=9;
                }
                break;
            case HEADER2:
                {
                alt11=10;
                }
                break;
            case HEADER3:
                {
                alt11=11;
                }
                break;
            case HEADER4:
                {
                alt11=12;
                }
                break;
            case HEADER5:
                {
                alt11=13;
                }
                break;
            case HEADER6:
                {
                alt11=14;
                }
                break;
            case INPUT:
                {
                alt11=15;
                }
                break;
            case UL:
                {
                alt11=16;
                }
                break;
            case LI:
                {
                alt11=17;
                }
                break;
            case IMG:
                {
                alt11=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // src/com/capsula/mml/core/MHTML.g:71:9: DIV
                    {
                    match(input,DIV,FOLLOW_DIV_in_tag296); 
                     presentNode = new MMLNode(Tag.DIV); 

                    }
                    break;
                case 2 :
                    // src/com/capsula/mml/core/MHTML.g:72:6: SPAN
                    {
                    match(input,SPAN,FOLLOW_SPAN_in_tag307); 
                     presentNode = new MMLNode(Tag.SPAN); 

                    }
                    break;
                case 3 :
                    // src/com/capsula/mml/core/MHTML.g:73:7: PARAGRAPH
                    {
                    match(input,PARAGRAPH,FOLLOW_PARAGRAPH_in_tag318); 
                     presentNode = new MMLNode(Tag.PARAGRAPH); 

                    }
                    break;
                case 4 :
                    // src/com/capsula/mml/core/MHTML.g:74:7: ANCHOR
                    {
                    match(input,ANCHOR,FOLLOW_ANCHOR_in_tag329); 
                     presentNode = new MMLNode(Tag.ANCHOR); 

                    }
                    break;
                case 5 :
                    // src/com/capsula/mml/core/MHTML.g:75:7: FORM
                    {
                    match(input,FORM,FOLLOW_FORM_in_tag341); 
                     presentNode = new MMLNode(Tag.FORM); 

                    }
                    break;
                case 6 :
                    // src/com/capsula/mml/core/MHTML.g:76:7: FIELDSET
                    {
                    match(input,FIELDSET,FOLLOW_FIELDSET_in_tag353); 
                     presentNode = new MMLNode(Tag.FIELDSET); 

                    }
                    break;
                case 7 :
                    // src/com/capsula/mml/core/MHTML.g:77:7: STRONG
                    {
                    match(input,STRONG,FOLLOW_STRONG_in_tag364); 
                     presentNode = new MMLNode(Tag.STRONG); 

                    }
                    break;
                case 8 :
                    // src/com/capsula/mml/core/MHTML.g:78:6: EMPHASIS
                    {
                    match(input,EMPHASIS,FOLLOW_EMPHASIS_in_tag375); 
                     presentNode = new MMLNode(Tag.EMPHASIS); 

                    }
                    break;
                case 9 :
                    // src/com/capsula/mml/core/MHTML.g:79:6: HEADER1
                    {
                    match(input,HEADER1,FOLLOW_HEADER1_in_tag384); 
                     presentNode = new MMLNode(Tag.H1); 

                    }
                    break;
                case 10 :
                    // src/com/capsula/mml/core/MHTML.g:80:6: HEADER2
                    {
                    match(input,HEADER2,FOLLOW_HEADER2_in_tag394); 
                     presentNode = new MMLNode(Tag.H2); 

                    }
                    break;
                case 11 :
                    // src/com/capsula/mml/core/MHTML.g:81:6: HEADER3
                    {
                    match(input,HEADER3,FOLLOW_HEADER3_in_tag404); 
                     presentNode = new MMLNode(Tag.H3); 

                    }
                    break;
                case 12 :
                    // src/com/capsula/mml/core/MHTML.g:82:6: HEADER4
                    {
                    match(input,HEADER4,FOLLOW_HEADER4_in_tag414); 
                     presentNode = new MMLNode(Tag.H4); 

                    }
                    break;
                case 13 :
                    // src/com/capsula/mml/core/MHTML.g:83:6: HEADER5
                    {
                    match(input,HEADER5,FOLLOW_HEADER5_in_tag424); 
                     presentNode = new MMLNode(Tag.H5); 

                    }
                    break;
                case 14 :
                    // src/com/capsula/mml/core/MHTML.g:84:6: HEADER6
                    {
                    match(input,HEADER6,FOLLOW_HEADER6_in_tag434); 
                     presentNode = new MMLNode(Tag.H6); 

                    }
                    break;
                case 15 :
                    // src/com/capsula/mml/core/MHTML.g:85:7: INPUT
                    {
                    match(input,INPUT,FOLLOW_INPUT_in_tag445); 
                     presentNode = new MMLNode(Tag.INPUT); 

                    }
                    break;
                case 16 :
                    // src/com/capsula/mml/core/MHTML.g:86:7: UL
                    {
                    match(input,UL,FOLLOW_UL_in_tag456); 
                     presentNode = new MMLNode(Tag.UL); 

                    }
                    break;
                case 17 :
                    // src/com/capsula/mml/core/MHTML.g:87:7: LI
                    {
                    match(input,LI,FOLLOW_LI_in_tag468); 
                     presentNode = new MMLNode(Tag.LI); 

                    }
                    break;
                case 18 :
                    // src/com/capsula/mml/core/MHTML.g:88:7: IMG
                    {
                    match(input,IMG,FOLLOW_IMG_in_tag480); 
                     presentNode = new MMLNode(Tag.IMAGE); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "tag"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\4\uffff";
    static final String DFA6_eofS =
        "\4\uffff";
    static final String DFA6_minS =
        "\1\35\1\4\2\uffff";
    static final String DFA6_maxS =
        "\2\37\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA6_specialS =
        "\4\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\uffff\1\2",
            "\1\3\30\uffff\1\1\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 56:4: ( ( ' ' )+ textFrag= WORD )*";
        }
    }
 

    public static final BitSet FOLLOW_28_in_node36 = new BitSet(new long[]{0x0000000003FFFF00L});
    public static final BitSet FOLLOW_tag_in_node38 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_node41 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_nodeAttributes_in_node43 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_node47 = new BitSet(new long[]{0x00000000B0000010L});
    public static final BitSet FOLLOW_nodeList_in_node61 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_htmlText_in_node65 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_node77 = new BitSet(new long[]{0x0000000003FFFF00L});
    public static final BitSet FOLLOW_tag_in_node79 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_node81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_nodeList93 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_29_in_htmlText102 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_WORD_in_htmlText114 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_htmlText129 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_WORD_in_htmlText141 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_htmlText155 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_nodeAttribute_in_nodeAttributes173 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_nodeAttributes176 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_nodeAttribute_in_nodeAttributes178 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_nodeIdAttr_in_nodeAttribute187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nodeClassAttr_in_nodeAttribute191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_genericProperty_in_nodeAttribute195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTR_ID_in_nodeIdAttr202 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_nodeIdAttr204 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTE_in_nodeIdAttr206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_WORD_in_nodeIdAttr210 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTE_in_nodeIdAttr214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTR_CLASS_in_nodeClassAttr221 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_nodeClassAttr223 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTE_in_nodeClassAttr225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_WORD_in_nodeClassAttr229 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29_in_nodeClassAttr243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_WORD_in_nodeClassAttr247 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_QUOTE_in_nodeClassAttr255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_genericProperty274 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_genericProperty276 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTE_in_genericProperty278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_WORD_in_genericProperty282 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTE_in_genericProperty284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_tag296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPAN_in_tag307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAGRAPH_in_tag318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANCHOR_in_tag329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORM_in_tag341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIELDSET_in_tag353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRONG_in_tag364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPHASIS_in_tag375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEADER1_in_tag384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEADER2_in_tag394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEADER3_in_tag404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEADER4_in_tag414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEADER5_in_tag424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEADER6_in_tag434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INPUT_in_tag445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UL_in_tag456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LI_in_tag468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMG_in_tag480 = new BitSet(new long[]{0x0000000000000002L});

}