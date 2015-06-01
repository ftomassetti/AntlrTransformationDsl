/**
 */
package me.tomassetti.astTransformationsDsl.impl;

import me.tomassetti.astTransformationsDsl.AntlrGrammarRef;
import me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Antlr Grammar Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link me.tomassetti.astTransformationsDsl.impl.AntlrGrammarRefImpl#getGrammarFile <em>Grammar File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AntlrGrammarRefImpl extends MinimalEObjectImpl.Container implements AntlrGrammarRef
{
  /**
   * The default value of the '{@link #getGrammarFile() <em>Grammar File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrammarFile()
   * @generated
   * @ordered
   */
  protected static final String GRAMMAR_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGrammarFile() <em>Grammar File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrammarFile()
   * @generated
   * @ordered
   */
  protected String grammarFile = GRAMMAR_FILE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AntlrGrammarRefImpl()
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
    return AstTransformationsDslPackage.Literals.ANTLR_GRAMMAR_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGrammarFile()
  {
    return grammarFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGrammarFile(String newGrammarFile)
  {
    String oldGrammarFile = grammarFile;
    grammarFile = newGrammarFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AstTransformationsDslPackage.ANTLR_GRAMMAR_REF__GRAMMAR_FILE, oldGrammarFile, grammarFile));
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
      case AstTransformationsDslPackage.ANTLR_GRAMMAR_REF__GRAMMAR_FILE:
        return getGrammarFile();
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
      case AstTransformationsDslPackage.ANTLR_GRAMMAR_REF__GRAMMAR_FILE:
        setGrammarFile((String)newValue);
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
      case AstTransformationsDslPackage.ANTLR_GRAMMAR_REF__GRAMMAR_FILE:
        setGrammarFile(GRAMMAR_FILE_EDEFAULT);
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
      case AstTransformationsDslPackage.ANTLR_GRAMMAR_REF__GRAMMAR_FILE:
        return GRAMMAR_FILE_EDEFAULT == null ? grammarFile != null : !GRAMMAR_FILE_EDEFAULT.equals(grammarFile);
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
    result.append(" (grammarFile: ");
    result.append(grammarFile);
    result.append(')');
    return result.toString();
  }

} //AntlrGrammarRefImpl
