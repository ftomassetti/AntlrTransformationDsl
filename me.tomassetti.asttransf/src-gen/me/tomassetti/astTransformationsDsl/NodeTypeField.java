/**
 */
package me.tomassetti.astTransformationsDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Type Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getName <em>Name</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getMany <em>Many</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getOptional <em>Optional</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getSingle <em>Single</em>}</li>
 *   <li>{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getNodeTypeField()
 * @model
 * @generated
 */
public interface NodeTypeField extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getNodeTypeField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many</em>' attribute.
   * @see #setMany(String)
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getNodeTypeField_Many()
   * @model
   * @generated
   */
  String getMany();

  /**
   * Sets the value of the '{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #getMany()
   * @generated
   */
  void setMany(String value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(String)
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getNodeTypeField_Optional()
   * @model
   * @generated
   */
  String getOptional();

  /**
   * Sets the value of the '{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #getOptional()
   * @generated
   */
  void setOptional(String value);

  /**
   * Returns the value of the '<em><b>Single</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single</em>' attribute.
   * @see #setSingle(String)
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getNodeTypeField_Single()
   * @model
   * @generated
   */
  String getSingle();

  /**
   * Sets the value of the '{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getSingle <em>Single</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single</em>' attribute.
   * @see #getSingle()
   * @generated
   */
  void setSingle(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(NodeTypeFieldValue)
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#getNodeTypeField_Value()
   * @model containment="true"
   * @generated
   */
  NodeTypeFieldValue getValue();

  /**
   * Sets the value of the '{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(NodeTypeFieldValue value);

} // NodeTypeField
