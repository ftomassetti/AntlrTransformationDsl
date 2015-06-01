/**
 */
package me.tomassetti.astTransformationsDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Node Type Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link me.tomassetti.astTransformationsDsl.RelationNodeTypeField#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getRelationNodeTypeField()
 * @model
 * @generated
 */
public interface RelationNodeTypeField extends NodeTypeFieldValue
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(NodeType)
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getRelationNodeTypeField_Type()
   * @model
   * @generated
   */
  NodeType getType();

  /**
   * Sets the value of the '{@link me.tomassetti.astTransformationsDsl.RelationNodeTypeField#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(NodeType value);

} // RelationNodeTypeField
