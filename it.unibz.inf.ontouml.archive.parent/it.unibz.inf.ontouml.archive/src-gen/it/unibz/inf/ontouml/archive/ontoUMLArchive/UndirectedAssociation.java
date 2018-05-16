/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.ontoUMLArchive;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Undirected Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.UndirectedAssociation#getEndA <em>End A</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.UndirectedAssociation#getEndB <em>End B</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getUndirectedAssociation()
 * @model
 * @generated
 */
public interface UndirectedAssociation extends BinaryAssociation
{
  /**
   * Returns the value of the '<em><b>End A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End A</em>' containment reference.
   * @see #setEndA(AssociationEnd)
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getUndirectedAssociation_EndA()
   * @model containment="true"
   * @generated
   */
  AssociationEnd getEndA();

  /**
   * Sets the value of the '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.UndirectedAssociation#getEndA <em>End A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End A</em>' containment reference.
   * @see #getEndA()
   * @generated
   */
  void setEndA(AssociationEnd value);

  /**
   * Returns the value of the '<em><b>End B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End B</em>' containment reference.
   * @see #setEndB(AssociationEnd)
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getUndirectedAssociation_EndB()
   * @model containment="true"
   * @generated
   */
  AssociationEnd getEndB();

  /**
   * Sets the value of the '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.UndirectedAssociation#getEndB <em>End B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End B</em>' containment reference.
   * @see #getEndB()
   * @generated
   */
  void setEndB(AssociationEnd value);

} // UndirectedAssociation
