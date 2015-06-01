package me.tomassetti.idea.lang;

class AstTransformationsDslFileType extends AbstractAstTransformationsDslFileType {

	public static final AstTransformationsDslFileType INSTANCE = new AstTransformationsDslFileType()
	
	new() {
		super(AstTransformationsDslLanguage.INSTANCE)
	}

}
