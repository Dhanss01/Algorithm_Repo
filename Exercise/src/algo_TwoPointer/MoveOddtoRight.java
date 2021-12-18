package algo_TwoPointer;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public
/*
 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
 * provide more detail with example(s) -> If yes, go to next step !!
 * 
 * Yes
 * 
 * What is the input(s)? What is the expected output? Do I have constraints to
 * solve the problem? Do I have all informations to go to next step!! How big is
 * your test data set will be?
 * 
 * Input- int[] nums = {2,0,2,1,1,0}
 *  Output -int[] nums = {0,0,1,1,2,2}
 *  Constraint- should not remove the space and special characters
 * 
 * 2) Test data set
 * 
 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
 * interviewer if the data set is fine by his/her assumptions - Comparision
 * between
 * 
 * Positive- : s =[0,0,1,1,2,2]
     Negative -: s=[0]
      Edge -: s=[]
 * 
 * 
 * 3) Do I know how to solve it?
 * 
 * Yes - great, is there an alternate? 
 * 4) Ask for hint if don't know to solve? 
 * 
 * 5) Do i know any alternate solution? 
 *    -> No, Solve with the known solution
 *    
 * 6) If alternate solution found -> Find the O notation 
 *     -> Explain either or the best one depends on time
 *     -> Approach 01 : Starts with worst(Brute force)
 *     -> Approach 02: Write the options and benefits of it 
 *     -> Always start from worst to best
 *     
 * 7) Proceed with pseudocode 
 * 
 * 8) Implement code in editor
 * 
 * 9) Test against data set
 * 
 * 10) Debug if it fails    
 */

class MoveOddtoRight {
	
	
	@Test
	public void example1()
	{
		
		int[] nums = {2,4,1,6,3,8,7};
			
	     System.out.println(movezerotolast(nums));
		
	}
	
	
	//twopointer
	
	public int[] MoveoddtoEndandEventoLeft(int[] nums)
	{
		
		int left=0;
		int right =nums.length; int temp;
		while(left<right)
		{
			if(nums[left]%2!=0&&nums[right]%2==0)
			{
				temp = nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left=left+1;
				right=right-1;
				
				
			}
			else if(nums[right]%2!=0)
			{
				right=right-1;
			}
			else if(nums[left]%2==0)
			{
				left=left+1;
			}
			
			
		}
			
			return nums;
	}
	
	public  Integer[] movezerotolast(int[] nums)
	{
		List<Integer> mylist = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if((nums[i]&1)==0)
			{
			mylist.add(nums[i]);
			
			}
		}
		
		for(int j=0; j<nums.length;j++)
		{
			if((nums[j]&1)!=0)
			{
			mylist.add(nums[j]);
			
			}
			
		}
		
		
		System.out.println(mylist);
		

	       return (Integer[]) mylist.toArray();
		
		
	}
	
	//get the number from an array 
	//do the bitwise operation with 001 withtthat nums[i]
	//if value is 0 then that number is even
	//if that else non zero then  num[i] is an odd number 
	
	private static int[] moveOddAndEven(int[] nums1) {

		int left = 0, right = nums1.length - 1; int[] n;
		while (left <= right) {

			if (!findOdd(nums1[left]) && !findOdd(nums1[right])) {
				left++;
			}
			if (!findOdd(nums1[left]) && findOdd(nums1[right])) {
				right--;
			}
			if (findOdd(nums1[left]) && !findOdd(nums1[right])) {
				int temp = nums1[left];
				nums1[left++] = nums1[right];
				nums1[right--] = temp;
			} else
				right--;
		}
		System.out.println(Arrays.toString(nums1));
		return nums1;
	}
	public static boolean findOdd(int nums1) {
		if ((nums1 % 2) == 0) {
			return false;
		}
		return true;

	}
	
	

}
