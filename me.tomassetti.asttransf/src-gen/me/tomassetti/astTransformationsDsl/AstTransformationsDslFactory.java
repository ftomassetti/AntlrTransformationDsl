/**
 */
package me.tomassetti.astTransformationsDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage
 * @generated
 */
public interface AstTransformationsDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AstTransformationsDslFactory eINSTANCE = me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Antlr Grammar Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Antlr Grammar Ref</em>'.
   * @generated
   */
  AntlrGrammarRef createAntlrGrammarRef();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Named Enum Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Enum Declaration</em>'.
   * @generated
   */
  NamedEnumDeclaration createNamedEnumDeclaration();

  /**
   * Returns a new object of class '<em>Unnamed Enum Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unnamed Enum Declaration</em>'.
   * @generated
   */
  UnnamedEnumDeclaration createUnnamedEnumDeclaration();

  /**
   * Returns a new object of class '<em>Node Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Type</em>'.
   * @generated
   */
  NodeType createNodeType();

  /**
   * Returns a new object of class '<em>Node Type Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Type Field</em>'.
   * @generated
   */
  NodeTypeField createNodeTypeField();

  /**
   * Returns a new object of class '<em>Node Type Field Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Type Field Value</em>'.
   * @generated
   */
  NodeTypeFieldValue createNodeTypeFieldValue();

  /**
   * Returns a new object of class '<em>Enum Node Type Field Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Node Type Field Value</em>'.
   * @generated
   */
  EnumNodeTypeFieldValue createEnumNodeTypeFieldValue();

  /**
   * Returns a new object of class '<em>Relation Node Type Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation Node Type Field</em>'.
   * @generated
   */
  RelationNodeTypeField createRelationNodeTypeField();

  /**
   * Returns a new object of class '<em>Attribute Node Type Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Node Type Field</em>'.
   * @generated
   */
  AttributeNodeTypeField createAttributeNodeTypeField();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AstTransformationsDslPackage getAstTransformationsDslPackage();

} //AstTransformationsDslFactory
