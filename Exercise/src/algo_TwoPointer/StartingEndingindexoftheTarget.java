
package algo_TwoPointer;

import org.junit.Assert;
import org.junit.Test;

public class StartingEndingindexoftheTarget {
	/*Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
 
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	/*pseaudo code 
	 *  low is index 0 and high is length-1, mid is low+high/2
	 * check target value is less than mid , if so then change the high index as mid-1 and keep right as it is
	 * check if target value is greater than mid if so then change the low index as mid+1
	 * if target value is found at the index X then add that in a array
	 * print the index and loop thorugh if you find the same target then return the index
	 * 
	 */
	@Test

    public void test1() {

           int n[] = {5,7,7,8,8,10 };

           int k = 8;
           System.out.println(returnstartingindex(n,k ));
           System.out.println(returnendingindex(n,k ));
           //(int[] nums, int k )
           //Assert.assertEquals(9, findmissingnumber(n,k));

    }



	
	public int returnstartingindex(int[] nums, int k )
	{
		int startingindex =0 ; int endingindex=0;
		int low=0, high=nums.length;
		
		while(low<=high)
		{
			int mid= (low+high)/2;
			if(nums[mid] == k)
			{
				startingindex= mid;
				System.out.println(startingindex);
				high=mid-1;
				
			}
			else if(nums[mid]<k)
			{
				high=mid-1;
			}
			else if(nums[mid]>k)
			{
				low=mid+1;
			}
			
		}
		return startingindex;
	}
	
	public int returnendingindex(int[] nums, int k )
	{
		int startingindex =0 ; int endingindex=0;
		int low=0, high=nums.length;
		
		while(low<=high)
		{
			int mid= (low+high)/2;
			if(nums[mid] == k)
			{
			
				endingindex= mid;
				System.out.println(endingindex);
				low=mid+1;
			}
			else if(nums[mid]<k)
			{
				high=mid-1;
			}
			else if(nums[mid]>k)
			{
				low=mid+1;
			}
			
		}
		return endingindex;
	}
	
	
	
	public void returnStartingEndingindexofK (int[] nums,  int k)
	{
		int startingindex =0 ; int endingindex=0;
		for(int i =0; i<nums.length;i++)
		{
			if(nums[i]==k)
			{
			startingindex= i;
			System.out.println(startingindex);
			break;
			}
		}
		for(int i=nums.length;i<=0;i++) 
		{
			if(nums[i]==k)
			{
			endingindex= i;
			System.out.println(endingindex);
			break;
			}
		}
		if(startingindex==endingindex)
		{
			System.out.println("only one index");
		}
		
		
	}

}
