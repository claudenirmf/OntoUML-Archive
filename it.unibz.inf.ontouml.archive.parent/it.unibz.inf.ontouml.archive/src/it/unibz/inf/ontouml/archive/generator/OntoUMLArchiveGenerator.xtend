/*
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.archive.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.google.inject.Inject
import it.unibz.inf.ontouml.archive.OntoUMLArchiveUtils
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Model
import it.unibz.inf.ontouml.archive.ontoUMLArchive.ModelElement
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Class
import it.unibz.inf.ontouml.archive.ontoUMLArchive.Generalization
import it.unibz.inf.ontouml.archive.ontoUMLArchive.BinaryAssociation
import it.unibz.inf.ontouml.archive.ontoUMLArchive.AggregationKind
import it.unibz.inf.ontouml.archive.ontoUMLArchive.DirectedAssociation
import it.unibz.inf.ontouml.archive.ontoUMLArchive.UndirectedAssociation

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class OntoUMLArchiveGenerator extends AbstractGenerator {
	
	@Inject extension OntoUMLArchiveUtils

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		val modelName = "full_model.txt"
		fsa.generateFile(modelName, 
				"@startuml\n\n"+
'''«FOR e : (resource.contents.get(0) as Model).modelElements»
«e.toPlantUML»
«ENDFOR»'''+"\n@enduml")
				
	}
	
	def String toPlantUML(ModelElement e) {
		switch(e) {
			case e instanceof Class : return (e as Class).classToPlantUML()
			case e instanceof Generalization : return (e as Generalization).generalizationToPlantUML()
			case e instanceof DirectedAssociation: return (e as DirectedAssociation).directedAssociationToPlantUML()
			case e instanceof UndirectedAssociation: return (e as UndirectedAssociation).undirectedAssociationToPlantUML()
		}
	}
	
	def String classToPlantUML(Class c) {
		'''class «IF c.isAbstract»abstract «ENDIF»«c.name.replaceAll(" ","_")» «FOR str:c.stereotypes»<<«str»>>«ENDFOR»'''
	}
	
	def String generalizationToPlantUML(Generalization g) {
		'''«g.getSuper.name.replaceAll(" ","_")» <|-- «g.sub.name.replaceAll(" ","_")»'''
	}
	
	def String directedAssociationToPlantUML(DirectedAssociation a) {
		val StringBuilder str = new StringBuilder
		str.append(a.from.endType.name.replaceAll(" ","_"))
		
		if(a.from.multiplicity!==null) {
			str.append(" \""+a.from.multiplicity.lower+"..")
			if(a.from.multiplicity.upper==-1)
				str.append("*\"")
			else
				str.append(a.from.multiplicity.upper+"\"")
		}
		
		if(a.from.aggregationKind==AggregationKind.COMPOSITE)
			str.append(" *-")
		else if(a.from.aggregationKind==AggregationKind.SHARED)
			str.append(" o-")
		else
			str.append(" -")
		
		if(a.to.aggregationKind==AggregationKind.COMPOSITE)
			str.append("-* ")
		else if(a.to.aggregationKind==AggregationKind.SHARED)
			str.append("-o ")
		else
			str.append("- ")
		
		if(a.to.multiplicity!==null) {
			str.append(" \""+a.to.multiplicity.lower+"..")
			if(a.to.multiplicity.upper==-1)
				str.append("*\"")
			else
				str.append(a.to.multiplicity.upper+"\"")
		}
		
		str.append(a.to.endType.name.replaceAll(" ","_"))
		
		if(a.name!==null && !a.name.empty && a.name!="unnamed")
			str.append(": "+a.name+" >")
		return str.toString
	}
	
	def String undirectedAssociationToPlantUML(UndirectedAssociation a) {
		val StringBuilder str = new StringBuilder
		str.append(a.endA.endType.name.replaceAll(" ","_"))
		
		if(a.endA.multiplicity!==null) {
			str.append(" \""+a.endA.multiplicity.lower+"..")
			if(a.endA.multiplicity.upper==-1)
				str.append("*\"")
			else
				str.append(a.endA.multiplicity.upper+"\"")
		}
		
		if(a.endA.aggregationKind==AggregationKind.COMPOSITE)
			str.append(" *-")
		else if(a.endA.aggregationKind==AggregationKind.SHARED)
			str.append(" o-")
		else
			str.append(" -")
		
		if(a.endB.aggregationKind==AggregationKind.COMPOSITE)
			str.append("-* ")
		else if(a.endB.aggregationKind==AggregationKind.SHARED)
			str.append("-o ")
		else
			str.append("- ")
		
		if(a.endB.multiplicity!==null) {
			str.append(" \""+a.endB.multiplicity.lower+"..")
			if(a.endB.multiplicity.upper==-1)
				str.append("*\"")
			else
				str.append(a.endB.multiplicity.upper+"\"")
		}
		
		str.append(a.endB.endType.name.replaceAll(" ","_"))
		
		if(a.name!==null && !a.name.empty && a.name!="unnamed")
			str.append(": "+a.name)
		return str.toString
	}
	
}
