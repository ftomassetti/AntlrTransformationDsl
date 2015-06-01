To build this project you need to install Gradle.
https://gradle.org/docs/current/userguide/installation.html


The following tasks are available:
 eclipse - generates Eclipse metadata like .project and .classpath, including the IntelliJ libraries
 test - runs all your unit tests
 assemble - creates the shippable build outputs. This includes an ideaZip, which packages your plugin in the format that the IDEA plugin manager understands
 runIdea - starts IntelliJ IDEA with your plugin installed

 For more information please read: https://github.com/xtext/xtext-gradle-plugin/tree/master/xtext-idea-gradle-plugin
