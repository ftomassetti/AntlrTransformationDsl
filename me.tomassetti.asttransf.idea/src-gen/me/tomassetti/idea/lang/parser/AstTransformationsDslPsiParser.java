package me.tomassetti.idea.lang.parser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.idea.parser.AbstractXtextPsiParser;
import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import me.tomassetti.idea.lang.AstTransformationsDslElementTypeProvider;
import me.tomassetti.idea.parser.antlr.internal.PsiInternalAstTransformationsDslParser;
import me.tomassetti.services.AstTransformationsDslGrammarAccess;

import com.google.inject.Inject;
import com.intellij.lang.PsiBuilder;

public class AstTransformationsDslPsiParser extends AbstractXtextPsiParser {

	private static final Set<String> INITIAL_HIDDEN_TOKENS = new HashSet<String>(Arrays.asList("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT"));

	@Inject 
	private AstTransformationsDslGrammarAccess grammarAccess;

	@Inject 
	private AstTransformationsDslElementTypeProvider elementTypeProvider;

	@Override
	protected AbstractPsiAntlrParser createParser(PsiBuilder builder, TokenStream tokenStream) {
		return new PsiInternalAstTransformationsDslParser(builder, tokenStream, elementTypeProvider, grammarAccess);
	}

	@Override
	protected Set<String> getInitialHiddenTokens() {
		return INITIAL_HIDDEN_TOKENS;
	}

}
