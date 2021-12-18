package algo_easyProblemsset2;

import java.util.HashMap;

import org.junit.Test;

public class MajorityElements {

	
	@Test
public void test1()	
{
	int[] nums= {2,2,1,1,1,2,2};
	System.out.println(getmajorityNumbers(nums));
}
	public int getmajorityNumbers(int[] nums)
	{
		HashMap<Integer,Integer> elements= new HashMap<Integer,Integer>();
		int k =nums.length/2;
		int max=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(elements.containsKey(nums[i]))
			{
				elements.put(nums[i],elements.getOrDefault(nums[i],1)+1);
			}
			else
			elements.put(nums[i],1);
		}
		
		for (Integer key : elements.keySet()) {
            if(elements.get(key)>k)
            	max=key;
        }
		return max;
	}
}
