package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

public class SortArrayByIncreasingFrequencey {
	
	@Test
	public void test1()
	{
		int[] nums= {2,3,1,3,2};
		System.out.println(IncreasingOrder(nums));
	}

	
	/*add the array values in to key and keep the count value of each  number in values
	 * sort the map based on the values  in the ascending order
	 * using collections.sort(list , comparatator)
	 * 
	 * 
	 * 
	 * 
	 */
	
	public int[] IncreasingOrder(int[] nums)
	{
		Map<Integer,Integer> hmap = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++)
		{
			hmap.put(nums[i], hmap.getOrDefault(hmap.get(nums[i]),0)+1);
			
		}
		List<Entry<Integer,Integer>> list1 = new ArrayList<Entry<Integer,Integer>>(hmap.entrySet());
		Collections.sort(list1, new Comparator<Entry<Integer,Integer>>(){

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		List<Entry<Integer,Integer>> list2= new ArrayList<Entry<Integer,Integer>>(hmap.entrySet());
		
		Collections.sort(list2, new Comparator<Entry<Integer,Integer>>()
				{
				@Override
				public int compare(Entry<Integer,Integer> o1, Entry<Integer,Integer> o2 ) {
			return o1.getValue().compareTo(o2.getValue());
		}
		
				
				
	});
		
		for(int l=0; l<list1.size();l++)
		{
			System.out.println(list1.get(l));
		}
		
		
		int[] array = new int[nums.length];
		int index=0;

		for(int i=0;i<list1.size();i++)
		{
			//resultsmap.put(list1.get(i).getKey(), list1.get(i).getValue());
			
			int k =list1.get(i).getValue();
			while(k>0)
			{
				array[index]=list1.get(i).getKey();
				index++;
				k--;
			}
			
		}	
		
		   
		return array;
	}
}
