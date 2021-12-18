package algo_MediumProblems;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;


/*
 * 1) Did i understand the problem? 
 *    Parameters
 *      -> What is the input for this problem? array
 *      -> What will be the output for this problem? int
 *      -> is there any constraints? 
 *         
 * 2) Test data set -yes
 *    -> Minimum of 3 data sets
 *    -> Positive, Negative and Edge case scenario
 *    -> Validate the test data with interviewer
 *    
 * 3) Do i know to solve it? - yes broute force
 * 
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


/*pseudo code
 * check  difference is equal to next element, since its a consecutive element let it be as 1
 * if its equals to next element then continue 
 * if not return missed element
 * 
 */

public class MissingnumberDistinctarray {

 
	 @Test
		public void example1() {
			int[] nums1 = { 1,3,5,7 };
			Assert.assertArrayEquals(MissingNumbsers(nums1), new Integer[] {2,4,6 });
		}

		

		 @Test
		public void example3() {
			int[] nums1 = { -4, -3, -2, -1 };
			Assert.assertArrayEquals(MissingNumbsers(nums1), new Integer[] {-1});

		}
		 @Test
			public void example4() {
				int[] nums1 = {};
				Assert.assertArrayEquals(MissingNumbsers(nums1), new Integer[] {-1});
			}
	 
	 
	
	 private static Integer[] MissingNumbsers(int[] nums1) {

			Arrays.sort(nums1);
			
			if (nums1.length==0)
			{
				return new Integer[] { -1 };
			}
			 List list = new ArrayList<>();    //O(n)
			for (int i = 0; i < nums1.length - 1; i++) 
			{
				
				if (!(nums1[i] + 1 == (nums1[i + 1])))    //O(n)
				{
					list.add(nums1[i] + 1);
				}
			}		
			
				return (Integer[]) list.toArray();

		}


	
}
