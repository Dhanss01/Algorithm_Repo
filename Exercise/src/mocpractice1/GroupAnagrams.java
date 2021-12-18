package mocpractice1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GroupAnagrams {
	
	
	@Test
	public void test1()
	{
		String[] str= {"eat","tea","tan","ate","nat","bat"};
	}
	
	 public List<List<String>> groupAnagrams(String[] strs) {
		 
		 Map<List<List<String>>,Integer> mymap = new HashMap<List<List<String>>, Integer>();
		 Map<Character,Integer> asciimamap = new HashMap<Character, Integer>();
		
		 for(int i =0; i<strs.length;i++)
		 {   
			 char[] c= strs[i].toCharArray();
			 asciimamap.put(c[i],0); 
		 }
		 
		 
		return null;
	        
	    }

}
