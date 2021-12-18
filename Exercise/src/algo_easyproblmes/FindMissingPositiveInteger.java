package algo_easyproblmes;

import java.util.Arrays;

import org.junit.Test;

public class FindMissingPositiveInteger {
	@Test
	public void test1() {
		int[] nums = {7,8,9,11,12};
		firstMissingPositive(nums);
	}
	
	//sort the array
	//index =1;
	//increment index when you see postive integers
	//if index==nums[i]
	//if index < nums[i] then return index
	
	public int firstMissingPositive(int[] nums) {
		Arrays.sort(nums);
		int index=1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<index) {
				continue;
			}
			else if(nums[i]==index) {
				index++;
			}
			else if(nums[i]>index)
			{
				return index;
			}
			
		}
		return index;
 
    }

}
