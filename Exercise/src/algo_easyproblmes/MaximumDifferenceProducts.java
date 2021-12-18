package algo_easyproblmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class MaximumDifferenceProducts {
	
	
	
	@Test
	public void test1() {
		int[] arr= {5,6,2,7,4};
		returnParis(arr);
		//int target;
		
	}
	
	public int returnParis(int [] numbers){
		int prod=0;
		List<Integer> arrlist=new ArrayList<Integer>();
		HashMap<List<Integer>,Integer> map =new HashMap<List<Integer>,Integer>();
   
		if(numbers==null) {
			throw new RuntimeException("given input array is null");
		}

	
		for(int i=0;i<numbers.length;i++){

		for(int j=i+1;j<numbers.length;j++){
		prod=0;
		arrlist.clear();
		prod=numbers[i]*numbers[j];	
	
		//arrlist.addAll(Arrays.asList(numbers[i],numbers[j]));
		arrlist.add(numbers[i]);
		arrlist.add(numbers[j]);
		map.put(arrlist, prod);	
		}
		//sum-=numbers[j];
		}
		
		List<Entry<List<Integer>, Integer>> sort=new ArrayList<Entry<List<Integer>, Integer>>(map.entrySet());
		Collections.sort(sort, Map.Entry.comparingByValue());
		List<Integer> listvalue= new ArrayList<Integer>();
		for(Entry<List<Integer>, Integer> entry : sort)
		{
	    listvalue.add(entry.getValue());
		}
	    int result= listvalue.get(0)-listvalue.get(listvalue.size()-1);
		
		return Math.abs(result);
		}


}
