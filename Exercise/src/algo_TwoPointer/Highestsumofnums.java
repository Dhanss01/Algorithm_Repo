package algo_TwoPointer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Highestsumofnums {
	@Test
	public void test()
	{
		int[] a = {1,-5,2,-3,7,1};
		System.out.println(retrurnmaximumsum(a));
	
		
	
	}
	@Test
	public void test2()
	{
		int[] a = {-3,-1};
		System.out.println(retrurnmaximumsum(a));
	
		
	
	}
	public int retrurnmaximumsum(int[] num)
	{
		
		
	        int size =num.length;
	        int maxsum = Integer.MIN_VALUE, currentsum = 0;
			 if(num.length==0)
			 {
				 return 0;
			 }
	        for (int i = 0; i < size; i++)
	        {
	            currentsum = currentsum + num[i];
	            if (maxsum < currentsum)
	                maxsum = currentsum;
	            if (currentsum < 0)
	                currentsum = 0;
	        }
	        
	        
	        for(int i=0; i<num.length;i++)
	        {
	        	for(int j=0; i<num.length;j++)
	        	{
	        		currentsum=currentsum+num[j];
	        	}
	        }
	    
	        return maxsum;
	}

}
