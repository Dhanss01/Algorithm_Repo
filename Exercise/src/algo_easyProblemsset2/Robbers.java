package algo_easyProblemsset2;

import java.util.Arrays;

import org.junit.Test;

public class Robbers {
	
	//@Test
	public void test1()
	{
		int[] nums= {1,2,3,1};
	   System.out.println(rob(nums));		
	}
	@Test
	public void test2()
	{
		int[] nums= {2,3,2};
	   System.out.println(rob(nums));		
	}
	
	
	
	
public int rob(int[] nums) {       
        
        int max=0, right=0;    int sum=0,sum1=0; int left=0;
        int i=0, index=0;
        
        for(int j=0;j<nums.length;j++)
        {
            if(max<nums[j])
            {
              max=nums[j]; 
            }
              
        }
      
        while(i < nums.length) {
			if(nums[i] == max) {
				index = i;
				break;
			}
			i++;
		}
        
       sum=max;
       left=index-2;   
       while(left>=0) 
       {
            sum=sum+nums[left];
            left= left-2;            
        }
        right=index+2;
        while(right<nums.length)
        {
          sum1=sum1+nums[right];
              right=right+2;
        }
     return sum+sum1;   
    }
}
