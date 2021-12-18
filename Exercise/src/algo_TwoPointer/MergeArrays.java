package algo_TwoPointer;

import static org.junit.jupiter.api.Assertions.assertTimeout;

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
 * int[] numbers = {1,2,3,0,0,0};
 * 	int[] numbers = {4,5,6};
 *  Output b= [1,2,3,4,5,6] ;
 *  Constraint- should not remove the space and special characters
 * 
 * 2) Test data set
 * 
 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
 * interviewer if the data set is fine by his/her assumptions - Comparision
 * between
 * 
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

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


/* 1) Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
 * 
 * 
 * 
 * /
 * 
 */
/**
 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
 * provide more detail with example(s) -> If yes, go to next step !!
 * 
 * Yes
 * 
 * What is the input(s)? What is the expected output? Do I have constraints to
 * solve the problem? Do I have all informations to go to next step!! How big is
 * your test data set will be?

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

 *  
 * 
 * 2) Test data set
 * 
 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
 * interviewer if the data set is fine by his/her assumptions - Comparision
 * between
 * 
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
public class MergeArrays {
	
	@Test
	public void example1()
	{
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2= {2,4,5};
		int k =3;
		
		Assert.assertTrue(Arrays.equals(new int[]{1,2,2,3,4,5},merginarray(nums1,nums2, k)));
	}
	@Test
	public void example2()
	{
		int[] nums1 = {0,0,0};
		int[] nums2= {2,4,5};
		int k =3;
		merginarray(nums1,nums2, k);
	}
	@Test
	public void example3()
	{
		int[] nums1 = {2};
		int[] nums2= {};
		int k =1;
		merginarray(nums1,nums2, k);
	}
	
	
	
	
	//iterating the array 
	//Wherever if find 0 and then am replacing 0 by second arra's element
	//as we know based on given k count we will be having k time replacement 
	//sort the array and return in increment order 
	
	//O(n+m), 
	//o(n)
	public int[] merginarray(int[] nums1, int[] nums2,int k)
	{
       int j=0;		 
		
		for(int i =0; i<nums1.length;i++) 
		{
			if(nums1[i]==0)
			{
				nums1[i] = nums2[j];
	            j++;
				
			}
			
           Arrays.sort(nums1); 
		}  
		return nums1;
			
		}	
	
	
	public int[] mergertwoarray(int[] nums1,int[] nums2) {
		int k=0;
		for (int i = 0; i < nums1.length; i++) {
				if(nums1[i]==0) {
				nums1[i]=nums2[k++];
			}
		}
		Arrays.sort(nums1);
		return nums1;
	}
	
	
	private static int[] mergeSortUsingTwoPointer(int[] nums1, int[] nums2) {

		int left = 0;
		int right = 0;
		while (left < nums1.length) {
			if (nums1[left] == 0) {
				nums1[left] = nums2[right++];
			} else
				left++;
		}
		Arrays.sort(nums1);
		return nums1;

	}
	
}






			
