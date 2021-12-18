package SlidingWindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


/** 
 * A dieter consumes calories[i] calories on the i-th day.

Given an integer k, for every consecutive sequence of k days (calories[i], calories[i+1], ..., calories[i+k-1] for all 0 <= i <= n-k), they look at T, the total calories consumed during that sequence of k days (calories[i] + calories[i+1] + ... + calories[i+k-1]):

If T < lower, they performed poorly on their diet and lose 1 point;
If T > upper, they performed well on their diet and gain 1 point;
Otherwise, they performed normally and there is no change in points.
Initially, the dieter has zero points. Return the total number of points the dieter has after dieting for calories.length days.

Note that the total points can be negative.

Example 1:

Input: calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3

Output: 0

Explanation: Since k = 1, we consider each element of the array separately and compare it to lower and upper.

calories[0] and calories[1] are less than lower so 2 points are lost.


 
calories[3] and calories[4] are greater than upper so 2 points are gained.

Example 2:

Input: calories = [3,2], k = 2, lower = 0, upper = 1

Output: 1

Explanation: Since k = 2, we consider subarrays of length 2.

calories[0] + calories[1] > upper so 1 point is gained.

Example 3:

Input: calories = [6,5,0,0], k = 2, lower = 1, upper = 5 

6+5 > 1  =1
5+0 

Output: 0

 * 
 */

public class DietPlan {
	
	@Test
	public void example1()
	{
		int[] nums= {1,2,3,4,5};
		int target =1;
		int lower = 3, upper = 3;
		assertEquals(0, coloriescalculations(nums,target, lower, upper));	
		
	}	
	
	@Test
	public void example2()
	{
		int[] nums= {3,2};
		int target =2;
		int lower = 0, upper = 1;
		assertEquals(1, coloriescalculations(nums,target, lower, upper));	
		
	}
	
	
	@Test
	public void example3()
	{
		int[] nums= {6,5,0,0};
		int target =2;
		int lower = 1, upper = 5;
		assertEquals(0, coloriescalculations(nums,target, lower, upper));	
		
	}
	
	
	@Test
		public void example4()
		{
			int[] nums= {0,1};
			int target =2;
			int lower = 0, upper = 1;
			assertEquals(0, coloriescalculations(nums,target, lower, upper));	
			
		}
	
	/*If T < lower, they performed poorly on their diet and lose 1 point;
	 *If T > upper, they performed well on their diet and gain 1 point;
	 *Otherwise, they performed normally and there is no change in points.
	 *
	 *Pseudo code
	 * loop through the given array upto index k Find the sum of the initial window
	 * Compare with the lower , higher values and Calculate points 
	 * Move the window , follow the above steps to get the sum of current window and
	 * Calculate the points based on given 3 conditions. 
	 * Iterate the process till the end of the loop .
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	public int coloriescalculations(int nums[],int target, int lower, int upper)
	{
		
		int sumsofwindow=0;
		int currentsum=0; 
		int colorierestuls=0;
		int result=0;
		
		for(int i =0; i<target;i++)
		
		sumsofwindow=sumsofwindow+nums[i];	
		
		currentsum=sumsofwindow;
		
		
		
		
		for(int j=target;j<nums.length;j++ )
		{
		currentsum = currentsum + nums[j] - nums[j- target];	
		   	
		    
		}	
		
		 result=getcolories(sumsofwindow, currentsum, colorierestuls, upper,lower);
			
		return result;
	}
	
	public int getcolories(int sumsofwindow,int currentsum, int colorierestuls,int upper,int lower)
	{
		
		
		 if(currentsum > upper)
		    {
		    	colorierestuls = colorierestuls+1;
		    }
		    
		    else if(currentsum < lower) 		    	
		    {		    
		    	colorierestuls=colorierestuls-1;
		    }
		    
		    else if(currentsum ==lower ||currentsum ==upper )
		    	return colorierestuls;
		    	
		 
		 return colorierestuls;
		
	}
	
	
	
}

/*
 * 
 * 
 * if (windowsum < lower) {
				points = points - 1;
			}

			else if (windowsum > upper) {
				points = points + 1;
			}

			else {
				points = points;
			}
 */
