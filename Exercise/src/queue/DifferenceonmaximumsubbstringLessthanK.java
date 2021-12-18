package queue;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.Test;

public class DifferenceonmaximumsubbstringLessthanK {

	@Test
	public void test1()
	{
		int[] data= {8,2,4,7};
		int limit= 4;
		longestSubArray(data, limit);
	}
	//
	//@Test
	public void test2()
	{
		int[] data= {10,1,2,4,7,2};
		int limit= 5;
		maximumsubarrayforgivenlimit(data, limit);
	}
	
	//@Test
	public void test3()
	{
		int[] data= {4,2,2,2,4,4,2,2};
		int limit= 0;
		maximumsubarrayforgivenlimit(data, limit);
	}



	/*traverse throught all the elements
	 * next for loop i-j if that difference is less than limit,  keep it in a max value
	 * then grow the windowsize and get the difference if it is less then limit, then take length of string i-j keep it temp value 
	 * compare with max value, which ever is greater than then take that max and push it in to stack  
	 * else break and  shrink the window size j-i+1;
	 * continue the same process 
	 * 
	 */

	public void maximumsubarrayforgivenlimit(int[] data, int limit)
	{
		int max=0, temp=0;
		for(int i=0;i<data.length;i++)
		{
			for(int j=i;j<data.length;j++)
			{
				int diff = Math.abs(data[i]-data[j]);
				if(diff<=limit)
				{
					temp=j-i+1;
					max = Math.max(temp, max);
				}
				else		
					break;

			}


		}
		
		System.out.println(max);
	}
	
	
	
	
	
	/*
	 * Two Pointer Algorithm - Equi Directional
	 * Find the min and max for slow and fast pointer values
	 * if the abs difference is the less than or equal to limit -> find the longest and move right
	 * else reset the min and max with the right value -> left 
	 * 
	 */
	
	private int longestSubArray(int[] nums, int limit) {
		
		int left = 0, right = 0;
		int longest = Integer.MIN_VALUE, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		while(left < nums.length && right < nums.length) {
			
			// find the min and max for the absolute difference
			min = Math.min(min, Math.min(nums[left], nums[right])); //{8,2,4,7};
			max = Math.max(max, Math.max(nums[left], nums[right]));
			
			// Check with the limit
			if(Math.abs(max-min) <= limit) {
				longest = Math.max(longest, right-left+1);
				right++;
			} else {
				right = ++left;
				min = nums[left];
				max = nums[left];
			}
			
		}
		return longest;
		
	}
	
	//Using Arrays Dequeue
	// take the min value from left and right  and add it in minque
	//take the max value from left-right and add it in maxqye
	
	// min-max =temp 
	// 
	
	
	
	
	public void usingDeque(int[] data, int limit)
	{
		Deque<Integer> minqueue = new ArrayDeque<>();
		Deque<Integer> Maxqueue = new ArrayDeque<>();
		
	
		int left=0,right=0;
		int min=0;
		int i=0;
		while(left<data.length && right<data.length)
		{
			minqueue.offer(data[i]);
		}
		
	}
	

	
}
