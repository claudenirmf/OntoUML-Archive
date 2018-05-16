/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.ontoUMLArchive.impl;

import it.unibz.inf.ontouml.archive.ontoUMLArchive.AggregationKind;
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
import it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchiveFactory;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.RelationDerivationEnd;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Relationship;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.UndirectedAssociation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OntoUMLArchivePackageImpl extends EPackageImpl implements OntoUMLArchivePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass associationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directedAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass undirectedAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naryAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass associationEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass derivationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classDerivationEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationDerivationEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalizationSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum aggregationKindEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OntoUMLArchivePackageImpl()
  {
    super(eNS_URI, OntoUMLArchiveFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OntoUMLArchivePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OntoUMLArchivePackage init()
  {
    if (isInited) return (OntoUMLArchivePackage)EPackage.Registry.INSTANCE.getEPackage(OntoUMLArchivePackage.eNS_URI);

    // Obtain or create and register package
    OntoUMLArchivePackageImpl theOntoUMLArchivePackage = (OntoUMLArchivePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OntoUMLArchivePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OntoUMLArchivePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theOntoUMLArchivePackage.createPackageContents();

    // Initialize created meta-data
    theOntoUMLArchivePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOntoUMLArchivePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OntoUMLArchivePackage.eNS_URI, theOntoUMLArchivePackage);
    return theOntoUMLArchivePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_PublicationTitle()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Authors()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_OntologyName()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelElement()
  {
    return modelElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelElement_Name()
  {
    return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_IsAbstract()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Stereotypes()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Attributes()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Multiplicity()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_AttType()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationship()
  {
    return relationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssociation()
  {
    return associationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssociation_Stereotypes()
  {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryAssociation()
  {
    return binaryAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectedAssociation()
  {
    return directedAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectedAssociation_From()
  {
    return (EReference)directedAssociationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectedAssociation_To()
  {
    return (EReference)directedAssociationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUndirectedAssociation()
  {
    return undirectedAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUndirectedAssociation_EndA()
  {
    return (EReference)undirectedAssociationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUndirectedAssociation_EndB()
  {
    return (EReference)undirectedAssociationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaryAssociation()
  {
    return naryAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaryAssociation_Ends()
  {
    return (EReference)naryAssociationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssociationEnd()
  {
    return associationEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssociationEnd_AggregationKind()
  {
    return (EAttribute)associationEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssociationEnd_Name()
  {
    return (EAttribute)associationEndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssociationEnd_Multiplicity()
  {
    return (EReference)associationEndEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssociationEnd_EndType()
  {
    return (EReference)associationEndEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssociationEnd_Constraints()
  {
    return (EAttribute)associationEndEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicity()
  {
    return multiplicityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicity_Lower()
  {
    return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicity_Upper()
  {
    return (EAttribute)multiplicityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneralization()
  {
    return generalizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralization_Super()
  {
    return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralization_Sub()
  {
    return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependencyLink()
  {
    return dependencyLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDependencyLink_Stereotypes()
  {
    return (EAttribute)dependencyLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependencyLink_From()
  {
    return (EReference)dependencyLinkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependencyLink_To()
  {
    return (EReference)dependencyLinkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDerivation()
  {
    return derivationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDerivation_Stereotypes()
  {
    return (EAttribute)derivationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDerivation_Class()
  {
    return (EReference)derivationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDerivation_Part()
  {
    return (EReference)derivationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassDerivationEnd()
  {
    return classDerivationEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDerivationEnd_Multiplicity()
  {
    return (EReference)classDerivationEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDerivationEnd_EndType()
  {
    return (EReference)classDerivationEndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDerivationEnd_Constraints()
  {
    return (EAttribute)classDerivationEndEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationDerivationEnd()
  {
    return relationDerivationEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationDerivationEnd_Multiplicity()
  {
    return (EReference)relationDerivationEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationDerivationEnd_EndType()
  {
    return (EReference)relationDerivationEndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelationDerivationEnd_Constraints()
  {
    return (EAttribute)relationDerivationEndEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneralizationSet()
  {
    return generalizationSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeneralizationSet_IsDisjoint()
  {
    return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeneralizationSet_IsComplete()
  {
    return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralizationSet_Generalizations()
  {
    return (EReference)generalizationSetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAggregationKind()
  {
    return aggregationKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OntoUMLArchiveFactory getOntoUMLArchiveFactory()
  {
    return (OntoUMLArchiveFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__PUBLICATION_TITLE);
    createEAttribute(modelEClass, MODEL__AUTHORS);
    createEAttribute(modelEClass, MODEL__ONTOLOGY_NAME);
    createEReference(modelEClass, MODEL__ELEMENTS);

    modelElementEClass = createEClass(MODEL_ELEMENT);
    createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);

    classEClass = createEClass(CLASS);
    createEAttribute(classEClass, CLASS__IS_ABSTRACT);
    createEAttribute(classEClass, CLASS__STEREOTYPES);
    createEReference(classEClass, CLASS__ATTRIBUTES);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEReference(attributeEClass, ATTRIBUTE__MULTIPLICITY);
    createEReference(attributeEClass, ATTRIBUTE__ATT_TYPE);

    relationshipEClass = createEClass(RELATIONSHIP);

    associationEClass = createEClass(ASSOCIATION);
    createEAttribute(associationEClass, ASSOCIATION__STEREOTYPES);

    binaryAssociationEClass = createEClass(BINARY_ASSOCIATION);

    directedAssociationEClass = createEClass(DIRECTED_ASSOCIATION);
    createEReference(directedAssociationEClass, DIRECTED_ASSOCIATION__FROM);
    createEReference(directedAssociationEClass, DIRECTED_ASSOCIATION__TO);

    undirectedAssociationEClass = createEClass(UNDIRECTED_ASSOCIATION);
    createEReference(undirectedAssociationEClass, UNDIRECTED_ASSOCIATION__END_A);
    createEReference(undirectedAssociationEClass, UNDIRECTED_ASSOCIATION__END_B);

    naryAssociationEClass = createEClass(NARY_ASSOCIATION);
    createEReference(naryAssociationEClass, NARY_ASSOCIATION__ENDS);

    associationEndEClass = createEClass(ASSOCIATION_END);
    createEAttribute(associationEndEClass, ASSOCIATION_END__AGGREGATION_KIND);
    createEAttribute(associationEndEClass, ASSOCIATION_END__NAME);
    createEReference(associationEndEClass, ASSOCIATION_END__MULTIPLICITY);
    createEReference(associationEndEClass, ASSOCIATION_END__END_TYPE);
    createEAttribute(associationEndEClass, ASSOCIATION_END__CONSTRAINTS);

    multiplicityEClass = createEClass(MULTIPLICITY);
    createEAttribute(multiplicityEClass, MULTIPLICITY__LOWER);
    createEAttribute(multiplicityEClass, MULTIPLICITY__UPPER);

    generalizationEClass = createEClass(GENERALIZATION);
    createEReference(generalizationEClass, GENERALIZATION__SUPER);
    createEReference(generalizationEClass, GENERALIZATION__SUB);

    dependencyLinkEClass = createEClass(DEPENDENCY_LINK);
    createEAttribute(dependencyLinkEClass, DEPENDENCY_LINK__STEREOTYPES);
    createEReference(dependencyLinkEClass, DEPENDENCY_LINK__FROM);
    createEReference(dependencyLinkEClass, DEPENDENCY_LINK__TO);

    derivationEClass = createEClass(DERIVATION);
    createEAttribute(derivationEClass, DERIVATION__STEREOTYPES);
    createEReference(derivationEClass, DERIVATION__CLASS);
    createEReference(derivationEClass, DERIVATION__PART);

    classDerivationEndEClass = createEClass(CLASS_DERIVATION_END);
    createEReference(classDerivationEndEClass, CLASS_DERIVATION_END__MULTIPLICITY);
    createEReference(classDerivationEndEClass, CLASS_DERIVATION_END__END_TYPE);
    createEAttribute(classDerivationEndEClass, CLASS_DERIVATION_END__CONSTRAINTS);

    relationDerivationEndEClass = createEClass(RELATION_DERIVATION_END);
    createEReference(relationDerivationEndEClass, RELATION_DERIVATION_END__MULTIPLICITY);
    createEReference(relationDerivationEndEClass, RELATION_DERIVATION_END__END_TYPE);
    createEAttribute(relationDerivationEndEClass, RELATION_DERIVATION_END__CONSTRAINTS);

    generalizationSetEClass = createEClass(GENERALIZATION_SET);
    createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_DISJOINT);
    createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_COMPLETE);
    createEReference(generalizationSetEClass, GENERALIZATION_SET__GENERALIZATIONS);

    // Create enums
    aggregationKindEEnum = createEEnum(AGGREGATION_KIND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    classEClass.getESuperTypes().add(this.getModelElement());
    relationshipEClass.getESuperTypes().add(this.getModelElement());
    associationEClass.getESuperTypes().add(this.getRelationship());
    binaryAssociationEClass.getESuperTypes().add(this.getAssociation());
    directedAssociationEClass.getESuperTypes().add(this.getBinaryAssociation());
    undirectedAssociationEClass.getESuperTypes().add(this.getBinaryAssociation());
    naryAssociationEClass.getESuperTypes().add(this.getAssociation());
    generalizationEClass.getESuperTypes().add(this.getRelationship());
    dependencyLinkEClass.getESuperTypes().add(this.getRelationship());
    derivationEClass.getESuperTypes().add(this.getRelationship());
    generalizationSetEClass.getESuperTypes().add(this.getModelElement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_PublicationTitle(), ecorePackage.getEString(), "publicationTitle", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Authors(), ecorePackage.getEString(), "authors", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_OntologyName(), ecorePackage.getEString(), "ontologyName", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Elements(), this.getModelElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classEClass, it.unibz.inf.ontouml.archive.ontoUMLArchive.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, it.unibz.inf.ontouml.archive.ontoUMLArchive.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_Stereotypes(), ecorePackage.getEString(), "stereotypes", null, 0, -1, it.unibz.inf.ontouml.archive.ontoUMLArchive.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, it.unibz.inf.ontouml.archive.ontoUMLArchive.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_AttType(), this.getClass_(), null, "attType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssociation_Stereotypes(), ecorePackage.getEString(), "stereotypes", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryAssociationEClass, BinaryAssociation.class, "BinaryAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(directedAssociationEClass, DirectedAssociation.class, "DirectedAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDirectedAssociation_From(), this.getAssociationEnd(), null, "from", null, 0, 1, DirectedAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDirectedAssociation_To(), this.getAssociationEnd(), null, "to", null, 0, 1, DirectedAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(undirectedAssociationEClass, UndirectedAssociation.class, "UndirectedAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUndirectedAssociation_EndA(), this.getAssociationEnd(), null, "endA", null, 0, 1, UndirectedAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUndirectedAssociation_EndB(), this.getAssociationEnd(), null, "endB", null, 0, 1, UndirectedAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(naryAssociationEClass, NaryAssociation.class, "NaryAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNaryAssociation_Ends(), this.getAssociationEnd(), null, "ends", null, 0, -1, NaryAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(associationEndEClass, AssociationEnd.class, "AssociationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssociationEnd_AggregationKind(), this.getAggregationKind(), "aggregationKind", null, 0, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssociationEnd_Name(), ecorePackage.getEString(), "name", null, 0, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssociationEnd_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssociationEnd_EndType(), this.getClass_(), null, "endType", null, 0, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssociationEnd_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiplicity_Lower(), ecorePackage.getEInt(), "lower", null, 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplicity_Upper(), ecorePackage.getEInt(), "upper", null, 0, 1, Multiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGeneralization_Super(), this.getClass_(), null, "super", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralization_Sub(), this.getClass_(), null, "sub", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dependencyLinkEClass, DependencyLink.class, "DependencyLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDependencyLink_Stereotypes(), ecorePackage.getEString(), "stereotypes", null, 0, -1, DependencyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDependencyLink_From(), this.getClass_(), null, "from", null, 0, 1, DependencyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDependencyLink_To(), this.getClass_(), null, "to", null, 0, 1, DependencyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(derivationEClass, Derivation.class, "Derivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDerivation_Stereotypes(), ecorePackage.getEString(), "stereotypes", null, 0, -1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDerivation_Class(), this.getClassDerivationEnd(), null, "class", null, 0, 1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDerivation_Part(), this.getRelationDerivationEnd(), null, "part", null, 0, 1, Derivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classDerivationEndEClass, ClassDerivationEnd.class, "ClassDerivationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassDerivationEnd_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1, ClassDerivationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassDerivationEnd_EndType(), this.getClass_(), null, "endType", null, 0, 1, ClassDerivationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassDerivationEnd_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, ClassDerivationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationDerivationEndEClass, RelationDerivationEnd.class, "RelationDerivationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationDerivationEnd_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1, RelationDerivationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationDerivationEnd_EndType(), this.getAssociation(), null, "endType", null, 0, 1, RelationDerivationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelationDerivationEnd_Constraints(), ecorePackage.getEString(), "constraints", null, 0, -1, RelationDerivationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeneralizationSet_IsDisjoint(), ecorePackage.getEBoolean(), "isDisjoint", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeneralizationSet_IsComplete(), ecorePackage.getEBoolean(), "isComplete", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralizationSet_Generalizations(), this.getGeneralization(), null, "generalizations", null, 0, -1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(aggregationKindEEnum, AggregationKind.class, "AggregationKind");
    addEEnumLiteral(aggregationKindEEnum, AggregationKind.NONE);
    addEEnumLiteral(aggregationKindEEnum, AggregationKind.SHARED);
    addEEnumLiteral(aggregationKindEEnum, AggregationKind.COMPOSITE);

    // Create resource
    createResource(eNS_URI);
  }

} //OntoUMLArchivePackageImpl
