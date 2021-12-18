package algo_TwoPointer;

import org.junit.Test;

public class MovePostitivenumberstoEnd {
	
	@Test
	public void test1()
	{
		int[] nums= {2,1,-6,-1,0};
		System.out.print(movenegnumstoend(nums));
		
		
		
	}
	
	//Get the nums
	//loop through the nums till the last num and 
	 // if num[j] is >= 0 then add that to the index 0 and increment the index
	//add all the postive at the rigt side of the array 
	public int[] movenegnumstoend(int[] nums)	
	{
		int i=0;
		for(int j=0; j<nums.length;j++)
		{
			if(nums[j] >=0)
			{
				nums[i]=nums[j];
				i++;
			}
			
		}

		for(int j=i; j<nums.length;j++)
		{
			if(nums[j] <0)
			{
				nums[i]=nums[j];
				i++;
			}
			
		}
		return nums;
		
	}

}
