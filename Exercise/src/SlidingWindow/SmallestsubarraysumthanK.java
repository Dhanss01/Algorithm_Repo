package SlidingWindow;

import org.junit.Test;

public class SmallestsubarraysumthanK {
	
	@Test
	public void test1()
	{
		int[] nums= {1, 4, 45, 6, 0, 19};
		int x=51;
		System.out.print(minimumSubbarraySumlessthanK(nums,  x));
	}

	
	public int minimumSubbarraySumlessthanK(int[] nums, int x)
	{
		int startingindex=0, endingindex=0,currentsum=0;
		int minimumwindowlength=Integer.MAX_VALUE;
		for(endingindex=0; endingindex<nums.length;endingindex++)
		{
			currentsum=nums[endingindex];
			while (currentsum>=x)
			{
				minimumwindowlength=Math.min(minimumwindowlength,endingindex-startingindex+1);
				currentsum=currentsum-nums[startingindex];
				startingindex++;
			}
		}
		
		return minimumwindowlength;
	}
	
}
