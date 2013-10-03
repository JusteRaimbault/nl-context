/**
 * 
 */
package morpho;

/**
 * @author Raimbault Juste <br/> <a href="mailto:juste.raimbault@polytechnique.edu">juste.raimbault@polytechnique.edu</a>
 *
 */
public interface MorphoOperation {

	public Data process(Data image,BinaryKernelData kernel);
	
}
