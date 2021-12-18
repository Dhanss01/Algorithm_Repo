package brouteforceproblems;

import org.junit.Test;

public class PrintduplicatesUnsortedarray {
	
	
	@Test
	public void test1()
	{
		
		
	}

	
	 public void printingnumbers(float[] nums)
	 {
		 int[] results = new int[nums.length-1];
		 for(int j=0; j<nums.length;j++)
		 {
		 for(int i =1; i<nums.length;i++)
		 {
			 if(nums[i]== nums[j])
			 {
				 results[j]=results[j+1];
				 
			 }
			  
			 System.out.println(Math.abs(nums[i]));
		 }
		 }
		 
	 }
}
