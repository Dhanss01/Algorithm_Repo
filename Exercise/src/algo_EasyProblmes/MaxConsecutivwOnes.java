package algo_EasyProblmes;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutivwOnes {
	
	@Test
	public void test1()
	{
		int[] nums= {1,1,1,0,0,0,1,1,1,1,0};
		int k=2;
		Assert.assertEquals(6,getMaxCountofOnes(nums,k));
	}
	@Test
	public void test2(){
		int[] nums= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k=3;
		Assert.assertEquals(10, getMaxCountofOnes(nums,k));
	}
	
	
	/*init left =0, right=0 and max ,zerocount;
	 * increment right utill we get zero
	 *    -> if zero, Zerocount++ ;until zerocount==k
	 *    --> if zerocount==k then compare max with right-left+1
	 *    -->increment right++ ,
	 *        if Zerocount > K then
	 *           reduce one zero by adjusting left pointer to it  
	 */
	
	public int getMaxCountofOnes(int[] nums, int k) {
		int max=0, left=0, right=0;
		int zerocount=0;
		
		while(right<nums.length) {
			
			if(nums[right]==1)
				right++;
			else if(nums[right]==0) {
				if(zerocount==k) {
					max=Math.max(max, right-left);
				}
				zerocount++;
				right++;
			}
			while(zerocount>k) {
					if(nums[left]==0)
					{
						zerocount--;
					}
					left++;	 
				}		
		}
		
		return max;
	}
	
	
	
	
	
	 public int longestOnes(int[] nums, int k) {
		       
		 int left=0, right=0,count=0; int max=0;
		 while(left<nums.length&&right<nums.length)
		 {
			 if(nums[right]==1)
			 {				 
				 right++;
			 }
			 else if(nums[right]==0) {
				 k--;
				 right++;
				 if(k<=0) {
					count = right-left;
					left=right;
					right++;
					max=Math.max(max,count);
				 }
			 }
			 
		 }
		 max=Math.max(max,left-right);
		 return max;
}

}
