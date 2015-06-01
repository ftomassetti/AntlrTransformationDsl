package me.tomassetti.idea.lang.parser;

import org.eclipse.xtext.psi.impl.PsiEObjectReference;
import me.tomassetti.idea.lang.AstTransformationsDslElementTypeProvider;
import me.tomassetti.idea.lang.psi.impl.AstTransformationsDslFileImpl;
import org.eclipse.xtext.idea.parser.AbstractXtextParserDefinition;
import org.eclipse.xtext.psi.impl.PsiNamedEObjectImpl;

import com.google.inject.Inject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;

public class AstTransformationsDslParserDefinition extends AbstractXtextParserDefinition {

	@Inject 
	private AstTransformationsDslElementTypeProvider elementTypeProvider;

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new AstTransformationsDslFileImpl(viewProvider);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public PsiElement createElement(ASTNode node) {
		IElementType elementType = node.getElementType();
		if (elementType == elementTypeProvider.getDeclaration_NamedEnumDeclarationParserRuleCall_1ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getNamedEnumDeclaration_NameIDTerminalRuleCall_1_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getDeclaration_NodeTypeParserRuleCall_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getNodeType_NameIDTerminalRuleCall_2_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getNodeType_FieldsNodeTypeFieldParserRuleCall_6_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getNodeTypeField_NameIDTerminalRuleCall_0_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getNamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_3_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getEnumNodeTypeFieldValue_NameIDTerminalRuleCall_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getUnnamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_2_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getEnumNodeTypeFieldValue_NameIDTerminalRuleCall_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getNodeType_SuperTypeNodeTypeCrossReference_3_1_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		if (elementType == elementTypeProvider.getRelationNodeTypeField_TypeNodeTypeCrossReference_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		return super.createElement(node);
	}

}
