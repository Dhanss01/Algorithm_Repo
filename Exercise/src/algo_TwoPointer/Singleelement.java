package algo_TwoPointer;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

/*
 * 1) Given a non-empty array of integers nums, every element appears twice except for one. Find that single one. You must implement a solution with a linear runtime complexity and use only constant extra space.
 

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
0*/



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

	
	
public class Singleelement {
	
	
	@Test 
	public void example()
	{
		int[] numbers = {3,4,3,3};
		
		int occcount = largestUniqueNumber(numbers);
		Assert.assertEquals(4, occcount);
	}
	
	@Test
	public void example2()
	{
		int[] numbers = {1,1,3,2,2};
		
		int occcount = largestUniqueNumber(numbers);
		Assert.assertEquals(3, occcount);
		
	}
	
	
	//Get the number in pseudocode
	//Create a map and add respective elements from an array 
	////if hashmap contains 'element', then increase correspoding val by getdefault method
	//if 'value' for 'key' is '1', then return that 'key' element
	
	 public Integer largestUniqueNumber(int[] A) {
	        HashMap<Integer, Integer> hmap = new HashMap<>();
	       for(int i = 0; i<A.length; i++){
	           if(hmap.containsKey(A[i])){
	               hmap.put(A[i], hmap.get(A[i])+1);
	           }else{
	               hmap.put(A[i], 1);
	           }
	       }
	       
	        for(int i : hmap.keySet()) 
	        {
	            if(hmap.get(i) == 1) 
	            {
	               return i;
	            }
	        }
	        return  0;
	    }
	

}
