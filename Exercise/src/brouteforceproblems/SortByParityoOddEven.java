package brouteforceproblems;

import org.junit.Test;

public class SortByParityoOddEven {
	
	/*
	 * Sort Array By Parity IIGiven an array of integers nums, half of the integers in nums are odd, and the other half are even.

		Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
		
		Return any answer array that satisfies this condition.


	 * 
	 *//*
	 * 1) Did I understand the problem? 
	 * 
	 * 2) What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? 
	 * 
	 * Input- int[] nums = [4,2,5,7];
	 *  Output -int[] nums =[4,7,2,5]
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
			int[] nums = {4,7,2,5};
			System.out.println(evenoddparitysum(nums));
			
		}
		@Test
		public void test2() {
			
			int[] nums = {1,2,3,4,5,6};
			System.out.println(evenoddparitysum(nums));
		}

	/*initialize new index value, create an ouptput array
	 * iterate each value in index 
	 * when nums[i] is even  assign that vaue in inex postion and inccrement index by 2 
	 * add the all even values to the output array
	 * 	now when nums[i] is odd 
	 * 	 */
		
 public int[] evenoddparitysum(int[] nums)
 {	 
	 int[] output = new int[nums.length];
	 int index=0;
	 for(int i : nums)
	 { 
		 if(i%2==0)
		 {
			 output[index]=i;
			 index=index+2;
		 }
		 
	 }
	 index=1;
	 for(int i : nums)
	 {
		 if(i%2!=0)
		 {
			 output[index]=i;
			 index=index+2;
		 }
	 }
	return output ;
 }

}
