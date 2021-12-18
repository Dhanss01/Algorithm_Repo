package binarySearch;

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
	
	 */
	//Problem
		/* 
		 */
		
		
		/*1) Did I understand the problem? 
		 * 
		 * 2)What is the input(s)? What is the expected output?
		 * 
		 * 3)Test data set
		 * Positive : Negative:  Edge:
		 * 
		 * 4) how to solve it?
		 * 
		 * 5)Alternate approach
		 * 
		 * 6)pseudo code
		
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
			else if(nums[mid]>k)
			{
				low=mid+1;
			}
			high=mid-1;
			
		}
		return startingindex;
	}
	
	public int returnendingindex(int[] nums, int k )
	{
		 int endingindex=-1;
		int low=0, high=nums.length;
		
		while(low<=high)
		{
			int mid= (low+high)/2;
			if(nums[mid] == k )
			{
				endingindex= mid;
				System.out.println(endingindex);
				low=mid+1;
				
			}			
			else if(nums[mid]>k)
			{
				high=mid-1;
				
			}
			low=mid+1;
			
		}
		return endingindex;
	}

	
	
	
	
public int[] getFirstLastIndexUsingBinary(int[] nums,int target) {
		
		int left=getLastOrFirstIndex(nums,target,true);
		int right=getLastOrFirstIndex(nums,target,false);
		return new int[] {left,right};
	}
	
	private int getLastOrFirstIndex(int[] nums, int target,boolean flag) {
		
		int left=0;int right=nums.length-1;
		int temp=-1;
		
		
		while(left <= right) {
			int mid=(left+right)/2;
			if(nums[mid] == target) {
				temp=mid;
				if(flag ==true)
					right=mid-1;
				else {
					left=mid+1;
				}
			}else if(nums[mid] > target) {
				right=mid-1;
			}else left=mid+1;
			
		}
		return temp;
	}

}
