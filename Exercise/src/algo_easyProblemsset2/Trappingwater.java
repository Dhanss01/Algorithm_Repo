package algo_easyProblemsset2;

import org.junit.Test;

public class Trappingwater {
	
	@Test
	public void test1()
	{
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(findMaxUnits(nums));
	}
	
	
	
	
	/*
	 * Pseudo code 
	 * Initialize left as 0, right as 0, sum as 0
	 * Traverse through the array
	 * 		Traverse through the array from current element to 0 in descending order
	 * 			Find Max and assign it to left
	 * 		Traverse from current element to length
	 * 			Find Max and assign it to right
	 * 		Find difference between min of left & right and current element, then add it to sum
	 * Return sum
	 */
	
	private int findMaxUnits(int[] nums) {
		int sum = 0;
		for(int i = 1; i < nums.length-1; i++) {
			int left = 0, right = 0;
			for(int j = i; j >= 0; j--)
				left = Math.max(nums[j], left);
			for(int k = i; k < nums.length; k++)
				right = Math.max(nums[k], right);
			sum += Math.abs(nums[i] - Math.min(left, right));
		}
		return sum;
	}

}
