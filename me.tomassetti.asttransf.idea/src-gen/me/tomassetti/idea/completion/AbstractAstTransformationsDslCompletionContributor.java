package me.tomassetti.idea.completion;

import org.eclipse.xtext.idea.lang.AbstractXtextLanguage;
import org.eclipse.xtext.common.idea.completion.TerminalsCompletionContributor;

public class AbstractAstTransformationsDslCompletionContributor extends TerminalsCompletionContributor {
	public AbstractAstTransformationsDslCompletionContributor(AbstractXtextLanguage lang) {
		super(lang);
	}
}
