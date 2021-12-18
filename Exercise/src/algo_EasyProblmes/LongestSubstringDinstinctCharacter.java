package algo_EasyProblmes;

import java.util.HashMap;

public class LongestSubstringDinstinctCharacter {
	
	String s="abcabcbb";
	
	//left right add the right charact in map
	//if right char exist in map increment ur left untill you find that character
	
	public int getLongestSubstring(String s) {
		int left=0, count=0, max=0;
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
	  int[] asccimap = new int[128];
       for(int right=0;right<s.length();right++) {
    	   if(asccimap[s.charAt(right)] == 1) {
    		   while(asccimap[s.charAt(right)]>1) {
    			  asccimap[s.charAt(left++)]--;
    		   }
    	   }
    	   
			
		}
		
		
		return 1;
	}

}
