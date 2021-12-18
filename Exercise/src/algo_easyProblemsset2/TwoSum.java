package algo_easyProblemsset2;

import java.util.Arrays;

import org.junit.Test;

public class TwoSum {

	//@Test
	public void test1()
	{
		int[] nums = {3,2,4};
		int target= 6;
		System.out.print(twoSum(nums,target));
	}
	//2,7,11,15]
	@Test
	public void test2()
	{
		int[] nums = {2,7,11,15};
		int target= 6;
		System.out.print(twoSum1(nums,target));
	}
	
public int[] twoSum(int[] nums, int target) {
        
       // Arrays.sort(nums);
        int left=0, right=nums.length-1;
        while(left<right)
        {
            if((nums[left]+nums[right])==target)
            {
                return new int[] {left,right};
            }
            
            else if((nums[left]+nums[right])<target)
            {
               right--;
            }
            else
                left++;
        }
		return new int[] {-1,-1};
}



public int[] twoSum1(int[] nums, int target) {
	for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == target - nums[i]) {
                return new int[] { i, j };
            }
        }
    }
	return null;
  }

}