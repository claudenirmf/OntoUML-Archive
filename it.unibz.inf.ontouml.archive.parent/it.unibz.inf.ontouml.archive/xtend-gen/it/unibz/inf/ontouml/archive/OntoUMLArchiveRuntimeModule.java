/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive;

import it.unibz.inf.ontouml.archive.AbstractOntoUMLArchiveRuntimeModule;
import it.unibz.inf.ontouml.archive.OntoUMLArchiveValueConverter;
import org.eclipse.xtext.conversion.IValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class OntoUMLArchiveRuntimeModule extends AbstractOntoUMLArchiveRuntimeModule {
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return OntoUMLArchiveValueConverter.class;
  }
}
