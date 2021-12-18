package algo_TwoPointer;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class ProductoftheElements {
	
	@Test
	public void eg1()
	{
		//int[] nums= {1,2,3,4};
		int[] nums= {1,2-3,1};
		//int[] nums= {0};
		
		System.out.println(prodelements(nums));
	}
	
	
public String prodelements(int[] nums)		
{
		

    int[] values=new int[nums.length];
    int product=1;
   
    for(int i=0;i<nums.length;i++) //ignore zero
    {
    product=product*nums[i];
    }
    
    for(int i=0;i<nums.length;i++)
    {
    int temp=nums[i];
    values[i]=product/temp;
    }
    
   return Arrays.toString(values);
		   
  
    
}

}
