/**
 * 
 */
package context;

/**
 * @author Raimbault Juste <br/> <a href="mailto:juste.raimbault@polytechnique.edu">juste.raimbault@polytechnique.edu</a>
 *
 */
import org.nlogo.api.*;
import org.nlogo.agent.World;

import java.util.Map;


public class LinkBreedNames extends DefaultReporter {
  // take one number as input, report a list
  
	
	public Syntax getSyntax() {
		return Syntax.reporterSyntax(Syntax.ListType());
	}
  
	
	public Object report(Argument args[], Context context) throws ExtensionException {
	    // create a NetLogo list for the result
	    LogoListBuilder list = new LogoListBuilder();
	    
	    Map<String,Object> breeds = ((org.nlogo.agent.World)context.getAgent().world()).getLinkBreeds();
	    for(String s:breeds.keySet()){
	    	list.add(s);
	    }
	    return list.toLogoList();
  }
  
}
