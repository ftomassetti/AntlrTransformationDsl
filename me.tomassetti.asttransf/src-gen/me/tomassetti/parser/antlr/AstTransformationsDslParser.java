/*
 * generated by Xtext 2.9.0.v201505220408
 */
package me.tomassetti.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import me.tomassetti.services.AstTransformationsDslGrammarAccess;

public class AstTransformationsDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private AstTransformationsDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected me.tomassetti.parser.antlr.internal.InternalAstTransformationsDslParser createParser(XtextTokenStream stream) {
		return new me.tomassetti.parser.antlr.internal.InternalAstTransformationsDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public AstTransformationsDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AstTransformationsDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
