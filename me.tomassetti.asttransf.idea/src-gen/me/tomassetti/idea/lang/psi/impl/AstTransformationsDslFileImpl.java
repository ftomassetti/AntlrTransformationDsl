package me.tomassetti.idea.lang.psi.impl;

import org.eclipse.xtext.psi.impl.BaseXtextFile;
import me.tomassetti.idea.lang.AstTransformationsDslFileType;
import me.tomassetti.idea.lang.AstTransformationsDslLanguage;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;

public final class AstTransformationsDslFileImpl extends BaseXtextFile {

	public AstTransformationsDslFileImpl(FileViewProvider viewProvider) {
		super(viewProvider, AstTransformationsDslLanguage.INSTANCE);
	}

	@Override
	public FileType getFileType() {
		return AstTransformationsDslFileType.INSTANCE;
	}

}
