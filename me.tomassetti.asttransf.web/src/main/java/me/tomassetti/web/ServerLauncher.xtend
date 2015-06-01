package me.tomassetti.web

import java.net.InetSocketAddress
import org.eclipse.jetty.annotations.AnnotationConfiguration
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.util.log.Slf4jLog
import org.eclipse.jetty.webapp.MetaInfConfiguration
import org.eclipse.jetty.webapp.WebAppContext
import org.eclipse.jetty.webapp.WebInfConfiguration
import org.eclipse.jetty.webapp.WebXmlConfiguration

class ServerLauncher {
	def static void main(String[] args) {
		val server = new Server(new InetSocketAddress('localhost', 8080))
		server.handler = new WebAppContext => [
			resourceBase = 'src/main/webapp'
			welcomeFiles = #["index.html"]
			contextPath = "/"
			configurations = #[
				new AnnotationConfiguration,
				new WebXmlConfiguration,
				new WebInfConfiguration,
				new MetaInfConfiguration
			]
			setAttribute(WebInfConfiguration.CONTAINER_JAR_PATTERN, ".*org\\.eclipse\\.xtext\\.web.*|.*me\\.tomassetti\\.asttransf\\.web.*|.*requirejs.*|.*jquery.*")
		]
		val log = new Slf4jLog
		server.start
		log.info('Press enter to stop the server...')
		new Thread[
	    	val key = System.in.read
	    	server.stop
	    	if (key == -1)
	    		log.warn('The standard input stream is empty. If you are using Gradle, set the property \'standardInput = System.in\' in the JavaExec task.')
	    ].start
		server.join
	}
}
