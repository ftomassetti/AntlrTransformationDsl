package me.tomassetti.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import me.tomassetti.services.AstTransformationsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAstTransformationsDslParser extends AbstractInternalAntlrParser {
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


        public InternalAstTransformationsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAstTransformationsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAstTransformationsDslParser.tokenNames; }
    public String getGrammarFileName() { return "../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g"; }



     	private AstTransformationsDslGrammarAccess grammarAccess;
     	
        public InternalAstTransformationsDslParser(TokenStream input, AstTransformationsDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected AstTransformationsDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_antlr_0_0= ruleAntlrGrammarRef ) ) ( (lv_declarations_1_0= ruleDeclaration ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_antlr_0_0 = null;

        EObject lv_declarations_1_0 = null;


         enterRule(); 
            
        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:79:28: ( ( ( (lv_antlr_0_0= ruleAntlrGrammarRef ) ) ( (lv_declarations_1_0= ruleDeclaration ) )* ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:80:1: ( ( (lv_antlr_0_0= ruleAntlrGrammarRef ) ) ( (lv_declarations_1_0= ruleDeclaration ) )* )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:80:1: ( ( (lv_antlr_0_0= ruleAntlrGrammarRef ) ) ( (lv_declarations_1_0= ruleDeclaration ) )* )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:80:2: ( (lv_antlr_0_0= ruleAntlrGrammarRef ) ) ( (lv_declarations_1_0= ruleDeclaration ) )*
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:80:2: ( (lv_antlr_0_0= ruleAntlrGrammarRef ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:81:1: (lv_antlr_0_0= ruleAntlrGrammarRef )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:81:1: (lv_antlr_0_0= ruleAntlrGrammarRef )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:82:3: lv_antlr_0_0= ruleAntlrGrammarRef
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getAntlrAntlrGrammarRefParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAntlrGrammarRef_in_ruleModel131);
            lv_antlr_0_0=ruleAntlrGrammarRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"antlr",
                    		lv_antlr_0_0, 
                    		"AntlrGrammarRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:98:2: ( (lv_declarations_1_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:99:1: (lv_declarations_1_0= ruleDeclaration )
            	    {
            	    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:99:1: (lv_declarations_1_0= ruleDeclaration )
            	    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:100:3: lv_declarations_1_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleModel152);
            	    lv_declarations_1_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_1_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAntlrGrammarRef"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:124:1: entryRuleAntlrGrammarRef returns [EObject current=null] : iv_ruleAntlrGrammarRef= ruleAntlrGrammarRef EOF ;
    public final EObject entryRuleAntlrGrammarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAntlrGrammarRef = null;


        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:125:2: (iv_ruleAntlrGrammarRef= ruleAntlrGrammarRef EOF )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:126:2: iv_ruleAntlrGrammarRef= ruleAntlrGrammarRef EOF
            {
             newCompositeNode(grammarAccess.getAntlrGrammarRefRule()); 
            pushFollow(FOLLOW_ruleAntlrGrammarRef_in_entryRuleAntlrGrammarRef189);
            iv_ruleAntlrGrammarRef=ruleAntlrGrammarRef();

            state._fsp--;

             current =iv_ruleAntlrGrammarRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAntlrGrammarRef199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAntlrGrammarRef"


    // $ANTLR start "ruleAntlrGrammarRef"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:133:1: ruleAntlrGrammarRef returns [EObject current=null] : (otherlv_0= 'adapt' ( (lv_grammarFile_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAntlrGrammarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_grammarFile_1_0=null;

         enterRule(); 
            
        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:136:28: ( (otherlv_0= 'adapt' ( (lv_grammarFile_1_0= RULE_STRING ) ) ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:137:1: (otherlv_0= 'adapt' ( (lv_grammarFile_1_0= RULE_STRING ) ) )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:137:1: (otherlv_0= 'adapt' ( (lv_grammarFile_1_0= RULE_STRING ) ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:137:3: otherlv_0= 'adapt' ( (lv_grammarFile_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAntlrGrammarRef236); 

                	newLeafNode(otherlv_0, grammarAccess.getAntlrGrammarRefAccess().getAdaptKeyword_0());
                
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:141:1: ( (lv_grammarFile_1_0= RULE_STRING ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:142:1: (lv_grammarFile_1_0= RULE_STRING )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:142:1: (lv_grammarFile_1_0= RULE_STRING )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:143:3: lv_grammarFile_1_0= RULE_STRING
            {
            lv_grammarFile_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAntlrGrammarRef253); 

            			newLeafNode(lv_grammarFile_1_0, grammarAccess.getAntlrGrammarRefAccess().getGrammarFileSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAntlrGrammarRefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"grammarFile",
                    		lv_grammarFile_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAntlrGrammarRef"


    // $ANTLR start "entryRuleDeclaration"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:167:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:168:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:169:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration294);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:176:1: ruleDeclaration returns [EObject current=null] : (this_NodeType_0= ruleNodeType | this_NamedEnumDeclaration_1= ruleNamedEnumDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_NodeType_0 = null;

        EObject this_NamedEnumDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:179:28: ( (this_NodeType_0= ruleNodeType | this_NamedEnumDeclaration_1= ruleNamedEnumDeclaration ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:180:1: (this_NodeType_0= ruleNodeType | this_NamedEnumDeclaration_1= ruleNamedEnumDeclaration )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:180:1: (this_NodeType_0= ruleNodeType | this_NamedEnumDeclaration_1= ruleNamedEnumDeclaration )
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
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:181:5: this_NodeType_0= ruleNodeType
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getNodeTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNodeType_in_ruleDeclaration351);
                    this_NodeType_0=ruleNodeType();

                    state._fsp--;

                     
                            current = this_NodeType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:191:5: this_NamedEnumDeclaration_1= ruleNamedEnumDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getNamedEnumDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNamedEnumDeclaration_in_ruleDeclaration378);
                    this_NamedEnumDeclaration_1=ruleNamedEnumDeclaration();

                    state._fsp--;

                     
                            current = this_NamedEnumDeclaration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleNamedEnumDeclaration"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:207:1: entryRuleNamedEnumDeclaration returns [EObject current=null] : iv_ruleNamedEnumDeclaration= ruleNamedEnumDeclaration EOF ;
    public final EObject entryRuleNamedEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedEnumDeclaration = null;


        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:208:2: (iv_ruleNamedEnumDeclaration= ruleNamedEnumDeclaration EOF )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:209:2: iv_ruleNamedEnumDeclaration= ruleNamedEnumDeclaration EOF
            {
             newCompositeNode(grammarAccess.getNamedEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleNamedEnumDeclaration_in_entryRuleNamedEnumDeclaration413);
            iv_ruleNamedEnumDeclaration=ruleNamedEnumDeclaration();

            state._fsp--;

             current =iv_ruleNamedEnumDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedEnumDeclaration423); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedEnumDeclaration"


    // $ANTLR start "ruleNamedEnumDeclaration"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:216:1: ruleNamedEnumDeclaration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_4= '}' ) ;
    public final EObject ruleNamedEnumDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:219:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_4= '}' ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:220:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_4= '}' )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:220:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_4= '}' )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:220:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleNamedEnumDeclaration460); 

                	newLeafNode(otherlv_0, grammarAccess.getNamedEnumDeclarationAccess().getEnumKeyword_0());
                
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:224:1: ( (lv_name_1_0= RULE_ID ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:225:1: (lv_name_1_0= RULE_ID )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:225:1: (lv_name_1_0= RULE_ID )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:226:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedEnumDeclaration477); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNamedEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedEnumDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleNamedEnumDeclaration494); 

                	newLeafNode(otherlv_2, grammarAccess.getNamedEnumDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:246:1: ( (lv_values_3_0= ruleEnumNodeTypeFieldValue ) )+
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
            	    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:247:1: (lv_values_3_0= ruleEnumNodeTypeFieldValue )
            	    {
            	    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:247:1: (lv_values_3_0= ruleEnumNodeTypeFieldValue )
            	    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:248:3: lv_values_3_0= ruleEnumNodeTypeFieldValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNamedEnumDeclarationAccess().getValuesEnumNodeTypeFieldValueParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumNodeTypeFieldValue_in_ruleNamedEnumDeclaration515);
            	    lv_values_3_0=ruleEnumNodeTypeFieldValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNamedEnumDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_3_0, 
            	            		"EnumNodeTypeFieldValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleNamedEnumDeclaration528); 

                	newLeafNode(otherlv_4, grammarAccess.getNamedEnumDeclarationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedEnumDeclaration"


    // $ANTLR start "entryRuleUnnamedEnumDeclaration"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:276:1: entryRuleUnnamedEnumDeclaration returns [EObject current=null] : iv_ruleUnnamedEnumDeclaration= ruleUnnamedEnumDeclaration EOF ;
    public final EObject entryRuleUnnamedEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedEnumDeclaration = null;


        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:277:2: (iv_ruleUnnamedEnumDeclaration= ruleUnnamedEnumDeclaration EOF )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:278:2: iv_ruleUnnamedEnumDeclaration= ruleUnnamedEnumDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUnnamedEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleUnnamedEnumDeclaration_in_entryRuleUnnamedEnumDeclaration564);
            iv_ruleUnnamedEnumDeclaration=ruleUnnamedEnumDeclaration();

            state._fsp--;

             current =iv_ruleUnnamedEnumDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedEnumDeclaration574); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnnamedEnumDeclaration"


    // $ANTLR start "ruleUnnamedEnumDeclaration"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:285:1: ruleUnnamedEnumDeclaration returns [EObject current=null] : (otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_3= '}' ) ;
    public final EObject ruleUnnamedEnumDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_values_2_0 = null;


         enterRule(); 
            
        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:288:28: ( (otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_3= '}' ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:289:1: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_3= '}' )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:289:1: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_3= '}' )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:289:3: otherlv_0= 'enum' otherlv_1= '{' ( (lv_values_2_0= ruleEnumNodeTypeFieldValue ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleUnnamedEnumDeclaration611); 

                	newLeafNode(otherlv_0, grammarAccess.getUnnamedEnumDeclarationAccess().getEnumKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleUnnamedEnumDeclaration623); 

                	newLeafNode(otherlv_1, grammarAccess.getUnnamedEnumDeclarationAccess().getLeftCurlyBracketKeyword_1());
                
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:297:1: ( (lv_values_2_0= ruleEnumNodeTypeFieldValue ) )+
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
            	    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:298:1: (lv_values_2_0= ruleEnumNodeTypeFieldValue )
            	    {
            	    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:298:1: (lv_values_2_0= ruleEnumNodeTypeFieldValue )
            	    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:299:3: lv_values_2_0= ruleEnumNodeTypeFieldValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnnamedEnumDeclarationAccess().getValuesEnumNodeTypeFieldValueParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumNodeTypeFieldValue_in_ruleUnnamedEnumDeclaration644);
            	    lv_values_2_0=ruleEnumNodeTypeFieldValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnnamedEnumDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_2_0, 
            	            		"EnumNodeTypeFieldValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleUnnamedEnumDeclaration657); 

                	newLeafNode(otherlv_3, grammarAccess.getUnnamedEnumDeclarationAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnnamedEnumDeclaration"


    // $ANTLR start "entryRuleNodeType"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:327:1: entryRuleNodeType returns [EObject current=null] : iv_ruleNodeType= ruleNodeType EOF ;
    public final EObject entryRuleNodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeType = null;


        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:328:2: (iv_ruleNodeType= ruleNodeType EOF )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:329:2: iv_ruleNodeType= ruleNodeType EOF
            {
             newCompositeNode(grammarAccess.getNodeTypeRule()); 
            pushFollow(FOLLOW_ruleNodeType_in_entryRuleNodeType693);
            iv_ruleNodeType=ruleNodeType();

            state._fsp--;

             current =iv_ruleNodeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeType703); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeType"


    // $ANTLR start "ruleNodeType"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:336:1: ruleNodeType returns [EObject current=null] : ( (otherlv_0= 'abstract' )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_fields_8_0= ruleNodeTypeField ) )* otherlv_9= '}' ) ;
    public final EObject ruleNodeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_antlrNode_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_fields_8_0 = null;


         enterRule(); 
            
        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:339:28: ( ( (otherlv_0= 'abstract' )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_fields_8_0= ruleNodeTypeField ) )* otherlv_9= '}' ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:340:1: ( (otherlv_0= 'abstract' )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_fields_8_0= ruleNodeTypeField ) )* otherlv_9= '}' )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:340:1: ( (otherlv_0= 'abstract' )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_fields_8_0= ruleNodeTypeField ) )* otherlv_9= '}' )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:340:2: (otherlv_0= 'abstract' )? otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) ) )? otherlv_7= '{' ( (lv_fields_8_0= ruleNodeTypeField ) )* otherlv_9= '}'
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:340:2: (otherlv_0= 'abstract' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:340:4: otherlv_0= 'abstract'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleNodeType741); 

                        	newLeafNode(otherlv_0, grammarAccess.getNodeTypeAccess().getAbstractKeyword_0());
                        

                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleNodeType755); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeTypeAccess().getTypeKeyword_1());
                
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:348:1: ( (lv_name_2_0= RULE_ID ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:349:1: (lv_name_2_0= RULE_ID )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:349:1: (lv_name_2_0= RULE_ID )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:350:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeType772); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNodeTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:366:2: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:366:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleNodeType790); 

                        	newLeafNode(otherlv_3, grammarAccess.getNodeTypeAccess().getExtendsKeyword_3_0());
                        
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:370:1: ( (otherlv_4= RULE_ID ) )
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:371:1: (otherlv_4= RULE_ID )
                    {
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:371:1: (otherlv_4= RULE_ID )
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:372:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeTypeRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeType810); 

                    		newLeafNode(otherlv_4, grammarAccess.getNodeTypeAccess().getSuperTypeNodeTypeCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:383:4: (otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:383:6: otherlv_5= 'from' ( (lv_antlrNode_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleNodeType825); 

                        	newLeafNode(otherlv_5, grammarAccess.getNodeTypeAccess().getFromKeyword_4_0());
                        
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:387:1: ( (lv_antlrNode_6_0= RULE_ID ) )
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:388:1: (lv_antlrNode_6_0= RULE_ID )
                    {
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:388:1: (lv_antlrNode_6_0= RULE_ID )
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:389:3: lv_antlrNode_6_0= RULE_ID
                    {
                    lv_antlrNode_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeType842); 

                    			newLeafNode(lv_antlrNode_6_0, grammarAccess.getNodeTypeAccess().getAntlrNodeIDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"antlrNode",
                            		lv_antlrNode_6_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleNodeType861); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeTypeAccess().getLeftCurlyBracketKeyword_5());
                
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:409:1: ( (lv_fields_8_0= ruleNodeTypeField ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:410:1: (lv_fields_8_0= ruleNodeTypeField )
            	    {
            	    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:410:1: (lv_fields_8_0= ruleNodeTypeField )
            	    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:411:3: lv_fields_8_0= ruleNodeTypeField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeAccess().getFieldsNodeTypeFieldParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeTypeField_in_ruleNodeType882);
            	    lv_fields_8_0=ruleNodeTypeField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_8_0, 
            	            		"NodeTypeField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleNodeType895); 

                	newLeafNode(otherlv_9, grammarAccess.getNodeTypeAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "entryRuleNodeTypeField"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:439:1: entryRuleNodeTypeField returns [EObject current=null] : iv_ruleNodeTypeField= ruleNodeTypeField EOF ;
    public final EObject entryRuleNodeTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTypeField = null;


        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:440:2: (iv_ruleNodeTypeField= ruleNodeTypeField EOF )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:441:2: iv_ruleNodeTypeField= ruleNodeTypeField EOF
            {
             newCompositeNode(grammarAccess.getNodeTypeFieldRule()); 
            pushFollow(FOLLOW_ruleNodeTypeField_in_entryRuleNodeTypeField931);
            iv_ruleNodeTypeField=ruleNodeTypeField();

            state._fsp--;

             current =iv_ruleNodeTypeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeField941); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeTypeField"


    // $ANTLR start "ruleNodeTypeField"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:448:1: ruleNodeTypeField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_many_1_0= '*=' ) ) | ( (lv_optional_2_0= '?=' ) ) | ( (lv_single_3_0= '=' ) ) ) ( (lv_value_4_0= ruleNodeTypeFieldValue ) ) ) ;
    public final EObject ruleNodeTypeField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_many_1_0=null;
        Token lv_optional_2_0=null;
        Token lv_single_3_0=null;
        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:451:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_many_1_0= '*=' ) ) | ( (lv_optional_2_0= '?=' ) ) | ( (lv_single_3_0= '=' ) ) ) ( (lv_value_4_0= ruleNodeTypeFieldValue ) ) ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:452:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_many_1_0= '*=' ) ) | ( (lv_optional_2_0= '?=' ) ) | ( (lv_single_3_0= '=' ) ) ) ( (lv_value_4_0= ruleNodeTypeFieldValue ) ) )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:452:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_many_1_0= '*=' ) ) | ( (lv_optional_2_0= '?=' ) ) | ( (lv_single_3_0= '=' ) ) ) ( (lv_value_4_0= ruleNodeTypeFieldValue ) ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:452:2: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_many_1_0= '*=' ) ) | ( (lv_optional_2_0= '?=' ) ) | ( (lv_single_3_0= '=' ) ) ) ( (lv_value_4_0= ruleNodeTypeFieldValue ) )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:452:2: ( (lv_name_0_0= RULE_ID ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:453:1: (lv_name_0_0= RULE_ID )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:453:1: (lv_name_0_0= RULE_ID )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:454:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeTypeField983); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNodeTypeFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeTypeFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:470:2: ( ( (lv_many_1_0= '*=' ) ) | ( (lv_optional_2_0= '?=' ) ) | ( (lv_single_3_0= '=' ) ) )
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
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:470:3: ( (lv_many_1_0= '*=' ) )
                    {
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:470:3: ( (lv_many_1_0= '*=' ) )
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:471:1: (lv_many_1_0= '*=' )
                    {
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:471:1: (lv_many_1_0= '*=' )
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:472:3: lv_many_1_0= '*='
                    {
                    lv_many_1_0=(Token)match(input,19,FOLLOW_19_in_ruleNodeTypeField1007); 

                            newLeafNode(lv_many_1_0, grammarAccess.getNodeTypeFieldAccess().getManyAsteriskEqualsSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "many", lv_many_1_0, "*=");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:486:6: ( (lv_optional_2_0= '?=' ) )
                    {
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:486:6: ( (lv_optional_2_0= '?=' ) )
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:487:1: (lv_optional_2_0= '?=' )
                    {
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:487:1: (lv_optional_2_0= '?=' )
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:488:3: lv_optional_2_0= '?='
                    {
                    lv_optional_2_0=(Token)match(input,20,FOLLOW_20_in_ruleNodeTypeField1044); 

                            newLeafNode(lv_optional_2_0, grammarAccess.getNodeTypeFieldAccess().getOptionalQuestionMarkEqualsSignKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "optional", lv_optional_2_0, "?=");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:502:6: ( (lv_single_3_0= '=' ) )
                    {
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:502:6: ( (lv_single_3_0= '=' ) )
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:503:1: (lv_single_3_0= '=' )
                    {
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:503:1: (lv_single_3_0= '=' )
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:504:3: lv_single_3_0= '='
                    {
                    lv_single_3_0=(Token)match(input,21,FOLLOW_21_in_ruleNodeTypeField1081); 

                            newLeafNode(lv_single_3_0, grammarAccess.getNodeTypeFieldAccess().getSingleEqualsSignKeyword_1_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeTypeFieldRule());
                    	        }
                           		setWithLastConsumed(current, "single", lv_single_3_0, "=");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:517:3: ( (lv_value_4_0= ruleNodeTypeFieldValue ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:518:1: (lv_value_4_0= ruleNodeTypeFieldValue )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:518:1: (lv_value_4_0= ruleNodeTypeFieldValue )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:519:3: lv_value_4_0= ruleNodeTypeFieldValue
            {
             
            	        newCompositeNode(grammarAccess.getNodeTypeFieldAccess().getValueNodeTypeFieldValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNodeTypeFieldValue_in_ruleNodeTypeField1116);
            lv_value_4_0=ruleNodeTypeFieldValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeTypeFieldRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"NodeTypeFieldValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeTypeField"


    // $ANTLR start "entryRuleNodeTypeFieldValue"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:543:1: entryRuleNodeTypeFieldValue returns [EObject current=null] : iv_ruleNodeTypeFieldValue= ruleNodeTypeFieldValue EOF ;
    public final EObject entryRuleNodeTypeFieldValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTypeFieldValue = null;


        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:544:2: (iv_ruleNodeTypeFieldValue= ruleNodeTypeFieldValue EOF )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:545:2: iv_ruleNodeTypeFieldValue= ruleNodeTypeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getNodeTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleNodeTypeFieldValue_in_entryRuleNodeTypeFieldValue1152);
            iv_ruleNodeTypeFieldValue=ruleNodeTypeFieldValue();

            state._fsp--;

             current =iv_ruleNodeTypeFieldValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeFieldValue1162); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeTypeFieldValue"


    // $ANTLR start "ruleNodeTypeFieldValue"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:552:1: ruleNodeTypeFieldValue returns [EObject current=null] : (this_UnnamedEnumDeclaration_0= ruleUnnamedEnumDeclaration | this_RelationNodeTypeField_1= ruleRelationNodeTypeField | this_AttributeNodeTypeField_2= ruleAttributeNodeTypeField ) ;
    public final EObject ruleNodeTypeFieldValue() throws RecognitionException {
        EObject current = null;

        EObject this_UnnamedEnumDeclaration_0 = null;

        EObject this_RelationNodeTypeField_1 = null;

        EObject this_AttributeNodeTypeField_2 = null;


         enterRule(); 
            
        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:555:28: ( (this_UnnamedEnumDeclaration_0= ruleUnnamedEnumDeclaration | this_RelationNodeTypeField_1= ruleRelationNodeTypeField | this_AttributeNodeTypeField_2= ruleAttributeNodeTypeField ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:556:1: (this_UnnamedEnumDeclaration_0= ruleUnnamedEnumDeclaration | this_RelationNodeTypeField_1= ruleRelationNodeTypeField | this_AttributeNodeTypeField_2= ruleAttributeNodeTypeField )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:556:1: (this_UnnamedEnumDeclaration_0= ruleUnnamedEnumDeclaration | this_RelationNodeTypeField_1= ruleRelationNodeTypeField | this_AttributeNodeTypeField_2= ruleAttributeNodeTypeField )
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
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:557:5: this_UnnamedEnumDeclaration_0= ruleUnnamedEnumDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getNodeTypeFieldValueAccess().getUnnamedEnumDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUnnamedEnumDeclaration_in_ruleNodeTypeFieldValue1209);
                    this_UnnamedEnumDeclaration_0=ruleUnnamedEnumDeclaration();

                    state._fsp--;

                     
                            current = this_UnnamedEnumDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:567:5: this_RelationNodeTypeField_1= ruleRelationNodeTypeField
                    {
                     
                            newCompositeNode(grammarAccess.getNodeTypeFieldValueAccess().getRelationNodeTypeFieldParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRelationNodeTypeField_in_ruleNodeTypeFieldValue1236);
                    this_RelationNodeTypeField_1=ruleRelationNodeTypeField();

                    state._fsp--;

                     
                            current = this_RelationNodeTypeField_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:577:5: this_AttributeNodeTypeField_2= ruleAttributeNodeTypeField
                    {
                     
                            newCompositeNode(grammarAccess.getNodeTypeFieldValueAccess().getAttributeNodeTypeFieldParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAttributeNodeTypeField_in_ruleNodeTypeFieldValue1263);
                    this_AttributeNodeTypeField_2=ruleAttributeNodeTypeField();

                    state._fsp--;

                     
                            current = this_AttributeNodeTypeField_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeTypeFieldValue"


    // $ANTLR start "entryRuleEnumNodeTypeFieldValue"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:593:1: entryRuleEnumNodeTypeFieldValue returns [EObject current=null] : iv_ruleEnumNodeTypeFieldValue= ruleEnumNodeTypeFieldValue EOF ;
    public final EObject entryRuleEnumNodeTypeFieldValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumNodeTypeFieldValue = null;


        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:594:2: (iv_ruleEnumNodeTypeFieldValue= ruleEnumNodeTypeFieldValue EOF )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:595:2: iv_ruleEnumNodeTypeFieldValue= ruleEnumNodeTypeFieldValue EOF
            {
             newCompositeNode(grammarAccess.getEnumNodeTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleEnumNodeTypeFieldValue_in_entryRuleEnumNodeTypeFieldValue1298);
            iv_ruleEnumNodeTypeFieldValue=ruleEnumNodeTypeFieldValue();

            state._fsp--;

             current =iv_ruleEnumNodeTypeFieldValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumNodeTypeFieldValue1308); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumNodeTypeFieldValue"


    // $ANTLR start "ruleEnumNodeTypeFieldValue"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:602:1: ruleEnumNodeTypeFieldValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumNodeTypeFieldValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:605:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:606:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:606:1: ( (lv_name_0_0= RULE_ID ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:607:1: (lv_name_0_0= RULE_ID )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:607:1: (lv_name_0_0= RULE_ID )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:608:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumNodeTypeFieldValue1349); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumNodeTypeFieldValueAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumNodeTypeFieldValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumNodeTypeFieldValue"


    // $ANTLR start "entryRuleRelationNodeTypeField"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:632:1: entryRuleRelationNodeTypeField returns [EObject current=null] : iv_ruleRelationNodeTypeField= ruleRelationNodeTypeField EOF ;
    public final EObject entryRuleRelationNodeTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationNodeTypeField = null;


        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:633:2: (iv_ruleRelationNodeTypeField= ruleRelationNodeTypeField EOF )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:634:2: iv_ruleRelationNodeTypeField= ruleRelationNodeTypeField EOF
            {
             newCompositeNode(grammarAccess.getRelationNodeTypeFieldRule()); 
            pushFollow(FOLLOW_ruleRelationNodeTypeField_in_entryRuleRelationNodeTypeField1389);
            iv_ruleRelationNodeTypeField=ruleRelationNodeTypeField();

            state._fsp--;

             current =iv_ruleRelationNodeTypeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationNodeTypeField1399); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationNodeTypeField"


    // $ANTLR start "ruleRelationNodeTypeField"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:641:1: ruleRelationNodeTypeField returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRelationNodeTypeField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:644:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:645:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:645:1: ( (otherlv_0= RULE_ID ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:646:1: (otherlv_0= RULE_ID )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:646:1: (otherlv_0= RULE_ID )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:647:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationNodeTypeFieldRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationNodeTypeField1443); 

            		newLeafNode(otherlv_0, grammarAccess.getRelationNodeTypeFieldAccess().getTypeNodeTypeCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationNodeTypeField"


    // $ANTLR start "entryRuleAttributeNodeTypeField"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:666:1: entryRuleAttributeNodeTypeField returns [EObject current=null] : iv_ruleAttributeNodeTypeField= ruleAttributeNodeTypeField EOF ;
    public final EObject entryRuleAttributeNodeTypeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeNodeTypeField = null;


        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:667:2: (iv_ruleAttributeNodeTypeField= ruleAttributeNodeTypeField EOF )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:668:2: iv_ruleAttributeNodeTypeField= ruleAttributeNodeTypeField EOF
            {
             newCompositeNode(grammarAccess.getAttributeNodeTypeFieldRule()); 
            pushFollow(FOLLOW_ruleAttributeNodeTypeField_in_entryRuleAttributeNodeTypeField1478);
            iv_ruleAttributeNodeTypeField=ruleAttributeNodeTypeField();

            state._fsp--;

             current =iv_ruleAttributeNodeTypeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeNodeTypeField1488); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeNodeTypeField"


    // $ANTLR start "ruleAttributeNodeTypeField"
    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:675:1: ruleAttributeNodeTypeField returns [EObject current=null] : ( () (otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) ) ;
    public final EObject ruleAttributeNodeTypeField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:678:28: ( ( () (otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:679:1: ( () (otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:679:1: ( () (otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' ) )
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:679:2: () (otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' )
            {
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:679:2: ()
            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:680:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeNodeTypeFieldAccess().getAttributeNodeTypeFieldAction_0(),
                        current);
                

            }

            // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:685:2: (otherlv_1= 'string' | otherlv_2= 'int' | otherlv_3= 'boolean' )
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
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:685:4: otherlv_1= 'string'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAttributeNodeTypeField1535); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeNodeTypeFieldAccess().getStringKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:690:7: otherlv_2= 'int'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAttributeNodeTypeField1553); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeNodeTypeFieldAccess().getIntKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../me.tomassetti.asttransf/src-gen/me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.g:695:7: otherlv_3= 'boolean'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleAttributeNodeTypeField1571); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeNodeTypeFieldAccess().getBooleanKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeNodeTypeField"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntlrGrammarRef_in_ruleModel131 = new BitSet(new long[]{0x0000000000019002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel152 = new BitSet(new long[]{0x0000000000019002L});
    public static final BitSet FOLLOW_ruleAntlrGrammarRef_in_entryRuleAntlrGrammarRef189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAntlrGrammarRef199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAntlrGrammarRef236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAntlrGrammarRef253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleDeclaration351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedEnumDeclaration_in_ruleDeclaration378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedEnumDeclaration_in_entryRuleNamedEnumDeclaration413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedEnumDeclaration423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleNamedEnumDeclaration460 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedEnumDeclaration477 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNamedEnumDeclaration494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumNodeTypeFieldValue_in_ruleNamedEnumDeclaration515 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleNamedEnumDeclaration528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedEnumDeclaration_in_entryRuleUnnamedEnumDeclaration564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedEnumDeclaration574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleUnnamedEnumDeclaration611 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUnnamedEnumDeclaration623 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEnumNodeTypeFieldValue_in_ruleUnnamedEnumDeclaration644 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleUnnamedEnumDeclaration657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_entryRuleNodeType693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeType703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleNodeType741 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNodeType755 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeType772 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_17_in_ruleNodeType790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeType810 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleNodeType825 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeType842 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleNodeType861 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ruleNodeTypeField_in_ruleNodeType882 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleNodeType895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeField_in_entryRuleNodeTypeField931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeField941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeTypeField983 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_19_in_ruleNodeTypeField1007 = new BitSet(new long[]{0x0000000001C01020L});
    public static final BitSet FOLLOW_20_in_ruleNodeTypeField1044 = new BitSet(new long[]{0x0000000001C01020L});
    public static final BitSet FOLLOW_21_in_ruleNodeTypeField1081 = new BitSet(new long[]{0x0000000001C01020L});
    public static final BitSet FOLLOW_ruleNodeTypeFieldValue_in_ruleNodeTypeField1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeFieldValue_in_entryRuleNodeTypeFieldValue1152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeFieldValue1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedEnumDeclaration_in_ruleNodeTypeFieldValue1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationNodeTypeField_in_ruleNodeTypeFieldValue1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeNodeTypeField_in_ruleNodeTypeFieldValue1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumNodeTypeFieldValue_in_entryRuleEnumNodeTypeFieldValue1298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumNodeTypeFieldValue1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumNodeTypeFieldValue1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationNodeTypeField_in_entryRuleRelationNodeTypeField1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationNodeTypeField1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationNodeTypeField1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeNodeTypeField_in_entryRuleAttributeNodeTypeField1478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeNodeTypeField1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttributeNodeTypeField1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAttributeNodeTypeField1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAttributeNodeTypeField1571 = new BitSet(new long[]{0x0000000000000002L});

}