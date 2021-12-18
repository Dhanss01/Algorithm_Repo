package binarySearch;

import org.junit.Test;

public class Findapeakelement {
	/*A peak element is an element that is strictly greater than its neighbors.

Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n].

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
	 *
	 */
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
	 * Input- int[] nums = [1,2,3,1]
	 *  Output -Output: 2
	 *  Constraint- should not remove the space and special characters
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions - Comparision
	 * between
	 * 
	 * Positive- : int[] nums = [1,2,3,1]
	     Negative -: s=[0]
	      Edge -: s=[3,3,3,3,3]
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

	@Test
	public void test01()
	{
		int[] nums = {1,2,1,3,5,6,4};
		System.out.println( FindPeakElement(nums));
	}
	
	/* 
	 * 
	 * 
	 * */
	
	 public int FindPeakElement(int[] nums) {
	       
	        int low = 0, high = nums.length-1;
	        while (low < high)
	        {
	            int mid = (low + high) / 2;
	            if (nums[mid] > nums[high])
	                high = mid;
	            else
	                low = mid + 1;
	        }
	        return low;
	    }

}
