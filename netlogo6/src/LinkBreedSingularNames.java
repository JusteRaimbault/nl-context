/**
 * 
 */

/**
 * @author Raimbault Juste <br/> <a href="mailto:juste.raimbault@polytechnique.edu">juste.raimbault@polytechnique.edu</a>
 *
 */
import org.nlogo.agent.TreeAgentSet;
import org.nlogo.api.*;
import org.nlogo.agent.World;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

import java.util.Map;


public class LinkBreedSingularNames implements Reporter {
  // take one number as input, report a list
  
	
	public Syntax getSyntax() {
		return SyntaxJ.reporterSyntax(new int[] {Syntax.NumberType()},Syntax.ListType());
	}
  
	
	public Object report(Argument args[], Context context) throws ExtensionException {
	    // create a NetLogo list for the result
	    LogoListBuilder list = new LogoListBuilder();
	    
	    Map<String,TreeAgentSet> breeds = ((org.nlogo.agent.World)context.getAgent().world()).linkBreeds();
	    for(String s:breeds.keySet()){
	    	list.add(((org.nlogo.agent.World)context.getAgent().world()).getLinkBreedSingular((org.nlogo.agent.AgentSet)breeds.get(s)));
	    }
	    return list.toLogoList();
  }
  
}
