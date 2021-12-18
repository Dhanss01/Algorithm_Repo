package algo_EasyProblmes;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class UniqueKeyElementsSum {
	
	@Test
	public void test1()
	{
		int[] nums= {1,2,3,2};
		System.out.println(sumOfUnique(nums));
	}
	
public int sumOfUnique(int[] nums) {
        
        int sum=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        //map.keySet().
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:nums)
        {
        	if(map.get(i)==1)
        	{
        		sum=sum+i;
        	}
        }
        
        /*for( Integer i : map.keySet())
        {
            if(map.get(i)==1)
            {
                sum=sum+i;
               
            }
        }*/
      return sum;  
    }

}
