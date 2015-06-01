package me.tomassetti.idea.lang.psi;

import com.intellij.psi.util.PsiModificationTracker;
import org.eclipse.xtext.psi.BaseXtextCodeBlockModificationListener;
import me.tomassetti.idea.lang.AstTransformationsDslLanguage;

public class AstTransformationsDslCodeBlockModificationListener extends BaseXtextCodeBlockModificationListener {

	public AstTransformationsDslCodeBlockModificationListener(PsiModificationTracker psiModificationTracker) {
		super(AstTransformationsDslLanguage.INSTANCE, psiModificationTracker);
	}

}
