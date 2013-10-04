/**
 * 
 */
package morpho;

import java.util.LinkedList;

/**
 * @author Raimbault Juste <br/> <a href="mailto:juste.raimbault@polytechnique.edu">juste.raimbault@polytechnique.edu</a>
 *
 */
public class Erosion extends BasicMorphoOperation implements MorphoOperation {

	
	
	@Override
	public Data process(Data image) {
		return process(image,defaultKernel);
	}
	
	
	@Override
	public Data process(Data image, BinaryKernelData kernel) {
		//clone original image
		Data res = new BinaryRasterData(image.data.clone());
		
		boolean[][] data = res.data;
		
		/*
		 * let try brutal version in O(n*w)
		 * Kernel is supposed to be anchored in center
		 * Will generally be of even size
		 * 
		 */
		
		//extract positive points form Kernel matrix
		LinkedList<Point> news = new LinkedList<Point>();
		int cx = (int) (kernel.data.length / 2),cy = (int) (kernel.data[0].length / 2);
		for(int i=0;i<kernel.data.length;i++){
			for(int j=0;j<kernel.data[0].length;j++){
				if(kernel.data[i][j]){news.add(new Point(cx - i,cy - j));}
			}
		}
		
		
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[0].length;j++){
				
				
			}
		}
		
		
		return res;
	}
	

}
