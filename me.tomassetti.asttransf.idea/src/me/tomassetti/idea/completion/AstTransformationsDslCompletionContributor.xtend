package me.tomassetti.idea.completion

import org.eclipse.xtext.idea.lang.AbstractXtextLanguage;
import me.tomassetti.idea.lang.AstTransformationsDslLanguage;

class AstTransformationsDslCompletionContributor extends AbstractAstTransformationsDslCompletionContributor {
	new() {
		this(AstTransformationsDslLanguage.INSTANCE)
	}
	
	new(AbstractXtextLanguage lang) {
		super(lang)
		//custom rules here
	}
}
