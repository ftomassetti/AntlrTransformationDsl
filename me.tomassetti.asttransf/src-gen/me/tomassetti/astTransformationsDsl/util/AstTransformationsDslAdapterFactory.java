/**
 */
package me.tomassetti.astTransformationsDsl.util;

import me.tomassetti.astTransformationsDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see me.tomassetti.astTransformationsDsl.AstTransformationsDslPackage
 * @generated
 */
public class AstTransformationsDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AstTransformationsDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstTransformationsDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AstTransformationsDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AstTransformationsDslSwitch<Adapter> modelSwitch =
    new AstTransformationsDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseAntlrGrammarRef(AntlrGrammarRef object)
      {
        return createAntlrGrammarRefAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseNamedEnumDeclaration(NamedEnumDeclaration object)
      {
        return createNamedEnumDeclarationAdapter();
      }
      @Override
      public Adapter caseUnnamedEnumDeclaration(UnnamedEnumDeclaration object)
      {
        return createUnnamedEnumDeclarationAdapter();
      }
      @Override
      public Adapter caseNodeType(NodeType object)
      {
        return createNodeTypeAdapter();
      }
      @Override
      public Adapter caseNodeTypeField(NodeTypeField object)
      {
        return createNodeTypeFieldAdapter();
      }
      @Override
      public Adapter caseNodeTypeFieldValue(NodeTypeFieldValue object)
      {
        return createNodeTypeFieldValueAdapter();
      }
      @Override
      public Adapter caseEnumNodeTypeFieldValue(EnumNodeTypeFieldValue object)
      {
        return createEnumNodeTypeFieldValueAdapter();
      }
      @Override
      public Adapter caseRelationNodeTypeField(RelationNodeTypeField object)
      {
        return createRelationNodeTypeFieldAdapter();
      }
      @Override
      public Adapter caseAttributeNodeTypeField(AttributeNodeTypeField object)
      {
        return createAttributeNodeTypeFieldAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link me.tomassetti.astTransformationsDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see me.tomassetti.astTransformationsDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link me.tomassetti.astTransformationsDsl.AntlrGrammarRef <em>Antlr Grammar Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see me.tomassetti.astTransformationsDsl.AntlrGrammarRef
   * @generated
   */
  public Adapter createAntlrGrammarRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link me.tomassetti.astTransformationsDsl.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see me.tomassetti.astTransformationsDsl.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link me.tomassetti.astTransformationsDsl.NamedEnumDeclaration <em>Named Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see me.tomassetti.astTransformationsDsl.NamedEnumDeclaration
   * @generated
   */
  public Adapter createNamedEnumDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link me.tomassetti.astTransformationsDsl.UnnamedEnumDeclaration <em>Unnamed Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see me.tomassetti.astTransformationsDsl.UnnamedEnumDeclaration
   * @generated
   */
  public Adapter createUnnamedEnumDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link me.tomassetti.astTransformationsDsl.NodeType <em>Node Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see me.tomassetti.astTransformationsDsl.NodeType
   * @generated
   */
  public Adapter createNodeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link me.tomassetti.astTransformationsDsl.NodeTypeField <em>Node Type Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see me.tomassetti.astTransformationsDsl.NodeTypeField
   * @generated
   */
  public Adapter createNodeTypeFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link me.tomassetti.astTransformationsDsl.NodeTypeFieldValue <em>Node Type Field Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see me.tomassetti.astTransformationsDsl.NodeTypeFieldValue
   * @generated
   */
  public Adapter createNodeTypeFieldValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link me.tomassetti.astTransformationsDsl.EnumNodeTypeFieldValue <em>Enum Node Type Field Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see me.tomassetti.astTransformationsDsl.EnumNodeTypeFieldValue
   * @generated
   */
  public Adapter createEnumNodeTypeFieldValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link me.tomassetti.astTransformationsDsl.RelationNodeTypeField <em>Relation Node Type Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see me.tomassetti.astTransformationsDsl.RelationNodeTypeField
   * @generated
   */
  public Adapter createRelationNodeTypeFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link me.tomassetti.astTransformationsDsl.AttributeNodeTypeField <em>Attribute Node Type Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see me.tomassetti.astTransformationsDsl.AttributeNodeTypeField
   * @generated
   */
  public Adapter createAttributeNodeTypeFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AstTransformationsDslAdapterFactory
