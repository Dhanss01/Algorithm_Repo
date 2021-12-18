package binarySearch;

import org.junit.Assert;
import org.junit.Test;

public class FindaNumber {
	
	
	@Test
    public void test1() {

           int[] nums = { 2, 3, 4, 7, 11 ,34,43,57};

           int k = 43;

           Assert.assertEquals(34, findanumber(nums,k));

    }
	
	@Test
    public void test2() {

           int[] nums = { 1,3,5,6};

           int k = 2;

           Assert.assertEquals(34, findanumber(nums,k));

    }
	
	
	/*pseaudo code 
	 *  low is index 0 and high is length-1, mid is low+high/2
	 * check target value is less than mid , if so then change the high index as mid-1 and keep right as it is
	 * check if target value is greater than mid if so then change the low index as mid+1
	 * if target value is found at the index X then add that in a array
	 * print the index and loop thorugh if you find the same target then return the index
	 * 
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
