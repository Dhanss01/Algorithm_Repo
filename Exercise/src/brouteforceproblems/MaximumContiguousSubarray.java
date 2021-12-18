package brouteforceproblems;

import org.junit.Test;

public class MaximumContiguousSubarray {
	/*
	 * 1) Did I understand the problem? 
	 * 
	 * 2) What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? 
	 * 
	 * Input- int[] nums =
	 *  Output -int[] nums =
	 *  Constraint- 
	 * 
	 * 3) Test data set
	 * 
	 * Positive- : s =[0,0,1,1,2,2]
	     Negative -: s=[0]
	      Edge -: s=[]
	 * 
	 * 
	 * 4) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate? 
	 * 4) Ask for hint if don't know to solve? 
	 * 
	 * 5) Do i know any alternate solution? 
	 *    -> No, Solve with the known solution
	 *    
	 *    Pseudo code
	 */

		
		
		@Test
		public void test1() {
			int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
			System.out.println(Maximumsubarrayofthenums(nums));
			
		}
		@Test
		public void test2() {
			
			
		}
		
		/*Kadanes algorithm
		 *iterate the array and find the sum of the array for each i values
		 *and get the maximumsum for each iterations
		 *when negative integers occurs in nums[i] because of which sum values falls in negative then max sum value to =0
		 *start iterating from next value from array and continue to get the maximum sub array sum
		 *
		 */
		
		public int Maximumsubarrayofthenums(int[] nums)
		{
			int sum=0;
			int maximumsum=0;
			
			for(int i=0; i<nums.length;i++)
			{
				sum=sum+nums[i];
				maximumsum=Math.max(sum, maximumsum);
				if(sum<0)
					{
					 sum= 0;					 
					}
				else 
					continue;
			}
			return maximumsum;
		}
}
