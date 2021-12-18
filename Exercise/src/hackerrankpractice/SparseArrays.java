package hackerrankpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class SparseArrays {
	
	@Test
	public void test1()
	{
		List<String> strs = Arrays.asList("ab","ab","abc");		
		List<String> queries = Arrays.asList("ab","bc","abc");
		
		System.out.println(matchingStringswaste(strs,queries).toString());
	}
	
	 private List<Integer> matchingStrings(List<String> strs, List<String> queries) {
		// TODO Auto-generated method stub
		 //List<Integer> listcount = new ArrayList<Integer>();
		 Map<String, Integer> resutlsmap = new HashMap<String, Integer>();
		 for(String m : queries) {
			 for(String k: strs)
			 {
				 if(m.equals(k))
				 {
					 resutlsmap.put(m,resutlsmap.getOrDefault(m, 0)+1);
				 }
				 else
				 {
					 resutlsmap.put(m,0);
				 }
			 }
			 
		 }
		 List<Integer> listcount  = new ArrayList<Integer>(resutlsmap.values());
		
		return listcount;
	}

	public static List<Integer> matchingStringswaste(List<String> strings, List<String> queries) {
		
		    // Write your code here
		
			// Write your code here

			Set<String> dict = new HashSet<>();
			for (String word : queries) {
			    dict.add(word);
			}
			List<Integer> result = new ArrayList<>();
			Map<String, Integer> map = new HashMap<>();
			for (String str : strings) {

			    if (dict.contains(str)) {
			        map.put(str, map.getOrDefault(str, 0) + 1);
			    }
			}

			for (String query : queries) {
			    result.add(map.getOrDefault(query, 0));
			}
			return result;
			}
	 }

	 
	 
	  
