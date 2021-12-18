package algo_easyProblemsset2;

import java.util.HashMap;
import java.util.TreeMap;
import org.junit.Assert;
import org.junit.*;
import java.util.Map;
import java.util.Map.Entry;

public class SortbyColor {

	@Test
	public void test1()
	{
		int[] nums= {2,0,2,1,1,0};
		int[] results= {0,0,1,1,2,2};

		Assert.assertArrayEquals(results,getColrsSorted(nums));
		
	}
	
	public int[] getColrsSorted(int[] nums)
	{
		Map<Integer, Integer> hmap= new TreeMap<Integer,Integer>();
		for(int i=0;i<nums.length-1;i++)
		{
			if(hmap.containsKey(nums[i]))
			hmap.put(nums[i], hmap.getOrDefault(hmap.get(nums[i]),0)+1);
			else
				hmap.put(nums[i],0);
		}
		
		
		for ( Integer key : hmap.keySet() ) {
			int i=0;int count=0;
		while(count<=hmap.get(key)){	
		 nums[i]=(int)key;
		 i++;
		 count++;
		}
		}
		return nums;
	}
}
