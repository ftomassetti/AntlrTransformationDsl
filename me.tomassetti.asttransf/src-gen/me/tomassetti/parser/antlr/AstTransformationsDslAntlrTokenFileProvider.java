/*
 * generated by Xtext 2.9.0.v201505220408
 */
package me.tomassetti.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AstTransformationsDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("me/tomassetti/parser/antlr/internal/InternalAstTransformationsDsl.tokens");
	}
}
