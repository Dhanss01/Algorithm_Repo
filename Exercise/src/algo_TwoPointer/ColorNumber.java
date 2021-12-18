package algo_TwoPointer;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

public class ColorNumber {
	
		
		/**
		 Given an array nums with n objects colored red, white, or blue, 
		 sort them in-place so that objects of the same color are adjacent, 
		 with the colors in the order red, white, and blue.

	      We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

	     You must solve this problem without using the library's sort function.

	 
	Example 1:

	Input: nums = [2,0,2,1,1,0]
	Output: [0,0,1,1,2,2]

	Example 2:

	Input: nums = [2,0,1]
	Output: [0,1,2]

	Example 3:

	Input: nums = [0]
	Output: [0]
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

		
		
		@Test
		public void test1() {
			
			int[] nums = {2,0,2,1,1,0};  //positive
	        storeNumberinColorsOrder(nums);
	        System.out.println(Arrays.toString(storeNumberinColorsOrderTwoPointer(nums)));
		}
		
		@Test
		public void test2() {  //postive
			
			int[] nums = {2,0,1};
	        storeNumberinColorsOrder(nums);
	        System.out.println(Arrays.toString(storeNumberinColorsOrderTwoPointer(nums)));
		}
		
		@Test
		public void test3() { // edge case
			int[] nums = {0};
	        storeNumberinColorsOrder(nums);
	        System.out.println(Arrays.toString(storeNumberinColorsOrderTwoPointer(nums)));
		}
		@Test
		public void test4() {
			int[] nums = {7,7}; //negative case
	        storeNumberinColorsOrder(nums);
	        System.out.println(Arrays.toString(storeNumberinColorsOrderTwoPointer(nums)));
		}


		
		//Brouteforce
		private int[] storeNumberinColorsOrder(int[] nums) {
			TreeMap<Integer, Integer> treemap = new TreeMap<Integer, Integer>();
			int[] newdata = new int[nums.length];
			int index=0;
			for (int i = 0; i < nums.length; i++) {
				treemap.put(nums[i], treemap.getOrDefault(nums[i],0)+1);
			}
		
			for (Entry<Integer, Integer> entry : treemap.entrySet()) {
				while(entry.getValue()>=1) {
					newdata[index++]= entry.getKey();
					treemap.put(entry.getKey(), entry.getValue()-1);
				}
					
			}
			
			return newdata;
			
		}
			
		
		//Pseudocode
		//intitialize left  as a starting index and right as array.length -1 pointer 
		//if Right <Left swap it to the right , decrement right 
		//if Left < Right then increment left 
		//values should be sorted by swapping
		
		//time  complexity  O(n/2) 
		//space O(1)
		
		private int[] storeNumberinColorsOrderTwoPointer(int[] nunumbers) {

			int left = 0;
			int right = nunumbers.length-1;
			while (left < right)
			{
				if (nunumbers[left] > nunumbers[right]) 
				{
					int temp = nunumbers[left];
					nunumbers[left] = nunumbers[right];
					nunumbers[right--] = temp;
				}
				 else if (nunumbers[left] < nunumbers[right]) 
					left++;
				else break;
			}
			return nunumbers;
		}
		
		
}


