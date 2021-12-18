package hackerrankpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MinimumDifference {
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
			int[] nums = {1,3,4,2,6,5};
			
			
		}
		@Test
		public void test2() {
			
			int[] nums = {1,7,3,4,2,6,5};
			getMinimumDifference(nums);
		}

		
		public int getMinimumDifference(int[] nums)
		{
			Arrays.sort(nums);
			List<Integer> m = new ArrayList<Integer>();
			int k = nums.length/2; int sum=0;
			int left=0; int right = nums.length-1;
			int set1=0; int set2=0;
			
			while(left<=right)
			{
				m.add(nums[left]);
				m.add(nums[right]);
				left++;
				right--;
				
			}
			for(int i=0;i < nums.length;i++)
			{
				 if(i<=k)
				 {
					 set1=set1+m.get(i);
				 }
				 else {
					 set2=set2+m.get(i);
				 }
			}
			
			
			
			return Math.abs(set1-set2);
		}

}
