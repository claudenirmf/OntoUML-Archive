/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.ontoUMLArchive;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd#getEndType <em>End Type</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getAssociationEnd()
 * @model
 * @generated
 */
public interface AssociationEnd extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getAssociationEnd_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' containment reference.
   * @see #setMultiplicity(Multiplicity)
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getAssociationEnd_Multiplicity()
   * @model containment="true"
   * @generated
   */
  Multiplicity getMultiplicity();

  /**
   * Sets the value of the '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd#getMultiplicity <em>Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' containment reference.
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(Multiplicity value);

  /**
   * Returns the value of the '<em><b>End Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Type</em>' reference.
   * @see #setEndType(it.unibz.inf.ontouml.archive.ontoUMLArchive.Class)
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getAssociationEnd_EndType()
   * @model
   * @generated
   */
  it.unibz.inf.ontouml.archive.ontoUMLArchive.Class getEndType();

  /**
   * Sets the value of the '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd#getEndType <em>End Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Type</em>' reference.
   * @see #getEndType()
   * @generated
   */
  void setEndType(it.unibz.inf.ontouml.archive.ontoUMLArchive.Class value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' attribute list.
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getAssociationEnd_Constraints()
   * @model unique="false"
   * @generated
   */
  EList<String> getConstraints();

} // AssociationEnd
