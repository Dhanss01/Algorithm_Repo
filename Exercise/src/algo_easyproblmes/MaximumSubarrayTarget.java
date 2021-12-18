package algo_easyproblmes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class MaximumSubarrayTarget {
	
	@Test
	public void test1() {
		int[] nums = {1,2,3};
		int k=3;
		getSumvalueEqualsK1(nums, k);
	}
	
	
	
	public int getSumvalueEqualsK1(int[] nums, int k) {
	int count = 0, sum = 0;
    HashMap < Integer, Integer > map = new HashMap < > ();
    map.put(0, 1);
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        if (map.containsKey(sum - k))
            count += map.get(sum - k);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
	
	}	
	
	
	
	
	
	
	
	
	
	//iterate through 
	// if sum is equals to k 
	//increase count 
	//when sum > k reduce ; 
	public int getSumvalueEqualsK(int[] nums,int k) {
		
		int sum=0, count=0; int left =0, right=0;
		List<Integer> subarrays= new ArrayList<Integer>();
		
		while(right<nums.length) {
			
			if(sum==k) {
				count++;
				sum=sum-nums[left];
			}
			else if(sum<k) {
				sum=sum+nums[right];
				if(sum>k) {
					while(sum>k) {
						sum=sum-nums[left];
						left++;
						if(sum==k) {
							count++;
							}
					}
				}
				right++;
			}
	}
	return count;
	}
}			
				/*	else if(sum>k) {
				while(sum>k) {
					sum=sum-nums[left];
					left++;
					if(sum==k) {
						count++;
						}
				}
				
			}	*/