package me.tomassetti.idea.lang;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.idea.lang.IElementTypeProvider;
import me.tomassetti.idea.lang.psi.impl.AstTransformationsDslFileImpl;
import me.tomassetti.services.AstTransformationsDslGrammarAccess;
import org.eclipse.xtext.psi.stubs.XtextFileElementType;
import org.eclipse.xtext.psi.stubs.XtextFileStub;
import org.eclipse.xtext.psi.tree.IGrammarAwareElementType;

import com.intellij.psi.tree.IFileElementType;

public class AstTransformationsDslElementTypeProvider implements IElementTypeProvider {

	public static final IFileElementType FILE_TYPE = new XtextFileElementType<XtextFileStub<AstTransformationsDslFileImpl>>(AstTransformationsDslLanguage.INSTANCE);

	private static final Map<EObject, IGrammarAwareElementType> GRAMMAR_ELEMENT_TYPE = new HashMap<EObject, IGrammarAwareElementType>();

	private static IGrammarAwareElementType associate(IGrammarAwareElementType grammarAwareElementType) {
		GRAMMAR_ELEMENT_TYPE.put(grammarAwareElementType.getGrammarElement(), grammarAwareElementType);
		return grammarAwareElementType;
	}

	private static final AstTransformationsDslGrammarAccess GRAMMAR_ACCESS = AstTransformationsDslLanguage.INSTANCE.getInstance(AstTransformationsDslGrammarAccess.class);

