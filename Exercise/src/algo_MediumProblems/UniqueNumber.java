package algo_MediumProblems;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


/*
 * 1) Did i understand the problem? 
 *    Parameters
 *      -> What is the input for this problem? int
 *      -> What will be the output for this problem? boolean
 *      -> is there any constraints? 
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
public class UniqueNumber {

	@Test
	public void example1()
	{
		int[] nums = {2,2,7,11,15};
		assertEquals(true, UniqueBrouteforce(nums));
	}
	
	@Test
	public void example2()
	{
		int[] nums = {2,1,8,7,8,4,};
		assertEquals(true, UniqueBrouteforce(nums));
	}
	
	@Test
	public void example3()
	{
		int[] nums = {9,9,8,8};
		assertEquals(false, UniqueBrouteforce(nums));		
	}
	public void example4()
	{
		int[] nums = {};
		assertEquals(false, UniqueBrouteforce(nums));		
	}
	public void example5()
	{	
	int[] nums = { 1, 1, -1, -1, -1, 2, 2, 2 };
	assertEquals(false, UniqueBrouteforce(nums));		
	}
	
	//brouteforce 
	//sort an array
	//if current index and index+1 is same then go next
	//if curent index and index+1 is not equal then print that number 
	  // continue
	
	public boolean UniqueBrouteforce(int[] nums)
	{
		Arrays.sort(nums);
		for(int i = 0; i <= nums.length-1;i++)   // Time Complexity O(n) +O(n) +O(1)=>O(n)
		{										//Space Complexity O(n)
			if(i>0&&nums[i]==nums[i+1])
			{
				i++;
			}
			
			else if(nums[i]!=nums[i+1])   
			{
				System.out.println(nums[i]);
			}
			
		}
		
		
		return true;
	}
	
	
	//Hashmp
	// Time Complexity O(n)+O(1)=>O(n)

	// Space Complexity O(n) )=>O(n)
	
	//add the array value in map
	//if that value is not exist in map add it as it is with they values as 0
	//if a element is already exist in map then increment the value by 1 with getordefaultmethod or a[i]+1
	//return all the elements when value is default 0
	
	 public boolean UniqueNumber1(int[] A) {
	        HashMap<Integer, Integer> hmap = new HashMap<>();
	       for(int i = 0; i<A.length; i++){         
	           if(hmap.containsKey(A[i]))
	           {
	               hmap.put(A[i], hmap.get(A[i])+1);  //getOrDefault(A[i], 0)+1
	           }
	           else
	           {									//O(1) is time complexity for put & get method
	               hmap.put(A[i], 1);   
	           }
	       }
	      
	        for(int key : hmap.keySet()){
	            if(hmap.get(key) == 1)
	            {
	               System.out.println(key);
	            }
	        }
	        return true;
	    }
}
