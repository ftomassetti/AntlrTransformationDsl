package me.tomassetti.web

import com.google.inject.Guice
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import javax.servlet.annotation.WebServlet
import me.tomassetti.AstTransformationsDslRuntimeModule
import me.tomassetti.AstTransformationsDslStandaloneSetup
import org.eclipse.xtext.web.servlet.XtextServlet
import com.google.inject.Module

@WebServlet(name = "Xtext Services", urlPatterns = "/xtext-service/*")
class AstTransformationsDslXtextServlet extends XtextServlet {

	ExecutorService executorService

	override init() {
		super.init()
		executorService = Executors.newCachedThreadPool
		new AstTransformationsDslStandaloneSetup {
			override createInjector() {
				val runtimeModule = new AstTransformationsDslRuntimeModule as Module
				val webModule = new AstTransformationsDslWebModule(executorService)
				return Guice.createInjector(runtimeModule, webModule)
			}
		}.createInjectorAndDoEMFRegistration
	}

	override destroy() {
		if (executorService !== null)
			executorService.shutdown()
		executorService = null
		super.destroy()
	}

}
