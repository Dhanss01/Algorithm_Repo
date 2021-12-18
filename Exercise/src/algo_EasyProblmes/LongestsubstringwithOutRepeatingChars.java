package algo_EasyProblmes;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LongestsubstringwithOutRepeatingChars {
	
	
	@Test
	public void test1() {
		String s="abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
		
	}

	
	 public int lengthOfLongestSubstring(String s) {
		 
		 int start=0; int end=0; int count=0; int d=0;
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		 for(end=0;end<s.length();end++) {
			char c= s.charAt(end);
			
		 map.put(c, map.getOrDefault(c, 0)+1);
		 if(map.get(c)>1) {
			 count++; 
		 }
		 while(count>0) {
			 
			 char temp=s.charAt(start);
			 if(map.get(temp)>1) count--;
			 map.put(temp, map.get(temp)-1);
			 if (map.get(temp)==0)  // If the occurance of the each character becomes zero , remove that character
					map.remove(temp);
			start++;
			 
		 }
		 
		 d = Math.max(d, end - start+1);
		 
		 }
		 return d;
	 }
}
