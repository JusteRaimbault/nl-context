/**
 * 
 */

/**
 * @author Raimbault Juste <br/> <a href="mailto:juste.raimbault@polytechnique.edu">juste.raimbault@polytechnique.edu</a>
 *
 */
import org.nlogo.agent.TreeAgentSet;
import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;
import org.nlogo.agent.World;

import java.util.Map;
import java.util.function.Consumer;


public class BreedSingularNames implements Reporter {
  // take one number as input, report a list
  
	
	public Syntax getSyntax() {
		return SyntaxJ.reporterSyntax(new int[] {Syntax.NumberType()},Syntax.ListType());
	}


	public Object report(Argument args[], Context context) throws ExtensionException {
	    // create a NetLogo list for the result
	    LogoListBuilder list = new LogoListBuilder();

	    World world = (org.nlogo.agent.World) context.getAgent().world();

	    Map<String,TreeAgentSet> breeds = world.breeds();
	    for(String s:breeds.keySet()){
	    	// report the breed agentsets ?
	        list.add(world.getBreedSingular(breeds.get(s)));
	    }
	    return list.toLogoList();
  }
  
}
