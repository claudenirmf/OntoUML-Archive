/*
 * generated by Xtext 2.12.0
 */
grammar InternalOntoUMLArchive;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package it.unibz.inf.ontouml.archive.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package it.unibz.inf.ontouml.archive.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.unibz.inf.ontouml.archive.services.OntoUMLArchiveGrammarAccess;

}

@parser::members {

 	private OntoUMLArchiveGrammarAccess grammarAccess;

    public InternalOntoUMLArchiveParser(TokenStream input, OntoUMLArchiveGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected OntoUMLArchiveGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getElmentsModelElementParserRuleCall_0());
			}
			lv_elments_0_0=ruleModelElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"elments",
					lv_elments_0_0,
					"it.unibz.inf.ontouml.archive.OntoUMLArchive.ModelElement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleModelElement
entryRuleModelElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelElementRule()); }
	iv_ruleModelElement=ruleModelElement
	{ $current=$iv_ruleModelElement.current; }
	EOF;

// Rule ModelElement
ruleModelElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelElementAccess().getClassParserRuleCall_0_0());
			}
			this_Class_0=ruleClass
			{
				$current = $this_Class_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getModelElementAccess().getRelationshipParserRuleCall_0_1());
			}
			this_Relationship_1=ruleRelationship
			{
				$current = $this_Relationship_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getModelElementAccess().getGeneralizationSetParserRuleCall_0_2());
			}
			this_GeneralizationSet_2=ruleGeneralizationSet
			{
				$current = $this_GeneralizationSet_2.current;
				afterParserOrEnumRuleCall();
			}
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getModelElementAccess().getSemicolonKeyword_1());
		}
	)
;

// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	iv_ruleClass=ruleClass
	{ $current=$iv_ruleClass.current; }
	EOF;

// Rule Class
ruleClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isAbstract_0_0='abstract'
				{
					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassRule());
					}
					setWithLastConsumed($current, "isAbstract", true, "abstract");
				}
			)
		)?
		otherlv_1='class'
		{
			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getClassAccess().getStereotypeStereotypeParserRuleCall_3_0());
				}
				lv_stereotype_3_0=ruleStereotype
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassRule());
					}
					set(
						$current,
						"stereotype",
						lv_stereotype_3_0,
						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Stereotype");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleRelationship
entryRuleRelationship returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationshipRule()); }
	iv_ruleRelationship=ruleRelationship
	{ $current=$iv_ruleRelationship.current; }
	EOF;

// Rule Relationship
ruleRelationship returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRelationshipAccess().getAssociationParserRuleCall_0());
		}
		this_Association_0=ruleAssociation
		{
			$current = $this_Association_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRelationshipAccess().getGeneralizationParserRuleCall_1());
		}
		this_Generalization_1=ruleGeneralization
		{
			$current = $this_Generalization_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRelationshipAccess().getDependencyLinkParserRuleCall_2());
		}
		this_DependencyLink_2=ruleDependencyLink
		{
			$current = $this_DependencyLink_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAssociation
entryRuleAssociation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssociationRule()); }
	iv_ruleAssociation=ruleAssociation
	{ $current=$iv_ruleAssociation.current; }
	EOF;

// Rule Association
ruleAssociation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAssociationAccess().getRegularAssociationParserRuleCall_0());
		}
		this_RegularAssociation_0=ruleRegularAssociation
		{
			$current = $this_RegularAssociation_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssociationAccess().getNaryAssociationParserRuleCall_1());
		}
		this_NaryAssociation_1=ruleNaryAssociation
		{
			$current = $this_NaryAssociation_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRegularAssociation
entryRuleRegularAssociation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegularAssociationRule()); }
	iv_ruleRegularAssociation=ruleRegularAssociation
	{ $current=$iv_ruleRegularAssociation.current; }
	EOF;

// Rule RegularAssociation
ruleRegularAssociation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='association'
		{
			newLeafNode(otherlv_0, grammarAccess.getRegularAssociationAccess().getAssociationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRegularAssociationAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegularAssociationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRegularAssociationAccess().getStereotypeStereotypeParserRuleCall_2_0());
				}
				lv_stereotype_2_0=ruleStereotype
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegularAssociationRule());
					}
					set(
						$current,
						"stereotype",
						lv_stereotype_2_0,
						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Stereotype");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_3='from'
		{
			newLeafNode(otherlv_3, grammarAccess.getRegularAssociationAccess().getFromKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRegularAssociationAccess().getFromAssociationEndParserRuleCall_4_0());
				}
				lv_from_4_0=ruleAssociationEnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegularAssociationRule());
					}
					set(
						$current,
						"from",
						lv_from_4_0,
						"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='to'
		{
			newLeafNode(otherlv_5, grammarAccess.getRegularAssociationAccess().getToKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRegularAssociationAccess().getToAssociationEndParserRuleCall_6_0());
				}
				lv_to_6_0=ruleAssociationEnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegularAssociationRule());
					}
					set(
						$current,
						"to",
						lv_to_6_0,
						"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNaryAssociation
entryRuleNaryAssociation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNaryAssociationRule()); }
	iv_ruleNaryAssociation=ruleNaryAssociation
	{ $current=$iv_ruleNaryAssociation.current; }
	EOF;

