/*
 * generated by Xtext 2.9.0.v201505220408
 */
grammar PsiInternalAstTransformationsDsl;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package me.tomassetti.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package me.tomassetti.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import me.tomassetti.idea.lang.AstTransformationsDslElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import me.tomassetti.services.AstTransformationsDslGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

	protected AstTransformationsDslGrammarAccess grammarAccess;

	protected AstTransformationsDslElementTypeProvider elementTypeProvider;

	public PsiInternalAstTransformationsDslParser(PsiBuilder builder, TokenStream input, AstTransformationsDslElementTypeProvider elementTypeProvider, AstTransformationsDslGrammarAccess grammarAccess) {
		this(input);
		setPsiBuilder(builder);
    	this.grammarAccess = grammarAccess;
		this.elementTypeProvider = elementTypeProvider;
	}

	@Override
	protected String getFirstRuleName() {
		return "Model";
	}

}

//Entry rule entryRuleModel
entryRuleModel:
	{ markComposite(elementTypeProvider.getModelElementType()); }
	ruleModel
	EOF;

// Rule Model
ruleModel:
	(
		(
			(
				{
					markComposite(elementTypeProvider.getModel_AntlrAntlrGrammarRefParserRuleCall_0_0ElementType());
				}
				lv_antlr_0_0=ruleAntlrGrammarRef
				{
					doneComposite();
				}
			)
		)
		(
			(
				{
					markComposite(elementTypeProvider.getModel_DeclarationsDeclarationParserRuleCall_1_0ElementType());
				}
				lv_declarations_1_0=ruleDeclaration
				{
					doneComposite();
				}
			)
		)*
	)
;

//Entry rule entryRuleAntlrGrammarRef
entryRuleAntlrGrammarRef:
	{ markComposite(elementTypeProvider.getAntlrGrammarRefElementType()); }
	ruleAntlrGrammarRef
	EOF;

// Rule AntlrGrammarRef
ruleAntlrGrammarRef:
	(
		{
			markLeaf(elementTypeProvider.getAntlrGrammarRef_AdaptKeyword_0ElementType());
		}
		otherlv_0='adapt'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getAntlrGrammarRef_GrammarFileSTRINGTerminalRuleCall_1_0ElementType());
				}
				lv_grammarFile_1_0=RULE_STRING
				{
					doneLeaf(lv_grammarFile_1_0);
				}
			)
		)
	)
;

//Entry rule entryRuleDeclaration
entryRuleDeclaration:
	{ markComposite(elementTypeProvider.getDeclarationElementType()); }
	ruleDeclaration
	EOF;

// Rule Declaration
ruleDeclaration:
	(
		{
			markComposite(elementTypeProvider.getDeclaration_NodeTypeParserRuleCall_0ElementType());
		}
		ruleNodeType
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getDeclaration_NamedEnumDeclarationParserRuleCall_1ElementType());
		}
		ruleNamedEnumDeclaration
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleNamedEnumDeclaration
entryRuleNamedEnumDeclaration:
	{ markComposite(elementTypeProvider.getNamedEnumDeclarationElementType()); }
	ruleNamedEnumDeclaration
	EOF;

// Rule NamedEnumDeclaration
ruleNamedEnumDeclaration:
	(
		{
			markLeaf(elementTypeProvider.getNamedEnumDeclaration_EnumKeyword_0ElementType());
		}
		otherlv_0='enum'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getNamedEnumDeclaration_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getNamedEnumDeclaration_LeftCurlyBracketKeyword_2ElementType());
		}
		otherlv_2='{'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getNamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_3_0ElementType());
				}
				lv_values_3_0=ruleEnumNodeTypeFieldValue
				{
					doneComposite();
				}
			)
		)+
		{
			markLeaf(elementTypeProvider.getNamedEnumDeclaration_RightCurlyBracketKeyword_4ElementType());
		}
		otherlv_4='}'
		{
			doneLeaf(otherlv_4);
		}
	)
;

//Entry rule entryRuleUnnamedEnumDeclaration
entryRuleUnnamedEnumDeclaration:
	{ markComposite(elementTypeProvider.getUnnamedEnumDeclarationElementType()); }
	ruleUnnamedEnumDeclaration
	EOF;

