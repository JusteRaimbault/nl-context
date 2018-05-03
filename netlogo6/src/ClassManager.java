/**
 * 
 */

import org.nlogo.api.*;

public class ClassManager extends DefaultClassManager {
	
	
    public void load(PrimitiveManager primitiveManager) {
       primitiveManager.addPrimitive("breed-names", new BreedNames());
       //primitiveManager.addPrimitive("breed-singular-names", new BreedSingularNames());
       primitiveManager.addPrimitive("link-breed-names", new LinkBreedNames());
       //primitiveManager.addPrimitive("link-breed-singular-names", new LinkBreedSingularNames());
	}
  
  
}
