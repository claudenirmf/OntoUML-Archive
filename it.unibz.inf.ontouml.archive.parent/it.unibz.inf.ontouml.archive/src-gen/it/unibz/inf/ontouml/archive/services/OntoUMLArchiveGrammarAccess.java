/*
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class OntoUMLArchiveGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.Model");
		private final Assignment cElmentsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElmentsModelElementParserRuleCall_0 = (RuleCall)cElmentsAssignment.eContents().get(0);
		
		//Model:
		//	elments+=ModelElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//elments+=ModelElement*
		public Assignment getElmentsAssignment() { return cElmentsAssignment; }
		
		//ModelElement
		public RuleCall getElmentsModelElementParserRuleCall_0() { return cElmentsModelElementParserRuleCall_0; }
	}
	public class ModelElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.ModelElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cClassParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cRelationshipParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cGeneralizationSetParserRuleCall_0_2 = (RuleCall)cAlternatives_0.eContents().get(2);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ModelElement:
		//	(Class | Relationship | GeneralizationSet) ';';
		@Override public ParserRule getRule() { return rule; }
		
		//(Class | Relationship | GeneralizationSet) ';'
		public Group getGroup() { return cGroup; }
		
		//Class | Relationship | GeneralizationSet
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//Class
		public RuleCall getClassParserRuleCall_0_0() { return cClassParserRuleCall_0_0; }
		
		//Relationship
		public RuleCall getRelationshipParserRuleCall_0_1() { return cRelationshipParserRuleCall_0_1; }
		
		//GeneralizationSet
		public RuleCall getGeneralizationSetParserRuleCall_0_2() { return cGeneralizationSetParserRuleCall_0_2; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class ClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.Class");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsAbstractAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsAbstractAbstractKeyword_0_0 = (Keyword)cIsAbstractAssignment_0.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cStereotypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStereotypeStereotypeParserRuleCall_3_0 = (RuleCall)cStereotypeAssignment_3.eContents().get(0);
		
		//Class:
		//	isAbstract?='abstract'? 'class' name=STRING
		//	stereotype=Stereotype?;
		@Override public ParserRule getRule() { return rule; }
		
		//isAbstract?='abstract'? 'class' name=STRING stereotype=Stereotype?
		public Group getGroup() { return cGroup; }
		
		//isAbstract?='abstract'?
		public Assignment getIsAbstractAssignment_0() { return cIsAbstractAssignment_0; }
		
		//'abstract'
		public Keyword getIsAbstractAbstractKeyword_0_0() { return cIsAbstractAbstractKeyword_0_0; }
		
		//'class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//stereotype=Stereotype?
		public Assignment getStereotypeAssignment_3() { return cStereotypeAssignment_3; }
		
		//Stereotype
		public RuleCall getStereotypeStereotypeParserRuleCall_3_0() { return cStereotypeStereotypeParserRuleCall_3_0; }
	}
	public class RelationshipElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.Relationship");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAssociationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGeneralizationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDependencyLinkParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Relationship:
		//	Association | Generalization | DependencyLink;
		@Override public ParserRule getRule() { return rule; }
		
		//Association | Generalization | DependencyLink
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Association
		public RuleCall getAssociationParserRuleCall_0() { return cAssociationParserRuleCall_0; }
		
		//Generalization
		public RuleCall getGeneralizationParserRuleCall_1() { return cGeneralizationParserRuleCall_1; }
		
		//DependencyLink
		public RuleCall getDependencyLinkParserRuleCall_2() { return cDependencyLinkParserRuleCall_2; }
	}
	public class AssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.Association");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRegularAssociationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNaryAssociationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Association:
		//	RegularAssociation | NaryAssociation;
		@Override public ParserRule getRule() { return rule; }
		
		//RegularAssociation | NaryAssociation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//RegularAssociation
		public RuleCall getRegularAssociationParserRuleCall_0() { return cRegularAssociationParserRuleCall_0; }
		
		//NaryAssociation
		public RuleCall getNaryAssociationParserRuleCall_1() { return cNaryAssociationParserRuleCall_1; }
	}
	public class RegularAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.RegularAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssociationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cStereotypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStereotypeStereotypeParserRuleCall_2_0 = (RuleCall)cStereotypeAssignment_2.eContents().get(0);
		private final Keyword cFromKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFromAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFromAssociationEndParserRuleCall_4_0 = (RuleCall)cFromAssignment_4.eContents().get(0);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cToAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cToAssociationEndParserRuleCall_6_0 = (RuleCall)cToAssignment_6.eContents().get(0);
		
		//RegularAssociation:
		//	'association' name=STRING?
		//	stereotype=Stereotype?
		//	'from' from=AssociationEnd
		//	'to' to=AssociationEnd;
		@Override public ParserRule getRule() { return rule; }
		
		//'association' name=STRING? stereotype=Stereotype? 'from' from=AssociationEnd 'to' to=AssociationEnd
		public Group getGroup() { return cGroup; }
		
		//'association'
		public Keyword getAssociationKeyword_0() { return cAssociationKeyword_0; }
		
		//name=STRING?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//stereotype=Stereotype?
		public Assignment getStereotypeAssignment_2() { return cStereotypeAssignment_2; }
		
		//Stereotype
		public RuleCall getStereotypeStereotypeParserRuleCall_2_0() { return cStereotypeStereotypeParserRuleCall_2_0; }
		
		//'from'
		public Keyword getFromKeyword_3() { return cFromKeyword_3; }
		
		//from=AssociationEnd
		public Assignment getFromAssignment_4() { return cFromAssignment_4; }
		
		//AssociationEnd
		public RuleCall getFromAssociationEndParserRuleCall_4_0() { return cFromAssociationEndParserRuleCall_4_0; }
		
		//'to'
		public Keyword getToKeyword_5() { return cToKeyword_5; }
		
		//to=AssociationEnd
		public Assignment getToAssignment_6() { return cToAssignment_6; }
		
		//AssociationEnd
		public RuleCall getToAssociationEndParserRuleCall_6_0() { return cToAssociationEndParserRuleCall_6_0; }
	}
	public class NaryAssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.NaryAssociation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssociationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cStereotypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStereotypeStereotypeParserRuleCall_2_0 = (RuleCall)cStereotypeAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cEndKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cEndsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cEndsAssociationEndParserRuleCall_3_1_0 = (RuleCall)cEndsAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cEndKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cEndsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cEndsAssociationEndParserRuleCall_4_1_0 = (RuleCall)cEndsAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cEndKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cEndsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cEndsAssociationEndParserRuleCall_5_1_0 = (RuleCall)cEndsAssignment_5_1.eContents().get(0);
		
		//NaryAssociation:
		//	'association' name=STRING?
		//	stereotype=Stereotype? ('end' ends+=AssociationEnd) ('end' ends+=AssociationEnd) ('end' ends+=AssociationEnd)+;
		@Override public ParserRule getRule() { return rule; }
		
		//'association' name=STRING? stereotype=Stereotype? ('end' ends+=AssociationEnd) ('end' ends+=AssociationEnd) ('end'
		//ends+=AssociationEnd)+
		public Group getGroup() { return cGroup; }
		
		//'association'
		public Keyword getAssociationKeyword_0() { return cAssociationKeyword_0; }
		
		//name=STRING?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//stereotype=Stereotype?
		public Assignment getStereotypeAssignment_2() { return cStereotypeAssignment_2; }
		
		//Stereotype
		public RuleCall getStereotypeStereotypeParserRuleCall_2_0() { return cStereotypeStereotypeParserRuleCall_2_0; }
		
		//'end' ends+=AssociationEnd
		public Group getGroup_3() { return cGroup_3; }
		
		//'end'
		public Keyword getEndKeyword_3_0() { return cEndKeyword_3_0; }
		
		//ends+=AssociationEnd
		public Assignment getEndsAssignment_3_1() { return cEndsAssignment_3_1; }
		
		//AssociationEnd
		public RuleCall getEndsAssociationEndParserRuleCall_3_1_0() { return cEndsAssociationEndParserRuleCall_3_1_0; }
		
		//'end' ends+=AssociationEnd
		public Group getGroup_4() { return cGroup_4; }
		
		//'end'
		public Keyword getEndKeyword_4_0() { return cEndKeyword_4_0; }
		
		//ends+=AssociationEnd
		public Assignment getEndsAssignment_4_1() { return cEndsAssignment_4_1; }
		
		//AssociationEnd
		public RuleCall getEndsAssociationEndParserRuleCall_4_1_0() { return cEndsAssociationEndParserRuleCall_4_1_0; }
		
		//('end' ends+=AssociationEnd)+
		public Group getGroup_5() { return cGroup_5; }
		
		//'end'
		public Keyword getEndKeyword_5_0() { return cEndKeyword_5_0; }
		
		//ends+=AssociationEnd
		public Assignment getEndsAssignment_5_1() { return cEndsAssignment_5_1; }
		
		//AssociationEnd
		public RuleCall getEndsAssociationEndParserRuleCall_5_1_0() { return cEndsAssociationEndParserRuleCall_5_1_0; }
	}
	public class AssociationEndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.AssociationEnd");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cMultiplicityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMultiplicityMultiplicityParserRuleCall_1_0 = (RuleCall)cMultiplicityAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEndTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cEndTypeClassCrossReference_3_0 = (CrossReference)cEndTypeAssignment_3.eContents().get(0);
		private final RuleCall cEndTypeClassSTRINGTerminalRuleCall_3_0_1 = (RuleCall)cEndTypeClassCrossReference_3_0.eContents().get(1);
		
		//AssociationEnd:
		//	name=STRING?
		//	multiplicity=Multiplicity
		//	':' endType=[Class|STRING];
		@Override public ParserRule getRule() { return rule; }
		
		//name=STRING? multiplicity=Multiplicity ':' endType=[Class|STRING]
		public Group getGroup() { return cGroup; }
		
		//name=STRING?
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_0_0() { return cNameSTRINGTerminalRuleCall_0_0; }
		
		//multiplicity=Multiplicity
		public Assignment getMultiplicityAssignment_1() { return cMultiplicityAssignment_1; }
		
		//Multiplicity
		public RuleCall getMultiplicityMultiplicityParserRuleCall_1_0() { return cMultiplicityMultiplicityParserRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//endType=[Class|STRING]
		public Assignment getEndTypeAssignment_3() { return cEndTypeAssignment_3; }
		
		//[Class|STRING]
		public CrossReference getEndTypeClassCrossReference_3_0() { return cEndTypeClassCrossReference_3_0; }
		
		//STRING
		public RuleCall getEndTypeClassSTRINGTerminalRuleCall_3_0_1() { return cEndTypeClassSTRINGTerminalRuleCall_3_0_1; }
	}
	public class MultiplicityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.Multiplicity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLowerAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLowerCARDINALITYParserRuleCall_1_0 = (RuleCall)cLowerAssignment_1.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cUpperAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cUpperCARDINALITYParserRuleCall_3_0 = (RuleCall)cUpperAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Multiplicity:
		//	'[' lower=CARDINALITY '..' upper=CARDINALITY ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'[' lower=CARDINALITY '..' upper=CARDINALITY ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//lower=CARDINALITY
		public Assignment getLowerAssignment_1() { return cLowerAssignment_1; }
		
		//CARDINALITY
		public RuleCall getLowerCARDINALITYParserRuleCall_1_0() { return cLowerCARDINALITYParserRuleCall_1_0; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_2() { return cFullStopFullStopKeyword_2; }
		
		//upper=CARDINALITY
		public Assignment getUpperAssignment_3() { return cUpperAssignment_3; }
		
		//CARDINALITY
		public RuleCall getUpperCARDINALITYParserRuleCall_3_0() { return cUpperCARDINALITYParserRuleCall_3_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}
	public class CARDINALITYElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.CARDINALITY");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cAsteriskKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//CARDINALITY ecore::EInt:
		//	'*' | INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'*' | INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'*'
		public Keyword getAsteriskKeyword_0() { return cAsteriskKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class GeneralizationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.Generalization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSuperKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSuperAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cSuperClassCrossReference_3_0 = (CrossReference)cSuperAssignment_3.eContents().get(0);
		private final RuleCall cSuperClassSTRINGTerminalRuleCall_3_0_1 = (RuleCall)cSuperClassCrossReference_3_0.eContents().get(1);
		private final Keyword cSubKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSubAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cSubClassCrossReference_5_0 = (CrossReference)cSubAssignment_5.eContents().get(0);
		private final RuleCall cSubClassSTRINGTerminalRuleCall_5_0_1 = (RuleCall)cSubClassCrossReference_5_0.eContents().get(1);
		
		//Generalization:
		//	'gen' name=STRING?
		//	'super' super=[Class|STRING]
		//	'sub' sub=[Class|STRING];
		@Override public ParserRule getRule() { return rule; }
		
		//'gen' name=STRING? 'super' super=[Class|STRING] 'sub' sub=[Class|STRING]
		public Group getGroup() { return cGroup; }
		
		//'gen'
		public Keyword getGenKeyword_0() { return cGenKeyword_0; }
		
		//name=STRING?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'super'
		public Keyword getSuperKeyword_2() { return cSuperKeyword_2; }
		
		//super=[Class|STRING]
		public Assignment getSuperAssignment_3() { return cSuperAssignment_3; }
		
		//[Class|STRING]
		public CrossReference getSuperClassCrossReference_3_0() { return cSuperClassCrossReference_3_0; }
		
		//STRING
		public RuleCall getSuperClassSTRINGTerminalRuleCall_3_0_1() { return cSuperClassSTRINGTerminalRuleCall_3_0_1; }
		
		//'sub'
		public Keyword getSubKeyword_4() { return cSubKeyword_4; }
		
		//sub=[Class|STRING]
		public Assignment getSubAssignment_5() { return cSubAssignment_5; }
		
		//[Class|STRING]
		public CrossReference getSubClassCrossReference_5_0() { return cSubClassCrossReference_5_0; }
		
		//STRING
		public RuleCall getSubClassSTRINGTerminalRuleCall_5_0_1() { return cSubClassSTRINGTerminalRuleCall_5_0_1; }
	}
	public class DependencyLinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.DependencyLink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDependencyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFromAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFromClassCrossReference_3_0 = (CrossReference)cFromAssignment_3.eContents().get(0);
		private final RuleCall cFromClassSTRINGTerminalRuleCall_3_0_1 = (RuleCall)cFromClassCrossReference_3_0.eContents().get(1);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cToAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cToClassCrossReference_5_0 = (CrossReference)cToAssignment_5.eContents().get(0);
		private final RuleCall cToClassSTRINGTerminalRuleCall_5_0_1 = (RuleCall)cToClassCrossReference_5_0.eContents().get(1);
		
		//DependencyLink:
		//	'dependency' name=STRING?
		//	'from' from=[Class|STRING]
		//	'to' to=[Class|STRING];
		@Override public ParserRule getRule() { return rule; }
		
		//'dependency' name=STRING? 'from' from=[Class|STRING] 'to' to=[Class|STRING]
		public Group getGroup() { return cGroup; }
		
		//'dependency'
		public Keyword getDependencyKeyword_0() { return cDependencyKeyword_0; }
		
		//name=STRING?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//from=[Class|STRING]
		public Assignment getFromAssignment_3() { return cFromAssignment_3; }
		
		//[Class|STRING]
		public CrossReference getFromClassCrossReference_3_0() { return cFromClassCrossReference_3_0; }
		
		//STRING
		public RuleCall getFromClassSTRINGTerminalRuleCall_3_0_1() { return cFromClassSTRINGTerminalRuleCall_3_0_1; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//to=[Class|STRING]
		public Assignment getToAssignment_5() { return cToAssignment_5; }
		
		//[Class|STRING]
		public CrossReference getToClassCrossReference_5_0() { return cToClassCrossReference_5_0; }
		
		//STRING
		public RuleCall getToClassSTRINGTerminalRuleCall_5_0_1() { return cToClassSTRINGTerminalRuleCall_5_0_1; }
	}
	public class GeneralizationSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.GeneralizationSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGensetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1 = (UnorderedGroup)cGroup.eContents().get(1);
		private final Assignment cIsDisjointAssignment_1_0 = (Assignment)cUnorderedGroup_1.eContents().get(0);
		private final Keyword cIsDisjointDisjointKeyword_1_0_0 = (Keyword)cIsDisjointAssignment_1_0.eContents().get(0);
		private final Assignment cIsCompleteAssignment_1_1 = (Assignment)cUnorderedGroup_1.eContents().get(1);
		private final Keyword cIsCompleteCompleteKeyword_1_1_0 = (Keyword)cIsCompleteAssignment_1_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cGeneralizationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGeneralizationsGeneralizationParserRuleCall_3_0 = (RuleCall)cGeneralizationsAssignment_3.eContents().get(0);
		
		//GeneralizationSet:
		//	'genset' (isDisjoint?='disjoint'? & isComplete?='complete'?) name=STRING?
		//	generalizations+=Generalization+;
		@Override public ParserRule getRule() { return rule; }
		
		//'genset' (isDisjoint?='disjoint'? & isComplete?='complete'?) name=STRING? generalizations+=Generalization+
		public Group getGroup() { return cGroup; }
		
		//'genset'
		public Keyword getGensetKeyword_0() { return cGensetKeyword_0; }
		
		//isDisjoint?='disjoint'? & isComplete?='complete'?
		public UnorderedGroup getUnorderedGroup_1() { return cUnorderedGroup_1; }
		
		//isDisjoint?='disjoint'?
		public Assignment getIsDisjointAssignment_1_0() { return cIsDisjointAssignment_1_0; }
		
		//'disjoint'
		public Keyword getIsDisjointDisjointKeyword_1_0_0() { return cIsDisjointDisjointKeyword_1_0_0; }
		
		//isComplete?='complete'?
		public Assignment getIsCompleteAssignment_1_1() { return cIsCompleteAssignment_1_1; }
		
		//'complete'
		public Keyword getIsCompleteCompleteKeyword_1_1_0() { return cIsCompleteCompleteKeyword_1_1_0; }
		
		//name=STRING?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//generalizations+=Generalization+
		public Assignment getGeneralizationsAssignment_3() { return cGeneralizationsAssignment_3; }
		
		//Generalization
		public RuleCall getGeneralizationsGeneralizationParserRuleCall_3_0() { return cGeneralizationsGeneralizationParserRuleCall_3_0; }
	}
	public class StereotypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.Stereotype");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameSTEREOTYPE_STRINGTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Stereotype:
		//	name=STEREOTYPE_STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name=STEREOTYPE_STRING
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//STEREOTYPE_STRING
		public RuleCall getNameSTEREOTYPE_STRINGTerminalRuleCall_0() { return cNameSTEREOTYPE_STRINGTerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final ModelElementElements pModelElement;
	private final ClassElements pClass;
	private final RelationshipElements pRelationship;
	private final AssociationElements pAssociation;
	private final RegularAssociationElements pRegularAssociation;
	private final NaryAssociationElements pNaryAssociation;
	private final AssociationEndElements pAssociationEnd;
	private final MultiplicityElements pMultiplicity;
	private final CARDINALITYElements pCARDINALITY;
	private final GeneralizationElements pGeneralization;
	private final DependencyLinkElements pDependencyLink;
	private final GeneralizationSetElements pGeneralizationSet;
	private final StereotypeElements pStereotype;
	private final TerminalRule tSTEREOTYPE_STRING;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public OntoUMLArchiveGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pModelElement = new ModelElementElements();
		this.pClass = new ClassElements();
		this.pRelationship = new RelationshipElements();
		this.pAssociation = new AssociationElements();
		this.pRegularAssociation = new RegularAssociationElements();
		this.pNaryAssociation = new NaryAssociationElements();
		this.pAssociationEnd = new AssociationEndElements();
		this.pMultiplicity = new MultiplicityElements();
		this.pCARDINALITY = new CARDINALITYElements();
		this.pGeneralization = new GeneralizationElements();
		this.pDependencyLink = new DependencyLinkElements();
		this.pGeneralizationSet = new GeneralizationSetElements();
		this.pStereotype = new StereotypeElements();
		this.tSTEREOTYPE_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "it.unibz.inf.ontouml.archive.OntoUMLArchive.STEREOTYPE_STRING");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("it.unibz.inf.ontouml.archive.OntoUMLArchive".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	elments+=ModelElement*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//ModelElement:
	//	(Class | Relationship | GeneralizationSet) ';';
	public ModelElementElements getModelElementAccess() {
		return pModelElement;
	}
	
	public ParserRule getModelElementRule() {
		return getModelElementAccess().getRule();
	}
	
	//Class:
	//	isAbstract?='abstract'? 'class' name=STRING
	//	stereotype=Stereotype?;
	public ClassElements getClassAccess() {
		return pClass;
	}
	
	public ParserRule getClassRule() {
		return getClassAccess().getRule();
	}
	
	//Relationship:
	//	Association | Generalization | DependencyLink;
	public RelationshipElements getRelationshipAccess() {
		return pRelationship;
	}
	
	public ParserRule getRelationshipRule() {
		return getRelationshipAccess().getRule();
	}
	
	//Association:
	//	RegularAssociation | NaryAssociation;
	public AssociationElements getAssociationAccess() {
		return pAssociation;
	}
	
	public ParserRule getAssociationRule() {
		return getAssociationAccess().getRule();
	}
	
	//RegularAssociation:
	//	'association' name=STRING?
	//	stereotype=Stereotype?
	//	'from' from=AssociationEnd
	//	'to' to=AssociationEnd;
	public RegularAssociationElements getRegularAssociationAccess() {
		return pRegularAssociation;
	}
	
	public ParserRule getRegularAssociationRule() {
		return getRegularAssociationAccess().getRule();
	}
	
	//NaryAssociation:
	//	'association' name=STRING?
	//	stereotype=Stereotype? ('end' ends+=AssociationEnd) ('end' ends+=AssociationEnd) ('end' ends+=AssociationEnd)+;
	public NaryAssociationElements getNaryAssociationAccess() {
		return pNaryAssociation;
	}
	
	public ParserRule getNaryAssociationRule() {
		return getNaryAssociationAccess().getRule();
	}
	
	//AssociationEnd:
	//	name=STRING?
	//	multiplicity=Multiplicity
	//	':' endType=[Class|STRING];
	public AssociationEndElements getAssociationEndAccess() {
		return pAssociationEnd;
	}
	
	public ParserRule getAssociationEndRule() {
		return getAssociationEndAccess().getRule();
	}
	
	//Multiplicity:
	//	'[' lower=CARDINALITY '..' upper=CARDINALITY ']';
	public MultiplicityElements getMultiplicityAccess() {
		return pMultiplicity;
	}
	
	public ParserRule getMultiplicityRule() {
		return getMultiplicityAccess().getRule();
	}
	
	//CARDINALITY ecore::EInt:
	//	'*' | INT;
	public CARDINALITYElements getCARDINALITYAccess() {
		return pCARDINALITY;
	}
	
	public ParserRule getCARDINALITYRule() {
		return getCARDINALITYAccess().getRule();
	}
	
	//Generalization:
	//	'gen' name=STRING?
	//	'super' super=[Class|STRING]
	//	'sub' sub=[Class|STRING];
	public GeneralizationElements getGeneralizationAccess() {
		return pGeneralization;
	}
	
	public ParserRule getGeneralizationRule() {
		return getGeneralizationAccess().getRule();
	}
	
	//DependencyLink:
	//	'dependency' name=STRING?
	//	'from' from=[Class|STRING]
	//	'to' to=[Class|STRING];
	public DependencyLinkElements getDependencyLinkAccess() {
		return pDependencyLink;
	}
	
	public ParserRule getDependencyLinkRule() {
		return getDependencyLinkAccess().getRule();
	}
	
	//GeneralizationSet:
	//	'genset' (isDisjoint?='disjoint'? & isComplete?='complete'?) name=STRING?
	//	generalizations+=Generalization+;
	public GeneralizationSetElements getGeneralizationSetAccess() {
		return pGeneralizationSet;
	}
	
	public ParserRule getGeneralizationSetRule() {
		return getGeneralizationSetAccess().getRule();
	}
	
	//Stereotype:
	//	name=STEREOTYPE_STRING;
	public StereotypeElements getStereotypeAccess() {
		return pStereotype;
	}
	
	public ParserRule getStereotypeRule() {
		return getStereotypeAccess().getRule();
	}
	
	//terminal STEREOTYPE_STRING:
	//	"<<" ('a'..'z' | 'A'..'Z' | ' ') ('a'..'z' | 'A'..'Z' | ' ')* ">>";
	public TerminalRule getSTEREOTYPE_STRINGRule() {
		return tSTEREOTYPE_STRING;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
