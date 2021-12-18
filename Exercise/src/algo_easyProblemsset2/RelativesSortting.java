package algo_easyProblemsset2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class RelativesSortting {

	@Test
	public void test1()
	{
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		getSortedvaluesRelatively(arr1,arr2);
	}
	
	/*find the first 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void getSortedvaluesRelatively(int[] arr1, int[] arr2)
	{
		
		String strs = "test";
		char[] arr=strs.toCharArray();
		String word = new String(arr);
		String word1 = arr.toString();

		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList());
		Map<Integer, Integer> map= new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			list.add(arr1[i]);
		}
		for(int i =0;i<arr2.length;i++)
		{
			//map.put(arr2[i],1);
			
		   
				int index=0;
				while(index<list.size())
				{
					if(list.get(index).equals(arr2[i]))
					{
					  int k =list.get(i);
					  if(map.containsKey(k))
					  {
						  map.put(k, map.getOrDefault(map.get(k), 1)+1);  
					  }
						
					  else
						  map.put(k, 1);
						
					}	
					index++;
				}
				   
			
		}
		
		
		
		
		
		
		
	}
}