	private static class ModelFactory {
		public static IGrammarAwareElementType createModelElementType() {
			return new IGrammarAwareElementType("Model_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getModelRule());
		}
		public static IGrammarAwareElementType createModel_GroupElementType() {
			return new IGrammarAwareElementType("Model_Group_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getGroup());
		}
		public static IGrammarAwareElementType createModel_AntlrAssignment_0ElementType() {
			return new IGrammarAwareElementType("Model_AntlrAssignment_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getAntlrAssignment_0());
		}
		public static IGrammarAwareElementType createModel_AntlrAntlrGrammarRefParserRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("Model_AntlrAntlrGrammarRefParserRuleCall_0_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getAntlrAntlrGrammarRefParserRuleCall_0_0());
		}
		public static IGrammarAwareElementType createModel_DeclarationsAssignment_1ElementType() {
			return new IGrammarAwareElementType("Model_DeclarationsAssignment_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getDeclarationsAssignment_1());
		}
		public static IGrammarAwareElementType createModel_DeclarationsDeclarationParserRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("Model_DeclarationsDeclarationParserRuleCall_1_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getDeclarationsDeclarationParserRuleCall_1_0());
		}
	}

	public static final IGrammarAwareElementType Model_ELEMENT_TYPE = associate(ModelFactory.createModelElementType());

	public static final IGrammarAwareElementType Model_Group_ELEMENT_TYPE = associate(ModelFactory.createModel_GroupElementType());

	public static final IGrammarAwareElementType Model_AntlrAssignment_0_ELEMENT_TYPE = associate(ModelFactory.createModel_AntlrAssignment_0ElementType());

	public static final IGrammarAwareElementType Model_AntlrAntlrGrammarRefParserRuleCall_0_0_ELEMENT_TYPE = associate(ModelFactory.createModel_AntlrAntlrGrammarRefParserRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType Model_DeclarationsAssignment_1_ELEMENT_TYPE = associate(ModelFactory.createModel_DeclarationsAssignment_1ElementType());

	public static final IGrammarAwareElementType Model_DeclarationsDeclarationParserRuleCall_1_0_ELEMENT_TYPE = associate(ModelFactory.createModel_DeclarationsDeclarationParserRuleCall_1_0ElementType());

	private static class AntlrGrammarRefFactory {
		public static IGrammarAwareElementType createAntlrGrammarRefElementType() {
			return new IGrammarAwareElementType("AntlrGrammarRef_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getAntlrGrammarRefRule());
		}
		public static IGrammarAwareElementType createAntlrGrammarRef_GroupElementType() {
			return new IGrammarAwareElementType("AntlrGrammarRef_Group_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getAntlrGrammarRefAccess().getGroup());
		}
		public static IGrammarAwareElementType createAntlrGrammarRef_AdaptKeyword_0ElementType() {
			return new IGrammarAwareElementType("AntlrGrammarRef_AdaptKeyword_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getAntlrGrammarRefAccess().getAdaptKeyword_0());
		}
		public static IGrammarAwareElementType createAntlrGrammarRef_GrammarFileAssignment_1ElementType() {
			return new IGrammarAwareElementType("AntlrGrammarRef_GrammarFileAssignment_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getAntlrGrammarRefAccess().getGrammarFileAssignment_1());
		}
		public static IGrammarAwareElementType createAntlrGrammarRef_GrammarFileSTRINGTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("AntlrGrammarRef_GrammarFileSTRINGTerminalRuleCall_1_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getAntlrGrammarRefAccess().getGrammarFileSTRINGTerminalRuleCall_1_0());
		}
	}

	public static final IGrammarAwareElementType AntlrGrammarRef_ELEMENT_TYPE = associate(AntlrGrammarRefFactory.createAntlrGrammarRefElementType());

	public static final IGrammarAwareElementType AntlrGrammarRef_Group_ELEMENT_TYPE = associate(AntlrGrammarRefFactory.createAntlrGrammarRef_GroupElementType());

	public static final IGrammarAwareElementType AntlrGrammarRef_AdaptKeyword_0_ELEMENT_TYPE = associate(AntlrGrammarRefFactory.createAntlrGrammarRef_AdaptKeyword_0ElementType());

	public static final IGrammarAwareElementType AntlrGrammarRef_GrammarFileAssignment_1_ELEMENT_TYPE = associate(AntlrGrammarRefFactory.createAntlrGrammarRef_GrammarFileAssignment_1ElementType());

	public static final IGrammarAwareElementType AntlrGrammarRef_GrammarFileSTRINGTerminalRuleCall_1_0_ELEMENT_TYPE = associate(AntlrGrammarRefFactory.createAntlrGrammarRef_GrammarFileSTRINGTerminalRuleCall_1_0ElementType());

	private static class DeclarationFactory {
		public static IGrammarAwareElementType createDeclarationElementType() {
			return new IGrammarAwareElementType("Declaration_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getDeclarationRule());
		}
		public static IGrammarAwareElementType createDeclaration_AlternativesElementType() {
			return new IGrammarAwareElementType("Declaration_Alternatives_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getDeclarationAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createDeclaration_NodeTypeParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Declaration_NodeTypeParserRuleCall_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getDeclarationAccess().getNodeTypeParserRuleCall_0());
		}
		public static IGrammarAwareElementType createDeclaration_NamedEnumDeclarationParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("Declaration_NamedEnumDeclarationParserRuleCall_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getDeclarationAccess().getNamedEnumDeclarationParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType Declaration_ELEMENT_TYPE = associate(DeclarationFactory.createDeclarationElementType());

	public static final IGrammarAwareElementType Declaration_Alternatives_ELEMENT_TYPE = associate(DeclarationFactory.createDeclaration_AlternativesElementType());

	public static final IGrammarAwareElementType Declaration_NodeTypeParserRuleCall_0_ELEMENT_TYPE = associate(DeclarationFactory.createDeclaration_NodeTypeParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType Declaration_NamedEnumDeclarationParserRuleCall_1_ELEMENT_TYPE = associate(DeclarationFactory.createDeclaration_NamedEnumDeclarationParserRuleCall_1ElementType());

	private static class NamedEnumDeclarationFactory {
		public static IGrammarAwareElementType createNamedEnumDeclarationElementType() {
			return new IGrammarAwareElementType("NamedEnumDeclaration_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedEnumDeclarationRule());
		}
		public static IGrammarAwareElementType createNamedEnumDeclaration_GroupElementType() {
			return new IGrammarAwareElementType("NamedEnumDeclaration_Group_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedEnumDeclarationAccess().getGroup());
		}
		public static IGrammarAwareElementType createNamedEnumDeclaration_EnumKeyword_0ElementType() {
			return new IGrammarAwareElementType("NamedEnumDeclaration_EnumKeyword_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedEnumDeclarationAccess().getEnumKeyword_0());
		}
		public static IGrammarAwareElementType createNamedEnumDeclaration_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("NamedEnumDeclaration_NameAssignment_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedEnumDeclarationAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createNamedEnumDeclaration_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("NamedEnumDeclaration_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createNamedEnumDeclaration_LeftCurlyBracketKeyword_2ElementType() {
			return new IGrammarAwareElementType("NamedEnumDeclaration_LeftCurlyBracketKeyword_2_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedEnumDeclarationAccess().getLeftCurlyBracketKeyword_2());
		}
		public static IGrammarAwareElementType createNamedEnumDeclaration_ValuesAssignment_3ElementType() {
			return new IGrammarAwareElementType("NamedEnumDeclaration_ValuesAssignment_3_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedEnumDeclarationAccess().getValuesAssignment_3());
		}
		public static IGrammarAwareElementType createNamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("NamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_3_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedEnumDeclarationAccess().getValuesEnumNodeTypeFieldValueParserRuleCall_3_0());
		}
		public static IGrammarAwareElementType createNamedEnumDeclaration_RightCurlyBracketKeyword_4ElementType() {
			return new IGrammarAwareElementType("NamedEnumDeclaration_RightCurlyBracketKeyword_4_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNamedEnumDeclarationAccess().getRightCurlyBracketKeyword_4());
		}
	}

	public static final IGrammarAwareElementType NamedEnumDeclaration_ELEMENT_TYPE = associate(NamedEnumDeclarationFactory.createNamedEnumDeclarationElementType());

	public static final IGrammarAwareElementType NamedEnumDeclaration_Group_ELEMENT_TYPE = associate(NamedEnumDeclarationFactory.createNamedEnumDeclaration_GroupElementType());

	public static final IGrammarAwareElementType NamedEnumDeclaration_EnumKeyword_0_ELEMENT_TYPE = associate(NamedEnumDeclarationFactory.createNamedEnumDeclaration_EnumKeyword_0ElementType());

	public static final IGrammarAwareElementType NamedEnumDeclaration_NameAssignment_1_ELEMENT_TYPE = associate(NamedEnumDeclarationFactory.createNamedEnumDeclaration_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType NamedEnumDeclaration_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(NamedEnumDeclarationFactory.createNamedEnumDeclaration_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType NamedEnumDeclaration_LeftCurlyBracketKeyword_2_ELEMENT_TYPE = associate(NamedEnumDeclarationFactory.createNamedEnumDeclaration_LeftCurlyBracketKeyword_2ElementType());

	public static final IGrammarAwareElementType NamedEnumDeclaration_ValuesAssignment_3_ELEMENT_TYPE = associate(NamedEnumDeclarationFactory.createNamedEnumDeclaration_ValuesAssignment_3ElementType());

	public static final IGrammarAwareElementType NamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_3_0_ELEMENT_TYPE = associate(NamedEnumDeclarationFactory.createNamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_3_0ElementType());

	public static final IGrammarAwareElementType NamedEnumDeclaration_RightCurlyBracketKeyword_4_ELEMENT_TYPE = associate(NamedEnumDeclarationFactory.createNamedEnumDeclaration_RightCurlyBracketKeyword_4ElementType());

	private static class UnnamedEnumDeclarationFactory {
		public static IGrammarAwareElementType createUnnamedEnumDeclarationElementType() {
			return new IGrammarAwareElementType("UnnamedEnumDeclaration_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getUnnamedEnumDeclarationRule());
		}
		public static IGrammarAwareElementType createUnnamedEnumDeclaration_GroupElementType() {
			return new IGrammarAwareElementType("UnnamedEnumDeclaration_Group_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getUnnamedEnumDeclarationAccess().getGroup());
		}
		public static IGrammarAwareElementType createUnnamedEnumDeclaration_EnumKeyword_0ElementType() {
			return new IGrammarAwareElementType("UnnamedEnumDeclaration_EnumKeyword_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getUnnamedEnumDeclarationAccess().getEnumKeyword_0());
		}
		public static IGrammarAwareElementType createUnnamedEnumDeclaration_LeftCurlyBracketKeyword_1ElementType() {
			return new IGrammarAwareElementType("UnnamedEnumDeclaration_LeftCurlyBracketKeyword_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getUnnamedEnumDeclarationAccess().getLeftCurlyBracketKeyword_1());
		}
		public static IGrammarAwareElementType createUnnamedEnumDeclaration_ValuesAssignment_2ElementType() {
			return new IGrammarAwareElementType("UnnamedEnumDeclaration_ValuesAssignment_2_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getUnnamedEnumDeclarationAccess().getValuesAssignment_2());
		}
		public static IGrammarAwareElementType createUnnamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("UnnamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_2_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getUnnamedEnumDeclarationAccess().getValuesEnumNodeTypeFieldValueParserRuleCall_2_0());
		}
		public static IGrammarAwareElementType createUnnamedEnumDeclaration_RightCurlyBracketKeyword_3ElementType() {
			return new IGrammarAwareElementType("UnnamedEnumDeclaration_RightCurlyBracketKeyword_3_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getUnnamedEnumDeclarationAccess().getRightCurlyBracketKeyword_3());
		}
	}

	public static final IGrammarAwareElementType UnnamedEnumDeclaration_ELEMENT_TYPE = associate(UnnamedEnumDeclarationFactory.createUnnamedEnumDeclarationElementType());

	public static final IGrammarAwareElementType UnnamedEnumDeclaration_Group_ELEMENT_TYPE = associate(UnnamedEnumDeclarationFactory.createUnnamedEnumDeclaration_GroupElementType());

	public static final IGrammarAwareElementType UnnamedEnumDeclaration_EnumKeyword_0_ELEMENT_TYPE = associate(UnnamedEnumDeclarationFactory.createUnnamedEnumDeclaration_EnumKeyword_0ElementType());

	public static final IGrammarAwareElementType UnnamedEnumDeclaration_LeftCurlyBracketKeyword_1_ELEMENT_TYPE = associate(UnnamedEnumDeclarationFactory.createUnnamedEnumDeclaration_LeftCurlyBracketKeyword_1ElementType());

	public static final IGrammarAwareElementType UnnamedEnumDeclaration_ValuesAssignment_2_ELEMENT_TYPE = associate(UnnamedEnumDeclarationFactory.createUnnamedEnumDeclaration_ValuesAssignment_2ElementType());

	public static final IGrammarAwareElementType UnnamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_2_0_ELEMENT_TYPE = associate(UnnamedEnumDeclarationFactory.createUnnamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType UnnamedEnumDeclaration_RightCurlyBracketKeyword_3_ELEMENT_TYPE = associate(UnnamedEnumDeclarationFactory.createUnnamedEnumDeclaration_RightCurlyBracketKeyword_3ElementType());

	private static class NodeTypeFactory {
		public static IGrammarAwareElementType createNodeTypeElementType() {
			return new IGrammarAwareElementType("NodeType_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeRule());
		}
		public static IGrammarAwareElementType createNodeType_GroupElementType() {
			return new IGrammarAwareElementType("NodeType_Group_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getGroup());
		}
		public static IGrammarAwareElementType createNodeType_AbstractKeyword_0ElementType() {
			return new IGrammarAwareElementType("NodeType_AbstractKeyword_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getAbstractKeyword_0());
		}
		public static IGrammarAwareElementType createNodeType_TypeKeyword_1ElementType() {
			return new IGrammarAwareElementType("NodeType_TypeKeyword_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getTypeKeyword_1());
		}
		public static IGrammarAwareElementType createNodeType_NameAssignment_2ElementType() {
			return new IGrammarAwareElementType("NodeType_NameAssignment_2_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getNameAssignment_2());
		}
		public static IGrammarAwareElementType createNodeType_NameIDTerminalRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("NodeType_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getNameIDTerminalRuleCall_2_0());
		}
		public static IGrammarAwareElementType createNodeType_Group_3ElementType() {
			return new IGrammarAwareElementType("NodeType_Group_3_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createNodeType_ExtendsKeyword_3_0ElementType() {
			return new IGrammarAwareElementType("NodeType_ExtendsKeyword_3_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getExtendsKeyword_3_0());
		}
		public static IGrammarAwareElementType createNodeType_SuperTypeAssignment_3_1ElementType() {
			return new IGrammarAwareElementType("NodeType_SuperTypeAssignment_3_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getSuperTypeAssignment_3_1());
		}
		public static IGrammarAwareElementType createNodeType_SuperTypeNodeTypeCrossReference_3_1_0ElementType() {
			return new IGrammarAwareElementType("NodeType_SuperTypeNodeTypeCrossReference_3_1_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getSuperTypeNodeTypeCrossReference_3_1_0());
		}
		public static IGrammarAwareElementType createNodeType_SuperTypeNodeTypeIDTerminalRuleCall_3_1_0_1ElementType() {
			return new IGrammarAwareElementType("NodeType_SuperTypeNodeTypeIDTerminalRuleCall_3_1_0_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getSuperTypeNodeTypeIDTerminalRuleCall_3_1_0_1());
		}
		public static IGrammarAwareElementType createNodeType_Group_4ElementType() {
			return new IGrammarAwareElementType("NodeType_Group_4_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getGroup_4());
		}
		public static IGrammarAwareElementType createNodeType_FromKeyword_4_0ElementType() {
			return new IGrammarAwareElementType("NodeType_FromKeyword_4_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getFromKeyword_4_0());
		}
		public static IGrammarAwareElementType createNodeType_AntlrNodeAssignment_4_1ElementType() {
			return new IGrammarAwareElementType("NodeType_AntlrNodeAssignment_4_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getAntlrNodeAssignment_4_1());
		}
		public static IGrammarAwareElementType createNodeType_AntlrNodeIDTerminalRuleCall_4_1_0ElementType() {
			return new IGrammarAwareElementType("NodeType_AntlrNodeIDTerminalRuleCall_4_1_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getAntlrNodeIDTerminalRuleCall_4_1_0());
		}
		public static IGrammarAwareElementType createNodeType_LeftCurlyBracketKeyword_5ElementType() {
			return new IGrammarAwareElementType("NodeType_LeftCurlyBracketKeyword_5_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getLeftCurlyBracketKeyword_5());
		}
		public static IGrammarAwareElementType createNodeType_FieldsAssignment_6ElementType() {
			return new IGrammarAwareElementType("NodeType_FieldsAssignment_6_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getFieldsAssignment_6());
		}
		public static IGrammarAwareElementType createNodeType_FieldsNodeTypeFieldParserRuleCall_6_0ElementType() {
			return new IGrammarAwareElementType("NodeType_FieldsNodeTypeFieldParserRuleCall_6_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getFieldsNodeTypeFieldParserRuleCall_6_0());
		}
		public static IGrammarAwareElementType createNodeType_RightCurlyBracketKeyword_7ElementType() {
			return new IGrammarAwareElementType("NodeType_RightCurlyBracketKeyword_7_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeAccess().getRightCurlyBracketKeyword_7());
		}
	}

	public static final IGrammarAwareElementType NodeType_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeTypeElementType());

	public static final IGrammarAwareElementType NodeType_Group_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_GroupElementType());

	public static final IGrammarAwareElementType NodeType_AbstractKeyword_0_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_AbstractKeyword_0ElementType());

	public static final IGrammarAwareElementType NodeType_TypeKeyword_1_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_TypeKeyword_1ElementType());

	public static final IGrammarAwareElementType NodeType_NameAssignment_2_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_NameAssignment_2ElementType());

	public static final IGrammarAwareElementType NodeType_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_NameIDTerminalRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType NodeType_Group_3_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_Group_3ElementType());

	public static final IGrammarAwareElementType NodeType_ExtendsKeyword_3_0_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_ExtendsKeyword_3_0ElementType());

	public static final IGrammarAwareElementType NodeType_SuperTypeAssignment_3_1_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_SuperTypeAssignment_3_1ElementType());

	public static final IGrammarAwareElementType NodeType_SuperTypeNodeTypeCrossReference_3_1_0_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_SuperTypeNodeTypeCrossReference_3_1_0ElementType());

	public static final IGrammarAwareElementType NodeType_SuperTypeNodeTypeIDTerminalRuleCall_3_1_0_1_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_SuperTypeNodeTypeIDTerminalRuleCall_3_1_0_1ElementType());

	public static final IGrammarAwareElementType NodeType_Group_4_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_Group_4ElementType());

	public static final IGrammarAwareElementType NodeType_FromKeyword_4_0_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_FromKeyword_4_0ElementType());

	public static final IGrammarAwareElementType NodeType_AntlrNodeAssignment_4_1_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_AntlrNodeAssignment_4_1ElementType());

	public static final IGrammarAwareElementType NodeType_AntlrNodeIDTerminalRuleCall_4_1_0_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_AntlrNodeIDTerminalRuleCall_4_1_0ElementType());

	public static final IGrammarAwareElementType NodeType_LeftCurlyBracketKeyword_5_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_LeftCurlyBracketKeyword_5ElementType());

	public static final IGrammarAwareElementType NodeType_FieldsAssignment_6_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_FieldsAssignment_6ElementType());

	public static final IGrammarAwareElementType NodeType_FieldsNodeTypeFieldParserRuleCall_6_0_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_FieldsNodeTypeFieldParserRuleCall_6_0ElementType());

	public static final IGrammarAwareElementType NodeType_RightCurlyBracketKeyword_7_ELEMENT_TYPE = associate(NodeTypeFactory.createNodeType_RightCurlyBracketKeyword_7ElementType());

	private static class NodeTypeFieldFactory {
		public static IGrammarAwareElementType createNodeTypeFieldElementType() {
			return new IGrammarAwareElementType("NodeTypeField_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldRule());
		}
		public static IGrammarAwareElementType createNodeTypeField_GroupElementType() {
			return new IGrammarAwareElementType("NodeTypeField_Group_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldAccess().getGroup());
		}
		public static IGrammarAwareElementType createNodeTypeField_NameAssignment_0ElementType() {
			return new IGrammarAwareElementType("NodeTypeField_NameAssignment_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldAccess().getNameAssignment_0());
		}
		public static IGrammarAwareElementType createNodeTypeField_NameIDTerminalRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("NodeTypeField_NameIDTerminalRuleCall_0_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldAccess().getNameIDTerminalRuleCall_0_0());
		}
		public static IGrammarAwareElementType createNodeTypeField_Alternatives_1ElementType() {
			return new IGrammarAwareElementType("NodeTypeField_Alternatives_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldAccess().getAlternatives_1());
		}
		public static IGrammarAwareElementType createNodeTypeField_ManyAssignment_1_0ElementType() {
			return new IGrammarAwareElementType("NodeTypeField_ManyAssignment_1_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldAccess().getManyAssignment_1_0());
		}
		public static IGrammarAwareElementType createNodeTypeField_ManyAsteriskEqualsSignKeyword_1_0_0ElementType() {
			return new IGrammarAwareElementType("NodeTypeField_ManyAsteriskEqualsSignKeyword_1_0_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldAccess().getManyAsteriskEqualsSignKeyword_1_0_0());
		}
		public static IGrammarAwareElementType createNodeTypeField_OptionalAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("NodeTypeField_OptionalAssignment_1_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldAccess().getOptionalAssignment_1_1());
		}
		public static IGrammarAwareElementType createNodeTypeField_OptionalQuestionMarkEqualsSignKeyword_1_1_0ElementType() {
			return new IGrammarAwareElementType("NodeTypeField_OptionalQuestionMarkEqualsSignKeyword_1_1_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldAccess().getOptionalQuestionMarkEqualsSignKeyword_1_1_0());
		}
		public static IGrammarAwareElementType createNodeTypeField_SingleAssignment_1_2ElementType() {
			return new IGrammarAwareElementType("NodeTypeField_SingleAssignment_1_2_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldAccess().getSingleAssignment_1_2());
		}
		public static IGrammarAwareElementType createNodeTypeField_SingleEqualsSignKeyword_1_2_0ElementType() {
			return new IGrammarAwareElementType("NodeTypeField_SingleEqualsSignKeyword_1_2_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldAccess().getSingleEqualsSignKeyword_1_2_0());
		}
		public static IGrammarAwareElementType createNodeTypeField_ValueAssignment_2ElementType() {
			return new IGrammarAwareElementType("NodeTypeField_ValueAssignment_2_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldAccess().getValueAssignment_2());
		}
		public static IGrammarAwareElementType createNodeTypeField_ValueNodeTypeFieldValueParserRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("NodeTypeField_ValueNodeTypeFieldValueParserRuleCall_2_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldAccess().getValueNodeTypeFieldValueParserRuleCall_2_0());
		}
	}

	public static final IGrammarAwareElementType NodeTypeField_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeFieldElementType());

	public static final IGrammarAwareElementType NodeTypeField_Group_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeField_GroupElementType());

	public static final IGrammarAwareElementType NodeTypeField_NameAssignment_0_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeField_NameAssignment_0ElementType());

	public static final IGrammarAwareElementType NodeTypeField_NameIDTerminalRuleCall_0_0_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeField_NameIDTerminalRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType NodeTypeField_Alternatives_1_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeField_Alternatives_1ElementType());

	public static final IGrammarAwareElementType NodeTypeField_ManyAssignment_1_0_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeField_ManyAssignment_1_0ElementType());

	public static final IGrammarAwareElementType NodeTypeField_ManyAsteriskEqualsSignKeyword_1_0_0_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeField_ManyAsteriskEqualsSignKeyword_1_0_0ElementType());

	public static final IGrammarAwareElementType NodeTypeField_OptionalAssignment_1_1_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeField_OptionalAssignment_1_1ElementType());

	public static final IGrammarAwareElementType NodeTypeField_OptionalQuestionMarkEqualsSignKeyword_1_1_0_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeField_OptionalQuestionMarkEqualsSignKeyword_1_1_0ElementType());

	public static final IGrammarAwareElementType NodeTypeField_SingleAssignment_1_2_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeField_SingleAssignment_1_2ElementType());

	public static final IGrammarAwareElementType NodeTypeField_SingleEqualsSignKeyword_1_2_0_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeField_SingleEqualsSignKeyword_1_2_0ElementType());

	public static final IGrammarAwareElementType NodeTypeField_ValueAssignment_2_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeField_ValueAssignment_2ElementType());

	public static final IGrammarAwareElementType NodeTypeField_ValueNodeTypeFieldValueParserRuleCall_2_0_ELEMENT_TYPE = associate(NodeTypeFieldFactory.createNodeTypeField_ValueNodeTypeFieldValueParserRuleCall_2_0ElementType());

	private static class NodeTypeFieldValueFactory {
		public static IGrammarAwareElementType createNodeTypeFieldValueElementType() {
			return new IGrammarAwareElementType("NodeTypeFieldValue_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldValueRule());
		}
		public static IGrammarAwareElementType createNodeTypeFieldValue_AlternativesElementType() {
			return new IGrammarAwareElementType("NodeTypeFieldValue_Alternatives_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldValueAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createNodeTypeFieldValue_UnnamedEnumDeclarationParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("NodeTypeFieldValue_UnnamedEnumDeclarationParserRuleCall_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldValueAccess().getUnnamedEnumDeclarationParserRuleCall_0());
		}
		public static IGrammarAwareElementType createNodeTypeFieldValue_RelationNodeTypeFieldParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("NodeTypeFieldValue_RelationNodeTypeFieldParserRuleCall_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldValueAccess().getRelationNodeTypeFieldParserRuleCall_1());
		}
		public static IGrammarAwareElementType createNodeTypeFieldValue_AttributeNodeTypeFieldParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("NodeTypeFieldValue_AttributeNodeTypeFieldParserRuleCall_2_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getNodeTypeFieldValueAccess().getAttributeNodeTypeFieldParserRuleCall_2());
		}
	}

	public static final IGrammarAwareElementType NodeTypeFieldValue_ELEMENT_TYPE = associate(NodeTypeFieldValueFactory.createNodeTypeFieldValueElementType());

	public static final IGrammarAwareElementType NodeTypeFieldValue_Alternatives_ELEMENT_TYPE = associate(NodeTypeFieldValueFactory.createNodeTypeFieldValue_AlternativesElementType());

	public static final IGrammarAwareElementType NodeTypeFieldValue_UnnamedEnumDeclarationParserRuleCall_0_ELEMENT_TYPE = associate(NodeTypeFieldValueFactory.createNodeTypeFieldValue_UnnamedEnumDeclarationParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType NodeTypeFieldValue_RelationNodeTypeFieldParserRuleCall_1_ELEMENT_TYPE = associate(NodeTypeFieldValueFactory.createNodeTypeFieldValue_RelationNodeTypeFieldParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType NodeTypeFieldValue_AttributeNodeTypeFieldParserRuleCall_2_ELEMENT_TYPE = associate(NodeTypeFieldValueFactory.createNodeTypeFieldValue_AttributeNodeTypeFieldParserRuleCall_2ElementType());

	private static class EnumNodeTypeFieldValueFactory {
		public static IGrammarAwareElementType createEnumNodeTypeFieldValueElementType() {
			return new IGrammarAwareElementType("EnumNodeTypeFieldValue_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getEnumNodeTypeFieldValueRule());
		}
		public static IGrammarAwareElementType createEnumNodeTypeFieldValue_NameAssignmentElementType() {
			return new IGrammarAwareElementType("EnumNodeTypeFieldValue_NameAssignment_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getEnumNodeTypeFieldValueAccess().getNameAssignment());
		}
		public static IGrammarAwareElementType createEnumNodeTypeFieldValue_NameIDTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("EnumNodeTypeFieldValue_NameIDTerminalRuleCall_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getEnumNodeTypeFieldValueAccess().getNameIDTerminalRuleCall_0());
		}
	}

	public static final IGrammarAwareElementType EnumNodeTypeFieldValue_ELEMENT_TYPE = associate(EnumNodeTypeFieldValueFactory.createEnumNodeTypeFieldValueElementType());

	public static final IGrammarAwareElementType EnumNodeTypeFieldValue_NameAssignment_ELEMENT_TYPE = associate(EnumNodeTypeFieldValueFactory.createEnumNodeTypeFieldValue_NameAssignmentElementType());

	public static final IGrammarAwareElementType EnumNodeTypeFieldValue_NameIDTerminalRuleCall_0_ELEMENT_TYPE = associate(EnumNodeTypeFieldValueFactory.createEnumNodeTypeFieldValue_NameIDTerminalRuleCall_0ElementType());

	private static class RelationNodeTypeFieldFactory {
		public static IGrammarAwareElementType createRelationNodeTypeFieldElementType() {
			return new IGrammarAwareElementType("RelationNodeTypeField_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationNodeTypeFieldRule());
		}
		public static IGrammarAwareElementType createRelationNodeTypeField_TypeAssignmentElementType() {
			return new IGrammarAwareElementType("RelationNodeTypeField_TypeAssignment_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationNodeTypeFieldAccess().getTypeAssignment());
		}
		public static IGrammarAwareElementType createRelationNodeTypeField_TypeNodeTypeCrossReference_0ElementType() {
			return new IGrammarAwareElementType("RelationNodeTypeField_TypeNodeTypeCrossReference_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationNodeTypeFieldAccess().getTypeNodeTypeCrossReference_0());
		}
		public static IGrammarAwareElementType createRelationNodeTypeField_TypeNodeTypeIDTerminalRuleCall_0_1ElementType() {
			return new IGrammarAwareElementType("RelationNodeTypeField_TypeNodeTypeIDTerminalRuleCall_0_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationNodeTypeFieldAccess().getTypeNodeTypeIDTerminalRuleCall_0_1());
		}
	}

	public static final IGrammarAwareElementType RelationNodeTypeField_ELEMENT_TYPE = associate(RelationNodeTypeFieldFactory.createRelationNodeTypeFieldElementType());

	public static final IGrammarAwareElementType RelationNodeTypeField_TypeAssignment_ELEMENT_TYPE = associate(RelationNodeTypeFieldFactory.createRelationNodeTypeField_TypeAssignmentElementType());

	public static final IGrammarAwareElementType RelationNodeTypeField_TypeNodeTypeCrossReference_0_ELEMENT_TYPE = associate(RelationNodeTypeFieldFactory.createRelationNodeTypeField_TypeNodeTypeCrossReference_0ElementType());

	public static final IGrammarAwareElementType RelationNodeTypeField_TypeNodeTypeIDTerminalRuleCall_0_1_ELEMENT_TYPE = associate(RelationNodeTypeFieldFactory.createRelationNodeTypeField_TypeNodeTypeIDTerminalRuleCall_0_1ElementType());

	private static class AttributeNodeTypeFieldFactory {
		public static IGrammarAwareElementType createAttributeNodeTypeFieldElementType() {
			return new IGrammarAwareElementType("AttributeNodeTypeField_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getAttributeNodeTypeFieldRule());
		}
		public static IGrammarAwareElementType createAttributeNodeTypeField_GroupElementType() {
			return new IGrammarAwareElementType("AttributeNodeTypeField_Group_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getAttributeNodeTypeFieldAccess().getGroup());
		}
		public static IGrammarAwareElementType createAttributeNodeTypeField_AttributeNodeTypeFieldAction_0ElementType() {
			return new IGrammarAwareElementType("AttributeNodeTypeField_AttributeNodeTypeFieldAction_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getAttributeNodeTypeFieldAccess().getAttributeNodeTypeFieldAction_0());
		}
		public static IGrammarAwareElementType createAttributeNodeTypeField_Alternatives_1ElementType() {
			return new IGrammarAwareElementType("AttributeNodeTypeField_Alternatives_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getAttributeNodeTypeFieldAccess().getAlternatives_1());
		}
		public static IGrammarAwareElementType createAttributeNodeTypeField_StringKeyword_1_0ElementType() {
			return new IGrammarAwareElementType("AttributeNodeTypeField_StringKeyword_1_0_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getAttributeNodeTypeFieldAccess().getStringKeyword_1_0());
		}
		public static IGrammarAwareElementType createAttributeNodeTypeField_IntKeyword_1_1ElementType() {
			return new IGrammarAwareElementType("AttributeNodeTypeField_IntKeyword_1_1_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getAttributeNodeTypeFieldAccess().getIntKeyword_1_1());
		}
		public static IGrammarAwareElementType createAttributeNodeTypeField_BooleanKeyword_1_2ElementType() {
			return new IGrammarAwareElementType("AttributeNodeTypeField_BooleanKeyword_1_2_ELEMENT_TYPE", AstTransformationsDslLanguage.INSTANCE, GRAMMAR_ACCESS.getAttributeNodeTypeFieldAccess().getBooleanKeyword_1_2());
		}
	}

	public static final IGrammarAwareElementType AttributeNodeTypeField_ELEMENT_TYPE = associate(AttributeNodeTypeFieldFactory.createAttributeNodeTypeFieldElementType());

	public static final IGrammarAwareElementType AttributeNodeTypeField_Group_ELEMENT_TYPE = associate(AttributeNodeTypeFieldFactory.createAttributeNodeTypeField_GroupElementType());

	public static final IGrammarAwareElementType AttributeNodeTypeField_AttributeNodeTypeFieldAction_0_ELEMENT_TYPE = associate(AttributeNodeTypeFieldFactory.createAttributeNodeTypeField_AttributeNodeTypeFieldAction_0ElementType());

	public static final IGrammarAwareElementType AttributeNodeTypeField_Alternatives_1_ELEMENT_TYPE = associate(AttributeNodeTypeFieldFactory.createAttributeNodeTypeField_Alternatives_1ElementType());

	public static final IGrammarAwareElementType AttributeNodeTypeField_StringKeyword_1_0_ELEMENT_TYPE = associate(AttributeNodeTypeFieldFactory.createAttributeNodeTypeField_StringKeyword_1_0ElementType());

	public static final IGrammarAwareElementType AttributeNodeTypeField_IntKeyword_1_1_ELEMENT_TYPE = associate(AttributeNodeTypeFieldFactory.createAttributeNodeTypeField_IntKeyword_1_1ElementType());

	public static final IGrammarAwareElementType AttributeNodeTypeField_BooleanKeyword_1_2_ELEMENT_TYPE = associate(AttributeNodeTypeFieldFactory.createAttributeNodeTypeField_BooleanKeyword_1_2ElementType());

	@Override
	public IFileElementType getFileType() {
		return FILE_TYPE;
	}

	@Override
	public IGrammarAwareElementType findElementType(EObject grammarElement) {
		return GRAMMAR_ELEMENT_TYPE.get(grammarElement);
	}
	
	public IGrammarAwareElementType getModelElementType() {
		return Model_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_GroupElementType() {
		return Model_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_AntlrAssignment_0ElementType() {
		return Model_AntlrAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_AntlrAntlrGrammarRefParserRuleCall_0_0ElementType() {
		return Model_AntlrAntlrGrammarRefParserRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_DeclarationsAssignment_1ElementType() {
		return Model_DeclarationsAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_DeclarationsDeclarationParserRuleCall_1_0ElementType() {
		return Model_DeclarationsDeclarationParserRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAntlrGrammarRefElementType() {
		return AntlrGrammarRef_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAntlrGrammarRef_GroupElementType() {
		return AntlrGrammarRef_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAntlrGrammarRef_AdaptKeyword_0ElementType() {
		return AntlrGrammarRef_AdaptKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAntlrGrammarRef_GrammarFileAssignment_1ElementType() {
		return AntlrGrammarRef_GrammarFileAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAntlrGrammarRef_GrammarFileSTRINGTerminalRuleCall_1_0ElementType() {
		return AntlrGrammarRef_GrammarFileSTRINGTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDeclarationElementType() {
		return Declaration_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDeclaration_AlternativesElementType() {
		return Declaration_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDeclaration_NodeTypeParserRuleCall_0ElementType() {
		return Declaration_NodeTypeParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDeclaration_NamedEnumDeclarationParserRuleCall_1ElementType() {
		return Declaration_NamedEnumDeclarationParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedEnumDeclarationElementType() {
		return NamedEnumDeclaration_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedEnumDeclaration_GroupElementType() {
		return NamedEnumDeclaration_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedEnumDeclaration_EnumKeyword_0ElementType() {
		return NamedEnumDeclaration_EnumKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedEnumDeclaration_NameAssignment_1ElementType() {
		return NamedEnumDeclaration_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedEnumDeclaration_NameIDTerminalRuleCall_1_0ElementType() {
		return NamedEnumDeclaration_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedEnumDeclaration_LeftCurlyBracketKeyword_2ElementType() {
		return NamedEnumDeclaration_LeftCurlyBracketKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedEnumDeclaration_ValuesAssignment_3ElementType() {
		return NamedEnumDeclaration_ValuesAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_3_0ElementType() {
		return NamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNamedEnumDeclaration_RightCurlyBracketKeyword_4ElementType() {
		return NamedEnumDeclaration_RightCurlyBracketKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnnamedEnumDeclarationElementType() {
		return UnnamedEnumDeclaration_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnnamedEnumDeclaration_GroupElementType() {
		return UnnamedEnumDeclaration_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnnamedEnumDeclaration_EnumKeyword_0ElementType() {
		return UnnamedEnumDeclaration_EnumKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnnamedEnumDeclaration_LeftCurlyBracketKeyword_1ElementType() {
		return UnnamedEnumDeclaration_LeftCurlyBracketKeyword_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnnamedEnumDeclaration_ValuesAssignment_2ElementType() {
		return UnnamedEnumDeclaration_ValuesAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnnamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_2_0ElementType() {
		return UnnamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnnamedEnumDeclaration_RightCurlyBracketKeyword_3ElementType() {
		return UnnamedEnumDeclaration_RightCurlyBracketKeyword_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeElementType() {
		return NodeType_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_GroupElementType() {
		return NodeType_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_AbstractKeyword_0ElementType() {
		return NodeType_AbstractKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_TypeKeyword_1ElementType() {
		return NodeType_TypeKeyword_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_NameAssignment_2ElementType() {
		return NodeType_NameAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_NameIDTerminalRuleCall_2_0ElementType() {
		return NodeType_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_Group_3ElementType() {
		return NodeType_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_ExtendsKeyword_3_0ElementType() {
		return NodeType_ExtendsKeyword_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_SuperTypeAssignment_3_1ElementType() {
		return NodeType_SuperTypeAssignment_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_SuperTypeNodeTypeCrossReference_3_1_0ElementType() {
		return NodeType_SuperTypeNodeTypeCrossReference_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_SuperTypeNodeTypeIDTerminalRuleCall_3_1_0_1ElementType() {
		return NodeType_SuperTypeNodeTypeIDTerminalRuleCall_3_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_Group_4ElementType() {
		return NodeType_Group_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_FromKeyword_4_0ElementType() {
		return NodeType_FromKeyword_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_AntlrNodeAssignment_4_1ElementType() {
		return NodeType_AntlrNodeAssignment_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_AntlrNodeIDTerminalRuleCall_4_1_0ElementType() {
		return NodeType_AntlrNodeIDTerminalRuleCall_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_LeftCurlyBracketKeyword_5ElementType() {
		return NodeType_LeftCurlyBracketKeyword_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_FieldsAssignment_6ElementType() {
		return NodeType_FieldsAssignment_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_FieldsNodeTypeFieldParserRuleCall_6_0ElementType() {
		return NodeType_FieldsNodeTypeFieldParserRuleCall_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeType_RightCurlyBracketKeyword_7ElementType() {
		return NodeType_RightCurlyBracketKeyword_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeFieldElementType() {
		return NodeTypeField_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeField_GroupElementType() {
		return NodeTypeField_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeField_NameAssignment_0ElementType() {
		return NodeTypeField_NameAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeField_NameIDTerminalRuleCall_0_0ElementType() {
		return NodeTypeField_NameIDTerminalRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeField_Alternatives_1ElementType() {
		return NodeTypeField_Alternatives_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeField_ManyAssignment_1_0ElementType() {
		return NodeTypeField_ManyAssignment_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeField_ManyAsteriskEqualsSignKeyword_1_0_0ElementType() {
		return NodeTypeField_ManyAsteriskEqualsSignKeyword_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeField_OptionalAssignment_1_1ElementType() {
		return NodeTypeField_OptionalAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeField_OptionalQuestionMarkEqualsSignKeyword_1_1_0ElementType() {
		return NodeTypeField_OptionalQuestionMarkEqualsSignKeyword_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeField_SingleAssignment_1_2ElementType() {
		return NodeTypeField_SingleAssignment_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeField_SingleEqualsSignKeyword_1_2_0ElementType() {
		return NodeTypeField_SingleEqualsSignKeyword_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeField_ValueAssignment_2ElementType() {
		return NodeTypeField_ValueAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeField_ValueNodeTypeFieldValueParserRuleCall_2_0ElementType() {
		return NodeTypeField_ValueNodeTypeFieldValueParserRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeFieldValueElementType() {
		return NodeTypeFieldValue_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeFieldValue_AlternativesElementType() {
		return NodeTypeFieldValue_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeFieldValue_UnnamedEnumDeclarationParserRuleCall_0ElementType() {
		return NodeTypeFieldValue_UnnamedEnumDeclarationParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeFieldValue_RelationNodeTypeFieldParserRuleCall_1ElementType() {
		return NodeTypeFieldValue_RelationNodeTypeFieldParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNodeTypeFieldValue_AttributeNodeTypeFieldParserRuleCall_2ElementType() {
		return NodeTypeFieldValue_AttributeNodeTypeFieldParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEnumNodeTypeFieldValueElementType() {
		return EnumNodeTypeFieldValue_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEnumNodeTypeFieldValue_NameAssignmentElementType() {
		return EnumNodeTypeFieldValue_NameAssignment_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getEnumNodeTypeFieldValue_NameIDTerminalRuleCall_0ElementType() {
		return EnumNodeTypeFieldValue_NameIDTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationNodeTypeFieldElementType() {
		return RelationNodeTypeField_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationNodeTypeField_TypeAssignmentElementType() {
		return RelationNodeTypeField_TypeAssignment_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationNodeTypeField_TypeNodeTypeCrossReference_0ElementType() {
		return RelationNodeTypeField_TypeNodeTypeCrossReference_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationNodeTypeField_TypeNodeTypeIDTerminalRuleCall_0_1ElementType() {
		return RelationNodeTypeField_TypeNodeTypeIDTerminalRuleCall_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAttributeNodeTypeFieldElementType() {
		return AttributeNodeTypeField_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAttributeNodeTypeField_GroupElementType() {
		return AttributeNodeTypeField_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAttributeNodeTypeField_AttributeNodeTypeFieldAction_0ElementType() {
		return AttributeNodeTypeField_AttributeNodeTypeFieldAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAttributeNodeTypeField_Alternatives_1ElementType() {
		return AttributeNodeTypeField_Alternatives_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAttributeNodeTypeField_StringKeyword_1_0ElementType() {
		return AttributeNodeTypeField_StringKeyword_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAttributeNodeTypeField_IntKeyword_1_1ElementType() {
		return AttributeNodeTypeField_IntKeyword_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAttributeNodeTypeField_BooleanKeyword_1_2ElementType() {
		return AttributeNodeTypeField_BooleanKeyword_1_2_ELEMENT_TYPE;
	}

}
