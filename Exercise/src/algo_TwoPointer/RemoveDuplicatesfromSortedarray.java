package algo_TwoPointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

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
 * 6)pseudocode
 * Assign two pointer in same directions left as slow and right as a faster pointer
 * if array[left] and array[right] is not equal then left will be incremented 
 * if array[left] is equals to array[right] then continue and dont assign that value to array[left]
 * 
 */
public class RemoveDuplicatesfromSortedarray {
	
	@Test
	public void test1()
	{
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeduplicates(nums));
		//Assert.assertTrue(Arrays.equals(new in {0,1,2,3,4}, removeduplicates(nums)));
	}
	
	@Test
	public void test2()
	{
		int[] nums= {1,1,2};
		System.out.println(removeduplicates(nums));
		//Assert.assertTrue(Arrays.equals(new int[] {0,1,2,3,4}, removeduplicates(nums)));
	}
	
	public int removeduplicates(int[] nums)
	{
		int left=0; 
		for(int right=1; right<nums.length-1;right++)
		{
			if(nums[right]!=nums[left])
			{	left++;
				nums[left]=nums[right];
				
			}
		}
		System.out.println(nums);
		return left+1;
		
	}

}
