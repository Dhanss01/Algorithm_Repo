package algo_MediumProblems;
import static org.junit.Assert.assertEquals;

import java.util.*;
import java.util.Map.Entry;

import org.junit.*;
import org.junit.Assert;
import org.junit.Test;


/*
 * 1) Did i understand the problem? 
 *    Parameters
 *      -> What is the input for this problem? string
 *      -> What will be the output for this problem? int
 *      -> is there any constraints? consider only substring without duplicate characters
 *      -> Do i have all informants to go the next step? yes
 *      -> How big is the test data? small
 *      
 * 2) Test data set -yes
 *    -> Minimum of 3 data sets
 *    -> Positive, Negative and Edge case scenario
 *    -> Validate the test data with interviewer
 *    
 * 3) Do i know to solve it? - yes
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

public class UnionandIntersectionofanarray {
	
	@Test 
	public void example()
	{
		int[] nums1 = {1, 2,2,3, 4, 5, 7};
        int[] nums2= {2,2,3, 5, 6} ;		
        assertEquals(true, Arrays.equals(intersections03(nums1, nums2), new int[] { 3, 5}));
		
	}
	
	@Test
	public void example2() {
		int[] nums1 = { 1, 2, 9, 99 };
		int[] nums2 = { -2, -2 };
		
		assertEquals(true, Arrays.equals(intersections03(nums1, nums2), new int[] { }));

	}


	

	/*@Test
	public void example4() {
		int[] nums1 = {};
		int[] nums2 = { 1, 2, 2, 1 };
		assertEquals(true, Arrays.equals(intersections03(nums1, nums2), new int[] {}));

	}*/
	
	@Test
	public void example5() {
		int[] nums1 = {};
		int[] nums2 = {};
		assertEquals(true, Arrays.equals(intersections03(nums1, nums2), new int[] { -1, -1 }));

	}
	

	
	
	
	
	//Create a set to add distinct number from an 1st array
	// run through all elements in array2
	//if set does not contains a element from array 2 then remove it from an array  eg: a1={1,2,3,4) a2={3,7} then return {3} 
	
	 public int[] intersections03(int[] nums1, int[] nums2) {
		 
		 if (nums1.length == 0 || nums2.length == 0 ) {
				return new int[] { -1, -1 };
			}
	       Set<Integer> set = new HashSet<>();
	        for (int n: nums1) { // o(n)
	            set.add(n);
	        }
	        
	        
	        for (int i = 0; i < nums2.length; i++) {
	            if (!set.contains(nums2[i])) {
	                
	                set.remove(nums1[i]);   // o(n)
	            }							// Space Complexity O(n)+O(1)+O(1)=>(O(n))
	        }
	        
	        int[] result =new int[set.size()];
			int index= 0;
			for(int i :set)
			{
				 result[index] =result[index]+i;
				index++;
				
			}
			return result;  			
				        
	    }
		
	 
	 
	// Time Complexity O(n) * O(n)=>O(n^2)

		// Space Complexity O(n)+O(1)+O(1)=>(O(n))
		private static int[] intersectionfunc(int[] nums1, int[] nums2) {
			int k= nums1.length > nums2.length ? nums1.length : nums2.length;
			
			int[] dups = new int[k];
			int count = 0;
			if (nums1.length == 0 || nums2.length == 0 ) {
				return new int[] { -1, -1 };
			}
			for (int i = 0; i < nums1.length; i++) {
				for (int j = 0; j < nums2.length; j++) {
					if (nums1[i] == nums2[j]) {
						dups[count++] = nums1[i];
						
					}
				}
			}
			return dups;
		}

}
