package me.tomassetti.idea;

import org.eclipse.xtext.util.Modules2;
import me.tomassetti.AstTransformationsDslStandaloneSetupGenerated;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class AstTransformationsDslStandaloneSetupIdea extends AstTransformationsDslStandaloneSetupGenerated {

    @Override
    public Injector createInjector() {
        Module runtimeModule = new me.tomassetti.AstTransformationsDslRuntimeModule();
        Module ideaModule = new me.tomassetti.idea.AstTransformationsDslIdeaModule();
        Module mergedModule = Modules2.mixin(runtimeModule, ideaModule);
        return Guice.createInjector(mergedModule);
    }

}
