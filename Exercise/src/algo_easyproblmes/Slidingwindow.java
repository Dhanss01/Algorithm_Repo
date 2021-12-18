package algo_easyproblmes;

import org.junit.Test;

public class Slidingwindow {
	
	@Test
	public void test1()
	{
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k=2;
		maxSlidingWindow(nums,2);
	}
	
	 public int maxSlidingWindow(int[] nums, int k) {
	 int sum=0, maxsum=Integer.MIN_VALUE;
	 int i=0;
		 for(i=0;i<k;i++) {
			 sum=sum+nums[i];
		 }
		 maxsum=Math.max(maxsum, sum);
		 int ind=0;
		 for(int j=i;j<nums.length;j++) {
			 sum=sum+nums[j]-nums[ind++];
			 if(sum>maxsum) {
				 maxsum=sum;
			 }
		 }
		 return maxsum;
	 }
}
