/**
 * 
 */
package morpho;

/**
 * @author Raimbault Juste <br/> <a href="mailto:juste.raimbault@polytechnique.edu">juste.raimbault@polytechnique.edu</a>
 *
 */
public interface MorphoOperation {

	/**
	 * Processes input image with default Kernel.
	 * 
	 * @param image
	 * @return
	 */
	public Data process(Data image);
	
	
	/**
	 * Processes input image with given Kernel
	 * 
	 * @param image
	 * @param kernel
	 * @return
	 */
	public Data process(Data image,BinaryKernelData kernel);
	
}
