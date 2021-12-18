package brouteforceproblems;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class RemovetheDuplicatesfromSortedarray {
	
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
			
			int[] nums = {1,2,3,5,5,5,5,8};
			removeduplicatesfromsortedsrray(nums);
		}
		
		//@Test
		public void test2() {
			
			
		}

		
		private void removeduplicatesfromsortedsrray(int[] nums)
		{ int i =0;
		 for(int j =0; j<nums.length-1;j++)
		 {
			 if(nums[j]!=nums[j+1])
			 {
				 nums[i]=nums[j];
				System.out.println(nums[i]);
			 }
			 
			 i++;
		 }
		 
		System.out.println(nums[i]);
			// TODO Auto-generated method stub
			  
		}
}
