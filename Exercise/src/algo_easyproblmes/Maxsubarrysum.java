package algo_easyproblmes;

import org.junit.Test;

public class Maxsubarrysum {

 @Test
  public void test1() {
	  int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
	  System.out.println(getMaxSubsum(nums));
  }

 
 //kadanes
private int getMaxSubsum(int[] nums) {
	// TODO Auto-generated method stub
	//subarraysum=subarraysum+nums[i]
	//subarraysum>max; max=maxsubarraysum
	// subarraysum<0 them subarraysum=0 
	int maxsum=0, subsum=0;
	for(int i=0;i<nums.length;i++) {
	  subsum=subsum+nums[i];
	  maxsum= (subsum>maxsum) ? subsum:maxsum;
	  if(subsum<0) {
		  subsum=0;
	  }
		
	}
	return maxsum;
}	
	
}
