package algo_easyProblemsset2;

import org.junit.Test;

public class SlideWAveragelessthanK {
	
	@Test
	public void test1() {
		int[] nums= {2,2,2,2,5,5,5,8};
		int k = 3, threshold = 4;
		numOfSubarrays(nums, k,threshold);
	}
	
	
	 public int numOfSubarrays(int[] arr, int k, int threshold) {
		
		 
		 int windowsum=0;
		 int count=0;int start=0;
		 
		for(int i=0;i<arr.length;i++) {
			
			windowsum=windowsum+arr[i];
			if(i>=k-1) {
				if((windowsum/k)>=threshold) {
					count++;
				}

				windowsum=windowsum-arr[start];
				start++;
								
			}			
		} 
		return count;
	        
	  }

}