// Rule NaryAssociation
ruleNaryAssociation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='association'
		{
			newLeafNode(otherlv_0, grammarAccess.getNaryAssociationAccess().getAssociationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNaryAssociationAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNaryAssociationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getNaryAssociationAccess().getStereotypeStereotypeParserRuleCall_2_0());
				}
				lv_stereotype_2_0=ruleStereotype
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNaryAssociationRule());
					}
					set(
						$current,
						"stereotype",
						lv_stereotype_2_0,
						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Stereotype");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_3='end'
			{
				newLeafNode(otherlv_3, grammarAccess.getNaryAssociationAccess().getEndKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_3_1_0());
					}
					lv_ends_4_0=ruleAssociationEnd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaryAssociationRule());
						}
						add(
							$current,
							"ends",
							lv_ends_4_0,
							"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_5='end'
			{
				newLeafNode(otherlv_5, grammarAccess.getNaryAssociationAccess().getEndKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_4_1_0());
					}
					lv_ends_6_0=ruleAssociationEnd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaryAssociationRule());
						}
						add(
							$current,
							"ends",
							lv_ends_6_0,
							"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_7='end'
			{
				newLeafNode(otherlv_7, grammarAccess.getNaryAssociationAccess().getEndKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaryAssociationAccess().getEndsAssociationEndParserRuleCall_5_1_0());
					}
					lv_ends_8_0=ruleAssociationEnd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaryAssociationRule());
						}
						add(
							$current,
							"ends",
							lv_ends_8_0,
							"it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
	)
;

// Entry rule entryRuleAssociationEnd
entryRuleAssociationEnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssociationEndRule()); }
	iv_ruleAssociationEnd=ruleAssociationEnd
	{ $current=$iv_ruleAssociationEnd.current; }
	EOF;

// Rule AssociationEnd
ruleAssociationEnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_STRING
				{
					newLeafNode(lv_name_0_0, grammarAccess.getAssociationEndAccess().getNameSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociationEndRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationEndAccess().getMultiplicityMultiplicityParserRuleCall_1_0());
				}
				lv_multiplicity_1_0=ruleMultiplicity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationEndRule());
					}
					set(
						$current,
						"multiplicity",
						lv_multiplicity_1_0,
						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Multiplicity");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getAssociationEndAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociationEndRule());
					}
				}
				otherlv_3=RULE_STRING
				{
					newLeafNode(otherlv_3, grammarAccess.getAssociationEndAccess().getEndTypeClassCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleMultiplicity
entryRuleMultiplicity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicityRule()); }
	iv_ruleMultiplicity=ruleMultiplicity
	{ $current=$iv_ruleMultiplicity.current; }
	EOF;

// Rule Multiplicity
ruleMultiplicity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerCARDINALITYParserRuleCall_1_0());
				}
				lv_lower_1_0=ruleCARDINALITY
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiplicityRule());
					}
					set(
						$current,
						"lower",
						lv_lower_1_0,
						"it.unibz.inf.ontouml.archive.OntoUMLArchive.CARDINALITY");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='..'
		{
			newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperCARDINALITYParserRuleCall_3_0());
				}
				lv_upper_3_0=ruleCARDINALITY
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiplicityRule());
					}
					set(
						$current,
						"upper",
						lv_upper_3_0,
						"it.unibz.inf.ontouml.archive.OntoUMLArchive.CARDINALITY");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleCARDINALITY
entryRuleCARDINALITY returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCARDINALITYRule()); }
	iv_ruleCARDINALITY=ruleCARDINALITY
	{ $current=$iv_ruleCARDINALITY.current.getText(); }
	EOF;

// Rule CARDINALITY
ruleCARDINALITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCARDINALITYAccess().getAsteriskKeyword_0());
		}
		    |
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getCARDINALITYAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleGeneralization
entryRuleGeneralization returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGeneralizationRule()); }
	iv_ruleGeneralization=ruleGeneralization
	{ $current=$iv_ruleGeneralization.current; }
	EOF;

