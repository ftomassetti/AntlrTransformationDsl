package me.tomassetti.idea.lang;

import org.eclipse.xtext.idea.lang.AbstractXtextLanguage;

import com.google.inject.Injector;

public final class AstTransformationsDslLanguage extends AbstractXtextLanguage {

	public static final AstTransformationsDslLanguage INSTANCE = new AstTransformationsDslLanguage();

	private Injector injector;

	private AstTransformationsDslLanguage() {
		super("me.tomassetti.AstTransformationsDsl");
		this.injector = new me.tomassetti.idea.AstTransformationsDslStandaloneSetupIdea().createInjectorAndDoEMFRegistration();
		
	}

	@Override
	protected Injector getInjector() {
		return injector;
	}
}
