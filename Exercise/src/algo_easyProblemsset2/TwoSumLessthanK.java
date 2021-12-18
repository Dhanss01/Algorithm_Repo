package algo_easyProblemsset2;

import java.util.Arrays;

import org.junit.Test;

public class TwoSumLessthanK {
	@Test
	public void example1()
	{
		int[] nums = {2,2,7,11,15,40};	
		int target = 50;
		System.out.println(twoSumLessThanK(nums,target));
	}
	
	
	public int twoSumLessThanK(int[] nums, int k) {
        Arrays.sort(nums);
        int answer = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum < k) {
                answer = Math.max(answer, sum);
                left++;
            } else {
                right--;
            }
        }
        return answer;
    }

}
