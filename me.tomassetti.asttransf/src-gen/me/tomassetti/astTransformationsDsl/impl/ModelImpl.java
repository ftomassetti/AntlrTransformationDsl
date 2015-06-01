/**
 */
package me.tomassetti.astTransformationsDsl.impl;

import java.util.Collection;

import me.tomassetti.astTransformationsDsl.AntlrGrammarRef;
import me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage;
import me.tomassetti.astTransformationsDsl.Declaration;
import me.tomassetti.astTransformationsDsl.Model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link me.tomassetti.astTransformationsDsl.impl.ModelImpl#getAntlr <em>Antlr</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.impl.ModelImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getAntlr() <em>Antlr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAntlr()
   * @generated
   * @ordered
   */
  protected AntlrGrammarRef antlr;

  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<Declaration> declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return AstTransformationsDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AntlrGrammarRef getAntlr()
  {
    return antlr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAntlr(AntlrGrammarRef newAntlr, NotificationChain msgs)
  {
    AntlrGrammarRef oldAntlr = antlr;
    antlr = newAntlr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstTransformationsDslPackage.MODEL__ANTLR, oldAntlr, newAntlr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAntlr(AntlrGrammarRef newAntlr)
  {
    if (newAntlr != antlr)
    {
      NotificationChain msgs = null;
      if (antlr != null)
        msgs = ((InternalEObject)antlr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstTransformationsDslPackage.MODEL__ANTLR, null, msgs);
      if (newAntlr != null)
        msgs = ((InternalEObject)newAntlr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstTransformationsDslPackage.MODEL__ANTLR, null, msgs);
      msgs = basicSetAntlr(newAntlr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstTransformationsDslPackage.MODEL__ANTLR, newAntlr, newAntlr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Declaration> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, AstTransformationsDslPackage.MODEL__DECLARATIONS);
    }
    return declarations;
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
      case AstTransformationsDslPackage.MODEL__ANTLR:
        return basicSetAntlr(null, msgs);
      case AstTransformationsDslPackage.MODEL__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
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
      case AstTransformationsDslPackage.MODEL__ANTLR:
        return getAntlr();
      case AstTransformationsDslPackage.MODEL__DECLARATIONS:
        return getDeclarations();
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
      case AstTransformationsDslPackage.MODEL__ANTLR:
        setAntlr((AntlrGrammarRef)newValue);
        return;
      case AstTransformationsDslPackage.MODEL__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends Declaration>)newValue);
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
      case AstTransformationsDslPackage.MODEL__ANTLR:
        setAntlr((AntlrGrammarRef)null);
        return;
      case AstTransformationsDslPackage.MODEL__DECLARATIONS:
        getDeclarations().clear();
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
      case AstTransformationsDslPackage.MODEL__ANTLR:
        return antlr != null;
      case AstTransformationsDslPackage.MODEL__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
