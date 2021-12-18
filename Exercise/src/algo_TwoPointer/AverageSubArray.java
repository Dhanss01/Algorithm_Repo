package algo_TwoPointer;

import org.junit.Assert;
import org.junit.Test;

public class AverageSubArray {
	
	
	
	@Test
	public void example1()
	{
		int[] nums= {1,12,-5,-6,50,3};
		int target =4;
		findMaxAverage(nums,target);
		
		
	}
	
public double findMaxAverage(int[] nums, int target) {
        double sum=0 ; double tempsum=0;
	for(int i = 0;i<target;i++)
	
		sum =sum+nums[i];
		tempsum=sum;
	
	for(int i=target ; i<nums.length;i++)
	{
		sum=sum+nums[i]-nums[i-target];
		tempsum=Math.max(tempsum, sum);
	}
	
	System.out.println(tempsum/target);
	return tempsum/target;
    }

}
