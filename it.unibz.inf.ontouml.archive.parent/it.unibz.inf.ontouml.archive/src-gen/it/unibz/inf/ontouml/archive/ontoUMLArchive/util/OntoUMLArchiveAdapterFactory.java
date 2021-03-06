/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.ontoUMLArchive.util;

import it.unibz.inf.ontouml.archive.ontoUMLArchive.Association;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Attribute;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.BinaryAssociation;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.ClassDerivationEnd;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.DependencyLink;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Derivation;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.DirectedAssociation;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Generalization;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.GeneralizationSet;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Model;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.ModelElement;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Multiplicity;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.NaryAssociation;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.RelationDerivationEnd;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Relationship;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.UndirectedAssociation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage
 * @generated
 */
public class OntoUMLArchiveAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OntoUMLArchivePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OntoUMLArchiveAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OntoUMLArchivePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OntoUMLArchiveSwitch<Adapter> modelSwitch =
    new OntoUMLArchiveSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseModelElement(ModelElement object)
      {
        return createModelElementAdapter();
      }
      @Override
      public Adapter caseClass(it.unibz.inf.ontouml.archive.ontoUMLArchive.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseRelationship(Relationship object)
      {
        return createRelationshipAdapter();
      }
      @Override
      public Adapter caseAssociation(Association object)
      {
        return createAssociationAdapter();
      }
      @Override
      public Adapter caseBinaryAssociation(BinaryAssociation object)
      {
        return createBinaryAssociationAdapter();
      }
      @Override
      public Adapter caseDirectedAssociation(DirectedAssociation object)
      {
        return createDirectedAssociationAdapter();
      }
      @Override
      public Adapter caseUndirectedAssociation(UndirectedAssociation object)
      {
        return createUndirectedAssociationAdapter();
      }
      @Override
      public Adapter caseNaryAssociation(NaryAssociation object)
      {
        return createNaryAssociationAdapter();
      }
      @Override
      public Adapter caseAssociationEnd(AssociationEnd object)
      {
        return createAssociationEndAdapter();
      }
      @Override
      public Adapter caseMultiplicity(Multiplicity object)
      {
        return createMultiplicityAdapter();
      }
      @Override
      public Adapter caseGeneralization(Generalization object)
      {
        return createGeneralizationAdapter();
      }
      @Override
      public Adapter caseDependencyLink(DependencyLink object)
      {
        return createDependencyLinkAdapter();
      }
      @Override
      public Adapter caseDerivation(Derivation object)
      {
        return createDerivationAdapter();
      }
      @Override
      public Adapter caseClassDerivationEnd(ClassDerivationEnd object)
      {
        return createClassDerivationEndAdapter();
      }
      @Override
      public Adapter caseRelationDerivationEnd(RelationDerivationEnd object)
      {
        return createRelationDerivationEndAdapter();
      }
      @Override
      public Adapter caseGeneralizationSet(GeneralizationSet object)
      {
        return createGeneralizationSetAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.ModelElement
   * @generated
   */
  public Adapter createModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.Relationship
   * @generated
   */
  public Adapter createRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.Association
   * @generated
   */
  public Adapter createAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.BinaryAssociation <em>Binary Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.BinaryAssociation
   * @generated
   */
  public Adapter createBinaryAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.DirectedAssociation <em>Directed Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.DirectedAssociation
   * @generated
   */
  public Adapter createDirectedAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.UndirectedAssociation <em>Undirected Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.UndirectedAssociation
   * @generated
   */
  public Adapter createUndirectedAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.NaryAssociation <em>Nary Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.NaryAssociation
   * @generated
   */
  public Adapter createNaryAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd <em>Association End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd
   * @generated
   */
  public Adapter createAssociationEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.Multiplicity
   * @generated
   */
  public Adapter createMultiplicityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.Generalization <em>Generalization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.Generalization
   * @generated
   */
  public Adapter createGeneralizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.DependencyLink <em>Dependency Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.DependencyLink
   * @generated
   */
  public Adapter createDependencyLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.Derivation <em>Derivation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.Derivation
   * @generated
   */
  public Adapter createDerivationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.ClassDerivationEnd <em>Class Derivation End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.ClassDerivationEnd
   * @generated
   */
  public Adapter createClassDerivationEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.RelationDerivationEnd <em>Relation Derivation End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.RelationDerivationEnd
   * @generated
   */
  public Adapter createRelationDerivationEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.GeneralizationSet <em>Generalization Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.GeneralizationSet
   * @generated
   */
  public Adapter createGeneralizationSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //OntoUMLArchiveAdapterFactory
