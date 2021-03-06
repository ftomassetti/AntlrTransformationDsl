/*
 * generated by Xtext 2.9.0.v201505220408
 */
package me.tomassetti.ide.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import me.tomassetti.services.AstTransformationsDslGrammarAccess;

public class AstTransformationsDslParser extends AbstractContentAssistParser {
	
	@Inject
	private AstTransformationsDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected me.tomassetti.ide.contentassist.antlr.internal.InternalAstTransformationsDslParser createParser() {
		me.tomassetti.ide.contentassist.antlr.internal.InternalAstTransformationsDslParser result = new me.tomassetti.ide.contentassist.antlr.internal.InternalAstTransformationsDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getNodeTypeFieldAccess().getAlternatives_1(), "rule__NodeTypeField__Alternatives_1");
					put(grammarAccess.getNodeTypeFieldValueAccess().getAlternatives(), "rule__NodeTypeFieldValue__Alternatives");
					put(grammarAccess.getAttributeNodeTypeFieldAccess().getAlternatives_1(), "rule__AttributeNodeTypeField__Alternatives_1");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getAntlrGrammarRefAccess().getGroup(), "rule__AntlrGrammarRef__Group__0");
					put(grammarAccess.getNamedEnumDeclarationAccess().getGroup(), "rule__NamedEnumDeclaration__Group__0");
					put(grammarAccess.getUnnamedEnumDeclarationAccess().getGroup(), "rule__UnnamedEnumDeclaration__Group__0");
					put(grammarAccess.getNodeTypeAccess().getGroup(), "rule__NodeType__Group__0");
					put(grammarAccess.getNodeTypeAccess().getGroup_3(), "rule__NodeType__Group_3__0");
					put(grammarAccess.getNodeTypeAccess().getGroup_4(), "rule__NodeType__Group_4__0");
					put(grammarAccess.getNodeTypeFieldAccess().getGroup(), "rule__NodeTypeField__Group__0");
					put(grammarAccess.getAttributeNodeTypeFieldAccess().getGroup(), "rule__AttributeNodeTypeField__Group__0");
					put(grammarAccess.getModelAccess().getAntlrAssignment_0(), "rule__Model__AntlrAssignment_0");
					put(grammarAccess.getModelAccess().getDeclarationsAssignment_1(), "rule__Model__DeclarationsAssignment_1");
					put(grammarAccess.getAntlrGrammarRefAccess().getGrammarFileAssignment_1(), "rule__AntlrGrammarRef__GrammarFileAssignment_1");
					put(grammarAccess.getNamedEnumDeclarationAccess().getNameAssignment_1(), "rule__NamedEnumDeclaration__NameAssignment_1");
					put(grammarAccess.getNamedEnumDeclarationAccess().getValuesAssignment_3(), "rule__NamedEnumDeclaration__ValuesAssignment_3");
					put(grammarAccess.getUnnamedEnumDeclarationAccess().getValuesAssignment_2(), "rule__UnnamedEnumDeclaration__ValuesAssignment_2");
					put(grammarAccess.getNodeTypeAccess().getNameAssignment_2(), "rule__NodeType__NameAssignment_2");
					put(grammarAccess.getNodeTypeAccess().getSuperTypeAssignment_3_1(), "rule__NodeType__SuperTypeAssignment_3_1");
					put(grammarAccess.getNodeTypeAccess().getAntlrNodeAssignment_4_1(), "rule__NodeType__AntlrNodeAssignment_4_1");
					put(grammarAccess.getNodeTypeAccess().getFieldsAssignment_6(), "rule__NodeType__FieldsAssignment_6");
					put(grammarAccess.getNodeTypeFieldAccess().getNameAssignment_0(), "rule__NodeTypeField__NameAssignment_0");
					put(grammarAccess.getNodeTypeFieldAccess().getManyAssignment_1_0(), "rule__NodeTypeField__ManyAssignment_1_0");
					put(grammarAccess.getNodeTypeFieldAccess().getOptionalAssignment_1_1(), "rule__NodeTypeField__OptionalAssignment_1_1");
					put(grammarAccess.getNodeTypeFieldAccess().getSingleAssignment_1_2(), "rule__NodeTypeField__SingleAssignment_1_2");
					put(grammarAccess.getNodeTypeFieldAccess().getValueAssignment_2(), "rule__NodeTypeField__ValueAssignment_2");
					put(grammarAccess.getEnumNodeTypeFieldValueAccess().getNameAssignment(), "rule__EnumNodeTypeFieldValue__NameAssignment");
					put(grammarAccess.getRelationNodeTypeFieldAccess().getTypeAssignment(), "rule__RelationNodeTypeField__TypeAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			me.tomassetti.ide.contentassist.antlr.internal.InternalAstTransformationsDslParser typedParser = (me.tomassetti.ide.contentassist.antlr.internal.InternalAstTransformationsDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AstTransformationsDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AstTransformationsDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