// Rule UnnamedEnumDeclaration
ruleUnnamedEnumDeclaration:
	(
		{
			markLeaf(elementTypeProvider.getUnnamedEnumDeclaration_EnumKeyword_0ElementType());
		}
		otherlv_0='enum'
		{
			doneLeaf(otherlv_0);
		}
		{
			markLeaf(elementTypeProvider.getUnnamedEnumDeclaration_LeftCurlyBracketKeyword_1ElementType());
		}
		otherlv_1='{'
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getUnnamedEnumDeclaration_ValuesEnumNodeTypeFieldValueParserRuleCall_2_0ElementType());
				}
				lv_values_2_0=ruleEnumNodeTypeFieldValue
				{
					doneComposite();
				}
			)
		)+
		{
			markLeaf(elementTypeProvider.getUnnamedEnumDeclaration_RightCurlyBracketKeyword_3ElementType());
		}
		otherlv_3='}'
		{
			doneLeaf(otherlv_3);
		}
	)
;

//Entry rule entryRuleNodeType
entryRuleNodeType:
	{ markComposite(elementTypeProvider.getNodeTypeElementType()); }
	ruleNodeType
	EOF;

// Rule NodeType
ruleNodeType:
	(
		(
			{
				markLeaf(elementTypeProvider.getNodeType_AbstractKeyword_0ElementType());
			}
			otherlv_0='abstract'
			{
				doneLeaf(otherlv_0);
			}
		)?
		{
			markLeaf(elementTypeProvider.getNodeType_TypeKeyword_1ElementType());
		}
		otherlv_1='type'
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getNodeType_NameIDTerminalRuleCall_2_0ElementType());
				}
				lv_name_2_0=RULE_ID
				{
					doneLeaf(lv_name_2_0);
				}
			)
		)
		(
			{
				markLeaf(elementTypeProvider.getNodeType_ExtendsKeyword_3_0ElementType());
			}
			otherlv_3='extends'
			{
				doneLeaf(otherlv_3);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getNodeType_SuperTypeNodeTypeCrossReference_3_1_0ElementType());
					}
					otherlv_4=RULE_ID
					{
						doneLeaf(otherlv_4);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getNodeType_FromKeyword_4_0ElementType());
			}
			otherlv_5='from'
			{
				doneLeaf(otherlv_5);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getNodeType_AntlrNodeIDTerminalRuleCall_4_1_0ElementType());
					}
					lv_antlrNode_6_0=RULE_ID
					{
						doneLeaf(lv_antlrNode_6_0);
					}
				)
			)
		)?
		{
			markLeaf(elementTypeProvider.getNodeType_LeftCurlyBracketKeyword_5ElementType());
		}
		otherlv_7='{'
		{
			doneLeaf(otherlv_7);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getNodeType_FieldsNodeTypeFieldParserRuleCall_6_0ElementType());
				}
				lv_fields_8_0=ruleNodeTypeField
				{
					doneComposite();
				}
			)
		)*
		{
			markLeaf(elementTypeProvider.getNodeType_RightCurlyBracketKeyword_7ElementType());
		}
		otherlv_9='}'
		{
			doneLeaf(otherlv_9);
		}
	)
;

//Entry rule entryRuleNodeTypeField
entryRuleNodeTypeField:
	{ markComposite(elementTypeProvider.getNodeTypeFieldElementType()); }
	ruleNodeTypeField
	EOF;

