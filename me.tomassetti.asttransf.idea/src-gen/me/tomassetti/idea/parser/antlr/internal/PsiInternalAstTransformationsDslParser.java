package me.tomassetti.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import me.tomassetti.idea.lang.AstTransformationsDslElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import me.tomassetti.services.AstTransformationsDslGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalAstTransformationsDslParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'adapt'", "'enum'", "'{'", "'}'", "'abstract'", "'type'", "'extends'", "'from'", "'*='", "'?='", "'='", "'string'", "'int'", "'boolean'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public PsiInternalAstTransformationsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalAstTransformationsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalAstTransformationsDslParser.tokenNames; }
    public String getGrammarFileName() { return "../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g"; }



    	protected AstTransformationsDslGrammarAccess grammarAccess;

    	protected AstTransformationsDslElementTypeProvider elementTypeProvider;

    	public PsiInternalAstTransformationsDslParser(PsiBuilder builder, TokenStream input, AstTransformationsDslElementTypeProvider elementTypeProvider, AstTransformationsDslGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Model";
    	}




    // $ANTLR start "entryRuleModel"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:52:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:52:15: ( ruleModel EOF )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:53:2: ruleModel EOF
            {
             markComposite(elementTypeProvider.getModelElementType()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel54);
            ruleModel();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_entryRuleModel57); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:58:1: ruleModel : ( ( (lv_antlr_0_0= ruleAntlrGrammarRef ) ) ( (lv_declarations_1_0= ruleDeclaration ) )* ) ;
    public final void ruleModel() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:58:10: ( ( ( (lv_antlr_0_0= ruleAntlrGrammarRef ) ) ( (lv_declarations_1_0= ruleDeclaration ) )* ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:59:2: ( ( (lv_antlr_0_0= ruleAntlrGrammarRef ) ) ( (lv_declarations_1_0= ruleDeclaration ) )* )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:59:2: ( ( (lv_antlr_0_0= ruleAntlrGrammarRef ) ) ( (lv_declarations_1_0= ruleDeclaration ) )* )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:60:3: ( (lv_antlr_0_0= ruleAntlrGrammarRef ) ) ( (lv_declarations_1_0= ruleDeclaration ) )*
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:60:3: ( (lv_antlr_0_0= ruleAntlrGrammarRef ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:61:4: (lv_antlr_0_0= ruleAntlrGrammarRef )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:61:4: (lv_antlr_0_0= ruleAntlrGrammarRef )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:62:5: lv_antlr_0_0= ruleAntlrGrammarRef
            {

            					markComposite(elementTypeProvider.getModel_AntlrAntlrGrammarRefParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_ruleAntlrGrammarRef_in_ruleModel89);
            ruleAntlrGrammarRef();

            state._fsp--;


            					doneComposite();
            				

            }


            }

            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:71:3: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:72:4: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:72:4: (lv_declarations_1_0= ruleDeclaration )
            	    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:73:5: lv_declarations_1_0= ruleDeclaration
            	    {

            	    					markComposite(elementTypeProvider.getModel_DeclarationsDeclarationParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleModel127);
            	    ruleDeclaration();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAntlrGrammarRef"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:86:1: entryRuleAntlrGrammarRef : ruleAntlrGrammarRef EOF ;
    public final void entryRuleAntlrGrammarRef() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:86:25: ( ruleAntlrGrammarRef EOF )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:87:2: ruleAntlrGrammarRef EOF
            {
             markComposite(elementTypeProvider.getAntlrGrammarRefElementType()); 
            pushFollow(FOLLOW_ruleAntlrGrammarRef_in_entryRuleAntlrGrammarRef159);
            ruleAntlrGrammarRef();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_entryRuleAntlrGrammarRef162); 

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
    // $ANTLR end "entryRuleAntlrGrammarRef"


    // $ANTLR start "ruleAntlrGrammarRef"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:92:1: ruleAntlrGrammarRef : (otherlv_0= 'adapt' ( (lv_grammarFile_1_0= RULE_STRING ) ) ) ;
    public final void ruleAntlrGrammarRef() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_grammarFile_1_0=null;

        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:92:20: ( (otherlv_0= 'adapt' ( (lv_grammarFile_1_0= RULE_STRING ) ) ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:93:2: (otherlv_0= 'adapt' ( (lv_grammarFile_1_0= RULE_STRING ) ) )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:93:2: (otherlv_0= 'adapt' ( (lv_grammarFile_1_0= RULE_STRING ) ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:94:3: otherlv_0= 'adapt' ( (lv_grammarFile_1_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getAntlrGrammarRef_AdaptKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAntlrGrammarRef181); 

            			doneLeaf(otherlv_0);
            		
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:101:3: ( (lv_grammarFile_1_0= RULE_STRING ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:102:4: (lv_grammarFile_1_0= RULE_STRING )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:102:4: (lv_grammarFile_1_0= RULE_STRING )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:103:5: lv_grammarFile_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getAntlrGrammarRef_GrammarFileSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_grammarFile_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAntlrGrammarRef208); 

            					doneLeaf(lv_grammarFile_1_0);
            				

            }


            }


            }


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
    // $ANTLR end "ruleAntlrGrammarRef"


    // $ANTLR start "entryRuleDeclaration"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:116:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:116:21: ( ruleDeclaration EOF )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:117:2: ruleDeclaration EOF
            {
             markComposite(elementTypeProvider.getDeclarationElementType()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration239);
            ruleDeclaration();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration242); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:122:1: ruleDeclaration : ( ruleNodeType | ruleNamedEnumDeclaration ) ;
    public final void ruleDeclaration() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:122:16: ( ( ruleNodeType | ruleNamedEnumDeclaration ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:123:2: ( ruleNodeType | ruleNamedEnumDeclaration )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:123:2: ( ruleNodeType | ruleNamedEnumDeclaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:124:3: ruleNodeType
                    {

                    			markComposite(elementTypeProvider.getDeclaration_NodeTypeParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_ruleNodeType_in_ruleDeclaration259);
                    ruleNodeType();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:132:3: ruleNamedEnumDeclaration
                    {

                    			markComposite(elementTypeProvider.getDeclaration_NamedEnumDeclarationParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_ruleNamedEnumDeclaration_in_ruleDeclaration279);
                    ruleNamedEnumDeclaration();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleNamedEnumDeclaration"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:143:1: entryRuleNamedEnumDeclaration : ruleNamedEnumDeclaration EOF ;
    public final void entryRuleNamedEnumDeclaration() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:143:30: ( ruleNamedEnumDeclaration EOF )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:144:2: ruleNamedEnumDeclaration EOF
            {
             markComposite(elementTypeProvider.getNamedEnumDeclarationElementType()); 
            pushFollow(FOLLOW_ruleNamedEnumDeclaration_in_entryRuleNamedEnumDeclaration299);
            ruleNamedEnumDeclaration();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedEnumDeclaration302); 

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
    // $ANTLR end "entryRuleNamedEnumDeclaration"


    // $ANTLR start "ruleNamedEnumDeclaration"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:149:1: ruleNamedEnumDeclaration : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_4= '}' ) ;
    public final void ruleNamedEnumDeclaration() throws RecognitionException {
        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:149:25: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_4= '}' ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:150:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_4= '}' )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:150:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_4= '}' )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:151:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_4= '}'
            {

            			markLeaf(elementTypeProvider.getNamedEnumDeclaration_EnumKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleNamedEnumDeclaration321); 

            			doneLeaf(otherlv_0);
            		
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:158:3: ( (lv_name_1_0= RULE_ID ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:159:4: (lv_name_1_0= RULE_ID )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:159:4: (lv_name_1_0= RULE_ID )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:160:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getNamedEnumDeclaration_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedEnumDeclaration348); 

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getNamedEnumDeclaration_LeftCurlyBracketKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleNamedEnumDeclaration373); 

            			doneLeaf(otherlv_2);
            		
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:176:3: ( (lv_values_3_0= ruleEnumNodeTypeFieldValue ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:177:4: (lv_values_3_0= ruleEnumNodeTypeFieldValue )
            	    {
            	    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:177:4: (lv_values_3_0= ruleEnumNodeTypeFieldValue )
            	    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:178:5: lv_values_3_0= ruleEnumNodeTypeFieldValue
            	    {

            	    					markComposite(elementTypeProvider.getNamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_3_0ElementType());
            	    				
            	    pushFollow(FOLLOW_ruleEnumNodeTypeFieldValue_in_ruleNamedEnumDeclaration400);
            	    ruleEnumNodeTypeFieldValue();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            			markLeaf(elementTypeProvider.getNamedEnumDeclaration_RightCurlyBracketKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleNamedEnumDeclaration426); 

            			doneLeaf(otherlv_4);
            		

            }


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
    // $ANTLR end "ruleNamedEnumDeclaration"


    // $ANTLR start "entryRuleUnnamedEnumDeclaration"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:198:1: entryRuleUnnamedEnumDeclaration : ruleUnnamedEnumDeclaration EOF ;
    public final void entryRuleUnnamedEnumDeclaration() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:198:32: ( ruleUnnamedEnumDeclaration EOF )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:199:2: ruleUnnamedEnumDeclaration EOF
            {
             markComposite(elementTypeProvider.getUnnamedEnumDeclarationElementType()); 
            pushFollow(FOLLOW_ruleUnnamedEnumDeclaration_in_entryRuleUnnamedEnumDeclaration446);
            ruleUnnamedEnumDeclaration();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedEnumDeclaration449); 

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
    // $ANTLR end "entryRuleUnnamedEnumDeclaration"


    // $ANTLR start "ruleUnnamedEnumDeclaration"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:204:1: ruleUnnamedEnumDeclaration : (otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_3= '}' ) ;
    public final void ruleUnnamedEnumDeclaration() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:204:27: ( (otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_3= '}' ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:205:2: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_3= '}' )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:205:2: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_3= '}' )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:206:3: otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_3= '}'
            {

            			markLeaf(elementTypeProvider.getUnnamedEnumDeclaration_EnumKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleUnnamedEnumDeclaration468); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getUnnamedEnumDeclaration_LeftCurlyBracketKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleUnnamedEnumDeclaration482); 

            			doneLeaf(otherlv_1);
            		
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:220:3: ( (lv_values_2_0= ruleEnumNodeTypeFieldValue ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:221:4: (lv_values_2_0= ruleEnumNodeTypeFieldValue )
            	    {
            	    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:221:4: (lv_values_2_0= ruleEnumNodeTypeFieldValue )
            	    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:222:5: lv_values_2_0= ruleEnumNodeTypeFieldValue
            	    {

            	    					markComposite(elementTypeProvider.getUnnamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_ruleEnumNodeTypeFieldValue_in_ruleUnnamedEnumDeclaration509);
            	    ruleEnumNodeTypeFieldValue();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            			markLeaf(elementTypeProvider.getUnnamedEnumDeclaration_RightCurlyBracketKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleUnnamedEnumDeclaration535); 

            			doneLeaf(otherlv_3);
            		

            }


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
    // $ANTLR end "ruleUnnamedEnumDeclaration"


    // $ANTLR start "entryRuleNodeType"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:242:1: entryRuleNodeType : ruleNodeType EOF ;
    public final void entryRuleNodeType() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:242:18: ( ruleNodeType EOF )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:243:2: ruleNodeType EOF
            {
             markComposite(elementTypeProvider.getNodeTypeElementType()); 
            pushFollow(FOLLOW_ruleNodeType_in_entryRuleNodeType555);
            ruleNodeType();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeType558); 

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
    // $ANTLR end "entryRuleNodeType"


    // $ANTLR start "ruleNodeType"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:248:1: ruleNodeType : ( (otherlv_0= 'abstract' )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_fields_8_0= ruleNodeTypeField ) )* otherlv_9= '}' ) ;
    public final void ruleNodeType() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_antlrNode_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;

        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:248:13: ( ( (otherlv_0= 'abstract' )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_fields_8_0= ruleNodeTypeField ) )* otherlv_9= '}' ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:249:2: ( (otherlv_0= 'abstract' )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_fields_8_0= ruleNodeTypeField ) )* otherlv_9= '}' )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:249:2: ( (otherlv_0= 'abstract' )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_fields_8_0= ruleNodeTypeField ) )* otherlv_9= '}' )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:250:3: (otherlv_0= 'abstract' )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_fields_8_0= ruleNodeTypeField ) )* otherlv_9= '}'
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:250:3: (otherlv_0= 'abstract' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:251:4: otherlv_0= 'abstract'
                    {

                    				markLeaf(elementTypeProvider.getNodeType_AbstractKeyword_0ElementType());
                    			
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleNodeType583); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getNodeType_TypeKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleNodeType603); 

            			doneLeaf(otherlv_1);
            		
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:266:3: ( (lv_name_2_0= RULE_ID ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:267:4: (lv_name_2_0= RULE_ID )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:267:4: (lv_name_2_0= RULE_ID )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:268:5: lv_name_2_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getNodeType_NameIDTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeType630); 

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:277:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:278:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getNodeType_ExtendsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleNodeType661); 

                    				doneLeaf(otherlv_3);
                    			
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:285:4: ( (otherlv_4= RULE_ID ) )
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:286:5: (otherlv_4= RULE_ID )
                    {
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:286:5: (otherlv_4= RULE_ID )
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:287:6: otherlv_4= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNodeType_SuperTypeNodeTypeCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeType693); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:297:3: (otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:298:4: otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getNodeType_FromKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleNodeType732); 

                    				doneLeaf(otherlv_5);
                    			
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:305:4: ( (lv_antlrNode_6_0= RULE_ID ) )
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:306:5: (lv_antlrNode_6_0= RULE_ID )
                    {
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:306:5: (lv_antlrNode_6_0= RULE_ID )
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:307:6: lv_antlrNode_6_0= RULE_ID
                    {

                    						markLeaf(elementTypeProvider.getNodeType_AntlrNodeIDTerminalRuleCall_4_1_0ElementType());
                    					
                    lv_antlrNode_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeType764); 

                    						doneLeaf(lv_antlrNode_6_0);
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getNodeType_LeftCurlyBracketKeyword_5ElementType());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleNodeType797); 

            			doneLeaf(otherlv_7);
            		
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:324:3: ( (lv_fields_8_0= ruleNodeTypeField ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:325:4: (lv_fields_8_0= ruleNodeTypeField )
            	    {
            	    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:325:4: (lv_fields_8_0= ruleNodeTypeField )
            	    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:326:5: lv_fields_8_0= ruleNodeTypeField
            	    {

            	    					markComposite(elementTypeProvider.getNodeType_FieldsNodeTypeFieldParserRuleCall_6_0ElementType());
            	    				
            	    pushFollow(FOLLOW_ruleNodeTypeField_in_ruleNodeType824);
            	    ruleNodeTypeField();

            	    state._fsp--;


            	    					doneComposite();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getNodeType_RightCurlyBracketKeyword_7ElementType());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleNodeType850); 

            			doneLeaf(otherlv_9);
            		

            }


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
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "entryRuleNodeTypeField"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:346:1: entryRuleNodeTypeField : ruleNodeTypeField EOF ;
    public final void entryRuleNodeTypeField() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:346:23: ( ruleNodeTypeField EOF )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:347:2: ruleNodeTypeField EOF
            {
             markComposite(elementTypeProvider.getNodeTypeFieldElementType()); 
            pushFollow(FOLLOW_ruleNodeTypeField_in_entryRuleNodeTypeField870);
            ruleNodeTypeField();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeField873); 

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
    // $ANTLR end "entryRuleNodeTypeField"


    // $ANTLR start "ruleNodeTypeField"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:352:1: ruleNodeTypeField : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_many_1_0= '*=' ) ) | ( (lv_optional_2_0= '?=' ) ) | ( (lv_single_3_0= '=' ) ) ) ( (lv_value_4_0= ruleNodeTypeFieldValue ) ) ) ;
    public final void ruleNodeTypeField() throws RecognitionException {
        Token lv_name_0_0=null;
        Token lv_many_1_0=null;
        Token lv_optional_2_0=null;
        Token lv_single_3_0=null;

        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:352:18: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_many_1_0= '*=' ) ) | ( (lv_optional_2_0= '?=' ) ) | ( (lv_single_3_0= '=' ) ) ) ( (lv_value_4_0= ruleNodeTypeFieldValue ) ) ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:353:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_many_1_0= '*=' ) ) | ( (lv_optional_2_0= '?=' ) ) | ( (lv_single_3_0= '=' ) ) ) ( (lv_value_4_0= ruleNodeTypeFieldValue ) ) )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:353:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_many_1_0= '*=' ) ) | ( (lv_optional_2_0= '?=' ) ) | ( (lv_single_3_0= '=' ) ) ) ( (lv_value_4_0= ruleNodeTypeFieldValue ) ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:354:3: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_many_1_0= '*=' ) ) | ( (lv_optional_2_0= '?=' ) ) | ( (lv_single_3_0= '=' ) ) ) ( (lv_value_4_0= ruleNodeTypeFieldValue ) )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:354:3: ( (lv_name_0_0= RULE_ID ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:355:4: (lv_name_0_0= RULE_ID )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:355:4: (lv_name_0_0= RULE_ID )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:356:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getNodeTypeField_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeTypeField905); 

            					doneLeaf(lv_name_0_0);
            				

            }


            }

            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:365:3: ( ( (lv_many_1_0= '*=' ) ) | ( (lv_optional_2_0= '?=' ) ) | ( (lv_single_3_0= '=' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
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
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:366:4: ( (lv_many_1_0= '*=' ) )
                    {
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:366:4: ( (lv_many_1_0= '*=' ) )
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:367:5: (lv_many_1_0= '*=' )
                    {
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:367:5: (lv_many_1_0= '*=' )
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:368:6: lv_many_1_0= '*='
                    {

                    						markLeaf(elementTypeProvider.getNodeTypeField_ManyAsteriskEqualsSignKeyword_1_0_0ElementType());
                    					
                    lv_many_1_0=(Token)match(input,19,FOLLOW_19_in_ruleNodeTypeField951); 

                    						doneLeaf(lv_many_1_0);
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:378:4: ( (lv_optional_2_0= '?=' ) )
                    {
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:378:4: ( (lv_optional_2_0= '?=' ) )
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:379:5: (lv_optional_2_0= '?=' )
                    {
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:379:5: (lv_optional_2_0= '?=' )
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:380:6: lv_optional_2_0= '?='
                    {

                    						markLeaf(elementTypeProvider.getNodeTypeField_OptionalQuestionMarkEqualsSignKeyword_1_1_0ElementType());
                    					
                    lv_optional_2_0=(Token)match(input,20,FOLLOW_20_in_ruleNodeTypeField1005); 

                    						doneLeaf(lv_optional_2_0);
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:390:4: ( (lv_single_3_0= '=' ) )
                    {
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:390:4: ( (lv_single_3_0= '=' ) )
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:391:5: (lv_single_3_0= '=' )
                    {
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:391:5: (lv_single_3_0= '=' )
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:392:6: lv_single_3_0= '='
                    {

                    						markLeaf(elementTypeProvider.getNodeTypeField_SingleEqualsSignKeyword_1_2_0ElementType());
                    					
                    lv_single_3_0=(Token)match(input,21,FOLLOW_21_in_ruleNodeTypeField1059); 

                    						doneLeaf(lv_single_3_0);
                    					

                    }


                    }


                    }
                    break;

            }

            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:402:3: ( (lv_value_4_0= ruleNodeTypeFieldValue ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:403:4: (lv_value_4_0= ruleNodeTypeFieldValue )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:403:4: (lv_value_4_0= ruleNodeTypeFieldValue )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:404:5: lv_value_4_0= ruleNodeTypeFieldValue
            {

            					markComposite(elementTypeProvider.getNodeTypeField_ValueNodeTypeFieldValueParserRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_ruleNodeTypeFieldValue_in_ruleNodeTypeField1104);
            ruleNodeTypeFieldValue();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


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
    // $ANTLR end "ruleNodeTypeField"


    // $ANTLR start "entryRuleNodeTypeFieldValue"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:417:1: entryRuleNodeTypeFieldValue : ruleNodeTypeFieldValue EOF ;
    public final void entryRuleNodeTypeFieldValue() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:417:28: ( ruleNodeTypeFieldValue EOF )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:418:2: ruleNodeTypeFieldValue EOF
            {
             markComposite(elementTypeProvider.getNodeTypeFieldValueElementType()); 
            pushFollow(FOLLOW_ruleNodeTypeFieldValue_in_entryRuleNodeTypeFieldValue1135);
            ruleNodeTypeFieldValue();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeFieldValue1138); 

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
    // $ANTLR end "entryRuleNodeTypeFieldValue"


    // $ANTLR start "ruleNodeTypeFieldValue"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:423:1: ruleNodeTypeFieldValue : ( ruleUnnamedEnumDeclaration | ruleRelationNodeTypeField | ruleAttributeNodeTypeField ) ;
    public final void ruleNodeTypeFieldValue() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:423:23: ( ( ruleUnnamedEnumDeclaration | ruleRelationNodeTypeField | ruleAttributeNodeTypeField ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:424:2: ( ruleUnnamedEnumDeclaration | ruleRelationNodeTypeField | ruleAttributeNodeTypeField )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:424:2: ( ruleUnnamedEnumDeclaration | ruleRelationNodeTypeField | ruleAttributeNodeTypeField )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case 22:
            case 23:
            case 24:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:425:3: ruleUnnamedEnumDeclaration
                    {

                    			markComposite(elementTypeProvider.getNodeTypeFieldValue_UnnamedEnumDeclarationParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_ruleUnnamedEnumDeclaration_in_ruleNodeTypeFieldValue1155);
                    ruleUnnamedEnumDeclaration();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:433:3: ruleRelationNodeTypeField
                    {

                    			markComposite(elementTypeProvider.getNodeTypeFieldValue_RelationNodeTypeFieldParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_ruleRelationNodeTypeField_in_ruleNodeTypeFieldValue1175);
                    ruleRelationNodeTypeField();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:441:3: ruleAttributeNodeTypeField
                    {

                    			markComposite(elementTypeProvider.getNodeTypeFieldValue_AttributeNodeTypeFieldParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_ruleAttributeNodeTypeField_in_ruleNodeTypeFieldValue1195);
                    ruleAttributeNodeTypeField();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


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
    // $ANTLR end "ruleNodeTypeFieldValue"


    // $ANTLR start "entryRuleEnumNodeTypeFieldValue"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:452:1: entryRuleEnumNodeTypeFieldValue : ruleEnumNodeTypeFieldValue EOF ;
    public final void entryRuleEnumNodeTypeFieldValue() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:452:32: ( ruleEnumNodeTypeFieldValue EOF )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:453:2: ruleEnumNodeTypeFieldValue EOF
            {
             markComposite(elementTypeProvider.getEnumNodeTypeFieldValueElementType()); 
            pushFollow(FOLLOW_ruleEnumNodeTypeFieldValue_in_entryRuleEnumNodeTypeFieldValue1215);
            ruleEnumNodeTypeFieldValue();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumNodeTypeFieldValue1218); 

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
    // $ANTLR end "entryRuleEnumNodeTypeFieldValue"


    // $ANTLR start "ruleEnumNodeTypeFieldValue"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:458:1: ruleEnumNodeTypeFieldValue : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void ruleEnumNodeTypeFieldValue() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:458:27: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:459:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:459:2: ( (lv_name_0_0= RULE_ID ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:460:3: (lv_name_0_0= RULE_ID )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:460:3: (lv_name_0_0= RULE_ID )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:461:4: lv_name_0_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getEnumNodeTypeFieldValue_NameIDTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumNodeTypeFieldValue1243); 

            				doneLeaf(lv_name_0_0);
            			

            }


            }


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
    // $ANTLR end "ruleEnumNodeTypeFieldValue"


    // $ANTLR start "entryRuleRelationNodeTypeField"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:473:1: entryRuleRelationNodeTypeField : ruleRelationNodeTypeField EOF ;
    public final void entryRuleRelationNodeTypeField() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:473:31: ( ruleRelationNodeTypeField EOF )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:474:2: ruleRelationNodeTypeField EOF
            {
             markComposite(elementTypeProvider.getRelationNodeTypeFieldElementType()); 
            pushFollow(FOLLOW_ruleRelationNodeTypeField_in_entryRuleRelationNodeTypeField1268);
            ruleRelationNodeTypeField();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationNodeTypeField1271); 

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
    // $ANTLR end "entryRuleRelationNodeTypeField"


    // $ANTLR start "ruleRelationNodeTypeField"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:479:1: ruleRelationNodeTypeField : ( (otherlv_0= RULE_ID ) ) ;
    public final void ruleRelationNodeTypeField() throws RecognitionException {
        Token otherlv_0=null;

        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:479:26: ( ( (otherlv_0= RULE_ID ) ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:480:2: ( (otherlv_0= RULE_ID ) )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:480:2: ( (otherlv_0= RULE_ID ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:481:3: (otherlv_0= RULE_ID )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:481:3: (otherlv_0= RULE_ID )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:482:4: otherlv_0= RULE_ID
            {

            				markLeaf(elementTypeProvider.getRelationNodeTypeField_TypeNodeTypeCrossReference_0ElementType());
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationNodeTypeField1296); 

            				doneLeaf(otherlv_0);
            			

            }


            }


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
    // $ANTLR end "ruleRelationNodeTypeField"


    // $ANTLR start "entryRuleAttributeNodeTypeField"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:494:1: entryRuleAttributeNodeTypeField : ruleAttributeNodeTypeField EOF ;
    public final void entryRuleAttributeNodeTypeField() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:494:32: ( ruleAttributeNodeTypeField EOF )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:495:2: ruleAttributeNodeTypeField EOF
            {
             markComposite(elementTypeProvider.getAttributeNodeTypeFieldElementType()); 
            pushFollow(FOLLOW_ruleAttributeNodeTypeField_in_entryRuleAttributeNodeTypeField1321);
            ruleAttributeNodeTypeField();

            state._fsp--;

            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeNodeTypeField1324); 

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
    // $ANTLR end "entryRuleAttributeNodeTypeField"


    // $ANTLR start "ruleAttributeNodeTypeField"
    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:500:1: ruleAttributeNodeTypeField : ( () (otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) ) ;
    public final void ruleAttributeNodeTypeField() throws RecognitionException {
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

        try {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:500:27: ( ( () (otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:501:2: ( () (otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:501:2: ( () (otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) )
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:502:3: () (otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' )
            {
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:502:3: ()
            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:503:4: 
            {

            				precedeComposite(elementTypeProvider.getAttributeNodeTypeField_AttributeNodeTypeFieldAction_0ElementType());
            				doneComposite();
            			

            }

            // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:508:3: (otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:509:4: otherlv_1= 'string'
                    {

                    				markLeaf(elementTypeProvider.getAttributeNodeTypeField_StringKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAttributeNodeTypeField1362); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 2 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:517:4: otherlv_2= 'int'
                    {

                    				markLeaf(elementTypeProvider.getAttributeNodeTypeField_IntKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAttributeNodeTypeField1388); 

                    				doneLeaf(otherlv_2);
                    			

                    }
                    break;
                case 3 :
                    // ../me.tomassetti.asttransf.idea/src-gen/me/tomassetti/idea/parser/antlr/internal/PsiInternalAstTransformationsDsl.g:525:4: otherlv_3= 'boolean'
                    {

                    				markLeaf(elementTypeProvider.getAttributeNodeTypeField_BooleanKeyword_1_2ElementType());
                    			
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAttributeNodeTypeField1414); 

                    				doneLeaf(otherlv_3);
                    			

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleAttributeNodeTypeField"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntlrGrammarRef_in_ruleModel89 = new BitSet(new long[]{0x0000000000019002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel127 = new BitSet(new long[]{0x0000000000019002L});
    public static final BitSet FOLLOW_ruleAntlrGrammarRef_in_entryRuleAntlrGrammarRef159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAntlrGrammarRef162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAntlrGrammarRef181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAntlrGrammarRef208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleDeclaration259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedEnumDeclaration_in_ruleDeclaration279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedEnumDeclaration_in_entryRuleNamedEnumDeclaration299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedEnumDeclaration302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleNamedEnumDeclaration321 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedEnumDeclaration348 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNamedEnumDeclaration373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumNodeTypeFieldValue_in_ruleNamedEnumDeclaration400 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleNamedEnumDeclaration426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedEnumDeclaration_in_entryRuleUnnamedEnumDeclaration446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedEnumDeclaration449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleUnnamedEnumDeclaration468 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUnnamedEnumDeclaration482 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumNodeTypeFieldValue_in_ruleUnnamedEnumDeclaration509 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleUnnamedEnumDeclaration535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_entryRuleNodeType555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeType558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleNodeType583 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNodeType603 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeType630 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_17_in_ruleNodeType661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeType693 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleNodeType732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeType764 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeType797 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleNodeTypeField_in_ruleNodeType824 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleNodeType850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeField_in_entryRuleNodeTypeField870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeField873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeTypeField905 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_19_in_ruleNodeTypeField951 = new BitSet(new long[]{0x0000000001C01020L});
    public static final BitSet FOLLOW_20_in_ruleNodeTypeField1005 = new BitSet(new long[]{0x0000000001C01020L});
    public static final BitSet FOLLOW_21_in_ruleNodeTypeField1059 = new BitSet(new long[]{0x0000000001C01020L});
    public static final BitSet FOLLOW_ruleNodeTypeFieldValue_in_ruleNodeTypeField1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeFieldValue_in_entryRuleNodeTypeFieldValue1135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeFieldValue1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedEnumDeclaration_in_ruleNodeTypeFieldValue1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationNodeTypeField_in_ruleNodeTypeFieldValue1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeNodeTypeField_in_ruleNodeTypeFieldValue1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumNodeTypeFieldValue_in_entryRuleEnumNodeTypeFieldValue1215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumNodeTypeFieldValue1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumNodeTypeFieldValue1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationNodeTypeField_in_entryRuleRelationNodeTypeField1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationNodeTypeField1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationNodeTypeField1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeNodeTypeField_in_entryRuleAttributeNodeTypeField1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeNodeTypeField1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttributeNodeTypeField1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAttributeNodeTypeField1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAttributeNodeTypeField1414 = new BitSet(new long[]{0x0000000000000002L});

}