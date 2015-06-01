/**
 */
package me.tomassetti.astTransformationsDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link me.tomassetti.astTransformationsDsl.NodeType#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.NodeType#getAntlrNode <em>Antlr Node</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.NodeType#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getNodeType()
 * @model
 * @generated
 */
public interface NodeType extends Declaration
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(NodeType)
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getNodeType_SuperType()
   * @model
   * @generated
   */
  NodeType getSuperType();

  /**
   * Sets the value of the '{@link me.tomassetti.astTransformationsDsl.NodeType#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(NodeType value);

  /**
   * Returns the value of the '<em><b>Antlr Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Antlr Node</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Antlr Node</em>' attribute.
   * @see #setAntlrNode(String)
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getNodeType_AntlrNode()
   * @model
   * @generated
   */
  String getAntlrNode();

  /**
   * Sets the value of the '{@link me.tomassetti.astTransformationsDsl.NodeType#getAntlrNode <em>Antlr Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Antlr Node</em>' attribute.
   * @see #getAntlrNode()
   * @generated
   */
  void setAntlrNode(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link me.tomassetti.astTransformationsDsl.NodeTypeField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getNodeType_Fields()
   * @model containment="true"
   * @generated
   */
  EList<NodeTypeField> getFields();

} // NodeType
