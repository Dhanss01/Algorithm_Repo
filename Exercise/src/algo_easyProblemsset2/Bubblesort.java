package algo_easyProblemsset2;

import org.junit.Test;

public class Bubblesort {

	
	
	
	@Test
	public void test2()
	{
		int[] nums= {-4,-1,2,3};
		
		System.out.println(getbubbleSort(nums));
	}
	public int[] getbubbleSort(int[] nums)
	{
		int temp=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=1;j<nums.length-i;j++)
			{
				if(nums[i] > nums[j])
				{  
                      
                    temp= nums[i];  
                    nums[i] = nums[j];  
                    nums[j] = temp;  
				}
			}
		
		}
		return nums;
	}
	

}