package me.tomassetti.idea.lang;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class AstTransformationsDslFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(me.tomassetti.idea.lang.AstTransformationsDslFileType.INSTANCE, me.tomassetti.idea.lang.AbstractAstTransformationsDslFileType.DEFAULT_EXTENSION);
	}

}
