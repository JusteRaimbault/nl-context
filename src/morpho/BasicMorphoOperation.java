/**
 * 
 */
package morpho;

/**
 * @author Raimbault Juste <br/> <a href="mailto:juste.raimbault@polytechnique.edu">juste.raimbault@polytechnique.edu</a>
 *
 */
public abstract class BasicMorphoOperation implements MorphoOperation {

	protected BinaryKernelData defaultKernel;
	
	public void setDefaultKernel(Data kernel){defaultKernel = (BinaryKernelData) kernel;}
	
	@Override
	public abstract Data process(Data image);

	@Override
	public abstract Data process(Data image, BinaryKernelData kernel);


}
