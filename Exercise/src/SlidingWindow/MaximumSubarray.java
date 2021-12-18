package SlidingWindow;

import org.junit.Test;

public class MaximumSubarray {
	/*Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test1()
	{
		int[] nums= {2,3,1,2,4,3};
		int target =7;
		System.out.println(mmaximumsubarrayyusingkadanes(nums));
	}
	@Test
	public void test2()
	{
		int[] nums= {1,4,4};
		int target =4;
		System.out.println(mmaximumsubarrayyusingkadanes(nums));
	}
	@Test
	public void test3()
	{
		int[] nums= {1,1,1,1,1,1,1,1};
		int target =11;
		System.out.println(mmaximumsubarrayyusingkadanes(nums));
	}
	
	/*
	 *left = 0 , rigth =1
	 *sum both left and right till it meets the target
	 *if sum is greater than to target the increment
	 * 
	 * 
	 */
	
	public int mimsubarray(int[] num, int target)
	{
		
		int sum =0;
				int[] output = new int[num.length];
				int len=Integer.MAX_VALUE;
				int currentlen=0;
				int index=0;
	 for(int i = 0; i<num.length;i++)
	 {
		 if(num[i]==target)
		 {
			 return 1;
		 }
		 sum= num[i];
		 for(int j = i+1; j<num.length;j++)
		 {
			 
			 sum+=num[j];
			 if(sum>=target)
			 {
				 currentlen = j-i+1;
				 break;
			 }
		 }
		 len=Math.min(len, currentlen);
			
	 }
	 return len;
	}
	
	public void maximumsubarrayofgiventarget(int[] num, int target)
	{
		int left = 0 , right =1;
		int minlength=Integer.MAX_VALUE; int sumlength=0;
		int currentsum = num[left]; 
		 	
		while (right < num.length)
		{
		   
			
			while(currentsum+num[right] >=target)
			{
				sumlength= right-left+1;
			    left++;
			    right++;
			}
			//int currentsums =num[left]+num[right];
				right++;
			
			 
			
			
				
		}
		minlength=Math.min(minlength, sumlength);
		System.out.println(minlength);
		
	}
	
	
	
	
	// creating subbarraysum  and adding i elements from array
	//creating maxsum as 0;
	// if subbarraysum is greaterthan to maxsum then assign that value to maxsum
	// if sumarraysum is lessthan to zero then assign 0 as subarraysum , then iterrate from next sub arraya and add new subbarray in to subbarraysum
	public int mmaximumsubarrayyusingkadanes(int[] num)
	{
		int subarraysum=0, maxarraysum =0;
		for(int i=0;i<num.length;i++)
		{
		subarraysum= subarraysum+num[i];
		if(subarraysum > maxarraysum)
		{
			maxarraysum =subarraysum;   //maxarraysum = Math.max(subarraysum,maxarraysum);
		}
		if(subarraysum<0)
		{
			subarraysum=0;
		}
	   }
		return maxarraysum;
	}
	

}
