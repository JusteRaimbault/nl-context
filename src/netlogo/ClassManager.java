/**
 * 
 */
package netlogo;

import org.nlogo.api.*;

import test.TestReporter;

public class ClassManager extends DefaultClassManager {
	
	
    public void load(PrimitiveManager primitiveManager) {
       primitiveManager.addPrimitive("first-n-integers", new TestReporter());
       primitiveManager.addPrimitive("int-wrapper", new ReportWrapper());
       primitiveManager.addPrimitive("sum", new Sum());

	}
  
  
}
