package algo_TwoPointer;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IndexOrder {
	/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
 
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:
Input: nums = [1,3,5,6], target = 0
Output: 0
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
	 * Input- Input: nums = [1,3,5,6], target = 5
	 *  Output -int
	 *  Constraint- 0(log n)
	 * 
	 * 2) Test data set
	 * 
	 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
	 * interviewer if the data set is fine by his/her assumptions - Comparision
	 * between
	 * 
	 * Positive- : 
	     Negative -: 
	      Edge :
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

       public void test1() {

              int n[] = { 2, 3, 4, 7, 11 };

              int k = 5;

              Assert.assertEquals(3, findanumber(n,k));

       }

 

       @Test

       public void test2() {

              int n[] = { 1, 2, 3,6 };

              int k = 3;

              Assert.assertEquals(2, findanumber(n,k));

       }
	 
       /*pseaudo code 
   	 * low is index 0 and high is length-1, mid is low+high/2
   	 * check target value is less than mid , if so then change the high index as mid-1 and keep right as it is
   	 * check if target value is greater than mid if so then change the low index as mid+1
   	 * if target value is found at the index then return the index
   	 * If the target is not here: target < nums[mind], continue to search on the left side. right = mid - 1
   	 * else search on the right side  left = mid+1
   	 * print the left element
   	 */

		
		public int findanumber(int[] nums,int k)
		{
			int low = 0; int high = nums.length-1;
			
			
			while(low<=high)
			{
				int mid=(low+high)/2;
				if(nums[mid]==k)
				{
					return mid;
				}
				else if (nums[mid]<k)
				{
					low =mid+1;
				}
				else{
					high= mid-1;
					}
			}	
			System.out.println(low);
			return low;	
		}
}
