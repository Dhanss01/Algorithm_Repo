package algo_TwoPointer;

import org.junit.Test;

//Given an array of integers sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
//Input: [-8,-3,4,3,10]
//Output: [9,9,16,64,100]


public class SquareofEachnumberinArray {
	
	@Test
	public void eg1()
	{
		int[] nums= {1,2,3,4};			
		squarenondecreasingorder(nums);
	}
	

	
	
	public int[] squarenondecreasingorder(int[] nums) {
       
        //math.abs
        int [] ans = new int[nums.length];     
        for (int i = 0; i < nums.length-1; i++)
        {
        	   for (int j = i + 1; j < nums.length; j++) 
        	   {
        	      int temp = 0;
        	      if (nums[i] > nums[j]) 
        	      {
        	    	  temp = nums[i];
        	          nums[i] = nums[j];
        	          nums[j] = temp;

        	     }

        	   }
        	   ans[i]=nums[i]*nums[i];
          	 }
        System.out.println(nums);
        return ans;
    }
		
}
