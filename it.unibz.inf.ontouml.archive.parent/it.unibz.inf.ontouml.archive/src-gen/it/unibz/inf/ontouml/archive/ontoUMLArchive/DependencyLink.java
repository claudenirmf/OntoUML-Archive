/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.ontoUMLArchive;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.DependencyLink#getFrom <em>From</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.DependencyLink#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getDependencyLink()
 * @model
 * @generated
 */
public interface DependencyLink extends Relationship
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(it.unibz.inf.ontouml.archive.ontoUMLArchive.Class)
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getDependencyLink_From()
   * @model
   * @generated
   */
  it.unibz.inf.ontouml.archive.ontoUMLArchive.Class getFrom();

  /**
   * Sets the value of the '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.DependencyLink#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(it.unibz.inf.ontouml.archive.ontoUMLArchive.Class value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(it.unibz.inf.ontouml.archive.ontoUMLArchive.Class)
   * @see it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage#getDependencyLink_To()
   * @model
   * @generated
   */
  it.unibz.inf.ontouml.archive.ontoUMLArchive.Class getTo();

  /**
   * Sets the value of the '{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.DependencyLink#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(it.unibz.inf.ontouml.archive.ontoUMLArchive.Class value);

} // DependencyLink
