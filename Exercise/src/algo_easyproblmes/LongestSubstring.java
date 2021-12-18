package algo_easyproblmes;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class LongestSubstring {
	
	@Test
	public void test1() {
		String s= "abcabcbb";
		repeatedSubstringPattern(s);
		
	}
	
	//read each character from string
	//check if that char is available in string builder 
	//append then with String builder
	// then get a substring add that in map
	
	public boolean repeatedSubstringPattern(String s) {
		Map<String,Integer> map =new HashMap<String,Integer>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		String value= sb.toString();
		if(!(value.contains(""+c)))
		{
			sb.append(c);			
		}
		else {
			
			map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
			sb=sb.replace(0, sb.length(), ""+c);
		}
		}
		
		for(Entry<String, Integer> key :map.entrySet()) {
			
			if(key.getValue()==2) {
				return true;
			}
		}
			
		
		return false;
		} 
        
    }
	
	


