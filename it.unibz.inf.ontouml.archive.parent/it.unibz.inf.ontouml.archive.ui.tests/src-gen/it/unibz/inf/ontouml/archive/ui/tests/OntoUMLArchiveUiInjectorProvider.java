/*
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.ui.tests;

import com.google.inject.Injector;
import it.unibz.inf.ontouml.archive.ui.internal.ArchiveActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class OntoUMLArchiveUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ArchiveActivator.getInstance().getInjector("it.unibz.inf.ontouml.archive.OntoUMLArchive");
	}

}
