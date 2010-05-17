// $ANTLR 3.2 Sep 23, 2009 12:02:23 src/com/capsula/mml/core/MHTML.g 2010-05-14 11:56:07
 package com.capsula.mml.core; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MHTMLLexer extends Lexer {
    public static final int FIELDSET=13;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int INPUT=22;
    public static final int EOF=-1;
    public static final int EMPHASIS=15;
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
    public static final int STRONG=14;
    public static final int SPAN=9;
    public static final int HEADER2=17;
    public static final int HEADER1=16;
    public static final int ATTR_CLASS=7;
    public static final int FORM=12;
    public static final int DIV=8;
    public static final int LI=24;
    public static final int HTMLTEXT=26;
    public static final int IMG=25;

    // delegates
    // delegators

    public MHTMLLexer() {;} 
    public MHTMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MHTMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "src/com/capsula/mml/core/MHTML.g"; }

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:5:7: ( '<' )
            // src/com/capsula/mml/core/MHTML.g:5:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:6:7: ( ' ' )
            // src/com/capsula/mml/core/MHTML.g:6:9: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:7:7: ( '>' )
            // src/com/capsula/mml/core/MHTML.g:7:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:8:7: ( '</' )
            // src/com/capsula/mml/core/MHTML.g:8:9: '</'
            {
            match("</"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:9:7: ( '=' )
            // src/com/capsula/mml/core/MHTML.g:9:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:91:6: ( 'div' )
            // src/com/capsula/mml/core/MHTML.g:91:8: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "SPAN"
    public final void mSPAN() throws RecognitionException {
        try {
            int _type = SPAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:92:7: ( 'span' )
            // src/com/capsula/mml/core/MHTML.g:92:9: 'span'
            {
            match("span"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPAN"

    // $ANTLR start "PARAGRAPH"
    public final void mPARAGRAPH() throws RecognitionException {
        try {
            int _type = PARAGRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:93:11: ( 'p' )
            // src/com/capsula/mml/core/MHTML.g:93:13: 'p'
            {
            match('p'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARAGRAPH"

    // $ANTLR start "ANCHOR"
    public final void mANCHOR() throws RecognitionException {
        try {
            int _type = ANCHOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:94:9: ( 'a' )
            // src/com/capsula/mml/core/MHTML.g:94:11: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANCHOR"

    // $ANTLR start "FORM"
    public final void mFORM() throws RecognitionException {
        try {
            int _type = FORM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:95:7: ( 'form' )
            // src/com/capsula/mml/core/MHTML.g:95:9: 'form'
            {
            match("form"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORM"

    // $ANTLR start "FIELDSET"
    public final void mFIELDSET() throws RecognitionException {
        try {
            int _type = FIELDSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:96:10: ( 'fieldset' )
            // src/com/capsula/mml/core/MHTML.g:96:12: 'fieldset'
            {
            match("fieldset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIELDSET"

    // $ANTLR start "STRONG"
    public final void mSTRONG() throws RecognitionException {
        try {
            int _type = STRONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:97:9: ( 'strong' )
            // src/com/capsula/mml/core/MHTML.g:97:11: 'strong'
            {
            match("strong"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRONG"

    // $ANTLR start "EMPHASIS"
    public final void mEMPHASIS() throws RecognitionException {
        try {
            int _type = EMPHASIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:98:10: ( 'em' )
            // src/com/capsula/mml/core/MHTML.g:98:12: 'em'
            {
            match("em"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EMPHASIS"

    // $ANTLR start "HEADER1"
    public final void mHEADER1() throws RecognitionException {
        try {
            int _type = HEADER1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:99:10: ( 'h1' )
            // src/com/capsula/mml/core/MHTML.g:99:12: 'h1'
            {
            match("h1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEADER1"

    // $ANTLR start "HEADER2"
    public final void mHEADER2() throws RecognitionException {
        try {
            int _type = HEADER2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:100:10: ( 'h2' )
            // src/com/capsula/mml/core/MHTML.g:100:12: 'h2'
            {
            match("h2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEADER2"

    // $ANTLR start "HEADER3"
    public final void mHEADER3() throws RecognitionException {
        try {
            int _type = HEADER3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:101:10: ( 'h3' )
            // src/com/capsula/mml/core/MHTML.g:101:12: 'h3'
            {
            match("h3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEADER3"

    // $ANTLR start "HEADER4"
    public final void mHEADER4() throws RecognitionException {
        try {
            int _type = HEADER4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:102:10: ( 'h4' )
            // src/com/capsula/mml/core/MHTML.g:102:12: 'h4'
            {
            match("h4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEADER4"

    // $ANTLR start "HEADER5"
    public final void mHEADER5() throws RecognitionException {
        try {
            int _type = HEADER5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:103:10: ( 'h5' )
            // src/com/capsula/mml/core/MHTML.g:103:12: 'h5'
            {
            match("h5"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEADER5"

    // $ANTLR start "HEADER6"
    public final void mHEADER6() throws RecognitionException {
        try {
            int _type = HEADER6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:104:10: ( 'h6' )
            // src/com/capsula/mml/core/MHTML.g:104:12: 'h6'
            {
            match("h6"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEADER6"

    // $ANTLR start "INPUT"
    public final void mINPUT() throws RecognitionException {
        try {
            int _type = INPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:105:8: ( 'input' )
            // src/com/capsula/mml/core/MHTML.g:105:10: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INPUT"

    // $ANTLR start "UL"
    public final void mUL() throws RecognitionException {
        try {
            int _type = UL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:106:5: ( 'ul' )
            // src/com/capsula/mml/core/MHTML.g:106:7: 'ul'
            {
            match("ul"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UL"

    // $ANTLR start "LI"
    public final void mLI() throws RecognitionException {
        try {
            int _type = LI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:107:5: ( 'li' )
            // src/com/capsula/mml/core/MHTML.g:107:7: 'li'
            {
            match("li"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LI"

    // $ANTLR start "IMG"
    public final void mIMG() throws RecognitionException {
        try {
            int _type = IMG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:108:6: ( 'img' )
            // src/com/capsula/mml/core/MHTML.g:108:8: 'img'
            {
            match("img"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMG"

    // $ANTLR start "ATTR_ID"
    public final void mATTR_ID() throws RecognitionException {
        try {
            int _type = ATTR_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:110:10: ( 'id' )
            // src/com/capsula/mml/core/MHTML.g:110:13: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATTR_ID"

    // $ANTLR start "ATTR_CLASS"
    public final void mATTR_CLASS() throws RecognitionException {
        try {
            int _type = ATTR_CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:111:12: ( 'class' )
            // src/com/capsula/mml/core/MHTML.g:111:14: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATTR_CLASS"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:113:8: ( '\\\"' )
            // src/com/capsula/mml/core/MHTML.g:113:10: '\\\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:115:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\u00C0' .. '\\u00FF' | '_' | '!' | ':' | ';' | '$' | '+' | '/' | '.' | ',' | '-' )* )
            // src/com/capsula/mml/core/MHTML.g:115:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\u00C0' .. '\\u00FF' | '_' | '!' | ':' | ';' | '$' | '+' | '/' | '.' | ',' | '-' )*
            {
            // src/com/capsula/mml/core/MHTML.g:115:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '\\u00C0' .. '\\u00FF' | '_' | '!' | ':' | ';' | '$' | '+' | '/' | '.' | ',' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='!'||LA1_0=='$'||(LA1_0>='+' && LA1_0<=';')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')||(LA1_0>='\u00C0' && LA1_0<='\u00FF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/com/capsula/mml/core/MHTML.g:
            	    {
            	    if ( input.LA(1)=='!'||input.LA(1)=='$'||(input.LA(1)>='+' && input.LA(1)<=';')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00FF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WORD"

    // $ANTLR start "HTMLTEXT"
    public final void mHTMLTEXT() throws RecognitionException {
        try {
            int _type = HTMLTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:116:10: (~ ( '<' | '>' | '\\r' | '\\n' ) )
            // src/com/capsula/mml/core/MHTML.g:116:12: ~ ( '<' | '>' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HTMLTEXT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/com/capsula/mml/core/MHTML.g:118:5: ( ( ' ' | '\\r' | '\\t' | '\\n' | '\\u000C' ) )
            // src/com/capsula/mml/core/MHTML.g:118:7: ( ' ' | '\\r' | '\\t' | '\\n' | '\\u000C' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // src/com/capsula/mml/core/MHTML.g:1:8: ( T__28 | T__29 | T__30 | T__31 | T__32 | DIV | SPAN | PARAGRAPH | ANCHOR | FORM | FIELDSET | STRONG | EMPHASIS | HEADER1 | HEADER2 | HEADER3 | HEADER4 | HEADER5 | HEADER6 | INPUT | UL | LI | IMG | ATTR_ID | ATTR_CLASS | QUOTE | WORD | HTMLTEXT | WS )
        int alt2=29;
        alt2 = dfa2.predict(input);
        switch (alt2) {
            case 1 :
                // src/com/capsula/mml/core/MHTML.g:1:10: T__28
                {
                mT__28(); 

                }
                break;
            case 2 :
                // src/com/capsula/mml/core/MHTML.g:1:16: T__29
                {
                mT__29(); 

                }
                break;
            case 3 :
                // src/com/capsula/mml/core/MHTML.g:1:22: T__30
                {
                mT__30(); 

                }
                break;
            case 4 :
                // src/com/capsula/mml/core/MHTML.g:1:28: T__31
                {
                mT__31(); 

                }
                break;
            case 5 :
                // src/com/capsula/mml/core/MHTML.g:1:34: T__32
                {
                mT__32(); 

                }
                break;
            case 6 :
                // src/com/capsula/mml/core/MHTML.g:1:40: DIV
                {
                mDIV(); 

                }
                break;
            case 7 :
                // src/com/capsula/mml/core/MHTML.g:1:44: SPAN
                {
                mSPAN(); 

                }
                break;
            case 8 :
                // src/com/capsula/mml/core/MHTML.g:1:49: PARAGRAPH
                {
                mPARAGRAPH(); 

                }
                break;
            case 9 :
                // src/com/capsula/mml/core/MHTML.g:1:59: ANCHOR
                {
                mANCHOR(); 

                }
                break;
            case 10 :
                // src/com/capsula/mml/core/MHTML.g:1:66: FORM
                {
                mFORM(); 

                }
                break;
            case 11 :
                // src/com/capsula/mml/core/MHTML.g:1:71: FIELDSET
                {
                mFIELDSET(); 

                }
                break;
            case 12 :
                // src/com/capsula/mml/core/MHTML.g:1:80: STRONG
                {
                mSTRONG(); 

                }
                break;
            case 13 :
                // src/com/capsula/mml/core/MHTML.g:1:87: EMPHASIS
                {
                mEMPHASIS(); 

                }
                break;
            case 14 :
                // src/com/capsula/mml/core/MHTML.g:1:96: HEADER1
                {
                mHEADER1(); 

                }
                break;
            case 15 :
                // src/com/capsula/mml/core/MHTML.g:1:104: HEADER2
                {
                mHEADER2(); 

                }
                break;
            case 16 :
                // src/com/capsula/mml/core/MHTML.g:1:112: HEADER3
                {
                mHEADER3(); 

                }
                break;
            case 17 :
                // src/com/capsula/mml/core/MHTML.g:1:120: HEADER4
                {
                mHEADER4(); 

                }
                break;
            case 18 :
                // src/com/capsula/mml/core/MHTML.g:1:128: HEADER5
                {
                mHEADER5(); 

                }
                break;
            case 19 :
                // src/com/capsula/mml/core/MHTML.g:1:136: HEADER6
                {
                mHEADER6(); 

                }
                break;
            case 20 :
                // src/com/capsula/mml/core/MHTML.g:1:144: INPUT
                {
                mINPUT(); 

                }
                break;
            case 21 :
                // src/com/capsula/mml/core/MHTML.g:1:150: UL
                {
                mUL(); 

                }
                break;
            case 22 :
                // src/com/capsula/mml/core/MHTML.g:1:153: LI
                {
                mLI(); 

                }
                break;
            case 23 :
                // src/com/capsula/mml/core/MHTML.g:1:156: IMG
                {
                mIMG(); 

                }
                break;
            case 24 :
                // src/com/capsula/mml/core/MHTML.g:1:160: ATTR_ID
                {
                mATTR_ID(); 

                }
                break;
            case 25 :
                // src/com/capsula/mml/core/MHTML.g:1:168: ATTR_CLASS
                {
                mATTR_CLASS(); 

                }
                break;
            case 26 :
                // src/com/capsula/mml/core/MHTML.g:1:179: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 27 :
                // src/com/capsula/mml/core/MHTML.g:1:185: WORD
                {
                mWORD(); 

                }
                break;
            case 28 :
                // src/com/capsula/mml/core/MHTML.g:1:190: HTMLTEXT
                {
                mHTMLTEXT(); 

                }
                break;
            case 29 :
                // src/com/capsula/mml/core/MHTML.g:1:199: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\1\22\1\27\3\uffff\2\22\1\35\1\36\7\22\12\uffff\3\22\2\uffff\2\22"+
        "\1\64\1\65\1\66\1\67\1\70\1\71\1\72\2\22\1\75\1\76\1\77\1\22\1\uffff"+
        "\1\101\4\22\7\uffff\1\22\1\107\3\uffff\1\22\1\uffff\1\111\1\22\1"+
        "\113\2\22\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\1\121\1\122\1\123"+
        "\1\22\3\uffff\1\22\1\126\1\uffff";
    static final String DFA2_eofS =
        "\127\uffff";
    static final String DFA2_minS =
        "\1\0\1\57\3\uffff\1\151\1\160\2\41\1\151\1\155\1\61\1\144\1\154"+
        "\1\151\1\154\12\uffff\1\166\1\141\1\162\2\uffff\1\162\1\145\7\41"+
        "\1\160\1\147\3\41\1\141\1\uffff\1\41\1\156\1\157\1\155\1\154\7\uffff"+
        "\1\165\1\41\3\uffff\1\163\1\uffff\1\41\1\156\1\41\1\144\1\164\1"+
        "\uffff\1\163\1\uffff\1\147\1\uffff\1\163\3\41\1\145\3\uffff\1\164"+
        "\1\41\1\uffff";
    static final String DFA2_maxS =
        "\1\uffff\1\57\3\uffff\1\151\1\164\2\u00ff\1\157\1\155\1\66\1\156"+
        "\1\154\1\151\1\154\12\uffff\1\166\1\141\1\162\2\uffff\1\162\1\145"+
        "\7\u00ff\1\160\1\147\3\u00ff\1\141\1\uffff\1\u00ff\1\156\1\157\1"+
        "\155\1\154\7\uffff\1\165\1\u00ff\3\uffff\1\163\1\uffff\1\u00ff\1"+
        "\156\1\u00ff\1\144\1\164\1\uffff\1\163\1\uffff\1\147\1\uffff\1\163"+
        "\3\u00ff\1\145\3\uffff\1\164\1\u00ff\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\3\1\5\13\uffff\1\32\2\33\2\34\1\35\1\4\1\1\1\2\1"+
        "\5\3\uffff\1\10\1\11\17\uffff\1\32\5\uffff\1\15\1\16\1\17\1\20\1"+
        "\21\1\22\1\23\2\uffff\1\30\1\25\1\26\1\uffff\1\6\5\uffff\1\27\1"+
        "\uffff\1\7\1\uffff\1\12\5\uffff\1\24\1\31\1\14\2\uffff\1\13";
    static final String DFA2_specialS =
        "\1\0\126\uffff}>";
    static final String[] DFA2_transitionS = {
            "\11\24\1\23\1\25\1\24\1\23\1\25\22\24\1\2\1\21\1\20\1\24\1\21"+
            "\6\24\21\21\1\1\1\4\1\3\2\24\32\21\4\24\1\21\1\24\1\10\1\21"+
            "\1\17\1\5\1\12\1\11\1\21\1\13\1\14\2\21\1\16\3\21\1\7\2\21\1"+
            "\6\1\21\1\15\5\21\105\24\100\21\uff00\24",
            "\1\26",
            "",
            "",
            "",
            "\1\32",
            "\1\33\3\uffff\1\34",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\40\5\uffff\1\37",
            "\1\41",
            "\1\42\1\43\1\44\1\45\1\46\1\47",
            "\1\52\10\uffff\1\51\1\50",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\73",
            "\1\74",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\100",
            "",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "",
            "",
            "",
            "\1\110",
            "",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\112",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "",
            "\1\117",
            "",
            "\1\120",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            "\1\124",
            "",
            "",
            "",
            "\1\125",
            "\1\22\2\uffff\1\22\6\uffff\21\22\5\uffff\32\22\4\uffff\1\22"+
            "\1\uffff\32\22\105\uffff\100\22",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__28 | T__29 | T__30 | T__31 | T__32 | DIV | SPAN | PARAGRAPH | ANCHOR | FORM | FIELDSET | STRONG | EMPHASIS | HEADER1 | HEADER2 | HEADER3 | HEADER4 | HEADER5 | HEADER6 | INPUT | UL | LI | IMG | ATTR_ID | ATTR_CLASS | QUOTE | WORD | HTMLTEXT | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_0 = input.LA(1);

                        s = -1;
                        if ( (LA2_0=='<') ) {s = 1;}

                        else if ( (LA2_0==' ') ) {s = 2;}

                        else if ( (LA2_0=='>') ) {s = 3;}

                        else if ( (LA2_0=='=') ) {s = 4;}

                        else if ( (LA2_0=='d') ) {s = 5;}

                        else if ( (LA2_0=='s') ) {s = 6;}

                        else if ( (LA2_0=='p') ) {s = 7;}

                        else if ( (LA2_0=='a') ) {s = 8;}

                        else if ( (LA2_0=='f') ) {s = 9;}

                        else if ( (LA2_0=='e') ) {s = 10;}

                        else if ( (LA2_0=='h') ) {s = 11;}

                        else if ( (LA2_0=='i') ) {s = 12;}

                        else if ( (LA2_0=='u') ) {s = 13;}

                        else if ( (LA2_0=='l') ) {s = 14;}

                        else if ( (LA2_0=='c') ) {s = 15;}

                        else if ( (LA2_0=='\"') ) {s = 16;}

                        else if ( (LA2_0=='!'||LA2_0=='$'||(LA2_0>='+' && LA2_0<=';')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||LA2_0=='b'||LA2_0=='g'||(LA2_0>='j' && LA2_0<='k')||(LA2_0>='m' && LA2_0<='o')||(LA2_0>='q' && LA2_0<='r')||LA2_0=='t'||(LA2_0>='v' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\u00FF')) ) {s = 17;}

                        else if ( (LA2_0=='\t'||LA2_0=='\f') ) {s = 19;}

                        else if ( ((LA2_0>='\u0000' && LA2_0<='\b')||LA2_0=='\u000B'||(LA2_0>='\u000E' && LA2_0<='\u001F')||LA2_0=='#'||(LA2_0>='%' && LA2_0<='*')||(LA2_0>='?' && LA2_0<='@')||(LA2_0>='[' && LA2_0<='^')||LA2_0=='`'||(LA2_0>='{' && LA2_0<='\u00BF')||(LA2_0>='\u0100' && LA2_0<='\uFFFF')) ) {s = 20;}

                        else if ( (LA2_0=='\n'||LA2_0=='\r') ) {s = 21;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}