package SlidingWindow;

import org.junit.Test;

public class MInimumWindowSize {

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
	 * 6)pseudocode
	 * get the array and traverse through till the target and sum it up and keep that as a currentsum
	 * for next window create a another for loop from target to till n.length
	 * find the firstfindow sum and keep that as a currentsum
	 * to move to the next window decrement the i from the sum and add the next element in the sum
	 * 
	 */

		//@Test
		public void test1()
		{
			int[] nums= {4,2,2,7,8,1,2,8,10};
			int target =3;
			System.out.println(minimumWindowSize(nums,target));
		}
		@Test
		public void test2()
		{
			int[] nums= {1,4,4};
			int target =4;
			System.out.println(minimumWindowSize(nums,target));
		}
		//@Test
		public void test3()
		{
			int[] nums= {1,1,1,1,1,1,1,1};
			int target =6;
			//System.out.println(returnmaximumsum(nums,target));
		}

/*
 * 
 * 
 * 
 * 
 */
		public int minimumWindowSize(int[] nums,int target)
		{
			int startingindex=0, endingindex=0;
			int minimumwindowsize = Integer.MAX_VALUE; int currentsum=0;
			for(endingindex=0;endingindex<nums.length;endingindex++)
			{
				currentsum=currentsum+nums[endingindex];
				while(currentsum>=target)
				{
					minimumwindowsize= Math.min(minimumwindowsize, endingindex-startingindex+1);
					currentsum=currentsum-nums[startingindex];
					startingindex++;
				}
			}
			
			return minimumwindowsize;
		}
}
