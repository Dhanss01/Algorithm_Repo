package algo_easyProblemsset2;

import org.junit.Test;

public class SubbaryySum {

	@Test
	public void test1()
	{
		int[] nums= {2,3,1,2,4,3};
		int target =7;
		System.out.println(getMatchingpairs(nums,target));
	}
	
	//left =0, right =1
	//sum =left+right: sum<target right++
	//sum>=target left++;;
	//sum==target return right-left+1;
	public int getMatchingpairs(int[] nums,int k)
	{
		int left=0, right=0, sum=0,result=0;
		int min=Integer.MAX_VALUE;
		while(right<nums.length&&left<nums.length)
		{
			if(sum<k){
			sum+=nums[right];	
			right++;
			}
			else if(sum>k)
			{
				sum=sum-nums[left];
				left++;
			}
			else if(sum==k)
			{
				result=right-left;
				min=Math.min(result,min);
				sum=sum-nums[left];
				left++;
			}
			
		}
		return min;
	}
}
