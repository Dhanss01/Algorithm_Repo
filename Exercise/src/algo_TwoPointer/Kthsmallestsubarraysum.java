package algo_TwoPointer;

import org.junit.Test;

public class Kthsmallestsubarraysum {
	@Test
public void test1()
{
		int[]  nums = {2,1,3};
		int k=4;
		kthSmallestSubarraySum( nums, k);
}
	
   
    
    public void kthSmallestSubarraySum(int[] nums, int k) {
       int[] sum= new int[50];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0; j<nums.length;j++)
            {
                
                sum[i]=nums[i]+nums[j];
            }
            
        }
        System.out.println(sum);
        
    }

}
