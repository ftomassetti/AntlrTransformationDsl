/**
 */
package me.tomassetti.astTransformationsDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslFactory
 * @model kind="package"
 * @generated
 */
public interface AstTransformationsDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "astTransformationsDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tomassetti.me/AstTransformationsDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "astTransformationsDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AstTransformationsDslPackage eINSTANCE = me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl.init();

  /**
   * The meta object id for the '{@link me.tomassetti.astTransformationsDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.tomassetti.astTransformationsDsl.impl.ModelImpl
   * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Antlr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ANTLR = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link me.tomassetti.astTransformationsDsl.impl.AntlrGrammarRefImpl <em>Antlr Grammar Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.tomassetti.astTransformationsDsl.impl.AntlrGrammarRefImpl
   * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getAntlrGrammarRef()
   * @generated
   */
  int ANTLR_GRAMMAR_REF = 1;

  /**
   * The feature id for the '<em><b>Grammar File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTLR_GRAMMAR_REF__GRAMMAR_FILE = 0;

  /**
   * The number of structural features of the '<em>Antlr Grammar Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTLR_GRAMMAR_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link me.tomassetti.astTransformationsDsl.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.tomassetti.astTransformationsDsl.impl.DeclarationImpl
   * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link me.tomassetti.astTransformationsDsl.impl.NamedEnumDeclarationImpl <em>Named Enum Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.tomassetti.astTransformationsDsl.impl.NamedEnumDeclarationImpl
   * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getNamedEnumDeclaration()
   * @generated
   */
  int NAMED_ENUM_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ENUM_DECLARATION__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ENUM_DECLARATION__VALUES = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Enum Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ENUM_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldValueImpl <em>Node Type Field Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldValueImpl
   * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getNodeTypeFieldValue()
   * @generated
   */
  int NODE_TYPE_FIELD_VALUE = 7;

  /**
   * The number of structural features of the '<em>Node Type Field Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_FIELD_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link me.tomassetti.astTransformationsDsl.impl.UnnamedEnumDeclarationImpl <em>Unnamed Enum Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.tomassetti.astTransformationsDsl.impl.UnnamedEnumDeclarationImpl
   * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getUnnamedEnumDeclaration()
   * @generated
   */
  int UNNAMED_ENUM_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_ENUM_DECLARATION__VALUES = NODE_TYPE_FIELD_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unnamed Enum Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNNAMED_ENUM_DECLARATION_FEATURE_COUNT = NODE_TYPE_FIELD_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeImpl <em>Node Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.tomassetti.astTransformationsDsl.impl.NodeTypeImpl
   * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getNodeType()
   * @generated
   */
  int NODE_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE__SUPER_TYPE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Antlr Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE__ANTLR_NODE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE__FIELDS = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Node Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldImpl <em>Node Type Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldImpl
   * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getNodeTypeField()
   * @generated
   */
  int NODE_TYPE_FIELD = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_FIELD__MANY = 1;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_FIELD__OPTIONAL = 2;

  /**
   * The feature id for the '<em><b>Single</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_FIELD__SINGLE = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_FIELD__VALUE = 4;

  /**
   * The number of structural features of the '<em>Node Type Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TYPE_FIELD_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link me.tomassetti.astTransformationsDsl.impl.EnumNodeTypeFieldValueImpl <em>Enum Node Type Field Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.tomassetti.astTransformationsDsl.impl.EnumNodeTypeFieldValueImpl
   * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getEnumNodeTypeFieldValue()
   * @generated
   */
  int ENUM_NODE_TYPE_FIELD_VALUE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_NODE_TYPE_FIELD_VALUE__NAME = 0;

  /**
   * The number of structural features of the '<em>Enum Node Type Field Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_NODE_TYPE_FIELD_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link me.tomassetti.astTransformationsDsl.impl.RelationNodeTypeFieldImpl <em>Relation Node Type Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.tomassetti.astTransformationsDsl.impl.RelationNodeTypeFieldImpl
   * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getRelationNodeTypeField()
   * @generated
   */
  int RELATION_NODE_TYPE_FIELD = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_NODE_TYPE_FIELD__TYPE = NODE_TYPE_FIELD_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Relation Node Type Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_NODE_TYPE_FIELD_FEATURE_COUNT = NODE_TYPE_FIELD_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link me.tomassetti.astTransformationsDsl.impl.AttributeNodeTypeFieldImpl <em>Attribute Node Type Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see me.tomassetti.astTransformationsDsl.impl.AttributeNodeTypeFieldImpl
   * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getAttributeNodeTypeField()
   * @generated
   */
  int ATTRIBUTE_NODE_TYPE_FIELD = 10;

  /**
   * The number of structural features of the '<em>Attribute Node Type Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NODE_TYPE_FIELD_FEATURE_COUNT = NODE_TYPE_FIELD_VALUE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link me.tomassetti.astTransformationsDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see me.tomassetti.astTransformationsDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link me.tomassetti.astTransformationsDsl.Model#getAntlr <em>Antlr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Antlr</em>'.
   * @see me.tomassetti.astTransformationsDsl.Model#getAntlr()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Antlr();

  /**
   * Returns the meta object for the containment reference list '{@link me.tomassetti.astTransformationsDsl.Model#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see me.tomassetti.astTransformationsDsl.Model#getDeclarations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Declarations();

  /**
   * Returns the meta object for class '{@link me.tomassetti.astTransformationsDsl.AntlrGrammarRef <em>Antlr Grammar Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Antlr Grammar Ref</em>'.
   * @see me.tomassetti.astTransformationsDsl.AntlrGrammarRef
   * @generated
   */
  EClass getAntlrGrammarRef();

  /**
   * Returns the meta object for the attribute '{@link me.tomassetti.astTransformationsDsl.AntlrGrammarRef#getGrammarFile <em>Grammar File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grammar File</em>'.
   * @see me.tomassetti.astTransformationsDsl.AntlrGrammarRef#getGrammarFile()
   * @see #getAntlrGrammarRef()
   * @generated
   */
  EAttribute getAntlrGrammarRef_GrammarFile();

  /**
   * Returns the meta object for class '{@link me.tomassetti.astTransformationsDsl.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see me.tomassetti.astTransformationsDsl.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link me.tomassetti.astTransformationsDsl.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see me.tomassetti.astTransformationsDsl.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Name();

  /**
   * Returns the meta object for class '{@link me.tomassetti.astTransformationsDsl.NamedEnumDeclaration <em>Named Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Enum Declaration</em>'.
   * @see me.tomassetti.astTransformationsDsl.NamedEnumDeclaration
   * @generated
   */
  EClass getNamedEnumDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link me.tomassetti.astTransformationsDsl.NamedEnumDeclaration#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see me.tomassetti.astTransformationsDsl.NamedEnumDeclaration#getValues()
   * @see #getNamedEnumDeclaration()
   * @generated
   */
  EReference getNamedEnumDeclaration_Values();

  /**
   * Returns the meta object for class '{@link me.tomassetti.astTransformationsDsl.UnnamedEnumDeclaration <em>Unnamed Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unnamed Enum Declaration</em>'.
   * @see me.tomassetti.astTransformationsDsl.UnnamedEnumDeclaration
   * @generated
   */
  EClass getUnnamedEnumDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link me.tomassetti.astTransformationsDsl.UnnamedEnumDeclaration#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see me.tomassetti.astTransformationsDsl.UnnamedEnumDeclaration#getValues()
   * @see #getUnnamedEnumDeclaration()
   * @generated
   */
  EReference getUnnamedEnumDeclaration_Values();

  /**
   * Returns the meta object for class '{@link me.tomassetti.astTransformationsDsl.NodeType <em>Node Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Type</em>'.
   * @see me.tomassetti.astTransformationsDsl.NodeType
   * @generated
   */
  EClass getNodeType();

  /**
   * Returns the meta object for the reference '{@link me.tomassetti.astTransformationsDsl.NodeType#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see me.tomassetti.astTransformationsDsl.NodeType#getSuperType()
   * @see #getNodeType()
   * @generated
   */
  EReference getNodeType_SuperType();

  /**
   * Returns the meta object for the attribute '{@link me.tomassetti.astTransformationsDsl.NodeType#getAntlrNode <em>Antlr Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Antlr Node</em>'.
   * @see me.tomassetti.astTransformationsDsl.NodeType#getAntlrNode()
   * @see #getNodeType()
   * @generated
   */
  EAttribute getNodeType_AntlrNode();

  /**
   * Returns the meta object for the containment reference list '{@link me.tomassetti.astTransformationsDsl.NodeType#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see me.tomassetti.astTransformationsDsl.NodeType#getFields()
   * @see #getNodeType()
   * @generated
   */
  EReference getNodeType_Fields();

  /**
   * Returns the meta object for class '{@link me.tomassetti.astTransformationsDsl.NodeTypeField <em>Node Type Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Type Field</em>'.
   * @see me.tomassetti.astTransformationsDsl.NodeTypeField
   * @generated
   */
  EClass getNodeTypeField();

  /**
   * Returns the meta object for the attribute '{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see me.tomassetti.astTransformationsDsl.NodeTypeField#getName()
   * @see #getNodeTypeField()
   * @generated
   */
  EAttribute getNodeTypeField_Name();

  /**
   * Returns the meta object for the attribute '{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getMany <em>Many</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Many</em>'.
   * @see me.tomassetti.astTransformationsDsl.NodeTypeField#getMany()
   * @see #getNodeTypeField()
   * @generated
   */
  EAttribute getNodeTypeField_Many();

  /**
   * Returns the meta object for the attribute '{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see me.tomassetti.astTransformationsDsl.NodeTypeField#getOptional()
   * @see #getNodeTypeField()
   * @generated
   */
  EAttribute getNodeTypeField_Optional();

  /**
   * Returns the meta object for the attribute '{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getSingle <em>Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Single</em>'.
   * @see me.tomassetti.astTransformationsDsl.NodeTypeField#getSingle()
   * @see #getNodeTypeField()
   * @generated
   */
  EAttribute getNodeTypeField_Single();

  /**
   * Returns the meta object for the containment reference '{@link me.tomassetti.astTransformationsDsl.NodeTypeField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see me.tomassetti.astTransformationsDsl.NodeTypeField#getValue()
   * @see #getNodeTypeField()
   * @generated
   */
  EReference getNodeTypeField_Value();

  /**
   * Returns the meta object for class '{@link me.tomassetti.astTransformationsDsl.NodeTypeFieldValue <em>Node Type Field Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Type Field Value</em>'.
   * @see me.tomassetti.astTransformationsDsl.NodeTypeFieldValue
   * @generated
   */
  EClass getNodeTypeFieldValue();

  /**
   * Returns the meta object for class '{@link me.tomassetti.astTransformationsDsl.EnumNodeTypeFieldValue <em>Enum Node Type Field Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Node Type Field Value</em>'.
   * @see me.tomassetti.astTransformationsDsl.EnumNodeTypeFieldValue
   * @generated
   */
  EClass getEnumNodeTypeFieldValue();

  /**
   * Returns the meta object for the attribute '{@link me.tomassetti.astTransformationsDsl.EnumNodeTypeFieldValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see me.tomassetti.astTransformationsDsl.EnumNodeTypeFieldValue#getName()
   * @see #getEnumNodeTypeFieldValue()
   * @generated
   */
  EAttribute getEnumNodeTypeFieldValue_Name();

  /**
   * Returns the meta object for class '{@link me.tomassetti.astTransformationsDsl.RelationNodeTypeField <em>Relation Node Type Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation Node Type Field</em>'.
   * @see me.tomassetti.astTransformationsDsl.RelationNodeTypeField
   * @generated
   */
  EClass getRelationNodeTypeField();

  /**
   * Returns the meta object for the reference '{@link me.tomassetti.astTransformationsDsl.RelationNodeTypeField#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see me.tomassetti.astTransformationsDsl.RelationNodeTypeField#getType()
   * @see #getRelationNodeTypeField()
   * @generated
   */
  EReference getRelationNodeTypeField_Type();

  /**
   * Returns the meta object for class '{@link me.tomassetti.astTransformationsDsl.AttributeNodeTypeField <em>Attribute Node Type Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Node Type Field</em>'.
   * @see me.tomassetti.astTransformationsDsl.AttributeNodeTypeField
   * @generated
   */
  EClass getAttributeNodeTypeField();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AstTransformationsDslFactory getAstTransformationsDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link me.tomassetti.astTransformationsDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.tomassetti.astTransformationsDsl.impl.ModelImpl
     * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Antlr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ANTLR = eINSTANCE.getModel_Antlr();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECLARATIONS = eINSTANCE.getModel_Declarations();

    /**
     * The meta object literal for the '{@link me.tomassetti.astTransformationsDsl.impl.AntlrGrammarRefImpl <em>Antlr Grammar Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.tomassetti.astTransformationsDsl.impl.AntlrGrammarRefImpl
     * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getAntlrGrammarRef()
     * @generated
     */
    EClass ANTLR_GRAMMAR_REF = eINSTANCE.getAntlrGrammarRef();

    /**
     * The meta object literal for the '<em><b>Grammar File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANTLR_GRAMMAR_REF__GRAMMAR_FILE = eINSTANCE.getAntlrGrammarRef_GrammarFile();

    /**
     * The meta object literal for the '{@link me.tomassetti.astTransformationsDsl.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.tomassetti.astTransformationsDsl.impl.DeclarationImpl
     * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

    /**
     * The meta object literal for the '{@link me.tomassetti.astTransformationsDsl.impl.NamedEnumDeclarationImpl <em>Named Enum Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.tomassetti.astTransformationsDsl.impl.NamedEnumDeclarationImpl
     * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getNamedEnumDeclaration()
     * @generated
     */
    EClass NAMED_ENUM_DECLARATION = eINSTANCE.getNamedEnumDeclaration();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_ENUM_DECLARATION__VALUES = eINSTANCE.getNamedEnumDeclaration_Values();

    /**
     * The meta object literal for the '{@link me.tomassetti.astTransformationsDsl.impl.UnnamedEnumDeclarationImpl <em>Unnamed Enum Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.tomassetti.astTransformationsDsl.impl.UnnamedEnumDeclarationImpl
     * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getUnnamedEnumDeclaration()
     * @generated
     */
    EClass UNNAMED_ENUM_DECLARATION = eINSTANCE.getUnnamedEnumDeclaration();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNNAMED_ENUM_DECLARATION__VALUES = eINSTANCE.getUnnamedEnumDeclaration_Values();

    /**
     * The meta object literal for the '{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeImpl <em>Node Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.tomassetti.astTransformationsDsl.impl.NodeTypeImpl
     * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getNodeType()
     * @generated
     */
    EClass NODE_TYPE = eINSTANCE.getNodeType();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TYPE__SUPER_TYPE = eINSTANCE.getNodeType_SuperType();

    /**
     * The meta object literal for the '<em><b>Antlr Node</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE__ANTLR_NODE = eINSTANCE.getNodeType_AntlrNode();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TYPE__FIELDS = eINSTANCE.getNodeType_Fields();

    /**
     * The meta object literal for the '{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldImpl <em>Node Type Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldImpl
     * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getNodeTypeField()
     * @generated
     */
    EClass NODE_TYPE_FIELD = eINSTANCE.getNodeTypeField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_FIELD__NAME = eINSTANCE.getNodeTypeField_Name();

    /**
     * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_FIELD__MANY = eINSTANCE.getNodeTypeField_Many();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_FIELD__OPTIONAL = eINSTANCE.getNodeTypeField_Optional();

    /**
     * The meta object literal for the '<em><b>Single</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_TYPE_FIELD__SINGLE = eINSTANCE.getNodeTypeField_Single();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TYPE_FIELD__VALUE = eINSTANCE.getNodeTypeField_Value();

    /**
     * The meta object literal for the '{@link me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldValueImpl <em>Node Type Field Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.tomassetti.astTransformationsDsl.impl.NodeTypeFieldValueImpl
     * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getNodeTypeFieldValue()
     * @generated
     */
    EClass NODE_TYPE_FIELD_VALUE = eINSTANCE.getNodeTypeFieldValue();

    /**
     * The meta object literal for the '{@link me.tomassetti.astTransformationsDsl.impl.EnumNodeTypeFieldValueImpl <em>Enum Node Type Field Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.tomassetti.astTransformationsDsl.impl.EnumNodeTypeFieldValueImpl
     * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getEnumNodeTypeFieldValue()
     * @generated
     */
    EClass ENUM_NODE_TYPE_FIELD_VALUE = eINSTANCE.getEnumNodeTypeFieldValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_NODE_TYPE_FIELD_VALUE__NAME = eINSTANCE.getEnumNodeTypeFieldValue_Name();

    /**
     * The meta object literal for the '{@link me.tomassetti.astTransformationsDsl.impl.RelationNodeTypeFieldImpl <em>Relation Node Type Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.tomassetti.astTransformationsDsl.impl.RelationNodeTypeFieldImpl
     * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getRelationNodeTypeField()
     * @generated
     */
    EClass RELATION_NODE_TYPE_FIELD = eINSTANCE.getRelationNodeTypeField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION_NODE_TYPE_FIELD__TYPE = eINSTANCE.getRelationNodeTypeField_Type();

    /**
     * The meta object literal for the '{@link me.tomassetti.astTransformationsDsl.impl.AttributeNodeTypeFieldImpl <em>Attribute Node Type Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see me.tomassetti.astTransformationsDsl.impl.AttributeNodeTypeFieldImpl
     * @see me.tomassetti.astTransformationsDsl.impl.AstTransformationsDslPackageImpl#getAttributeNodeTypeField()
     * @generated
     */
    EClass ATTRIBUTE_NODE_TYPE_FIELD = eINSTANCE.getAttributeNodeTypeField();

  }

} //AstTransformationsDslPackage
