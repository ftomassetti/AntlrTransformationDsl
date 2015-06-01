/**
 */
package me.tomassetti.astTransformationsDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antlr Grammar Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link me.tomassetti.astTransformationsDsl.AntlrGrammarRef#getGrammarFile <em>Grammar File</em>}</li>
 * </ul>
 *
 * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getAntlrGrammarRef()
 * @model
 * @generated
 */
public interface AntlrGrammarRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Grammar File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grammar File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grammar File</em>' attribute.
   * @see #setGrammarFile(String)
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getAntlrGrammarRef_GrammarFile()
   * @model
   * @generated
   */
  String getGrammarFile();

  /**
   * Sets the value of the '{@link me.tomassetti.astTransformationsDsl.AntlrGrammarRef#getGrammarFile <em>Grammar File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grammar File</em>' attribute.
   * @see #getGrammarFile()
   * @generated
   */
  void setGrammarFile(String value);

} // AntlrGrammarRef
