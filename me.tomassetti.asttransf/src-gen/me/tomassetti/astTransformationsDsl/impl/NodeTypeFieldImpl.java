/**
 */
package me.tomassetti.astTransformationsDsl.impl;

import me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage;
import me.tomassetti.astTransformationsDsl.NodeTypeField;
import me.tomassetti.astTransformationsDsl.NodeTypeFieldValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldImpl#getMany <em>Many</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldImpl#getSingle <em>Single</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeTypeFieldImpl extends MinimalEObjectImpl.Container implements NodeTypeField
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
   * The default value of the '{@link #getMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMany()
   * @generated
   * @ordered
   */
  protected static final String MANY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMany()
   * @generated
   * @ordered
   */
  protected String many = MANY_EDEFAULT;

  /**
   * The default value of the '{@link #getOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptional()
   * @generated
   * @ordered
   */
  protected static final String OPTIONAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptional()
   * @generated
   * @ordered
   */
  protected String optional = OPTIONAL_EDEFAULT;

  /**
   * The default value of the '{@link #getSingle() <em>Single</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingle()
   * @generated
   * @ordered
   */
  protected static final String SINGLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSingle() <em>Single</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingle()
   * @generated
   * @ordered
   */
  protected String single = SINGLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected NodeTypeFieldValue value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeTypeFieldImpl()
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
    return AstTransformationsDslPackage.Literals.NODE_TYPE_FIELD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AstTransformationsDslPackage.NODE_TYPE_FIELD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMany()
  {
    return many;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMany(String newMany)
  {
    String oldMany = many;
    many = newMany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstTransformationsDslPackage.NODE_TYPE_FIELD__MANY, oldMany, many));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOptional()
  {
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(String newOptional)
  {
    String oldOptional = optional;
    optional = newOptional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstTransformationsDslPackage.NODE_TYPE_FIELD__OPTIONAL, oldOptional, optional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSingle()
  {
    return single;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSingle(String newSingle)
  {
    String oldSingle = single;
    single = newSingle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstTransformationsDslPackage.NODE_TYPE_FIELD__SINGLE, oldSingle, single));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeTypeFieldValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(NodeTypeFieldValue newValue, NotificationChain msgs)
  {
    NodeTypeFieldValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstTransformationsDslPackage.NODE_TYPE_FIELD__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(NodeTypeFieldValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstTransformationsDslPackage.NODE_TYPE_FIELD__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstTransformationsDslPackage.NODE_TYPE_FIELD__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstTransformationsDslPackage.NODE_TYPE_FIELD__VALUE, newValue, newValue));
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
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__VALUE:
        return basicSetValue(null, msgs);
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
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__NAME:
        return getName();
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__MANY:
        return getMany();
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__OPTIONAL:
        return getOptional();
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__SINGLE:
        return getSingle();
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__VALUE:
        return getValue();
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
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__NAME:
        setName((String)newValue);
        return;
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__MANY:
        setMany((String)newValue);
        return;
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__OPTIONAL:
        setOptional((String)newValue);
        return;
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__SINGLE:
        setSingle((String)newValue);
        return;
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__VALUE:
        setValue((NodeTypeFieldValue)newValue);
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
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__MANY:
        setMany(MANY_EDEFAULT);
        return;
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__OPTIONAL:
        setOptional(OPTIONAL_EDEFAULT);
        return;
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__SINGLE:
        setSingle(SINGLE_EDEFAULT);
        return;
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__VALUE:
        setValue((NodeTypeFieldValue)null);
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
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__MANY:
        return MANY_EDEFAULT == null ? many != null : !MANY_EDEFAULT.equals(many);
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__OPTIONAL:
        return OPTIONAL_EDEFAULT == null ? optional != null : !OPTIONAL_EDEFAULT.equals(optional);
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__SINGLE:
        return SINGLE_EDEFAULT == null ? single != null : !SINGLE_EDEFAULT.equals(single);
      case AstTransformationsDslPackage.NODE_TYPE_FIELD__VALUE:
        return value != null;
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
    result.append(", many: ");
    result.append(many);
    result.append(", optional: ");
    result.append(optional);
    result.append(", single: ");
    result.append(single);
    result.append(')');
    return result.toString();
  }

} //NodeTypeFieldImpl
