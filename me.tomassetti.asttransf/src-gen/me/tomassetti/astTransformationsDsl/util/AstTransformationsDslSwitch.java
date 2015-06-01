/**
 */
package me.tomassetti.astTransformationsDsl.util;

import me.tomassetti.astTransformationsDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage
 * @generated
 */
public class AstTransformationsDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AstTransformationsDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstTransformationsDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AstTransformationsDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AstTransformationsDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstTransformationsDslPackage.ANTLR_GRAMMAR_REF:
      {
        AntlrGrammarRef antlrGrammarRef = (AntlrGrammarRef)theEObject;
        T result = caseAntlrGrammarRef(antlrGrammarRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstTransformationsDslPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstTransformationsDslPackage.NAMED_ENUM_DECLARATION:
      {
        NamedEnumDeclaration namedEnumDeclaration = (NamedEnumDeclaration)theEObject;
        T result = caseNamedEnumDeclaration(namedEnumDeclaration);
        if (result == null) result = caseDeclaration(namedEnumDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstTransformationsDslPackage.UNNAMED_ENUM_DECLARATION:
      {
        UnnamedEnumDeclaration unnamedEnumDeclaration = (UnnamedEnumDeclaration)theEObject;
        T result = caseUnnamedEnumDeclaration(unnamedEnumDeclaration);
        if (result == null) result = caseNodeTypeFieldValue(unnamedEnumDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstTransformationsDslPackage.NODE_TYPE:
      {
        NodeType nodeType = (NodeType)theEObject;
        T result = caseNodeType(nodeType);
        if (result == null) result = caseDeclaration(nodeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstTransformationsDslPackage.NODE_TYPE_FIELD:
      {
        NodeTypeField nodeTypeField = (NodeTypeField)theEObject;
        T result = caseNodeTypeField(nodeTypeField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstTransformationsDslPackage.NODE_TYPE_FIELD_VALUE:
      {
        NodeTypeFieldValue nodeTypeFieldValue = (NodeTypeFieldValue)theEObject;
        T result = caseNodeTypeFieldValue(nodeTypeFieldValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstTransformationsDslPackage.ENUM_NODE_TYPE_FIELD_VALUE:
      {
        EnumNodeTypeFieldValue enumNodeTypeFieldValue = (EnumNodeTypeFieldValue)theEObject;
        T result = caseEnumNodeTypeFieldValue(enumNodeTypeFieldValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstTransformationsDslPackage.RELATION_NODE_TYPE_FIELD:
      {
        RelationNodeTypeField relationNodeTypeField = (RelationNodeTypeField)theEObject;
        T result = caseRelationNodeTypeField(relationNodeTypeField);
        if (result == null) result = caseNodeTypeFieldValue(relationNodeTypeField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstTransformationsDslPackage.ATTRIBUTE_NODE_TYPE_FIELD:
      {
        AttributeNodeTypeField attributeNodeTypeField = (AttributeNodeTypeField)theEObject;
        T result = caseAttributeNodeTypeField(attributeNodeTypeField);
        if (result == null) result = caseNodeTypeFieldValue(attributeNodeTypeField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Antlr Grammar Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Antlr Grammar Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAntlrGrammarRef(AntlrGrammarRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Enum Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Enum Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedEnumDeclaration(NamedEnumDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unnamed Enum Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unnamed Enum Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnnamedEnumDeclaration(UnnamedEnumDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeType(NodeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Type Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Type Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeTypeField(NodeTypeField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Type Field Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Type Field Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeTypeFieldValue(NodeTypeFieldValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Node Type Field Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Node Type Field Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumNodeTypeFieldValue(EnumNodeTypeFieldValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Node Type Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Node Type Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationNodeTypeField(RelationNodeTypeField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Node Type Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Node Type Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeNodeTypeField(AttributeNodeTypeField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AstTransformationsDslSwitch
