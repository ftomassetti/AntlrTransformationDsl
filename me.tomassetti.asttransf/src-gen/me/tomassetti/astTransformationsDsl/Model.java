/**
 */
package me.tomassetti.astTransformationsDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link me.tomassetti.astTransformationsDsl.Model#getAntlr <em>Antlr</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.Model#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 *
 * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Antlr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Antlr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Antlr</em>' containment reference.
   * @see #setAntlr(AntlrGrammarRef)
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getModel_Antlr()
   * @model containment="true"
   * @generated
   */
  AntlrGrammarRef getAntlr();

  /**
   * Sets the value of the '{@link me.tomassetti.astTransformationsDsl.Model#getAntlr <em>Antlr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Antlr</em>' containment reference.
   * @see #getAntlr()
   * @generated
   */
  void setAntlr(AntlrGrammarRef value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link me.tomassetti.astTransformationsDsl.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getModel_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

} // Model
