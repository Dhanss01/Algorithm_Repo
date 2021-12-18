package algo_EasyProblmes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.junit.Test;

public class SecondMostOccurance {
	
	@Test
	public void test1()
	{
		String[] arr= {"red","green","green","green","blue","blue","red","green","red","yellow","purple","red"};
		System.out.println(getSecondMostOccurance(arr));
	}
	
	public String getSecondMostOccurance(String[] str) {
		int secondmax=0; String result =null;
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		for(String s :str) {
			if(map.containsKey(s)) {
			map.put(s, map.getOrDefault(s, 0)+1);
			}
			else map.put(s, 1);
		}
		int value=0, firstmax=0;
		for(String key :map.keySet()) {		
			
			value=map.get(key);
			
			firstmax = (value>firstmax) ? value:firstmax;
			
			if(value>secondmax && value<firstmax) {
				secondmax=value;
			}
						
		}
		
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();			
			if(next.getValue()==secondmax) {
				 result =next.getKey();
			  return result;
			}
			
		}
		return null;

		
	}

}
