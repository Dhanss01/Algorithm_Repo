package algo_EasyProblmes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class SortArrayByIncreasingFrequency {
	
	@Test
	public void test1() {
		int[] nums = {1,1,2,2,2,3};
		System.out.println(frequencySort(nums));
	}
	
	public int[] frequencySort(int[] nums) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		List<Entry<Integer,Integer>> list = new ArrayList<Entry<Integer,Integer>>(map.entrySet());		
		Collections.sort(list, Map.Entry.comparingByValue());
		
		int[] output= new int[nums.length];
		int index=0;
		for(Entry<Integer,Integer> entry : list) {
			for(int i=0;i<entry.getValue();i++) 	{	      
				output[index]=entry.getKey();
			    index++;		
			}
			
		}
		return output;		
		
	}

}
