/**
 */
package me.tomassetti.astTransformationsDsl.impl;

import java.util.Collection;

import me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage;
import me.tomassetti.astTransformationsDsl.NodeType;
import me.tomassetti.astTransformationsDsl.NodeTypeField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeImpl#getAntlrNode <em>Antlr Node</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeTypeImpl extends DeclarationImpl implements NodeType
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected NodeType superType;

  /**
   * The default value of the '{@link #getAntlrNode() <em>Antlr Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAntlrNode()
   * @generated
   * @ordered
   */
  protected static final String ANTLR_NODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAntlrNode() <em>Antlr Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAntlrNode()
   * @generated
   * @ordered
   */
  protected String antlrNode = ANTLR_NODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<NodeTypeField> fields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeTypeImpl()
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
    return AstTransformationsDslPackage.Literals.NODE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeType getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (NodeType)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AstTransformationsDslPackage.NODE_TYPE__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeType basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(NodeType newSuperType)
  {
    NodeType oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstTransformationsDslPackage.NODE_TYPE__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAntlrNode()
  {
    return antlrNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAntlrNode(String newAntlrNode)
  {
    String oldAntlrNode = antlrNode;
    antlrNode = newAntlrNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstTransformationsDslPackage.NODE_TYPE__ANTLR_NODE, oldAntlrNode, antlrNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NodeTypeField> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<NodeTypeField>(NodeTypeField.class, this, AstTransformationsDslPackage.NODE_TYPE__FIELDS);
    }
    return fields;
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
      case AstTransformationsDslPackage.NODE_TYPE__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
      case AstTransformationsDslPackage.NODE_TYPE__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case AstTransformationsDslPackage.NODE_TYPE__ANTLR_NODE:
        return getAntlrNode();
      case AstTransformationsDslPackage.NODE_TYPE__FIELDS:
        return getFields();
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
      case AstTransformationsDslPackage.NODE_TYPE__SUPER_TYPE:
        setSuperType((NodeType)newValue);
        return;
      case AstTransformationsDslPackage.NODE_TYPE__ANTLR_NODE:
        setAntlrNode((String)newValue);
        return;
      case AstTransformationsDslPackage.NODE_TYPE__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends NodeTypeField>)newValue);
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
      case AstTransformationsDslPackage.NODE_TYPE__SUPER_TYPE:
        setSuperType((NodeType)null);
        return;
      case AstTransformationsDslPackage.NODE_TYPE__ANTLR_NODE:
        setAntlrNode(ANTLR_NODE_EDEFAULT);
        return;
      case AstTransformationsDslPackage.NODE_TYPE__FIELDS:
        getFields().clear();
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
      case AstTransformationsDslPackage.NODE_TYPE__SUPER_TYPE:
        return superType != null;
      case AstTransformationsDslPackage.NODE_TYPE__ANTLR_NODE:
        return ANTLR_NODE_EDEFAULT == null ? antlrNode != null : !ANTLR_NODE_EDEFAULT.equals(antlrNode);
      case AstTransformationsDslPackage.NODE_TYPE__FIELDS:
        return fields != null && !fields.isEmpty();
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
    result.append(" (antlrNode: ");
    result.append(antlrNode);
    result.append(')');
    return result.toString();
  }

} //NodeTypeImpl
