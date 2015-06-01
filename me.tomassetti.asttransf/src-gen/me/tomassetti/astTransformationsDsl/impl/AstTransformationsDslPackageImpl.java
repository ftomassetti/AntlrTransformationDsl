/**
 */
package me.tomassetti.astTransformationsDsl.impl;

import me.tomassetti.astTransformationsDsl.AntlrGrammarRef;
import me.tomassetti.astTransformationsDsl.AstTransformationsDslFactory;
import me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage;
import me.tomassetti.astTransformationsDsl.AttributeNodeTypeField;
import me.tomassetti.astTransformationsDsl.Declaration;
import me.tomassetti.astTransformationsDsl.EnumNodeTypeFieldValue;
import me.tomassetti.astTransformationsDsl.Model;
import me.tomassetti.astTransformationsDsl.NamedEnumDeclaration;
import me.tomassetti.astTransformationsDsl.NodeType;
import me.tomassetti.astTransformationsDsl.NodeTypeField;
import me.tomassetti.astTransformationsDsl.NodeTypeFieldValue;
import me.tomassetti.astTransformationsDsl.RelationNodeTypeField;
import me.tomassetti.astTransformationsDsl.UnnamedEnumDeclaration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AstTransformationsDslPackageImpl extends EPackageImpl implements AstTransformationsDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass antlrGrammarRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedEnumDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unnamedEnumDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeTypeFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeTypeFieldValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumNodeTypeFieldValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationNodeTypeFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeNodeTypeFieldEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AstTransformationsDslPackageImpl()
  {
    super(eNS_URI, AstTransformationsDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AstTransformationsDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AstTransformationsDslPackage init()
  {
    if (isInited) return (AstTransformationsDslPackage)EPackage.Registry.INSTANCE.getEPackage(AstTransformationsDslPackage.eNS_URI);

    // Obtain or create and register package
    AstTransformationsDslPackageImpl theAstTransformationsDslPackage = (AstTransformationsDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AstTransformationsDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AstTransformationsDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAstTransformationsDslPackage.createPackageContents();

    // Initialize created meta-data
    theAstTransformationsDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAstTransformationsDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AstTransformationsDslPackage.eNS_URI, theAstTransformationsDslPackage);
    return theAstTransformationsDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Antlr()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Declarations()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAntlrGrammarRef()
  {
    return antlrGrammarRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAntlrGrammarRef_GrammarFile()
  {
    return (EAttribute)antlrGrammarRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaration_Name()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedEnumDeclaration()
  {
    return namedEnumDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedEnumDeclaration_Values()
  {
    return (EReference)namedEnumDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnnamedEnumDeclaration()
  {
    return unnamedEnumDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnnamedEnumDeclaration_Values()
  {
    return (EReference)unnamedEnumDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeType()
  {
    return nodeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeType_SuperType()
  {
    return (EReference)nodeTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeType_AntlrNode()
  {
    return (EAttribute)nodeTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeType_Fields()
  {
    return (EReference)nodeTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeTypeField()
  {
    return nodeTypeFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeField_Name()
  {
    return (EAttribute)nodeTypeFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeField_Many()
  {
    return (EAttribute)nodeTypeFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeField_Optional()
  {
    return (EAttribute)nodeTypeFieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeTypeField_Single()
  {
    return (EAttribute)nodeTypeFieldEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeTypeField_Value()
  {
    return (EReference)nodeTypeFieldEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeTypeFieldValue()
  {
    return nodeTypeFieldValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumNodeTypeFieldValue()
  {
    return enumNodeTypeFieldValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumNodeTypeFieldValue_Name()
  {
    return (EAttribute)enumNodeTypeFieldValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationNodeTypeField()
  {
    return relationNodeTypeFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationNodeTypeField_Type()
  {
    return (EReference)relationNodeTypeFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeNodeTypeField()
  {
    return attributeNodeTypeFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstTransformationsDslFactory getAstTransformationsDslFactory()
  {
    return (AstTransformationsDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ANTLR);
    createEReference(modelEClass, MODEL__DECLARATIONS);

    antlrGrammarRefEClass = createEClass(ANTLR_GRAMMAR_REF);
    createEAttribute(antlrGrammarRefEClass, ANTLR_GRAMMAR_REF__GRAMMAR_FILE);

    declarationEClass = createEClass(DECLARATION);
    createEAttribute(declarationEClass, DECLARATION__NAME);

    namedEnumDeclarationEClass = createEClass(NAMED_ENUM_DECLARATION);
    createEReference(namedEnumDeclarationEClass, NAMED_ENUM_DECLARATION__VALUES);

    unnamedEnumDeclarationEClass = createEClass(UNNAMED_ENUM_DECLARATION);
    createEReference(unnamedEnumDeclarationEClass, UNNAMED_ENUM_DECLARATION__VALUES);

    nodeTypeEClass = createEClass(NODE_TYPE);
    createEReference(nodeTypeEClass, NODE_TYPE__SUPER_TYPE);
    createEAttribute(nodeTypeEClass, NODE_TYPE__ANTLR_NODE);
    createEReference(nodeTypeEClass, NODE_TYPE__FIELDS);

    nodeTypeFieldEClass = createEClass(NODE_TYPE_FIELD);
    createEAttribute(nodeTypeFieldEClass, NODE_TYPE_FIELD__NAME);
    createEAttribute(nodeTypeFieldEClass, NODE_TYPE_FIELD__MANY);
    createEAttribute(nodeTypeFieldEClass, NODE_TYPE_FIELD__OPTIONAL);
    createEAttribute(nodeTypeFieldEClass, NODE_TYPE_FIELD__SINGLE);
    createEReference(nodeTypeFieldEClass, NODE_TYPE_FIELD__VALUE);

    nodeTypeFieldValueEClass = createEClass(NODE_TYPE_FIELD_VALUE);

    enumNodeTypeFieldValueEClass = createEClass(ENUM_NODE_TYPE_FIELD_VALUE);
    createEAttribute(enumNodeTypeFieldValueEClass, ENUM_NODE_TYPE_FIELD_VALUE__NAME);

    relationNodeTypeFieldEClass = createEClass(RELATION_NODE_TYPE_FIELD);
    createEReference(relationNodeTypeFieldEClass, RELATION_NODE_TYPE_FIELD__TYPE);

    attributeNodeTypeFieldEClass = createEClass(ATTRIBUTE_NODE_TYPE_FIELD);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    namedEnumDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    unnamedEnumDeclarationEClass.getESuperTypes().add(this.getNodeTypeFieldValue());
    nodeTypeEClass.getESuperTypes().add(this.getDeclaration());
    relationNodeTypeFieldEClass.getESuperTypes().add(this.getNodeTypeFieldValue());
    attributeNodeTypeFieldEClass.getESuperTypes().add(this.getNodeTypeFieldValue());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Antlr(), this.getAntlrGrammarRef(), null, "antlr", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(antlrGrammarRefEClass, AntlrGrammarRef.class, "AntlrGrammarRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAntlrGrammarRef_GrammarFile(), ecorePackage.getEString(), "grammarFile", null, 0, 1, AntlrGrammarRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedEnumDeclarationEClass, NamedEnumDeclaration.class, "NamedEnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamedEnumDeclaration_Values(), this.getEnumNodeTypeFieldValue(), null, "values", null, 0, -1, NamedEnumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unnamedEnumDeclarationEClass, UnnamedEnumDeclaration.class, "UnnamedEnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnnamedEnumDeclaration_Values(), this.getEnumNodeTypeFieldValue(), null, "values", null, 0, -1, UnnamedEnumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeTypeEClass, NodeType.class, "NodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeType_SuperType(), this.getNodeType(), null, "superType", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeType_AntlrNode(), ecorePackage.getEString(), "antlrNode", null, 0, 1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeType_Fields(), this.getNodeTypeField(), null, "fields", null, 0, -1, NodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeTypeFieldEClass, NodeTypeField.class, "NodeTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeTypeField_Name(), ecorePackage.getEString(), "name", null, 0, 1, NodeTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTypeField_Many(), ecorePackage.getEString(), "many", null, 0, 1, NodeTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTypeField_Optional(), ecorePackage.getEString(), "optional", null, 0, 1, NodeTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeTypeField_Single(), ecorePackage.getEString(), "single", null, 0, 1, NodeTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeTypeField_Value(), this.getNodeTypeFieldValue(), null, "value", null, 0, 1, NodeTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeTypeFieldValueEClass, NodeTypeFieldValue.class, "NodeTypeFieldValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumNodeTypeFieldValueEClass, EnumNodeTypeFieldValue.class, "EnumNodeTypeFieldValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumNodeTypeFieldValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumNodeTypeFieldValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationNodeTypeFieldEClass, RelationNodeTypeField.class, "RelationNodeTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationNodeTypeField_Type(), this.getNodeType(), null, "type", null, 0, 1, RelationNodeTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeNodeTypeFieldEClass, AttributeNodeTypeField.class, "AttributeNodeTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //AstTransformationsDslPackageImpl
