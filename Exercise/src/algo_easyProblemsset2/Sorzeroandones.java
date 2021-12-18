package algo_easyProblemsset2;

import org.junit.Assert;
import org.junit.Test;

public class Sorzeroandones {

	@Test
	public void test1()
	{
		int[] nums= {1,0,1,1,0,0};
		int[] results= {0,0,0,1,1,1};
		Assert.assertArrayEquals(results, getSortedValues(nums));
		
	}
	@Test
	public void test2()
	{
		int[] nums= {1,0,0,0};
		int[] results= {0,0,0,1};
		Assert.assertArrayEquals(results, getSortedValues(nums));
		
	}
	@Test
	public void test3()
	{
		int[] nums= {1,1,1,0,1,1};
		int[] results= {0,1,1,1,1,1};
		Assert.assertArrayEquals(results, getSortedValues(nums));
		
	}
	
	
	
	public int[] getSortedValues(int[] nums)
	{
		int left=0, right=nums.length-1;int temp=0;
		
		while(left<right)
		{
			//if left is greater than right then swap the value
			if(nums[left]>nums[right])
			{
				temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left++;
				right--;
			}
			
			else if(nums[left]==0)
			{
				left++;
			}
			
			else
				right--;			
		}
		
		return nums;
	}
}
