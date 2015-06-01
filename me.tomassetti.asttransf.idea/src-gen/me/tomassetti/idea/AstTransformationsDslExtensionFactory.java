package me.tomassetti.idea;

import me.tomassetti.idea.lang.AstTransformationsDslLanguage;

import com.intellij.openapi.extensions.ExtensionFactory;

public class AstTransformationsDslExtensionFactory implements ExtensionFactory {

	@Override
	public Object createInstance(final String factoryArgument, final String implementationClass) {
		Class<?> clazz;
		try {
			clazz = Class.forName(implementationClass);
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException("Couldn't load "+implementationClass, e);
		}
		return AstTransformationsDslLanguage.INSTANCE.<Object> getInstance(clazz);
	}

}
