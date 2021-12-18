package algo_TwoPointer;

import java.util.Arrays;

import org.junit.Test;

public class PositivetoEvenNegativetoOdd {
	
	//Problem
		/* array of nums, contains equal no of positve and negative, rearrange in an order +ve and then -ve in alternate positions.
	Constraint: cannot use extra space
	eg : int[] input = {12, -90, -100, 15, 98, 99, -56, -2};
			   expected output {12, -90, 15, -100, 98,-56,99,-2}
		 */
		
		
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
			int[] nums=  { 12, -90, -100, 15, 98, 99, -56, -2 };
			movepostivetoevennegativetodd(nums);
			
		}
		@Test
		public void test2()
		{
			int[] nums=  { -100,-50,-30};
			movepostivetoevennegativetodd(nums);
			
			
		}
		@Test
		public void test3()
		{
			int[] nums=  { 25, 90, 100, -40, -50, -60};
			movepostivetoevennegativetodd(nums);			
			
		}
		@Test
		public void test4()
		{
			int[] nums=  {};
			movepostivetoevennegativetodd(nums);			
			
		}
/*we need to have positive in even and negative in odd positions
 * use two pointer in same directional right is for even, left is for odd
 * whenever left >0  then keep that element and increment by 2
 * whenever right <0 keep that element and increment by 2
 * if both [left]<0&&[right]>0 increment both left and right by 2
 * when left is negative and right is negative, increment the left by 2 alone
 * when left is positive and right is positive increment the left by 2 alone 
 */
		public int[] movepostivetoevennegativetodd(int[] nums)
		{
			int left= 0; int right = 1;
			
			while(left < nums.length - 1 && right < nums.length)
			{
				 if(nums[left]>0)
				{
					left=left+2;
				}
				else if(nums[right]<0)
				{
					right=right+2;
				}
				else if(nums[left]<0&&nums[right]>0)
				{
					int temp =nums[left];
					nums[left]=nums[right];
					nums[right]=temp;
					left=left+2;
					right=right+2;
					
				}
				
				else if(nums[left]<0 && nums[right]<0 ) //when left is negative and right is negative, increment the left by 2 alone
				{
					right=right+2;
				}
				else if(nums[right]>0 && nums[left]>0) // when left is positive and right is positive increment the left by 2 alone
				{				
				left=left+2;
				}
				
			}	
			
			System.out.println(Arrays.toString(nums));
			return nums;
			
		}
		

}
