package me.tomassetti.idea.lang.psi;

import org.eclipse.xtext.psi.BaseXtextElementDescriptionProvider;
import me.tomassetti.idea.lang.AstTransformationsDslLanguage;

public class AstTransformationsDslElementDescriptionProvider extends BaseXtextElementDescriptionProvider {

	public AstTransformationsDslElementDescriptionProvider() {
		super(AstTransformationsDslLanguage.INSTANCE);
	}

}