// Rule NodeTypeField
ruleNodeTypeField:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getNodeTypeField_NameIDTerminalRuleCall_0_0ElementType());
				}
				lv_name_0_0=RULE_ID
				{
					doneLeaf(lv_name_0_0);
				}
			)
		)
		(
			(
				(
					{
						markLeaf(elementTypeProvider.getNodeTypeField_ManyAsteriskEqualsSignKeyword_1_0_0ElementType());
					}
					lv_many_1_0='*='
					{
						doneLeaf(lv_many_1_0);
					}
				)
			)
			    |
			(
				(
					{
						markLeaf(elementTypeProvider.getNodeTypeField_OptionalQuestionMarkEqualsSignKeyword_1_1_0ElementType());
					}
					lv_optional_2_0='?='
					{
						doneLeaf(lv_optional_2_0);
					}
				)
			)
			    |
			(
				(
					{
						markLeaf(elementTypeProvider.getNodeTypeField_SingleEqualsSignKeyword_1_2_0ElementType());
					}
					lv_single_3_0='='
					{
						doneLeaf(lv_single_3_0);
					}
				)
			)
		)
		(
			(
				{
					markComposite(elementTypeProvider.getNodeTypeField_ValueNodeTypeFieldValueParserRuleCall_2_0ElementType());
				}
				lv_value_4_0=ruleNodeTypeFieldValue
				{
					doneComposite();
				}
			)
		)
	)
;

//Entry rule entryRuleNodeTypeFieldValue
entryRuleNodeTypeFieldValue:
	{ markComposite(elementTypeProvider.getNodeTypeFieldValueElementType()); }
	ruleNodeTypeFieldValue
	EOF;

// Rule NodeTypeFieldValue
ruleNodeTypeFieldValue:
	(
		{
			markComposite(elementTypeProvider.getNodeTypeFieldValue_UnnamedEnumDeclarationParserRuleCall_0ElementType());
		}
		ruleUnnamedEnumDeclaration
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getNodeTypeFieldValue_RelationNodeTypeFieldParserRuleCall_1ElementType());
		}
		ruleRelationNodeTypeField
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getNodeTypeFieldValue_AttributeNodeTypeFieldParserRuleCall_2ElementType());
		}
		ruleAttributeNodeTypeField
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleEnumNodeTypeFieldValue
entryRuleEnumNodeTypeFieldValue:
	{ markComposite(elementTypeProvider.getEnumNodeTypeFieldValueElementType()); }
	ruleEnumNodeTypeFieldValue
	EOF;

// Rule EnumNodeTypeFieldValue
ruleEnumNodeTypeFieldValue:
	(
		(
			{
				markLeaf(elementTypeProvider.getEnumNodeTypeFieldValue_NameIDTerminalRuleCall_0ElementType());
			}
			lv_name_0_0=RULE_ID
			{
				doneLeaf(lv_name_0_0);
			}
		)
	)
;

//Entry rule entryRuleRelationNodeTypeField
entryRuleRelationNodeTypeField:
	{ markComposite(elementTypeProvider.getRelationNodeTypeFieldElementType()); }
	ruleRelationNodeTypeField
	EOF;

// Rule RelationNodeTypeField
ruleRelationNodeTypeField:
	(
		(
			{
				markLeaf(elementTypeProvider.getRelationNodeTypeField_TypeNodeTypeCrossReference_0ElementType());
			}
			otherlv_0=RULE_ID
			{
				doneLeaf(otherlv_0);
			}
		)
	)
;

//Entry rule entryRuleAttributeNodeTypeField
entryRuleAttributeNodeTypeField:
	{ markComposite(elementTypeProvider.getAttributeNodeTypeFieldElementType()); }
	ruleAttributeNodeTypeField
	EOF;

// Rule AttributeNodeTypeField
ruleAttributeNodeTypeField:
	(
		(
			{
				precedeComposite(elementTypeProvider.getAttributeNodeTypeField_AttributeNodeTypeFieldAction_0ElementType());
				doneComposite();
			}
		)
		(
			{
				markLeaf(elementTypeProvider.getAttributeNodeTypeField_StringKeyword_1_0ElementType());
			}
			otherlv_1='string'
			{
				doneLeaf(otherlv_1);
			}
			    |
			{
				markLeaf(elementTypeProvider.getAttributeNodeTypeField_IntKeyword_1_1ElementType());
			}
			otherlv_2='int'
			{
				doneLeaf(otherlv_2);
			}
			    |
			{
				markLeaf(elementTypeProvider.getAttributeNodeTypeField_BooleanKeyword_1_2ElementType());
			}
			otherlv_3='boolean'
			{
				doneLeaf(otherlv_3);
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
