/**
 */
package me.tomassetti.astTransformationsDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Enum Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link me.tomassetti.astTransformationsDsl.NamedEnumDeclaration#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getNamedEnumDeclaration()
 * @model
 * @generated
 */
public interface NamedEnumDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link me.tomassetti.astTransformationsDsl.EnumNodeTypeFieldValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getNamedEnumDeclaration_Values()
   * @model containment="true"
   * @generated
   */
  EList<EnumNodeTypeFieldValue> getValues();

} // NamedEnumDeclaration
