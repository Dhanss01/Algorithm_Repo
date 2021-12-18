package brouteforceproblems;

import org.junit.Test;

public class SubarraySum {
	/*Given an int array [1,4,20,3,10,5] and target sum 33.
If target subarray sum is found, return true else false
Time : 20 Minutes 
- Write another 2 test data (edge and neg)
- Pseudo Code for Optimised Solution
- Code, Debug
- Time everything 
- Do it yourself !! 
	 * 
	 * 
	 * 
	 * 
	 */
	
	//Pseudo Code for Optimised Solution
	/* Iterate to the array with the starting index as 0 and endinindex as 0
	 * slide the ending index and find the sum if sum is less than target and increment the endinginindex
	 * when sum is equal to the target get the subarray as windowend-start and return true
	 * when sum is greater than the target then windowend -windowstart
	 * 
	 * 3 and half mins
	 * 14 mins to solve and debug 
	 * 
	 */
	@Test
	public void test1() {
		int[] nums = {1,4,20,3,10,5};
		int target =33;
		System.out.println(Subarray(nums,target));
		
		
	}
	@Test
	public void test2() {
		
		int[] nums = {1,4,20,10,5};
		int target =33;
		System.out.println(Subarray(nums,target));
	}
	@Test
	public void test3() {
		
		int[] nums = {1,3,5,5};
		int target =14;
		System.out.println(Subarray(nums,target));
	}

	
	public boolean Subarray(int[] nums, int k )
	{
		int start=0, end =0, currentsum=0;
		int windowlength=Integer.MAX_VALUE;
		
		for(end=0; end<nums.length;end++)
		{
			currentsum= currentsum+nums[end];
			
			if(currentsum==k)
			{
				
				return true;
				//windowlength = Math.min(windowlength, start-end+1);
			}
			else if(currentsum > k)
			{
			currentsum=currentsum-nums[start];
			start++;
			}
		
		}		
		
		return false;
	}

}
