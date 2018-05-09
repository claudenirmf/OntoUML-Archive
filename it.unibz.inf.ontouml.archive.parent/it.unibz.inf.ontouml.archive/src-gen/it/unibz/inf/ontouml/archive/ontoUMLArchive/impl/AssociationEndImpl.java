/**
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.ontoUMLArchive.impl;

import it.unibz.inf.ontouml.archive.ontoUMLArchive.AssociationEnd;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Multiplicity;
import it.unibz.inf.ontouml.archive.ontoUMLArchive.OntoUMLArchivePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.impl.AssociationEndImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.impl.AssociationEndImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.archive.ontoUMLArchive.impl.AssociationEndImpl#getEndType <em>End Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationEndImpl extends MinimalEObjectImpl.Container implements AssociationEnd
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity()
   * @generated
   * @ordered
   */
  protected Multiplicity multiplicity;

  /**
   * The cached value of the '{@link #getEndType() <em>End Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndType()
   * @generated
   * @ordered
   */
  protected it.unibz.inf.ontouml.archive.ontoUMLArchive.Class endType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssociationEndImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OntoUMLArchivePackage.Literals.ASSOCIATION_END;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLArchivePackage.ASSOCIATION_END__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity getMultiplicity()
  {
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMultiplicity(Multiplicity newMultiplicity, NotificationChain msgs)
  {
    Multiplicity oldMultiplicity = multiplicity;
    multiplicity = newMultiplicity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OntoUMLArchivePackage.ASSOCIATION_END__MULTIPLICITY, oldMultiplicity, newMultiplicity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicity(Multiplicity newMultiplicity)
  {
    if (newMultiplicity != multiplicity)
    {
      NotificationChain msgs = null;
      if (multiplicity != null)
        msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OntoUMLArchivePackage.ASSOCIATION_END__MULTIPLICITY, null, msgs);
      if (newMultiplicity != null)
        msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OntoUMLArchivePackage.ASSOCIATION_END__MULTIPLICITY, null, msgs);
      msgs = basicSetMultiplicity(newMultiplicity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLArchivePackage.ASSOCIATION_END__MULTIPLICITY, newMultiplicity, newMultiplicity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public it.unibz.inf.ontouml.archive.ontoUMLArchive.Class getEndType()
  {
    if (endType != null && endType.eIsProxy())
    {
      InternalEObject oldEndType = (InternalEObject)endType;
      endType = (it.unibz.inf.ontouml.archive.ontoUMLArchive.Class)eResolveProxy(oldEndType);
      if (endType != oldEndType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntoUMLArchivePackage.ASSOCIATION_END__END_TYPE, oldEndType, endType));
      }
    }
    return endType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public it.unibz.inf.ontouml.archive.ontoUMLArchive.Class basicGetEndType()
  {
    return endType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndType(it.unibz.inf.ontouml.archive.ontoUMLArchive.Class newEndType)
  {
    it.unibz.inf.ontouml.archive.ontoUMLArchive.Class oldEndType = endType;
    endType = newEndType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntoUMLArchivePackage.ASSOCIATION_END__END_TYPE, oldEndType, endType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OntoUMLArchivePackage.ASSOCIATION_END__MULTIPLICITY:
        return basicSetMultiplicity(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OntoUMLArchivePackage.ASSOCIATION_END__NAME:
        return getName();
      case OntoUMLArchivePackage.ASSOCIATION_END__MULTIPLICITY:
        return getMultiplicity();
      case OntoUMLArchivePackage.ASSOCIATION_END__END_TYPE:
        if (resolve) return getEndType();
        return basicGetEndType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OntoUMLArchivePackage.ASSOCIATION_END__NAME:
        setName((String)newValue);
        return;
      case OntoUMLArchivePackage.ASSOCIATION_END__MULTIPLICITY:
        setMultiplicity((Multiplicity)newValue);
        return;
      case OntoUMLArchivePackage.ASSOCIATION_END__END_TYPE:
        setEndType((it.unibz.inf.ontouml.archive.ontoUMLArchive.Class)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OntoUMLArchivePackage.ASSOCIATION_END__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OntoUMLArchivePackage.ASSOCIATION_END__MULTIPLICITY:
        setMultiplicity((Multiplicity)null);
        return;
      case OntoUMLArchivePackage.ASSOCIATION_END__END_TYPE:
        setEndType((it.unibz.inf.ontouml.archive.ontoUMLArchive.Class)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OntoUMLArchivePackage.ASSOCIATION_END__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OntoUMLArchivePackage.ASSOCIATION_END__MULTIPLICITY:
        return multiplicity != null;
      case OntoUMLArchivePackage.ASSOCIATION_END__END_TYPE:
        return endType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AssociationEndImpl