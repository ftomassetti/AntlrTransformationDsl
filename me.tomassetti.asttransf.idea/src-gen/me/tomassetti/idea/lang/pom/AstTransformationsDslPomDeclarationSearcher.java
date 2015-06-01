package me.tomassetti.idea.lang.pom;

import org.eclipse.xtext.idea.pom.AbstractXtextPomDeclarationSearcher;
import me.tomassetti.idea.lang.AstTransformationsDslLanguage;

public class AstTransformationsDslPomDeclarationSearcher extends AbstractXtextPomDeclarationSearcher {

	public AstTransformationsDslPomDeclarationSearcher() {
		super(AstTransformationsDslLanguage.INSTANCE);
	}

}
