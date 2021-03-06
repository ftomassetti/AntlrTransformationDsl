package me.tomassetti.web

import com.google.inject.Binder
import com.google.inject.name.Names
import java.util.concurrent.ExecutorService
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ide.LexerIdeBindings
import org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer
import org.eclipse.xtext.service.AbstractGenericModule
import me.tomassetti.ide.contentassist.antlr.AstTransformationsDslParser
import me.tomassetti.ide.contentassist.antlr.internal.InternalAstTransformationsDslLexer

@Accessors
@FinalFieldsConstructor
class AstTransformationsDslWebModule extends AbstractGenericModule {

	val ExecutorService executorService

	def configureExecutorService(Binder binder) {
		binder.bind(ExecutorService).toInstance(executorService)
	}

	def configureContentAssistLexer(Binder binder) {
		binder.bind(Lexer).annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST)).to(InternalAstTransformationsDslLexer)
	}

	def Class<? extends IContentAssistParser> bindIContentAssistParser() {
		AstTransformationsDslParser
	}

}
