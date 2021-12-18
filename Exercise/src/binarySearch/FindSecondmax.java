package binarySearch;

import org.junit.Test;

public class FindSecondmax {

	@Test
	public void test1()
	{
		int[] nums = {2,4,1,7,2,9,0};
		System.out.println(returnsecondmax(nums));
		
	}
	
	public int returnsecondmax(int[] nums)
	{
		int  firstmax = 0; 
		int secondmax =0;
	        for (int i = 0; i < nums.length; i++) {
	           
	            if (nums[i] > firstmax) {
	                secondmax = firstmax;
	                firstmax = nums[i];
	            }
	 
	            
	            else if (nums[i] > secondmax && nums[i] != firstmax)
	                secondmax = nums[i];
	        }	 
	           
	  return secondmax;
	}
}