// Rule Generalization
ruleGeneralization returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='gen'
		{
			newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getGenKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGeneralizationAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGeneralizationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		otherlv_2='super'
		{
			newLeafNode(otherlv_2, grammarAccess.getGeneralizationAccess().getSuperKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGeneralizationRule());
					}
				}
				otherlv_3=RULE_STRING
				{
					newLeafNode(otherlv_3, grammarAccess.getGeneralizationAccess().getSuperClassCrossReference_3_0());
				}
			)
		)
		otherlv_4='sub'
		{
			newLeafNode(otherlv_4, grammarAccess.getGeneralizationAccess().getSubKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGeneralizationRule());
					}
				}
				otherlv_5=RULE_STRING
				{
					newLeafNode(otherlv_5, grammarAccess.getGeneralizationAccess().getSubClassCrossReference_5_0());
				}
			)
		)
	)
;

// Entry rule entryRuleDependencyLink
entryRuleDependencyLink returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDependencyLinkRule()); }
	iv_ruleDependencyLink=ruleDependencyLink
	{ $current=$iv_ruleDependencyLink.current; }
	EOF;

// Rule DependencyLink
ruleDependencyLink returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='dependency'
		{
			newLeafNode(otherlv_0, grammarAccess.getDependencyLinkAccess().getDependencyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDependencyLinkAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDependencyLinkRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		otherlv_2='from'
		{
			newLeafNode(otherlv_2, grammarAccess.getDependencyLinkAccess().getFromKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDependencyLinkRule());
					}
				}
				otherlv_3=RULE_STRING
				{
					newLeafNode(otherlv_3, grammarAccess.getDependencyLinkAccess().getFromClassCrossReference_3_0());
				}
			)
		)
		otherlv_4='to'
		{
			newLeafNode(otherlv_4, grammarAccess.getDependencyLinkAccess().getToKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDependencyLinkRule());
					}
				}
				otherlv_5=RULE_STRING
				{
					newLeafNode(otherlv_5, grammarAccess.getDependencyLinkAccess().getToClassCrossReference_5_0());
				}
			)
		)
	)
;

// Entry rule entryRuleGeneralizationSet
entryRuleGeneralizationSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGeneralizationSetRule()); }
	iv_ruleGeneralizationSet=ruleGeneralizationSet
	{ $current=$iv_ruleGeneralizationSet.current; }
	EOF;

// Rule GeneralizationSet
ruleGeneralizationSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='genset'
		{
			newLeafNode(otherlv_0, grammarAccess.getGeneralizationSetAccess().getGensetKeyword_0());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 0);
					}
								({true}?=>((
									lv_isDisjoint_2_0='disjoint'
									{
										newLeafNode(lv_isDisjoint_2_0, grammarAccess.getGeneralizationSetAccess().getIsDisjointDisjointKeyword_1_0_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getGeneralizationSetRule());
										}
										setWithLastConsumed($current, "isDisjoint", true, "disjoint");
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1(), 1);
					}
								({true}?=>((
									lv_isComplete_3_0='complete'
									{
										newLeafNode(lv_isComplete_3_0, grammarAccess.getGeneralizationSetAccess().getIsCompleteCompleteKeyword_1_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getGeneralizationSetRule());
										}
										setWithLastConsumed($current, "isComplete", true, "complete");
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getGeneralizationSetAccess().getUnorderedGroup_1());
				}
		)
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getGeneralizationSetAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGeneralizationSetRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGeneralizationSetAccess().getGeneralizationsGeneralizationParserRuleCall_3_0());
				}
				lv_generalizations_5_0=ruleGeneralization
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGeneralizationSetRule());
					}
					add(
						$current,
						"generalizations",
						lv_generalizations_5_0,
						"it.unibz.inf.ontouml.archive.OntoUMLArchive.Generalization");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleStereotype
entryRuleStereotype returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStereotypeRule()); }
	iv_ruleStereotype=ruleStereotype
	{ $current=$iv_ruleStereotype.current; }
	EOF;

// Rule Stereotype
ruleStereotype returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_STEREOTYPE_STRING
			{
				newLeafNode(lv_name_0_0, grammarAccess.getStereotypeAccess().getNameSTEREOTYPE_STRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStereotypeRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"it.unibz.inf.ontouml.archive.OntoUMLArchive.STEREOTYPE_STRING");
			}
		)
	)
;

RULE_STEREOTYPE_STRING : '<<' ('a'..'z'|'A'..'Z'|' ') ('a'..'z'|'A'..'Z'|' ')* '>>';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
