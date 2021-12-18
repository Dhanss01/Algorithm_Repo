package dynamicProblem;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MaximumIncreasingSubsequence {

	@Test
	public void testcase1() {
		int[] intarr= {-1,3,4,5,2,2,2,2};		
		Assert.assertEquals(4, findMaximumIncreasingSubsequnces(intarr));
	}

	@Test
	public void testcase2() {
		int[] intarr= {0,1,0,3,2,3};
		Assert.assertEquals(4, findMaximumIncreasingSubsequnces(intarr));
	}



	@Test
	public void testcase3() {
		int[] intarr= {10,9,2,5,3,7,101,18};
		Assert.assertEquals(4, findMaximumIncreasingSubsequnces(intarr));
	}


	@Test
	public void testcase4() {
		int[] intarr= {7,7,7,7,7,7,7};
		Assert.assertEquals(1, findMaximumIncreasingSubsequnces(intarr));
	}

	@Test
	public void testcase5() {
		int[] intarr= {1,3,6,7,9,4,10,5,6};
		Assert.assertEquals(6, findMaximumIncreasingSubsequnces(intarr));
	}
	
	
	
	
	/*get the nums array and assign the left as 0, right  as left+1;
	 * when left is greater than right 
	 *    yes -->   then increase count array element by1
	 *        -->   coutinue this process till the right element
	 *        --> find which ever is greater than append that with right 
	 * when left is less than right then increment right by 1 and reset the left to 0
	 * 
	 * 
	 */
	public int findMaximumIncreasingSubsequnces(int[] nums)
	{
		int[] countarr= new int[nums.length];
		Arrays.fill(countarr, 1);
		int left=0, right=0; int temp=0;
		int max=0;
		for(right=0; right<nums.length;right++)
		{
			left=0;
			while(left<right)
			{
				if(nums[left]<nums[right])
				{
					 if(countarr[left]<=countarr[right])
					{
						temp=countarr[left]+1; 
						//countarr[left]=countarr[left]+1;
					}
					
					countarr[right]=Math.max(countarr[right], temp);
					left++;
				}	
				else
				{
					left++;
				}
				
			}
			
		}
		for(int i=0;i<countarr.length;i++)
		{			
			if(max<countarr[i]) {
				max=countarr[i];
			}
		}
		System.out.println(Arrays.toString(countarr));
		
		
		
		
		
		
		
		
		
		
		return max;
	}
}
