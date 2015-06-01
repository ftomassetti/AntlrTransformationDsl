package me.tomassetti.ide.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import me.tomassetti.services.AstTransformationsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAstTransformationsDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'boolean'", "'adapt'", "'enum'", "'{'", "'}'", "'abstract'", "'type'", "'extends'", "'from'", "'*='", "'?='", "'='"
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
    public String getGrammarFileName() { return "../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g"; }


     
     	private AstTransformationsDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AstTransformationsDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:61:1: ( ruleModel EOF )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:76:1: ( rule__Model__Group__0 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAntlrGrammarRef"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:88:1: entryRuleAntlrGrammarRef : ruleAntlrGrammarRef EOF ;
    public final void entryRuleAntlrGrammarRef() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:89:1: ( ruleAntlrGrammarRef EOF )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:90:1: ruleAntlrGrammarRef EOF
            {
             before(grammarAccess.getAntlrGrammarRefRule()); 
            pushFollow(FOLLOW_ruleAntlrGrammarRef_in_entryRuleAntlrGrammarRef121);
            ruleAntlrGrammarRef();

            state._fsp--;

             after(grammarAccess.getAntlrGrammarRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAntlrGrammarRef128); 

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
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:97:1: ruleAntlrGrammarRef : ( ( rule__AntlrGrammarRef__Group__0 ) ) ;
    public final void ruleAntlrGrammarRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:101:2: ( ( ( rule__AntlrGrammarRef__Group__0 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:102:1: ( ( rule__AntlrGrammarRef__Group__0 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:102:1: ( ( rule__AntlrGrammarRef__Group__0 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:103:1: ( rule__AntlrGrammarRef__Group__0 )
            {
             before(grammarAccess.getAntlrGrammarRefAccess().getGroup()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:104:1: ( rule__AntlrGrammarRef__Group__0 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:104:2: rule__AntlrGrammarRef__Group__0
            {
            pushFollow(FOLLOW_rule__AntlrGrammarRef__Group__0_in_ruleAntlrGrammarRef154);
            rule__AntlrGrammarRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAntlrGrammarRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAntlrGrammarRef"


    // $ANTLR start "entryRuleDeclaration"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:116:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:117:1: ( ruleDeclaration EOF )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:118:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration181);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration188); 

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
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:125:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:129:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:130:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:130:1: ( ( rule__Declaration__Alternatives ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:131:1: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:132:1: ( rule__Declaration__Alternatives )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:132:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration214);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleNamedEnumDeclaration"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:144:1: entryRuleNamedEnumDeclaration : ruleNamedEnumDeclaration EOF ;
    public final void entryRuleNamedEnumDeclaration() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:145:1: ( ruleNamedEnumDeclaration EOF )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:146:1: ruleNamedEnumDeclaration EOF
            {
             before(grammarAccess.getNamedEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleNamedEnumDeclaration_in_entryRuleNamedEnumDeclaration241);
            ruleNamedEnumDeclaration();

            state._fsp--;

             after(grammarAccess.getNamedEnumDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedEnumDeclaration248); 

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
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:153:1: ruleNamedEnumDeclaration : ( ( rule__NamedEnumDeclaration__Group__0 ) ) ;
    public final void ruleNamedEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:157:2: ( ( ( rule__NamedEnumDeclaration__Group__0 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:158:1: ( ( rule__NamedEnumDeclaration__Group__0 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:158:1: ( ( rule__NamedEnumDeclaration__Group__0 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:159:1: ( rule__NamedEnumDeclaration__Group__0 )
            {
             before(grammarAccess.getNamedEnumDeclarationAccess().getGroup()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:160:1: ( rule__NamedEnumDeclaration__Group__0 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:160:2: rule__NamedEnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__NamedEnumDeclaration__Group__0_in_ruleNamedEnumDeclaration274);
            rule__NamedEnumDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedEnumDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedEnumDeclaration"


    // $ANTLR start "entryRuleUnnamedEnumDeclaration"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:172:1: entryRuleUnnamedEnumDeclaration : ruleUnnamedEnumDeclaration EOF ;
    public final void entryRuleUnnamedEnumDeclaration() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:173:1: ( ruleUnnamedEnumDeclaration EOF )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:174:1: ruleUnnamedEnumDeclaration EOF
            {
             before(grammarAccess.getUnnamedEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleUnnamedEnumDeclaration_in_entryRuleUnnamedEnumDeclaration301);
            ruleUnnamedEnumDeclaration();

            state._fsp--;

             after(grammarAccess.getUnnamedEnumDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedEnumDeclaration308); 

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
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:181:1: ruleUnnamedEnumDeclaration : ( ( rule__UnnamedEnumDeclaration__Group__0 ) ) ;
    public final void ruleUnnamedEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:185:2: ( ( ( rule__UnnamedEnumDeclaration__Group__0 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:186:1: ( ( rule__UnnamedEnumDeclaration__Group__0 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:186:1: ( ( rule__UnnamedEnumDeclaration__Group__0 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:187:1: ( rule__UnnamedEnumDeclaration__Group__0 )
            {
             before(grammarAccess.getUnnamedEnumDeclarationAccess().getGroup()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:188:1: ( rule__UnnamedEnumDeclaration__Group__0 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:188:2: rule__UnnamedEnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__UnnamedEnumDeclaration__Group__0_in_ruleUnnamedEnumDeclaration334);
            rule__UnnamedEnumDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedEnumDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnnamedEnumDeclaration"


    // $ANTLR start "entryRuleNodeType"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:200:1: entryRuleNodeType : ruleNodeType EOF ;
    public final void entryRuleNodeType() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:201:1: ( ruleNodeType EOF )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:202:1: ruleNodeType EOF
            {
             before(grammarAccess.getNodeTypeRule()); 
            pushFollow(FOLLOW_ruleNodeType_in_entryRuleNodeType361);
            ruleNodeType();

            state._fsp--;

             after(grammarAccess.getNodeTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeType368); 

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
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:209:1: ruleNodeType : ( ( rule__NodeType__Group__0 ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:213:2: ( ( ( rule__NodeType__Group__0 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:214:1: ( ( rule__NodeType__Group__0 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:214:1: ( ( rule__NodeType__Group__0 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:215:1: ( rule__NodeType__Group__0 )
            {
             before(grammarAccess.getNodeTypeAccess().getGroup()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:216:1: ( rule__NodeType__Group__0 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:216:2: rule__NodeType__Group__0
            {
            pushFollow(FOLLOW_rule__NodeType__Group__0_in_ruleNodeType394);
            rule__NodeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "entryRuleNodeTypeField"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:228:1: entryRuleNodeTypeField : ruleNodeTypeField EOF ;
    public final void entryRuleNodeTypeField() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:229:1: ( ruleNodeTypeField EOF )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:230:1: ruleNodeTypeField EOF
            {
             before(grammarAccess.getNodeTypeFieldRule()); 
            pushFollow(FOLLOW_ruleNodeTypeField_in_entryRuleNodeTypeField421);
            ruleNodeTypeField();

            state._fsp--;

             after(grammarAccess.getNodeTypeFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeField428); 

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
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:237:1: ruleNodeTypeField : ( ( rule__NodeTypeField__Group__0 ) ) ;
    public final void ruleNodeTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:241:2: ( ( ( rule__NodeTypeField__Group__0 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:242:1: ( ( rule__NodeTypeField__Group__0 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:242:1: ( ( rule__NodeTypeField__Group__0 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:243:1: ( rule__NodeTypeField__Group__0 )
            {
             before(grammarAccess.getNodeTypeFieldAccess().getGroup()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:244:1: ( rule__NodeTypeField__Group__0 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:244:2: rule__NodeTypeField__Group__0
            {
            pushFollow(FOLLOW_rule__NodeTypeField__Group__0_in_ruleNodeTypeField454);
            rule__NodeTypeField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeTypeField"


    // $ANTLR start "entryRuleNodeTypeFieldValue"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:256:1: entryRuleNodeTypeFieldValue : ruleNodeTypeFieldValue EOF ;
    public final void entryRuleNodeTypeFieldValue() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:257:1: ( ruleNodeTypeFieldValue EOF )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:258:1: ruleNodeTypeFieldValue EOF
            {
             before(grammarAccess.getNodeTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleNodeTypeFieldValue_in_entryRuleNodeTypeFieldValue481);
            ruleNodeTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getNodeTypeFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeFieldValue488); 

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
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:265:1: ruleNodeTypeFieldValue : ( ( rule__NodeTypeFieldValue__Alternatives ) ) ;
    public final void ruleNodeTypeFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:269:2: ( ( ( rule__NodeTypeFieldValue__Alternatives ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:270:1: ( ( rule__NodeTypeFieldValue__Alternatives ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:270:1: ( ( rule__NodeTypeFieldValue__Alternatives ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:271:1: ( rule__NodeTypeFieldValue__Alternatives )
            {
             before(grammarAccess.getNodeTypeFieldValueAccess().getAlternatives()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:272:1: ( rule__NodeTypeFieldValue__Alternatives )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:272:2: rule__NodeTypeFieldValue__Alternatives
            {
            pushFollow(FOLLOW_rule__NodeTypeFieldValue__Alternatives_in_ruleNodeTypeFieldValue514);
            rule__NodeTypeFieldValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeFieldValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeTypeFieldValue"


    // $ANTLR start "entryRuleEnumNodeTypeFieldValue"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:284:1: entryRuleEnumNodeTypeFieldValue : ruleEnumNodeTypeFieldValue EOF ;
    public final void entryRuleEnumNodeTypeFieldValue() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:285:1: ( ruleEnumNodeTypeFieldValue EOF )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:286:1: ruleEnumNodeTypeFieldValue EOF
            {
             before(grammarAccess.getEnumNodeTypeFieldValueRule()); 
            pushFollow(FOLLOW_ruleEnumNodeTypeFieldValue_in_entryRuleEnumNodeTypeFieldValue541);
            ruleEnumNodeTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getEnumNodeTypeFieldValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumNodeTypeFieldValue548); 

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
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:293:1: ruleEnumNodeTypeFieldValue : ( ( rule__EnumNodeTypeFieldValue__NameAssignment ) ) ;
    public final void ruleEnumNodeTypeFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:297:2: ( ( ( rule__EnumNodeTypeFieldValue__NameAssignment ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:298:1: ( ( rule__EnumNodeTypeFieldValue__NameAssignment ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:298:1: ( ( rule__EnumNodeTypeFieldValue__NameAssignment ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:299:1: ( rule__EnumNodeTypeFieldValue__NameAssignment )
            {
             before(grammarAccess.getEnumNodeTypeFieldValueAccess().getNameAssignment()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:300:1: ( rule__EnumNodeTypeFieldValue__NameAssignment )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:300:2: rule__EnumNodeTypeFieldValue__NameAssignment
            {
            pushFollow(FOLLOW_rule__EnumNodeTypeFieldValue__NameAssignment_in_ruleEnumNodeTypeFieldValue574);
            rule__EnumNodeTypeFieldValue__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumNodeTypeFieldValueAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumNodeTypeFieldValue"


    // $ANTLR start "entryRuleRelationNodeTypeField"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:312:1: entryRuleRelationNodeTypeField : ruleRelationNodeTypeField EOF ;
    public final void entryRuleRelationNodeTypeField() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:313:1: ( ruleRelationNodeTypeField EOF )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:314:1: ruleRelationNodeTypeField EOF
            {
             before(grammarAccess.getRelationNodeTypeFieldRule()); 
            pushFollow(FOLLOW_ruleRelationNodeTypeField_in_entryRuleRelationNodeTypeField601);
            ruleRelationNodeTypeField();

            state._fsp--;

             after(grammarAccess.getRelationNodeTypeFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationNodeTypeField608); 

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
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:321:1: ruleRelationNodeTypeField : ( ( rule__RelationNodeTypeField__TypeAssignment ) ) ;
    public final void ruleRelationNodeTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:325:2: ( ( ( rule__RelationNodeTypeField__TypeAssignment ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:326:1: ( ( rule__RelationNodeTypeField__TypeAssignment ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:326:1: ( ( rule__RelationNodeTypeField__TypeAssignment ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:327:1: ( rule__RelationNodeTypeField__TypeAssignment )
            {
             before(grammarAccess.getRelationNodeTypeFieldAccess().getTypeAssignment()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:328:1: ( rule__RelationNodeTypeField__TypeAssignment )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:328:2: rule__RelationNodeTypeField__TypeAssignment
            {
            pushFollow(FOLLOW_rule__RelationNodeTypeField__TypeAssignment_in_ruleRelationNodeTypeField634);
            rule__RelationNodeTypeField__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRelationNodeTypeFieldAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationNodeTypeField"


    // $ANTLR start "entryRuleAttributeNodeTypeField"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:340:1: entryRuleAttributeNodeTypeField : ruleAttributeNodeTypeField EOF ;
    public final void entryRuleAttributeNodeTypeField() throws RecognitionException {
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:341:1: ( ruleAttributeNodeTypeField EOF )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:342:1: ruleAttributeNodeTypeField EOF
            {
             before(grammarAccess.getAttributeNodeTypeFieldRule()); 
            pushFollow(FOLLOW_ruleAttributeNodeTypeField_in_entryRuleAttributeNodeTypeField661);
            ruleAttributeNodeTypeField();

            state._fsp--;

             after(grammarAccess.getAttributeNodeTypeFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeNodeTypeField668); 

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
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:349:1: ruleAttributeNodeTypeField : ( ( rule__AttributeNodeTypeField__Group__0 ) ) ;
    public final void ruleAttributeNodeTypeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:353:2: ( ( ( rule__AttributeNodeTypeField__Group__0 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:354:1: ( ( rule__AttributeNodeTypeField__Group__0 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:354:1: ( ( rule__AttributeNodeTypeField__Group__0 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:355:1: ( rule__AttributeNodeTypeField__Group__0 )
            {
             before(grammarAccess.getAttributeNodeTypeFieldAccess().getGroup()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:356:1: ( rule__AttributeNodeTypeField__Group__0 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:356:2: rule__AttributeNodeTypeField__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeNodeTypeField__Group__0_in_ruleAttributeNodeTypeField694);
            rule__AttributeNodeTypeField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNodeTypeFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeNodeTypeField"


    // $ANTLR start "rule__Declaration__Alternatives"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:368:1: rule__Declaration__Alternatives : ( ( ruleNodeType ) | ( ruleNamedEnumDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:372:1: ( ( ruleNodeType ) | ( ruleNamedEnumDeclaration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=18 && LA1_0<=19)) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:373:1: ( ruleNodeType )
                    {
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:373:1: ( ruleNodeType )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:374:1: ruleNodeType
                    {
                     before(grammarAccess.getDeclarationAccess().getNodeTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNodeType_in_rule__Declaration__Alternatives730);
                    ruleNodeType();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getNodeTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:379:6: ( ruleNamedEnumDeclaration )
                    {
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:379:6: ( ruleNamedEnumDeclaration )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:380:1: ruleNamedEnumDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getNamedEnumDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNamedEnumDeclaration_in_rule__Declaration__Alternatives747);
                    ruleNamedEnumDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getNamedEnumDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__NodeTypeField__Alternatives_1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:390:1: rule__NodeTypeField__Alternatives_1 : ( ( ( rule__NodeTypeField__ManyAssignment_1_0 ) ) | ( ( rule__NodeTypeField__OptionalAssignment_1_1 ) ) | ( ( rule__NodeTypeField__SingleAssignment_1_2 ) ) );
    public final void rule__NodeTypeField__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:394:1: ( ( ( rule__NodeTypeField__ManyAssignment_1_0 ) ) | ( ( rule__NodeTypeField__OptionalAssignment_1_1 ) ) | ( ( rule__NodeTypeField__SingleAssignment_1_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:395:1: ( ( rule__NodeTypeField__ManyAssignment_1_0 ) )
                    {
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:395:1: ( ( rule__NodeTypeField__ManyAssignment_1_0 ) )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:396:1: ( rule__NodeTypeField__ManyAssignment_1_0 )
                    {
                     before(grammarAccess.getNodeTypeFieldAccess().getManyAssignment_1_0()); 
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:397:1: ( rule__NodeTypeField__ManyAssignment_1_0 )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:397:2: rule__NodeTypeField__ManyAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeField__ManyAssignment_1_0_in_rule__NodeTypeField__Alternatives_1779);
                    rule__NodeTypeField__ManyAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeFieldAccess().getManyAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:401:6: ( ( rule__NodeTypeField__OptionalAssignment_1_1 ) )
                    {
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:401:6: ( ( rule__NodeTypeField__OptionalAssignment_1_1 ) )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:402:1: ( rule__NodeTypeField__OptionalAssignment_1_1 )
                    {
                     before(grammarAccess.getNodeTypeFieldAccess().getOptionalAssignment_1_1()); 
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:403:1: ( rule__NodeTypeField__OptionalAssignment_1_1 )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:403:2: rule__NodeTypeField__OptionalAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__NodeTypeField__OptionalAssignment_1_1_in_rule__NodeTypeField__Alternatives_1797);
                    rule__NodeTypeField__OptionalAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeFieldAccess().getOptionalAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:407:6: ( ( rule__NodeTypeField__SingleAssignment_1_2 ) )
                    {
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:407:6: ( ( rule__NodeTypeField__SingleAssignment_1_2 ) )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:408:1: ( rule__NodeTypeField__SingleAssignment_1_2 )
                    {
                     before(grammarAccess.getNodeTypeFieldAccess().getSingleAssignment_1_2()); 
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:409:1: ( rule__NodeTypeField__SingleAssignment_1_2 )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:409:2: rule__NodeTypeField__SingleAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__NodeTypeField__SingleAssignment_1_2_in_rule__NodeTypeField__Alternatives_1815);
                    rule__NodeTypeField__SingleAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeFieldAccess().getSingleAssignment_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeField__Alternatives_1"


    // $ANTLR start "rule__NodeTypeFieldValue__Alternatives"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:418:1: rule__NodeTypeFieldValue__Alternatives : ( ( ruleUnnamedEnumDeclaration ) | ( ruleRelationNodeTypeField ) | ( ruleAttributeNodeTypeField ) );
    public final void rule__NodeTypeFieldValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:422:1: ( ( ruleUnnamedEnumDeclaration ) | ( ruleRelationNodeTypeField ) | ( ruleAttributeNodeTypeField ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 11:
            case 12:
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:423:1: ( ruleUnnamedEnumDeclaration )
                    {
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:423:1: ( ruleUnnamedEnumDeclaration )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:424:1: ruleUnnamedEnumDeclaration
                    {
                     before(grammarAccess.getNodeTypeFieldValueAccess().getUnnamedEnumDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUnnamedEnumDeclaration_in_rule__NodeTypeFieldValue__Alternatives848);
                    ruleUnnamedEnumDeclaration();

                    state._fsp--;

                     after(grammarAccess.getNodeTypeFieldValueAccess().getUnnamedEnumDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:429:6: ( ruleRelationNodeTypeField )
                    {
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:429:6: ( ruleRelationNodeTypeField )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:430:1: ruleRelationNodeTypeField
                    {
                     before(grammarAccess.getNodeTypeFieldValueAccess().getRelationNodeTypeFieldParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelationNodeTypeField_in_rule__NodeTypeFieldValue__Alternatives865);
                    ruleRelationNodeTypeField();

                    state._fsp--;

                     after(grammarAccess.getNodeTypeFieldValueAccess().getRelationNodeTypeFieldParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:435:6: ( ruleAttributeNodeTypeField )
                    {
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:435:6: ( ruleAttributeNodeTypeField )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:436:1: ruleAttributeNodeTypeField
                    {
                     before(grammarAccess.getNodeTypeFieldValueAccess().getAttributeNodeTypeFieldParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAttributeNodeTypeField_in_rule__NodeTypeFieldValue__Alternatives882);
                    ruleAttributeNodeTypeField();

                    state._fsp--;

                     after(grammarAccess.getNodeTypeFieldValueAccess().getAttributeNodeTypeFieldParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeFieldValue__Alternatives"


    // $ANTLR start "rule__AttributeNodeTypeField__Alternatives_1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:446:1: rule__AttributeNodeTypeField__Alternatives_1 : ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) );
    public final void rule__AttributeNodeTypeField__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:450:1: ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:451:1: ( 'string' )
                    {
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:451:1: ( 'string' )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:452:1: 'string'
                    {
                     before(grammarAccess.getAttributeNodeTypeFieldAccess().getStringKeyword_1_0()); 
                    match(input,11,FOLLOW_11_in_rule__AttributeNodeTypeField__Alternatives_1915); 
                     after(grammarAccess.getAttributeNodeTypeFieldAccess().getStringKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:459:6: ( 'int' )
                    {
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:459:6: ( 'int' )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:460:1: 'int'
                    {
                     before(grammarAccess.getAttributeNodeTypeFieldAccess().getIntKeyword_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__AttributeNodeTypeField__Alternatives_1935); 
                     after(grammarAccess.getAttributeNodeTypeFieldAccess().getIntKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:467:6: ( 'boolean' )
                    {
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:467:6: ( 'boolean' )
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:468:1: 'boolean'
                    {
                     before(grammarAccess.getAttributeNodeTypeFieldAccess().getBooleanKeyword_1_2()); 
                    match(input,13,FOLLOW_13_in_rule__AttributeNodeTypeField__Alternatives_1955); 
                     after(grammarAccess.getAttributeNodeTypeFieldAccess().getBooleanKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeNodeTypeField__Alternatives_1"


    // $ANTLR start "rule__Model__Group__0"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:482:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:486:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:487:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0987);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0990);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:494:1: rule__Model__Group__0__Impl : ( ( rule__Model__AntlrAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:498:1: ( ( ( rule__Model__AntlrAssignment_0 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:499:1: ( ( rule__Model__AntlrAssignment_0 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:499:1: ( ( rule__Model__AntlrAssignment_0 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:500:1: ( rule__Model__AntlrAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getAntlrAssignment_0()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:501:1: ( rule__Model__AntlrAssignment_0 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:501:2: rule__Model__AntlrAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__AntlrAssignment_0_in_rule__Model__Group__0__Impl1017);
            rule__Model__AntlrAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAntlrAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:511:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:515:1: ( rule__Model__Group__1__Impl )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:516:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11047);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:522:1: rule__Model__Group__1__Impl : ( ( rule__Model__DeclarationsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:526:1: ( ( ( rule__Model__DeclarationsAssignment_1 )* ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:527:1: ( ( rule__Model__DeclarationsAssignment_1 )* )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:527:1: ( ( rule__Model__DeclarationsAssignment_1 )* )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:528:1: ( rule__Model__DeclarationsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment_1()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:529:1: ( rule__Model__DeclarationsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15||(LA5_0>=18 && LA5_0<=19)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:529:2: rule__Model__DeclarationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_1_in_rule__Model__Group__1__Impl1074);
            	    rule__Model__DeclarationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclarationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__AntlrGrammarRef__Group__0"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:543:1: rule__AntlrGrammarRef__Group__0 : rule__AntlrGrammarRef__Group__0__Impl rule__AntlrGrammarRef__Group__1 ;
    public final void rule__AntlrGrammarRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:547:1: ( rule__AntlrGrammarRef__Group__0__Impl rule__AntlrGrammarRef__Group__1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:548:2: rule__AntlrGrammarRef__Group__0__Impl rule__AntlrGrammarRef__Group__1
            {
            pushFollow(FOLLOW_rule__AntlrGrammarRef__Group__0__Impl_in_rule__AntlrGrammarRef__Group__01109);
            rule__AntlrGrammarRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AntlrGrammarRef__Group__1_in_rule__AntlrGrammarRef__Group__01112);
            rule__AntlrGrammarRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AntlrGrammarRef__Group__0"


    // $ANTLR start "rule__AntlrGrammarRef__Group__0__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:555:1: rule__AntlrGrammarRef__Group__0__Impl : ( 'adapt' ) ;
    public final void rule__AntlrGrammarRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:559:1: ( ( 'adapt' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:560:1: ( 'adapt' )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:560:1: ( 'adapt' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:561:1: 'adapt'
            {
             before(grammarAccess.getAntlrGrammarRefAccess().getAdaptKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__AntlrGrammarRef__Group__0__Impl1140); 
             after(grammarAccess.getAntlrGrammarRefAccess().getAdaptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AntlrGrammarRef__Group__0__Impl"


    // $ANTLR start "rule__AntlrGrammarRef__Group__1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:574:1: rule__AntlrGrammarRef__Group__1 : rule__AntlrGrammarRef__Group__1__Impl ;
    public final void rule__AntlrGrammarRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:578:1: ( rule__AntlrGrammarRef__Group__1__Impl )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:579:2: rule__AntlrGrammarRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AntlrGrammarRef__Group__1__Impl_in_rule__AntlrGrammarRef__Group__11171);
            rule__AntlrGrammarRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AntlrGrammarRef__Group__1"


    // $ANTLR start "rule__AntlrGrammarRef__Group__1__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:585:1: rule__AntlrGrammarRef__Group__1__Impl : ( ( rule__AntlrGrammarRef__GrammarFileAssignment_1 ) ) ;
    public final void rule__AntlrGrammarRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:589:1: ( ( ( rule__AntlrGrammarRef__GrammarFileAssignment_1 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:590:1: ( ( rule__AntlrGrammarRef__GrammarFileAssignment_1 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:590:1: ( ( rule__AntlrGrammarRef__GrammarFileAssignment_1 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:591:1: ( rule__AntlrGrammarRef__GrammarFileAssignment_1 )
            {
             before(grammarAccess.getAntlrGrammarRefAccess().getGrammarFileAssignment_1()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:592:1: ( rule__AntlrGrammarRef__GrammarFileAssignment_1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:592:2: rule__AntlrGrammarRef__GrammarFileAssignment_1
            {
            pushFollow(FOLLOW_rule__AntlrGrammarRef__GrammarFileAssignment_1_in_rule__AntlrGrammarRef__Group__1__Impl1198);
            rule__AntlrGrammarRef__GrammarFileAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAntlrGrammarRefAccess().getGrammarFileAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AntlrGrammarRef__Group__1__Impl"


    // $ANTLR start "rule__NamedEnumDeclaration__Group__0"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:606:1: rule__NamedEnumDeclaration__Group__0 : rule__NamedEnumDeclaration__Group__0__Impl rule__NamedEnumDeclaration__Group__1 ;
    public final void rule__NamedEnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:610:1: ( rule__NamedEnumDeclaration__Group__0__Impl rule__NamedEnumDeclaration__Group__1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:611:2: rule__NamedEnumDeclaration__Group__0__Impl rule__NamedEnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__NamedEnumDeclaration__Group__0__Impl_in_rule__NamedEnumDeclaration__Group__01232);
            rule__NamedEnumDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedEnumDeclaration__Group__1_in_rule__NamedEnumDeclaration__Group__01235);
            rule__NamedEnumDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedEnumDeclaration__Group__0"


    // $ANTLR start "rule__NamedEnumDeclaration__Group__0__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:618:1: rule__NamedEnumDeclaration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__NamedEnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:622:1: ( ( 'enum' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:623:1: ( 'enum' )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:623:1: ( 'enum' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:624:1: 'enum'
            {
             before(grammarAccess.getNamedEnumDeclarationAccess().getEnumKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__NamedEnumDeclaration__Group__0__Impl1263); 
             after(grammarAccess.getNamedEnumDeclarationAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedEnumDeclaration__Group__0__Impl"


    // $ANTLR start "rule__NamedEnumDeclaration__Group__1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:637:1: rule__NamedEnumDeclaration__Group__1 : rule__NamedEnumDeclaration__Group__1__Impl rule__NamedEnumDeclaration__Group__2 ;
    public final void rule__NamedEnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:641:1: ( rule__NamedEnumDeclaration__Group__1__Impl rule__NamedEnumDeclaration__Group__2 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:642:2: rule__NamedEnumDeclaration__Group__1__Impl rule__NamedEnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__NamedEnumDeclaration__Group__1__Impl_in_rule__NamedEnumDeclaration__Group__11294);
            rule__NamedEnumDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedEnumDeclaration__Group__2_in_rule__NamedEnumDeclaration__Group__11297);
            rule__NamedEnumDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedEnumDeclaration__Group__1"


    // $ANTLR start "rule__NamedEnumDeclaration__Group__1__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:649:1: rule__NamedEnumDeclaration__Group__1__Impl : ( ( rule__NamedEnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__NamedEnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:653:1: ( ( ( rule__NamedEnumDeclaration__NameAssignment_1 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:654:1: ( ( rule__NamedEnumDeclaration__NameAssignment_1 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:654:1: ( ( rule__NamedEnumDeclaration__NameAssignment_1 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:655:1: ( rule__NamedEnumDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getNamedEnumDeclarationAccess().getNameAssignment_1()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:656:1: ( rule__NamedEnumDeclaration__NameAssignment_1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:656:2: rule__NamedEnumDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamedEnumDeclaration__NameAssignment_1_in_rule__NamedEnumDeclaration__Group__1__Impl1324);
            rule__NamedEnumDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedEnumDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedEnumDeclaration__Group__1__Impl"


    // $ANTLR start "rule__NamedEnumDeclaration__Group__2"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:666:1: rule__NamedEnumDeclaration__Group__2 : rule__NamedEnumDeclaration__Group__2__Impl rule__NamedEnumDeclaration__Group__3 ;
    public final void rule__NamedEnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:670:1: ( rule__NamedEnumDeclaration__Group__2__Impl rule__NamedEnumDeclaration__Group__3 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:671:2: rule__NamedEnumDeclaration__Group__2__Impl rule__NamedEnumDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__NamedEnumDeclaration__Group__2__Impl_in_rule__NamedEnumDeclaration__Group__21354);
            rule__NamedEnumDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedEnumDeclaration__Group__3_in_rule__NamedEnumDeclaration__Group__21357);
            rule__NamedEnumDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedEnumDeclaration__Group__2"


    // $ANTLR start "rule__NamedEnumDeclaration__Group__2__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:678:1: rule__NamedEnumDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__NamedEnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:682:1: ( ( '{' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:683:1: ( '{' )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:683:1: ( '{' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:684:1: '{'
            {
             before(grammarAccess.getNamedEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__NamedEnumDeclaration__Group__2__Impl1385); 
             after(grammarAccess.getNamedEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedEnumDeclaration__Group__2__Impl"


    // $ANTLR start "rule__NamedEnumDeclaration__Group__3"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:697:1: rule__NamedEnumDeclaration__Group__3 : rule__NamedEnumDeclaration__Group__3__Impl rule__NamedEnumDeclaration__Group__4 ;
    public final void rule__NamedEnumDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:701:1: ( rule__NamedEnumDeclaration__Group__3__Impl rule__NamedEnumDeclaration__Group__4 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:702:2: rule__NamedEnumDeclaration__Group__3__Impl rule__NamedEnumDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__NamedEnumDeclaration__Group__3__Impl_in_rule__NamedEnumDeclaration__Group__31416);
            rule__NamedEnumDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedEnumDeclaration__Group__4_in_rule__NamedEnumDeclaration__Group__31419);
            rule__NamedEnumDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedEnumDeclaration__Group__3"


    // $ANTLR start "rule__NamedEnumDeclaration__Group__3__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:709:1: rule__NamedEnumDeclaration__Group__3__Impl : ( ( ( rule__NamedEnumDeclaration__ValuesAssignment_3 ) ) ( ( rule__NamedEnumDeclaration__ValuesAssignment_3 )* ) ) ;
    public final void rule__NamedEnumDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:713:1: ( ( ( ( rule__NamedEnumDeclaration__ValuesAssignment_3 ) ) ( ( rule__NamedEnumDeclaration__ValuesAssignment_3 )* ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:714:1: ( ( ( rule__NamedEnumDeclaration__ValuesAssignment_3 ) ) ( ( rule__NamedEnumDeclaration__ValuesAssignment_3 )* ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:714:1: ( ( ( rule__NamedEnumDeclaration__ValuesAssignment_3 ) ) ( ( rule__NamedEnumDeclaration__ValuesAssignment_3 )* ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:715:1: ( ( rule__NamedEnumDeclaration__ValuesAssignment_3 ) ) ( ( rule__NamedEnumDeclaration__ValuesAssignment_3 )* )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:715:1: ( ( rule__NamedEnumDeclaration__ValuesAssignment_3 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:716:1: ( rule__NamedEnumDeclaration__ValuesAssignment_3 )
            {
             before(grammarAccess.getNamedEnumDeclarationAccess().getValuesAssignment_3()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:717:1: ( rule__NamedEnumDeclaration__ValuesAssignment_3 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:717:2: rule__NamedEnumDeclaration__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__NamedEnumDeclaration__ValuesAssignment_3_in_rule__NamedEnumDeclaration__Group__3__Impl1448);
            rule__NamedEnumDeclaration__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNamedEnumDeclarationAccess().getValuesAssignment_3()); 

            }

            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:720:1: ( ( rule__NamedEnumDeclaration__ValuesAssignment_3 )* )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:721:1: ( rule__NamedEnumDeclaration__ValuesAssignment_3 )*
            {
             before(grammarAccess.getNamedEnumDeclarationAccess().getValuesAssignment_3()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:722:1: ( rule__NamedEnumDeclaration__ValuesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:722:2: rule__NamedEnumDeclaration__ValuesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__NamedEnumDeclaration__ValuesAssignment_3_in_rule__NamedEnumDeclaration__Group__3__Impl1460);
            	    rule__NamedEnumDeclaration__ValuesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getNamedEnumDeclarationAccess().getValuesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedEnumDeclaration__Group__3__Impl"


    // $ANTLR start "rule__NamedEnumDeclaration__Group__4"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:733:1: rule__NamedEnumDeclaration__Group__4 : rule__NamedEnumDeclaration__Group__4__Impl ;
    public final void rule__NamedEnumDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:737:1: ( rule__NamedEnumDeclaration__Group__4__Impl )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:738:2: rule__NamedEnumDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NamedEnumDeclaration__Group__4__Impl_in_rule__NamedEnumDeclaration__Group__41493);
            rule__NamedEnumDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedEnumDeclaration__Group__4"


    // $ANTLR start "rule__NamedEnumDeclaration__Group__4__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:744:1: rule__NamedEnumDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__NamedEnumDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:748:1: ( ( '}' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:749:1: ( '}' )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:749:1: ( '}' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:750:1: '}'
            {
             before(grammarAccess.getNamedEnumDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__NamedEnumDeclaration__Group__4__Impl1521); 
             after(grammarAccess.getNamedEnumDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedEnumDeclaration__Group__4__Impl"


    // $ANTLR start "rule__UnnamedEnumDeclaration__Group__0"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:773:1: rule__UnnamedEnumDeclaration__Group__0 : rule__UnnamedEnumDeclaration__Group__0__Impl rule__UnnamedEnumDeclaration__Group__1 ;
    public final void rule__UnnamedEnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:777:1: ( rule__UnnamedEnumDeclaration__Group__0__Impl rule__UnnamedEnumDeclaration__Group__1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:778:2: rule__UnnamedEnumDeclaration__Group__0__Impl rule__UnnamedEnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__UnnamedEnumDeclaration__Group__0__Impl_in_rule__UnnamedEnumDeclaration__Group__01562);
            rule__UnnamedEnumDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnnamedEnumDeclaration__Group__1_in_rule__UnnamedEnumDeclaration__Group__01565);
            rule__UnnamedEnumDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedEnumDeclaration__Group__0"


    // $ANTLR start "rule__UnnamedEnumDeclaration__Group__0__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:785:1: rule__UnnamedEnumDeclaration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__UnnamedEnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:789:1: ( ( 'enum' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:790:1: ( 'enum' )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:790:1: ( 'enum' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:791:1: 'enum'
            {
             before(grammarAccess.getUnnamedEnumDeclarationAccess().getEnumKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__UnnamedEnumDeclaration__Group__0__Impl1593); 
             after(grammarAccess.getUnnamedEnumDeclarationAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedEnumDeclaration__Group__0__Impl"


    // $ANTLR start "rule__UnnamedEnumDeclaration__Group__1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:804:1: rule__UnnamedEnumDeclaration__Group__1 : rule__UnnamedEnumDeclaration__Group__1__Impl rule__UnnamedEnumDeclaration__Group__2 ;
    public final void rule__UnnamedEnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:808:1: ( rule__UnnamedEnumDeclaration__Group__1__Impl rule__UnnamedEnumDeclaration__Group__2 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:809:2: rule__UnnamedEnumDeclaration__Group__1__Impl rule__UnnamedEnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__UnnamedEnumDeclaration__Group__1__Impl_in_rule__UnnamedEnumDeclaration__Group__11624);
            rule__UnnamedEnumDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnnamedEnumDeclaration__Group__2_in_rule__UnnamedEnumDeclaration__Group__11627);
            rule__UnnamedEnumDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedEnumDeclaration__Group__1"


    // $ANTLR start "rule__UnnamedEnumDeclaration__Group__1__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:816:1: rule__UnnamedEnumDeclaration__Group__1__Impl : ( '{' ) ;
    public final void rule__UnnamedEnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:820:1: ( ( '{' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:821:1: ( '{' )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:821:1: ( '{' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:822:1: '{'
            {
             before(grammarAccess.getUnnamedEnumDeclarationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__UnnamedEnumDeclaration__Group__1__Impl1655); 
             after(grammarAccess.getUnnamedEnumDeclarationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedEnumDeclaration__Group__1__Impl"


    // $ANTLR start "rule__UnnamedEnumDeclaration__Group__2"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:835:1: rule__UnnamedEnumDeclaration__Group__2 : rule__UnnamedEnumDeclaration__Group__2__Impl rule__UnnamedEnumDeclaration__Group__3 ;
    public final void rule__UnnamedEnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:839:1: ( rule__UnnamedEnumDeclaration__Group__2__Impl rule__UnnamedEnumDeclaration__Group__3 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:840:2: rule__UnnamedEnumDeclaration__Group__2__Impl rule__UnnamedEnumDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__UnnamedEnumDeclaration__Group__2__Impl_in_rule__UnnamedEnumDeclaration__Group__21686);
            rule__UnnamedEnumDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnnamedEnumDeclaration__Group__3_in_rule__UnnamedEnumDeclaration__Group__21689);
            rule__UnnamedEnumDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedEnumDeclaration__Group__2"


    // $ANTLR start "rule__UnnamedEnumDeclaration__Group__2__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:847:1: rule__UnnamedEnumDeclaration__Group__2__Impl : ( ( ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 ) ) ( ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 )* ) ) ;
    public final void rule__UnnamedEnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:851:1: ( ( ( ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 ) ) ( ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 )* ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:852:1: ( ( ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 ) ) ( ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 )* ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:852:1: ( ( ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 ) ) ( ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 )* ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:853:1: ( ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 ) ) ( ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 )* )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:853:1: ( ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:854:1: ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 )
            {
             before(grammarAccess.getUnnamedEnumDeclarationAccess().getValuesAssignment_2()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:855:1: ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:855:2: rule__UnnamedEnumDeclaration__ValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__UnnamedEnumDeclaration__ValuesAssignment_2_in_rule__UnnamedEnumDeclaration__Group__2__Impl1718);
            rule__UnnamedEnumDeclaration__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnnamedEnumDeclarationAccess().getValuesAssignment_2()); 

            }

            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:858:1: ( ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 )* )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:859:1: ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 )*
            {
             before(grammarAccess.getUnnamedEnumDeclarationAccess().getValuesAssignment_2()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:860:1: ( rule__UnnamedEnumDeclaration__ValuesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:860:2: rule__UnnamedEnumDeclaration__ValuesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__UnnamedEnumDeclaration__ValuesAssignment_2_in_rule__UnnamedEnumDeclaration__Group__2__Impl1730);
            	    rule__UnnamedEnumDeclaration__ValuesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getUnnamedEnumDeclarationAccess().getValuesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedEnumDeclaration__Group__2__Impl"


    // $ANTLR start "rule__UnnamedEnumDeclaration__Group__3"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:871:1: rule__UnnamedEnumDeclaration__Group__3 : rule__UnnamedEnumDeclaration__Group__3__Impl ;
    public final void rule__UnnamedEnumDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:875:1: ( rule__UnnamedEnumDeclaration__Group__3__Impl )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:876:2: rule__UnnamedEnumDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnnamedEnumDeclaration__Group__3__Impl_in_rule__UnnamedEnumDeclaration__Group__31763);
            rule__UnnamedEnumDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedEnumDeclaration__Group__3"


    // $ANTLR start "rule__UnnamedEnumDeclaration__Group__3__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:882:1: rule__UnnamedEnumDeclaration__Group__3__Impl : ( '}' ) ;
    public final void rule__UnnamedEnumDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:886:1: ( ( '}' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:887:1: ( '}' )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:887:1: ( '}' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:888:1: '}'
            {
             before(grammarAccess.getUnnamedEnumDeclarationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__UnnamedEnumDeclaration__Group__3__Impl1791); 
             after(grammarAccess.getUnnamedEnumDeclarationAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedEnumDeclaration__Group__3__Impl"


    // $ANTLR start "rule__NodeType__Group__0"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:909:1: rule__NodeType__Group__0 : rule__NodeType__Group__0__Impl rule__NodeType__Group__1 ;
    public final void rule__NodeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:913:1: ( rule__NodeType__Group__0__Impl rule__NodeType__Group__1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:914:2: rule__NodeType__Group__0__Impl rule__NodeType__Group__1
            {
            pushFollow(FOLLOW_rule__NodeType__Group__0__Impl_in_rule__NodeType__Group__01830);
            rule__NodeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeType__Group__1_in_rule__NodeType__Group__01833);
            rule__NodeType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__0"


    // $ANTLR start "rule__NodeType__Group__0__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:921:1: rule__NodeType__Group__0__Impl : ( ( 'abstract' )? ) ;
    public final void rule__NodeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:925:1: ( ( ( 'abstract' )? ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:926:1: ( ( 'abstract' )? )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:926:1: ( ( 'abstract' )? )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:927:1: ( 'abstract' )?
            {
             before(grammarAccess.getNodeTypeAccess().getAbstractKeyword_0()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:928:1: ( 'abstract' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:929:2: 'abstract'
                    {
                    match(input,18,FOLLOW_18_in_rule__NodeType__Group__0__Impl1862); 

                    }
                    break;

            }

             after(grammarAccess.getNodeTypeAccess().getAbstractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__0__Impl"


    // $ANTLR start "rule__NodeType__Group__1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:940:1: rule__NodeType__Group__1 : rule__NodeType__Group__1__Impl rule__NodeType__Group__2 ;
    public final void rule__NodeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:944:1: ( rule__NodeType__Group__1__Impl rule__NodeType__Group__2 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:945:2: rule__NodeType__Group__1__Impl rule__NodeType__Group__2
            {
            pushFollow(FOLLOW_rule__NodeType__Group__1__Impl_in_rule__NodeType__Group__11895);
            rule__NodeType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeType__Group__2_in_rule__NodeType__Group__11898);
            rule__NodeType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__1"


    // $ANTLR start "rule__NodeType__Group__1__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:952:1: rule__NodeType__Group__1__Impl : ( 'type' ) ;
    public final void rule__NodeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:956:1: ( ( 'type' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:957:1: ( 'type' )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:957:1: ( 'type' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:958:1: 'type'
            {
             before(grammarAccess.getNodeTypeAccess().getTypeKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__NodeType__Group__1__Impl1926); 
             after(grammarAccess.getNodeTypeAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__1__Impl"


    // $ANTLR start "rule__NodeType__Group__2"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:971:1: rule__NodeType__Group__2 : rule__NodeType__Group__2__Impl rule__NodeType__Group__3 ;
    public final void rule__NodeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:975:1: ( rule__NodeType__Group__2__Impl rule__NodeType__Group__3 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:976:2: rule__NodeType__Group__2__Impl rule__NodeType__Group__3
            {
            pushFollow(FOLLOW_rule__NodeType__Group__2__Impl_in_rule__NodeType__Group__21957);
            rule__NodeType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeType__Group__3_in_rule__NodeType__Group__21960);
            rule__NodeType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__2"


    // $ANTLR start "rule__NodeType__Group__2__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:983:1: rule__NodeType__Group__2__Impl : ( ( rule__NodeType__NameAssignment_2 ) ) ;
    public final void rule__NodeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:987:1: ( ( ( rule__NodeType__NameAssignment_2 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:988:1: ( ( rule__NodeType__NameAssignment_2 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:988:1: ( ( rule__NodeType__NameAssignment_2 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:989:1: ( rule__NodeType__NameAssignment_2 )
            {
             before(grammarAccess.getNodeTypeAccess().getNameAssignment_2()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:990:1: ( rule__NodeType__NameAssignment_2 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:990:2: rule__NodeType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__NodeType__NameAssignment_2_in_rule__NodeType__Group__2__Impl1987);
            rule__NodeType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__2__Impl"


    // $ANTLR start "rule__NodeType__Group__3"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1000:1: rule__NodeType__Group__3 : rule__NodeType__Group__3__Impl rule__NodeType__Group__4 ;
    public final void rule__NodeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1004:1: ( rule__NodeType__Group__3__Impl rule__NodeType__Group__4 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1005:2: rule__NodeType__Group__3__Impl rule__NodeType__Group__4
            {
            pushFollow(FOLLOW_rule__NodeType__Group__3__Impl_in_rule__NodeType__Group__32017);
            rule__NodeType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeType__Group__4_in_rule__NodeType__Group__32020);
            rule__NodeType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__3"


    // $ANTLR start "rule__NodeType__Group__3__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1012:1: rule__NodeType__Group__3__Impl : ( ( rule__NodeType__Group_3__0 )? ) ;
    public final void rule__NodeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1016:1: ( ( ( rule__NodeType__Group_3__0 )? ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1017:1: ( ( rule__NodeType__Group_3__0 )? )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1017:1: ( ( rule__NodeType__Group_3__0 )? )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1018:1: ( rule__NodeType__Group_3__0 )?
            {
             before(grammarAccess.getNodeTypeAccess().getGroup_3()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1019:1: ( rule__NodeType__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1019:2: rule__NodeType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NodeType__Group_3__0_in_rule__NodeType__Group__3__Impl2047);
                    rule__NodeType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__3__Impl"


    // $ANTLR start "rule__NodeType__Group__4"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1029:1: rule__NodeType__Group__4 : rule__NodeType__Group__4__Impl rule__NodeType__Group__5 ;
    public final void rule__NodeType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1033:1: ( rule__NodeType__Group__4__Impl rule__NodeType__Group__5 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1034:2: rule__NodeType__Group__4__Impl rule__NodeType__Group__5
            {
            pushFollow(FOLLOW_rule__NodeType__Group__4__Impl_in_rule__NodeType__Group__42078);
            rule__NodeType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeType__Group__5_in_rule__NodeType__Group__42081);
            rule__NodeType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__4"


    // $ANTLR start "rule__NodeType__Group__4__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1041:1: rule__NodeType__Group__4__Impl : ( ( rule__NodeType__Group_4__0 )? ) ;
    public final void rule__NodeType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1045:1: ( ( ( rule__NodeType__Group_4__0 )? ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1046:1: ( ( rule__NodeType__Group_4__0 )? )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1046:1: ( ( rule__NodeType__Group_4__0 )? )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1047:1: ( rule__NodeType__Group_4__0 )?
            {
             before(grammarAccess.getNodeTypeAccess().getGroup_4()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1048:1: ( rule__NodeType__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1048:2: rule__NodeType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__NodeType__Group_4__0_in_rule__NodeType__Group__4__Impl2108);
                    rule__NodeType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__4__Impl"


    // $ANTLR start "rule__NodeType__Group__5"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1058:1: rule__NodeType__Group__5 : rule__NodeType__Group__5__Impl rule__NodeType__Group__6 ;
    public final void rule__NodeType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1062:1: ( rule__NodeType__Group__5__Impl rule__NodeType__Group__6 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1063:2: rule__NodeType__Group__5__Impl rule__NodeType__Group__6
            {
            pushFollow(FOLLOW_rule__NodeType__Group__5__Impl_in_rule__NodeType__Group__52139);
            rule__NodeType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeType__Group__6_in_rule__NodeType__Group__52142);
            rule__NodeType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__5"


    // $ANTLR start "rule__NodeType__Group__5__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1070:1: rule__NodeType__Group__5__Impl : ( '{' ) ;
    public final void rule__NodeType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1074:1: ( ( '{' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1075:1: ( '{' )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1075:1: ( '{' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1076:1: '{'
            {
             before(grammarAccess.getNodeTypeAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_16_in_rule__NodeType__Group__5__Impl2170); 
             after(grammarAccess.getNodeTypeAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__5__Impl"


    // $ANTLR start "rule__NodeType__Group__6"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1089:1: rule__NodeType__Group__6 : rule__NodeType__Group__6__Impl rule__NodeType__Group__7 ;
    public final void rule__NodeType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1093:1: ( rule__NodeType__Group__6__Impl rule__NodeType__Group__7 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1094:2: rule__NodeType__Group__6__Impl rule__NodeType__Group__7
            {
            pushFollow(FOLLOW_rule__NodeType__Group__6__Impl_in_rule__NodeType__Group__62201);
            rule__NodeType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeType__Group__7_in_rule__NodeType__Group__62204);
            rule__NodeType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__6"


    // $ANTLR start "rule__NodeType__Group__6__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1101:1: rule__NodeType__Group__6__Impl : ( ( rule__NodeType__FieldsAssignment_6 )* ) ;
    public final void rule__NodeType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1105:1: ( ( ( rule__NodeType__FieldsAssignment_6 )* ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1106:1: ( ( rule__NodeType__FieldsAssignment_6 )* )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1106:1: ( ( rule__NodeType__FieldsAssignment_6 )* )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1107:1: ( rule__NodeType__FieldsAssignment_6 )*
            {
             before(grammarAccess.getNodeTypeAccess().getFieldsAssignment_6()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1108:1: ( rule__NodeType__FieldsAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1108:2: rule__NodeType__FieldsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__NodeType__FieldsAssignment_6_in_rule__NodeType__Group__6__Impl2231);
            	    rule__NodeType__FieldsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getNodeTypeAccess().getFieldsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__6__Impl"


    // $ANTLR start "rule__NodeType__Group__7"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1118:1: rule__NodeType__Group__7 : rule__NodeType__Group__7__Impl ;
    public final void rule__NodeType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1122:1: ( rule__NodeType__Group__7__Impl )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1123:2: rule__NodeType__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__NodeType__Group__7__Impl_in_rule__NodeType__Group__72262);
            rule__NodeType__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__7"


    // $ANTLR start "rule__NodeType__Group__7__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1129:1: rule__NodeType__Group__7__Impl : ( '}' ) ;
    public final void rule__NodeType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1133:1: ( ( '}' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1134:1: ( '}' )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1134:1: ( '}' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1135:1: '}'
            {
             before(grammarAccess.getNodeTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_17_in_rule__NodeType__Group__7__Impl2290); 
             after(grammarAccess.getNodeTypeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group__7__Impl"


    // $ANTLR start "rule__NodeType__Group_3__0"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1164:1: rule__NodeType__Group_3__0 : rule__NodeType__Group_3__0__Impl rule__NodeType__Group_3__1 ;
    public final void rule__NodeType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1168:1: ( rule__NodeType__Group_3__0__Impl rule__NodeType__Group_3__1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1169:2: rule__NodeType__Group_3__0__Impl rule__NodeType__Group_3__1
            {
            pushFollow(FOLLOW_rule__NodeType__Group_3__0__Impl_in_rule__NodeType__Group_3__02337);
            rule__NodeType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeType__Group_3__1_in_rule__NodeType__Group_3__02340);
            rule__NodeType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group_3__0"


    // $ANTLR start "rule__NodeType__Group_3__0__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1176:1: rule__NodeType__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__NodeType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1180:1: ( ( 'extends' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1181:1: ( 'extends' )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1181:1: ( 'extends' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1182:1: 'extends'
            {
             before(grammarAccess.getNodeTypeAccess().getExtendsKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__NodeType__Group_3__0__Impl2368); 
             after(grammarAccess.getNodeTypeAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group_3__0__Impl"


    // $ANTLR start "rule__NodeType__Group_3__1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1195:1: rule__NodeType__Group_3__1 : rule__NodeType__Group_3__1__Impl ;
    public final void rule__NodeType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1199:1: ( rule__NodeType__Group_3__1__Impl )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1200:2: rule__NodeType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeType__Group_3__1__Impl_in_rule__NodeType__Group_3__12399);
            rule__NodeType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group_3__1"


    // $ANTLR start "rule__NodeType__Group_3__1__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1206:1: rule__NodeType__Group_3__1__Impl : ( ( rule__NodeType__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__NodeType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1210:1: ( ( ( rule__NodeType__SuperTypeAssignment_3_1 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1211:1: ( ( rule__NodeType__SuperTypeAssignment_3_1 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1211:1: ( ( rule__NodeType__SuperTypeAssignment_3_1 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1212:1: ( rule__NodeType__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getNodeTypeAccess().getSuperTypeAssignment_3_1()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1213:1: ( rule__NodeType__SuperTypeAssignment_3_1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1213:2: rule__NodeType__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NodeType__SuperTypeAssignment_3_1_in_rule__NodeType__Group_3__1__Impl2426);
            rule__NodeType__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getSuperTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group_3__1__Impl"


    // $ANTLR start "rule__NodeType__Group_4__0"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1227:1: rule__NodeType__Group_4__0 : rule__NodeType__Group_4__0__Impl rule__NodeType__Group_4__1 ;
    public final void rule__NodeType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1231:1: ( rule__NodeType__Group_4__0__Impl rule__NodeType__Group_4__1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1232:2: rule__NodeType__Group_4__0__Impl rule__NodeType__Group_4__1
            {
            pushFollow(FOLLOW_rule__NodeType__Group_4__0__Impl_in_rule__NodeType__Group_4__02460);
            rule__NodeType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeType__Group_4__1_in_rule__NodeType__Group_4__02463);
            rule__NodeType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group_4__0"


    // $ANTLR start "rule__NodeType__Group_4__0__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1239:1: rule__NodeType__Group_4__0__Impl : ( 'from' ) ;
    public final void rule__NodeType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1243:1: ( ( 'from' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1244:1: ( 'from' )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1244:1: ( 'from' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1245:1: 'from'
            {
             before(grammarAccess.getNodeTypeAccess().getFromKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__NodeType__Group_4__0__Impl2491); 
             after(grammarAccess.getNodeTypeAccess().getFromKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group_4__0__Impl"


    // $ANTLR start "rule__NodeType__Group_4__1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1258:1: rule__NodeType__Group_4__1 : rule__NodeType__Group_4__1__Impl ;
    public final void rule__NodeType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1262:1: ( rule__NodeType__Group_4__1__Impl )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1263:2: rule__NodeType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeType__Group_4__1__Impl_in_rule__NodeType__Group_4__12522);
            rule__NodeType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group_4__1"


    // $ANTLR start "rule__NodeType__Group_4__1__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1269:1: rule__NodeType__Group_4__1__Impl : ( ( rule__NodeType__AntlrNodeAssignment_4_1 ) ) ;
    public final void rule__NodeType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1273:1: ( ( ( rule__NodeType__AntlrNodeAssignment_4_1 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1274:1: ( ( rule__NodeType__AntlrNodeAssignment_4_1 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1274:1: ( ( rule__NodeType__AntlrNodeAssignment_4_1 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1275:1: ( rule__NodeType__AntlrNodeAssignment_4_1 )
            {
             before(grammarAccess.getNodeTypeAccess().getAntlrNodeAssignment_4_1()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1276:1: ( rule__NodeType__AntlrNodeAssignment_4_1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1276:2: rule__NodeType__AntlrNodeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__NodeType__AntlrNodeAssignment_4_1_in_rule__NodeType__Group_4__1__Impl2549);
            rule__NodeType__AntlrNodeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getAntlrNodeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__Group_4__1__Impl"


    // $ANTLR start "rule__NodeTypeField__Group__0"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1290:1: rule__NodeTypeField__Group__0 : rule__NodeTypeField__Group__0__Impl rule__NodeTypeField__Group__1 ;
    public final void rule__NodeTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1294:1: ( rule__NodeTypeField__Group__0__Impl rule__NodeTypeField__Group__1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1295:2: rule__NodeTypeField__Group__0__Impl rule__NodeTypeField__Group__1
            {
            pushFollow(FOLLOW_rule__NodeTypeField__Group__0__Impl_in_rule__NodeTypeField__Group__02583);
            rule__NodeTypeField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeField__Group__1_in_rule__NodeTypeField__Group__02586);
            rule__NodeTypeField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeField__Group__0"


    // $ANTLR start "rule__NodeTypeField__Group__0__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1302:1: rule__NodeTypeField__Group__0__Impl : ( ( rule__NodeTypeField__NameAssignment_0 ) ) ;
    public final void rule__NodeTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1306:1: ( ( ( rule__NodeTypeField__NameAssignment_0 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1307:1: ( ( rule__NodeTypeField__NameAssignment_0 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1307:1: ( ( rule__NodeTypeField__NameAssignment_0 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1308:1: ( rule__NodeTypeField__NameAssignment_0 )
            {
             before(grammarAccess.getNodeTypeFieldAccess().getNameAssignment_0()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1309:1: ( rule__NodeTypeField__NameAssignment_0 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1309:2: rule__NodeTypeField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NodeTypeField__NameAssignment_0_in_rule__NodeTypeField__Group__0__Impl2613);
            rule__NodeTypeField__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeField__Group__0__Impl"


    // $ANTLR start "rule__NodeTypeField__Group__1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1319:1: rule__NodeTypeField__Group__1 : rule__NodeTypeField__Group__1__Impl rule__NodeTypeField__Group__2 ;
    public final void rule__NodeTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1323:1: ( rule__NodeTypeField__Group__1__Impl rule__NodeTypeField__Group__2 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1324:2: rule__NodeTypeField__Group__1__Impl rule__NodeTypeField__Group__2
            {
            pushFollow(FOLLOW_rule__NodeTypeField__Group__1__Impl_in_rule__NodeTypeField__Group__12643);
            rule__NodeTypeField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeField__Group__2_in_rule__NodeTypeField__Group__12646);
            rule__NodeTypeField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeField__Group__1"


    // $ANTLR start "rule__NodeTypeField__Group__1__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1331:1: rule__NodeTypeField__Group__1__Impl : ( ( rule__NodeTypeField__Alternatives_1 ) ) ;
    public final void rule__NodeTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1335:1: ( ( ( rule__NodeTypeField__Alternatives_1 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1336:1: ( ( rule__NodeTypeField__Alternatives_1 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1336:1: ( ( rule__NodeTypeField__Alternatives_1 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1337:1: ( rule__NodeTypeField__Alternatives_1 )
            {
             before(grammarAccess.getNodeTypeFieldAccess().getAlternatives_1()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1338:1: ( rule__NodeTypeField__Alternatives_1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1338:2: rule__NodeTypeField__Alternatives_1
            {
            pushFollow(FOLLOW_rule__NodeTypeField__Alternatives_1_in_rule__NodeTypeField__Group__1__Impl2673);
            rule__NodeTypeField__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeFieldAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeField__Group__1__Impl"


    // $ANTLR start "rule__NodeTypeField__Group__2"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1348:1: rule__NodeTypeField__Group__2 : rule__NodeTypeField__Group__2__Impl ;
    public final void rule__NodeTypeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1352:1: ( rule__NodeTypeField__Group__2__Impl )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1353:2: rule__NodeTypeField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeField__Group__2__Impl_in_rule__NodeTypeField__Group__22703);
            rule__NodeTypeField__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeField__Group__2"


    // $ANTLR start "rule__NodeTypeField__Group__2__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1359:1: rule__NodeTypeField__Group__2__Impl : ( ( rule__NodeTypeField__ValueAssignment_2 ) ) ;
    public final void rule__NodeTypeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1363:1: ( ( ( rule__NodeTypeField__ValueAssignment_2 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1364:1: ( ( rule__NodeTypeField__ValueAssignment_2 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1364:1: ( ( rule__NodeTypeField__ValueAssignment_2 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1365:1: ( rule__NodeTypeField__ValueAssignment_2 )
            {
             before(grammarAccess.getNodeTypeFieldAccess().getValueAssignment_2()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1366:1: ( rule__NodeTypeField__ValueAssignment_2 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1366:2: rule__NodeTypeField__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__NodeTypeField__ValueAssignment_2_in_rule__NodeTypeField__Group__2__Impl2730);
            rule__NodeTypeField__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeFieldAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeField__Group__2__Impl"


    // $ANTLR start "rule__AttributeNodeTypeField__Group__0"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1382:1: rule__AttributeNodeTypeField__Group__0 : rule__AttributeNodeTypeField__Group__0__Impl rule__AttributeNodeTypeField__Group__1 ;
    public final void rule__AttributeNodeTypeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1386:1: ( rule__AttributeNodeTypeField__Group__0__Impl rule__AttributeNodeTypeField__Group__1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1387:2: rule__AttributeNodeTypeField__Group__0__Impl rule__AttributeNodeTypeField__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeNodeTypeField__Group__0__Impl_in_rule__AttributeNodeTypeField__Group__02766);
            rule__AttributeNodeTypeField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeNodeTypeField__Group__1_in_rule__AttributeNodeTypeField__Group__02769);
            rule__AttributeNodeTypeField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeNodeTypeField__Group__0"


    // $ANTLR start "rule__AttributeNodeTypeField__Group__0__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1394:1: rule__AttributeNodeTypeField__Group__0__Impl : ( () ) ;
    public final void rule__AttributeNodeTypeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1398:1: ( ( () ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1399:1: ( () )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1399:1: ( () )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1400:1: ()
            {
             before(grammarAccess.getAttributeNodeTypeFieldAccess().getAttributeNodeTypeFieldAction_0()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1401:1: ()
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1403:1: 
            {
            }

             after(grammarAccess.getAttributeNodeTypeFieldAccess().getAttributeNodeTypeFieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeNodeTypeField__Group__0__Impl"


    // $ANTLR start "rule__AttributeNodeTypeField__Group__1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1413:1: rule__AttributeNodeTypeField__Group__1 : rule__AttributeNodeTypeField__Group__1__Impl ;
    public final void rule__AttributeNodeTypeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1417:1: ( rule__AttributeNodeTypeField__Group__1__Impl )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1418:2: rule__AttributeNodeTypeField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeNodeTypeField__Group__1__Impl_in_rule__AttributeNodeTypeField__Group__12827);
            rule__AttributeNodeTypeField__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeNodeTypeField__Group__1"


    // $ANTLR start "rule__AttributeNodeTypeField__Group__1__Impl"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1424:1: rule__AttributeNodeTypeField__Group__1__Impl : ( ( rule__AttributeNodeTypeField__Alternatives_1 ) ) ;
    public final void rule__AttributeNodeTypeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1428:1: ( ( ( rule__AttributeNodeTypeField__Alternatives_1 ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1429:1: ( ( rule__AttributeNodeTypeField__Alternatives_1 ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1429:1: ( ( rule__AttributeNodeTypeField__Alternatives_1 ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1430:1: ( rule__AttributeNodeTypeField__Alternatives_1 )
            {
             before(grammarAccess.getAttributeNodeTypeFieldAccess().getAlternatives_1()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1431:1: ( rule__AttributeNodeTypeField__Alternatives_1 )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1431:2: rule__AttributeNodeTypeField__Alternatives_1
            {
            pushFollow(FOLLOW_rule__AttributeNodeTypeField__Alternatives_1_in_rule__AttributeNodeTypeField__Group__1__Impl2854);
            rule__AttributeNodeTypeField__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNodeTypeFieldAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeNodeTypeField__Group__1__Impl"


    // $ANTLR start "rule__Model__AntlrAssignment_0"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1446:1: rule__Model__AntlrAssignment_0 : ( ruleAntlrGrammarRef ) ;
    public final void rule__Model__AntlrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1450:1: ( ( ruleAntlrGrammarRef ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1451:1: ( ruleAntlrGrammarRef )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1451:1: ( ruleAntlrGrammarRef )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1452:1: ruleAntlrGrammarRef
            {
             before(grammarAccess.getModelAccess().getAntlrAntlrGrammarRefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAntlrGrammarRef_in_rule__Model__AntlrAssignment_02893);
            ruleAntlrGrammarRef();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAntlrAntlrGrammarRefParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AntlrAssignment_0"


    // $ANTLR start "rule__Model__DeclarationsAssignment_1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1461:1: rule__Model__DeclarationsAssignment_1 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1465:1: ( ( ruleDeclaration ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1466:1: ( ruleDeclaration )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1466:1: ( ruleDeclaration )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1467:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_12924);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclarationsAssignment_1"


    // $ANTLR start "rule__AntlrGrammarRef__GrammarFileAssignment_1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1476:1: rule__AntlrGrammarRef__GrammarFileAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AntlrGrammarRef__GrammarFileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1480:1: ( ( RULE_STRING ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1481:1: ( RULE_STRING )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1481:1: ( RULE_STRING )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1482:1: RULE_STRING
            {
             before(grammarAccess.getAntlrGrammarRefAccess().getGrammarFileSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AntlrGrammarRef__GrammarFileAssignment_12955); 
             after(grammarAccess.getAntlrGrammarRefAccess().getGrammarFileSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AntlrGrammarRef__GrammarFileAssignment_1"


    // $ANTLR start "rule__NamedEnumDeclaration__NameAssignment_1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1491:1: rule__NamedEnumDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NamedEnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1495:1: ( ( RULE_ID ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1496:1: ( RULE_ID )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1496:1: ( RULE_ID )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1497:1: RULE_ID
            {
             before(grammarAccess.getNamedEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedEnumDeclaration__NameAssignment_12986); 
             after(grammarAccess.getNamedEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedEnumDeclaration__NameAssignment_1"


    // $ANTLR start "rule__NamedEnumDeclaration__ValuesAssignment_3"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1506:1: rule__NamedEnumDeclaration__ValuesAssignment_3 : ( ruleEnumNodeTypeFieldValue ) ;
    public final void rule__NamedEnumDeclaration__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1510:1: ( ( ruleEnumNodeTypeFieldValue ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1511:1: ( ruleEnumNodeTypeFieldValue )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1511:1: ( ruleEnumNodeTypeFieldValue )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1512:1: ruleEnumNodeTypeFieldValue
            {
             before(grammarAccess.getNamedEnumDeclarationAccess().getValuesEnumNodeTypeFieldValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumNodeTypeFieldValue_in_rule__NamedEnumDeclaration__ValuesAssignment_33017);
            ruleEnumNodeTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getNamedEnumDeclarationAccess().getValuesEnumNodeTypeFieldValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedEnumDeclaration__ValuesAssignment_3"


    // $ANTLR start "rule__UnnamedEnumDeclaration__ValuesAssignment_2"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1521:1: rule__UnnamedEnumDeclaration__ValuesAssignment_2 : ( ruleEnumNodeTypeFieldValue ) ;
    public final void rule__UnnamedEnumDeclaration__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1525:1: ( ( ruleEnumNodeTypeFieldValue ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1526:1: ( ruleEnumNodeTypeFieldValue )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1526:1: ( ruleEnumNodeTypeFieldValue )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1527:1: ruleEnumNodeTypeFieldValue
            {
             before(grammarAccess.getUnnamedEnumDeclarationAccess().getValuesEnumNodeTypeFieldValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEnumNodeTypeFieldValue_in_rule__UnnamedEnumDeclaration__ValuesAssignment_23048);
            ruleEnumNodeTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getUnnamedEnumDeclarationAccess().getValuesEnumNodeTypeFieldValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnnamedEnumDeclaration__ValuesAssignment_2"


    // $ANTLR start "rule__NodeType__NameAssignment_2"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1536:1: rule__NodeType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__NodeType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1540:1: ( ( RULE_ID ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1541:1: ( RULE_ID )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1541:1: ( RULE_ID )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1542:1: RULE_ID
            {
             before(grammarAccess.getNodeTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeType__NameAssignment_23079); 
             after(grammarAccess.getNodeTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__NameAssignment_2"


    // $ANTLR start "rule__NodeType__SuperTypeAssignment_3_1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1551:1: rule__NodeType__SuperTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__NodeType__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1555:1: ( ( ( RULE_ID ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1556:1: ( ( RULE_ID ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1556:1: ( ( RULE_ID ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1557:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeTypeAccess().getSuperTypeNodeTypeCrossReference_3_1_0()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1558:1: ( RULE_ID )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1559:1: RULE_ID
            {
             before(grammarAccess.getNodeTypeAccess().getSuperTypeNodeTypeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeType__SuperTypeAssignment_3_13114); 
             after(grammarAccess.getNodeTypeAccess().getSuperTypeNodeTypeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getNodeTypeAccess().getSuperTypeNodeTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__NodeType__AntlrNodeAssignment_4_1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1570:1: rule__NodeType__AntlrNodeAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__NodeType__AntlrNodeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1574:1: ( ( RULE_ID ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1575:1: ( RULE_ID )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1575:1: ( RULE_ID )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1576:1: RULE_ID
            {
             before(grammarAccess.getNodeTypeAccess().getAntlrNodeIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeType__AntlrNodeAssignment_4_13149); 
             after(grammarAccess.getNodeTypeAccess().getAntlrNodeIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__AntlrNodeAssignment_4_1"


    // $ANTLR start "rule__NodeType__FieldsAssignment_6"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1585:1: rule__NodeType__FieldsAssignment_6 : ( ruleNodeTypeField ) ;
    public final void rule__NodeType__FieldsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1589:1: ( ( ruleNodeTypeField ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1590:1: ( ruleNodeTypeField )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1590:1: ( ruleNodeTypeField )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1591:1: ruleNodeTypeField
            {
             before(grammarAccess.getNodeTypeAccess().getFieldsNodeTypeFieldParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleNodeTypeField_in_rule__NodeType__FieldsAssignment_63180);
            ruleNodeTypeField();

            state._fsp--;

             after(grammarAccess.getNodeTypeAccess().getFieldsNodeTypeFieldParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__FieldsAssignment_6"


    // $ANTLR start "rule__NodeTypeField__NameAssignment_0"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1600:1: rule__NodeTypeField__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NodeTypeField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1604:1: ( ( RULE_ID ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1605:1: ( RULE_ID )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1605:1: ( RULE_ID )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1606:1: RULE_ID
            {
             before(grammarAccess.getNodeTypeFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeTypeField__NameAssignment_03211); 
             after(grammarAccess.getNodeTypeFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeField__NameAssignment_0"


    // $ANTLR start "rule__NodeTypeField__ManyAssignment_1_0"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1615:1: rule__NodeTypeField__ManyAssignment_1_0 : ( ( '*=' ) ) ;
    public final void rule__NodeTypeField__ManyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1619:1: ( ( ( '*=' ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1620:1: ( ( '*=' ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1620:1: ( ( '*=' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1621:1: ( '*=' )
            {
             before(grammarAccess.getNodeTypeFieldAccess().getManyAsteriskEqualsSignKeyword_1_0_0()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1622:1: ( '*=' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1623:1: '*='
            {
             before(grammarAccess.getNodeTypeFieldAccess().getManyAsteriskEqualsSignKeyword_1_0_0()); 
            match(input,22,FOLLOW_22_in_rule__NodeTypeField__ManyAssignment_1_03247); 
             after(grammarAccess.getNodeTypeFieldAccess().getManyAsteriskEqualsSignKeyword_1_0_0()); 

            }

             after(grammarAccess.getNodeTypeFieldAccess().getManyAsteriskEqualsSignKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeField__ManyAssignment_1_0"


    // $ANTLR start "rule__NodeTypeField__OptionalAssignment_1_1"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1638:1: rule__NodeTypeField__OptionalAssignment_1_1 : ( ( '?=' ) ) ;
    public final void rule__NodeTypeField__OptionalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1642:1: ( ( ( '?=' ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1643:1: ( ( '?=' ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1643:1: ( ( '?=' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1644:1: ( '?=' )
            {
             before(grammarAccess.getNodeTypeFieldAccess().getOptionalQuestionMarkEqualsSignKeyword_1_1_0()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1645:1: ( '?=' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1646:1: '?='
            {
             before(grammarAccess.getNodeTypeFieldAccess().getOptionalQuestionMarkEqualsSignKeyword_1_1_0()); 
            match(input,23,FOLLOW_23_in_rule__NodeTypeField__OptionalAssignment_1_13291); 
             after(grammarAccess.getNodeTypeFieldAccess().getOptionalQuestionMarkEqualsSignKeyword_1_1_0()); 

            }

             after(grammarAccess.getNodeTypeFieldAccess().getOptionalQuestionMarkEqualsSignKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeField__OptionalAssignment_1_1"


    // $ANTLR start "rule__NodeTypeField__SingleAssignment_1_2"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1661:1: rule__NodeTypeField__SingleAssignment_1_2 : ( ( '=' ) ) ;
    public final void rule__NodeTypeField__SingleAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1665:1: ( ( ( '=' ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1666:1: ( ( '=' ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1666:1: ( ( '=' ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1667:1: ( '=' )
            {
             before(grammarAccess.getNodeTypeFieldAccess().getSingleEqualsSignKeyword_1_2_0()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1668:1: ( '=' )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1669:1: '='
            {
             before(grammarAccess.getNodeTypeFieldAccess().getSingleEqualsSignKeyword_1_2_0()); 
            match(input,24,FOLLOW_24_in_rule__NodeTypeField__SingleAssignment_1_23335); 
             after(grammarAccess.getNodeTypeFieldAccess().getSingleEqualsSignKeyword_1_2_0()); 

            }

             after(grammarAccess.getNodeTypeFieldAccess().getSingleEqualsSignKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeField__SingleAssignment_1_2"


    // $ANTLR start "rule__NodeTypeField__ValueAssignment_2"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1684:1: rule__NodeTypeField__ValueAssignment_2 : ( ruleNodeTypeFieldValue ) ;
    public final void rule__NodeTypeField__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1688:1: ( ( ruleNodeTypeFieldValue ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1689:1: ( ruleNodeTypeFieldValue )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1689:1: ( ruleNodeTypeFieldValue )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1690:1: ruleNodeTypeFieldValue
            {
             before(grammarAccess.getNodeTypeFieldAccess().getValueNodeTypeFieldValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNodeTypeFieldValue_in_rule__NodeTypeField__ValueAssignment_23374);
            ruleNodeTypeFieldValue();

            state._fsp--;

             after(grammarAccess.getNodeTypeFieldAccess().getValueNodeTypeFieldValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeField__ValueAssignment_2"


    // $ANTLR start "rule__EnumNodeTypeFieldValue__NameAssignment"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1699:1: rule__EnumNodeTypeFieldValue__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumNodeTypeFieldValue__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1703:1: ( ( RULE_ID ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1704:1: ( RULE_ID )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1704:1: ( RULE_ID )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1705:1: RULE_ID
            {
             before(grammarAccess.getEnumNodeTypeFieldValueAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumNodeTypeFieldValue__NameAssignment3405); 
             after(grammarAccess.getEnumNodeTypeFieldValueAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumNodeTypeFieldValue__NameAssignment"


    // $ANTLR start "rule__RelationNodeTypeField__TypeAssignment"
    // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1714:1: rule__RelationNodeTypeField__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RelationNodeTypeField__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1718:1: ( ( ( RULE_ID ) ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1719:1: ( ( RULE_ID ) )
            {
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1719:1: ( ( RULE_ID ) )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1720:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationNodeTypeFieldAccess().getTypeNodeTypeCrossReference_0()); 
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1721:1: ( RULE_ID )
            // ../me.tomassetti.asttransf.ide/src-gen/me/tomassetti/ide/contentassist/antlr/internal/InternalAstTransformationsDsl.g:1722:1: RULE_ID
            {
             before(grammarAccess.getRelationNodeTypeFieldAccess().getTypeNodeTypeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RelationNodeTypeField__TypeAssignment3440); 
             after(grammarAccess.getRelationNodeTypeFieldAccess().getTypeNodeTypeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRelationNodeTypeFieldAccess().getTypeNodeTypeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationNodeTypeField__TypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntlrGrammarRef_in_entryRuleAntlrGrammarRef121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAntlrGrammarRef128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntlrGrammarRef__Group__0_in_ruleAntlrGrammarRef154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedEnumDeclaration_in_entryRuleNamedEnumDeclaration241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedEnumDeclaration248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__Group__0_in_ruleNamedEnumDeclaration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedEnumDeclaration_in_entryRuleUnnamedEnumDeclaration301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedEnumDeclaration308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedEnumDeclaration__Group__0_in_ruleUnnamedEnumDeclaration334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_entryRuleNodeType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group__0_in_ruleNodeType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeField_in_entryRuleNodeTypeField421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeField428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeField__Group__0_in_ruleNodeTypeField454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeFieldValue_in_entryRuleNodeTypeFieldValue481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeFieldValue488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeFieldValue__Alternatives_in_ruleNodeTypeFieldValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumNodeTypeFieldValue_in_entryRuleEnumNodeTypeFieldValue541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumNodeTypeFieldValue548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumNodeTypeFieldValue__NameAssignment_in_ruleEnumNodeTypeFieldValue574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationNodeTypeField_in_entryRuleRelationNodeTypeField601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationNodeTypeField608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationNodeTypeField__TypeAssignment_in_ruleRelationNodeTypeField634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeNodeTypeField_in_entryRuleAttributeNodeTypeField661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeNodeTypeField668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeNodeTypeField__Group__0_in_ruleAttributeNodeTypeField694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__Declaration__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedEnumDeclaration_in_rule__Declaration__Alternatives747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeField__ManyAssignment_1_0_in_rule__NodeTypeField__Alternatives_1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeField__OptionalAssignment_1_1_in_rule__NodeTypeField__Alternatives_1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeField__SingleAssignment_1_2_in_rule__NodeTypeField__Alternatives_1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedEnumDeclaration_in_rule__NodeTypeFieldValue__Alternatives848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationNodeTypeField_in_rule__NodeTypeFieldValue__Alternatives865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeNodeTypeField_in_rule__NodeTypeFieldValue__Alternatives882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AttributeNodeTypeField__Alternatives_1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AttributeNodeTypeField__Alternatives_1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AttributeNodeTypeField__Alternatives_1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0987 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AntlrAssignment_0_in_rule__Model__Group__0__Impl1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_1_in_rule__Model__Group__1__Impl1074 = new BitSet(new long[]{0x00000000000C8002L});
    public static final BitSet FOLLOW_rule__AntlrGrammarRef__Group__0__Impl_in_rule__AntlrGrammarRef__Group__01109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AntlrGrammarRef__Group__1_in_rule__AntlrGrammarRef__Group__01112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AntlrGrammarRef__Group__0__Impl1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntlrGrammarRef__Group__1__Impl_in_rule__AntlrGrammarRef__Group__11171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntlrGrammarRef__GrammarFileAssignment_1_in_rule__AntlrGrammarRef__Group__1__Impl1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__Group__0__Impl_in_rule__NamedEnumDeclaration__Group__01232 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__Group__1_in_rule__NamedEnumDeclaration__Group__01235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NamedEnumDeclaration__Group__0__Impl1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__Group__1__Impl_in_rule__NamedEnumDeclaration__Group__11294 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__Group__2_in_rule__NamedEnumDeclaration__Group__11297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__NameAssignment_1_in_rule__NamedEnumDeclaration__Group__1__Impl1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__Group__2__Impl_in_rule__NamedEnumDeclaration__Group__21354 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__Group__3_in_rule__NamedEnumDeclaration__Group__21357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NamedEnumDeclaration__Group__2__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__Group__3__Impl_in_rule__NamedEnumDeclaration__Group__31416 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__Group__4_in_rule__NamedEnumDeclaration__Group__31419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__ValuesAssignment_3_in_rule__NamedEnumDeclaration__Group__3__Impl1448 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__ValuesAssignment_3_in_rule__NamedEnumDeclaration__Group__3__Impl1460 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__NamedEnumDeclaration__Group__4__Impl_in_rule__NamedEnumDeclaration__Group__41493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NamedEnumDeclaration__Group__4__Impl1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedEnumDeclaration__Group__0__Impl_in_rule__UnnamedEnumDeclaration__Group__01562 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__UnnamedEnumDeclaration__Group__1_in_rule__UnnamedEnumDeclaration__Group__01565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__UnnamedEnumDeclaration__Group__0__Impl1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedEnumDeclaration__Group__1__Impl_in_rule__UnnamedEnumDeclaration__Group__11624 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UnnamedEnumDeclaration__Group__2_in_rule__UnnamedEnumDeclaration__Group__11627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UnnamedEnumDeclaration__Group__1__Impl1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedEnumDeclaration__Group__2__Impl_in_rule__UnnamedEnumDeclaration__Group__21686 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__UnnamedEnumDeclaration__Group__3_in_rule__UnnamedEnumDeclaration__Group__21689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnnamedEnumDeclaration__ValuesAssignment_2_in_rule__UnnamedEnumDeclaration__Group__2__Impl1718 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__UnnamedEnumDeclaration__ValuesAssignment_2_in_rule__UnnamedEnumDeclaration__Group__2__Impl1730 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__UnnamedEnumDeclaration__Group__3__Impl_in_rule__UnnamedEnumDeclaration__Group__31763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__UnnamedEnumDeclaration__Group__3__Impl1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group__0__Impl_in_rule__NodeType__Group__01830 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__NodeType__Group__1_in_rule__NodeType__Group__01833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NodeType__Group__0__Impl1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group__1__Impl_in_rule__NodeType__Group__11895 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NodeType__Group__2_in_rule__NodeType__Group__11898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NodeType__Group__1__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group__2__Impl_in_rule__NodeType__Group__21957 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_rule__NodeType__Group__3_in_rule__NodeType__Group__21960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__NameAssignment_2_in_rule__NodeType__Group__2__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group__3__Impl_in_rule__NodeType__Group__32017 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_rule__NodeType__Group__4_in_rule__NodeType__Group__32020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group_3__0_in_rule__NodeType__Group__3__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group__4__Impl_in_rule__NodeType__Group__42078 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_rule__NodeType__Group__5_in_rule__NodeType__Group__42081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group_4__0_in_rule__NodeType__Group__4__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group__5__Impl_in_rule__NodeType__Group__52139 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_rule__NodeType__Group__6_in_rule__NodeType__Group__52142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NodeType__Group__5__Impl2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group__6__Impl_in_rule__NodeType__Group__62201 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_rule__NodeType__Group__7_in_rule__NodeType__Group__62204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__FieldsAssignment_6_in_rule__NodeType__Group__6__Impl2231 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__NodeType__Group__7__Impl_in_rule__NodeType__Group__72262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NodeType__Group__7__Impl2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group_3__0__Impl_in_rule__NodeType__Group_3__02337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NodeType__Group_3__1_in_rule__NodeType__Group_3__02340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NodeType__Group_3__0__Impl2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group_3__1__Impl_in_rule__NodeType__Group_3__12399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__SuperTypeAssignment_3_1_in_rule__NodeType__Group_3__1__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group_4__0__Impl_in_rule__NodeType__Group_4__02460 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NodeType__Group_4__1_in_rule__NodeType__Group_4__02463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NodeType__Group_4__0__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Group_4__1__Impl_in_rule__NodeType__Group_4__12522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__AntlrNodeAssignment_4_1_in_rule__NodeType__Group_4__1__Impl2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeField__Group__0__Impl_in_rule__NodeTypeField__Group__02583 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__NodeTypeField__Group__1_in_rule__NodeTypeField__Group__02586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeField__NameAssignment_0_in_rule__NodeTypeField__Group__0__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeField__Group__1__Impl_in_rule__NodeTypeField__Group__12643 = new BitSet(new long[]{0x000000000000B820L});
    public static final BitSet FOLLOW_rule__NodeTypeField__Group__2_in_rule__NodeTypeField__Group__12646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeField__Alternatives_1_in_rule__NodeTypeField__Group__1__Impl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeField__Group__2__Impl_in_rule__NodeTypeField__Group__22703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeField__ValueAssignment_2_in_rule__NodeTypeField__Group__2__Impl2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeNodeTypeField__Group__0__Impl_in_rule__AttributeNodeTypeField__Group__02766 = new BitSet(new long[]{0x000000000000B820L});
    public static final BitSet FOLLOW_rule__AttributeNodeTypeField__Group__1_in_rule__AttributeNodeTypeField__Group__02769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeNodeTypeField__Group__1__Impl_in_rule__AttributeNodeTypeField__Group__12827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeNodeTypeField__Alternatives_1_in_rule__AttributeNodeTypeField__Group__1__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntlrGrammarRef_in_rule__Model__AntlrAssignment_02893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_12924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AntlrGrammarRef__GrammarFileAssignment_12955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedEnumDeclaration__NameAssignment_12986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumNodeTypeFieldValue_in_rule__NamedEnumDeclaration__ValuesAssignment_33017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumNodeTypeFieldValue_in_rule__UnnamedEnumDeclaration__ValuesAssignment_23048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeType__NameAssignment_23079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeType__SuperTypeAssignment_3_13114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeType__AntlrNodeAssignment_4_13149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeField_in_rule__NodeType__FieldsAssignment_63180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeTypeField__NameAssignment_03211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NodeTypeField__ManyAssignment_1_03247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NodeTypeField__OptionalAssignment_1_13291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__NodeTypeField__SingleAssignment_1_23335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeFieldValue_in_rule__NodeTypeField__ValueAssignment_23374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumNodeTypeFieldValue__NameAssignment3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RelationNodeTypeField__TypeAssignment3440 = new BitSet(new long[]{0x0000000000000002L});

}