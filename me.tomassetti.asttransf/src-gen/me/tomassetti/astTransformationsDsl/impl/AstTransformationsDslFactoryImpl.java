/**
 */
package me.tomassetti.astTransformationsDsl.impl;

import me.tomassetti.astTransformationsDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AstTransformationsDslFactoryImpl extends EFactoryImpl implements AstTransformationsDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AstTransformationsDslFactory init()
  {
    try
    {
      AstTransformationsDslFactory theAstTransformationsDslFactory = (AstTransformationsDslFactory)EPackage.Registry.INSTANCE.getEFactory(AstTransformationsDslPackage.eNS_URI);
      if (theAstTransformationsDslFactory != null)
      {
        return theAstTransformationsDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AstTransformationsDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstTransformationsDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AstTransformationsDslPackage.MODEL: return createModel();
      case AstTransformationsDslPackage.ANTLR_GRAMMAR_REF: return createAntlrGrammarRef();
      case AstTransformationsDslPackage.DECLARATION: return createDeclaration();
      case AstTransformationsDslPackage.NAMED_ENUM_DECLARATION: return createNamedEnumDeclaration();
      case AstTransformationsDslPackage.UNNAMED_ENUM_DECLARATION: return createUnnamedEnumDeclaration();
      case AstTransformationsDslPackage.NODE_TYPE: return createNodeType();
      case AstTransformationsDslPackage.NODE_TYPE_FIELD: return createNodeTypeField();
      case AstTransformationsDslPackage.NODE_TYPE_FIELD_VALUE: return createNodeTypeFieldValue();
      case AstTransformationsDslPackage.ENUM_NODE_TYPE_FIELD_VALUE: return createEnumNodeTypeFieldValue();
      case AstTransformationsDslPackage.RELATION_NODE_TYPE_FIELD: return createRelationNodeTypeField();
      case AstTransformationsDslPackage.ATTRIBUTE_NODE_TYPE_FIELD: return createAttributeNodeTypeField();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AntlrGrammarRef createAntlrGrammarRef()
  {
    AntlrGrammarRefImpl antlrGrammarRef = new AntlrGrammarRefImpl();
    return antlrGrammarRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedEnumDeclaration createNamedEnumDeclaration()
  {
    NamedEnumDeclarationImpl namedEnumDeclaration = new NamedEnumDeclarationImpl();
    return namedEnumDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnnamedEnumDeclaration createUnnamedEnumDeclaration()
  {
    UnnamedEnumDeclarationImpl unnamedEnumDeclaration = new UnnamedEnumDeclarationImpl();
    return unnamedEnumDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeType createNodeType()
  {
    NodeTypeImpl nodeType = new NodeTypeImpl();
    return nodeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeTypeField createNodeTypeField()
  {
    NodeTypeFieldImpl nodeTypeField = new NodeTypeFieldImpl();
    return nodeTypeField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeTypeFieldValue createNodeTypeFieldValue()
  {
    NodeTypeFieldValueImpl nodeTypeFieldValue = new NodeTypeFieldValueImpl();
    return nodeTypeFieldValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumNodeTypeFieldValue createEnumNodeTypeFieldValue()
  {
    EnumNodeTypeFieldValueImpl enumNodeTypeFieldValue = new EnumNodeTypeFieldValueImpl();
    return enumNodeTypeFieldValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationNodeTypeField createRelationNodeTypeField()
  {
    RelationNodeTypeFieldImpl relationNodeTypeField = new RelationNodeTypeFieldImpl();
    return relationNodeTypeField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeNodeTypeField createAttributeNodeTypeField()
  {
    AttributeNodeTypeFieldImpl attributeNodeTypeField = new AttributeNodeTypeFieldImpl();
    return attributeNodeTypeField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstTransformationsDslPackage getAstTransformationsDslPackage()
  {
    return (AstTransformationsDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AstTransformationsDslPackage getPackage()
  {
    return AstTransformationsDslPackage.eINSTANCE;
  }

} //AstTransformationsDslFactoryImpl
