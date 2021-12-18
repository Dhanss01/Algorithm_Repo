package algo_EasyProblmes;

import org.junit.Test;

public class MaximumAscendingSubarrySum {
	
	@Test
	public void test1() {
		int[] nums= {10,20,30,5,10,50};
		System.out.println(maxAscendingSum(nums));
	}
	
	//right
	//right>right-1 : --> sum=sum+nums[right]
	//
	 public int maxAscendingSum(int[] nums) {
		 int left=0, right=0, sum=0, maxsum=0;
		 for(right=0;right<nums.length;right++) {
			 if(right==0) {
			 sum=nums[right];
			 //right++;
			 }
			 else {
			 if(nums[right]>nums[right-1]) {
				 sum=sum+nums[right];				 
			 }
			 else {
				 maxsum= (maxsum>sum)?maxsum:sum;
				 while(left<=right) {
					 left++;
				 }
				 sum=0;
				 sum=nums[right];
				 
			 }
			 }
		 }
		 maxsum= (maxsum>sum)?maxsum:sum;
	        return maxsum;
	    }

}
