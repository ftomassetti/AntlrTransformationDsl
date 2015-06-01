/**
 */
package me.tomassetti.astTransformationsDsl.impl;

import java.util.Collection;

import me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage;
import me.tomassetti.astTransformationsDsl.EnumNodeTypeFieldValue;
import me.tomassetti.astTransformationsDsl.UnnamedEnumDeclaration;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unnamed Enum Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link me.tomassetti.astTransformationsDsl.impl.UnnamedEnumDeclarationImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnnamedEnumDeclarationImpl extends NodeTypeFieldValueImpl implements UnnamedEnumDeclaration
{
  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<EnumNodeTypeFieldValue> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnnamedEnumDeclarationImpl()
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
    return AstTransformationsDslPackage.Literals.UNNAMED_ENUM_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumNodeTypeFieldValue> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<EnumNodeTypeFieldValue>(EnumNodeTypeFieldValue.class, this, AstTransformationsDslPackage.UNNAMED_ENUM_DECLARATION__VALUES);
    }
    return values;
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
      case AstTransformationsDslPackage.UNNAMED_ENUM_DECLARATION__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
      case AstTransformationsDslPackage.UNNAMED_ENUM_DECLARATION__VALUES:
        return getValues();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AstTransformationsDslPackage.UNNAMED_ENUM_DECLARATION__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends EnumNodeTypeFieldValue>)newValue);
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
      case AstTransformationsDslPackage.UNNAMED_ENUM_DECLARATION__VALUES:
        getValues().clear();
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
      case AstTransformationsDslPackage.UNNAMED_ENUM_DECLARATION__VALUES:
        return values != null && !values.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UnnamedEnumDeclarationImpl
