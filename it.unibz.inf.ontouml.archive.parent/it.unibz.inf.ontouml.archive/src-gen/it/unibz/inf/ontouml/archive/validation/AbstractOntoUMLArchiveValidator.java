/*
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractOntoUMLArchiveValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage.eINSTANCE);
		return result;
	}
	
}
