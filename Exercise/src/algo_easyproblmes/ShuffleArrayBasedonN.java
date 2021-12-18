package algo_easyproblmes;

import org.junit.Test;

public class ShuffleArrayBasedonN {
	
	@Test
	public void test1() {
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		System.out.println(shuffle(nums,n));
	}

public int[] shuffle(int[] nums, int n) {  
    int[] arr= new int[nums.length];
    int left=0, right=n;
    int i=0;
    while(right<nums.length&&left<n)
    {
        arr[i]=nums[left];
        arr[i+1]=nums[right];
        if(i<nums.length-2)
        {
        	i=i+2;
        }
        left++;
        right++;
        
    }
	return arr;
}

}
