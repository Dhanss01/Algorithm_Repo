package binarySearch;

import org.junit.Test;

public class FindtheOnes {
	/*1) Did I understand the problem? 
	 * 
	 * 2)What is the input(s)? What is the expected output?
	 * 
	 * 3)Test data set
	 * Positive : Negative:  Edge:
	 * 
	 * 4) how to solve it?
	 * 
	 * 5)Alternate approach
	 * 
	 * 6)pseudo code
	 *
	 */

	
	@Test
	public void test1()
	{
		int[] nums = {0,0,1,1,1};
		System.out.println(numberofones(nums));
		
	}
	@Test
	public void test2()
	{
		int[] nums = {0,0};
		System.out.println(numberofones(nums));
		
	}
	@Test
	public void test3()
	{
		int[] nums = {1};
		System.out.println(numberofones(nums));
		
	}
	@Test
	public void test4()
	{
		int[] nums = {};
		System.out.println(numberofones(nums));
		
	}
	@Test
	public void test5()
	{
		int[] nums = {0,1,1,1,1};
		System.out.println(numberofones(nums));
		
	}
	
	
	public int numberofones(int[] nums)
	{
		int low =0, high = nums.length;
		int index=0;
		
		if(nums.length==0)
		{
			return 0;
		}
		
		while(low<=high)
		{
			int mid = (low+high)/2;
		   if(nums[mid]==1)
		   {
			   index=nums.length-mid;
		   }
		   if(nums[mid]<1)
		   {
			   low=mid+1;
		   }
		   else {
		   high=mid-1;
		   }
		  
		}
			
		
		return index;
		
	}

}
