/*
 * generated by Xtext 2.9.0.v201505220408
 */
package me.tomassetti.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractAstTransformationsDslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage.eINSTANCE);
		return result;
	}
}
