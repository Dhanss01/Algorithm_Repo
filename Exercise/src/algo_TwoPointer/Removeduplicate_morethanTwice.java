package algo_TwoPointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

/**
 *  * 2) Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3]
Explanation: Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively. It doesn't matter what you leave beyond the returned length.

Example 2:
Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3]
Explanation: Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively. It doesn't matter what values are set beyond the returned length.xze    
 * 
 * 
 * 
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
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3]
 *  
 * 
 * 2) Test data set
 * 
 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
 * interviewer if the data set is fine by his/her assumptions - Comparision
 * between
 * Positive
 * negative
 * edge 
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

	


public class Removeduplicate_morethanTwice {
	
	@Test
	public void example1()
	{
	int[] a = {0,0,1,1,1,1,2,3,3};
	System.out.println(removeduplicatemorethantwooccurance(a));
	
	}
	
public void example2()
{
	int[] a = {0,0,1,1,1,1,2,3,3};
	System.out.println(removeduplicatemorethantwooccurance(a));
}	


@Test
public void Teexample23()
{
	int[] nums1= {0,-3,3,3,3};
	System.out.println(removeduplicatemorethantwooccurance(nums1));
}

//Pseaudocode 
	//intialize map	
	//add the array value in key and increment the map value
	//if that element is already exist increase the value by getorDefaultmethod.
	//when a[i] is more than 2 then simply dont add that element in to map
	//get thecount 
	//print that as an array
	

//O(n)
//o(n)+0(1)
	
	public int removeduplicatemorethantwooccurance(int[] a)
	{
	   int count=0; int lastelement=0;
	   
	   HashMap<Integer, Integer> map = new HashMap<>();
	   for(int i =0; i<a.length;i++)
	   {
		   if(map.get(a[i])<=2)
		   {
		   map.put(a[i], map.getOrDefault(a[i], 0) + 1);			
	       }
	   
	   System.out.println(map);

		for (int i1 = 0; i1 < map.size(); i1++)
		{
			count += map.get(i1);
		}
	   }// O(1)

	   return count;	
			
		
	}
	
	
	private int findDuplicateInSortedArrayUsingTwoPointer(int[] n) {
		int count = 1;
		int newArraySize = 1;
		int left = 0;
		int right = n.length - 1;

		if (n.length == 0) {
			return 0;
		}
		while (left < right) {
			if (n[left] == n[left++]) { 
				if (count < 2) {
					n[newArraySize++] = n[left++];
					count++;
				} else
					n[newArraySize++] = n[left++];
				count = 1;
			}
			if (n[right] == n[right--]) {
				if (count < 2) {
					n[newArraySize++] = n[right--];
					count++;
				}
			} else
				n[newArraySize++] = n[right--];
			count = 1;
		}

		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		return newArraySize;

	}



public int[] removeDuplicatesTwopointer(int[] nums)
{
    
    
    int i =2;
    for(int j =2; j<nums.length; j++)
    {
        if((nums[j]!=nums[j-1]) && nums[j-2]!=nums[j-1])
        {
            nums[i]=nums[i]+nums[j];
        }
    }
      
    return nums;


}
}
 