package me.tomassetti.idea.lang;

import javax.swing.Icon;

import org.eclipse.xtext.idea.Icons;
import org.jetbrains.annotations.NonNls;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;

public class AbstractAstTransformationsDslFileType extends LanguageFileType {

	@NonNls 
	public static final String DEFAULT_EXTENSION = "asttr";

	protected AbstractAstTransformationsDslFileType(final Language language) {
		super(language);
	}

	@Override
	public String getDefaultExtension() {
		return DEFAULT_EXTENSION;
	}

	@Override
	public String getDescription() {
		return "AstTransformationsDsl files";
	}

	@Override
	public Icon getIcon() {
		return Icons.DSL_FILE_TYPE;
	}

	@Override
	public String getName() {
		return "AstTransformationsDsl";
	}

}
