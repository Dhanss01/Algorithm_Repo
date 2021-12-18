package hackerrankpractice;

import org.junit.Test;

public class WaterTrapping {

	@Test
	public void test1()
	{
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
	}
	
	/*nitialize the leftmaxarrray and rightmax array
	 * left should start with index 0, right should start with index n-1;
	 *get the max of leftmax with the previous  leftmax
	 *get the max of the rightmax witht he previous rightmax
	 *based on the left max and right max get the min value 
	 * get the minimum value and subract with each building 
	 * there you willget numberof places where ur can trap ur water 
	 * 
	 * 
	 * 
	 * 
	 *///0,1,0,2,1,0,1,3,2,1,2,1
	public int trap(int[] height) {
		int[] leftmax= new int[height.length];
		int[] rightmax= new int[height.length];
		int watertrapped=0;
		for(int i =0;i< height.length;i++)
		{
			if(i==0)
			{
				leftmax[0]=height[0];
				rightmax[height.length-1]=height[height.length-1];
			}
			else {
				
				leftmax[i]=Math.max(height[i], leftmax[i-1]);
				rightmax[height.length-i-1]=Math.max(height[i], rightmax[height.length-i-1]);
			}
			
		}
		for(int j=0;j<height.length;j++)
		{
			watertrapped= watertrapped+(Math.min(leftmax[j], rightmax[j] )-height[j]);
		}
		
		return watertrapped;
	        
    }
}
