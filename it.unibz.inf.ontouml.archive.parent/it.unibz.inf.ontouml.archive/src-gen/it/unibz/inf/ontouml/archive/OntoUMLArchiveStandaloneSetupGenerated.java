/*
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive;

import com.google.inject.Guice;
import com.google.inject.Injector;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class OntoUMLArchiveStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new OntoUMLArchiveRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.unibz.it/inf/ontouml/archive/OntoUMLArchive")) {
			EPackage.Registry.INSTANCE.put("http://www.unibz.it/inf/ontouml/archive/OntoUMLArchive", OntoUMLArchivePackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ontoarch", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("ontoarch", serviceProvider);
	}
}
