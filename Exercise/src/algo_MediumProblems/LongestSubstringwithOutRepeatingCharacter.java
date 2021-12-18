package algo_MediumProblems;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringwithOutRepeatingCharacter {
	/*get the string and startingindex=0, endingindex=0;
	 * Initialize hashmap
	 * increment the endingindex add each unique char and get the length of the string 
	 * add the char from string into a map until you find a repetitive char 
	 * check with the max length add take the max length
	 *  if that char exist in the map
	 *  get that char and remove it from map
	 * 
	 * 
	 * 
	 */
	//@Test
	public void test1()
	{
		String s ="abcabcaa";
		Assert.assertEquals(3, findUniqueLongestSubstring(s));
	}
	
	//@Test
	public void test2()
	{
		String s ="pwwkew";
		Assert.assertEquals(3, lengthOfLongestSubstring(s));
	}
	
	@Test
	public void test3()
	{
		String s ="abcabcd";
		Assert.assertEquals(4, findUniqueLongestSubstring(s));
	}
	
	//pwwkew

	private int findUniqueLongestSubstring(String s) {
		// TODO Auto-generated method stub
		int currentlength=0, maxlength=0;
		Map<Character,Integer> seenmap= new HashMap<Character,Integer>();
		int startingindex=0,endingindex=0;
		
		for(endingindex=0;endingindex<s.length();endingindex++)
		{
			char c= s.charAt(endingindex);
			while((seenmap.get(c) !=null)&& startingindex<=endingindex) {
				seenmap.remove(c);
				startingindex++;
			}
			
			seenmap.put(c, 1);
			currentlength=endingindex-startingindex+1;
			maxlength=Math.max(currentlength, maxlength);
		}
	   System.out.println(maxlength);
		return maxlength;
	}
	
	  public int lengthOfLongestSubstring(String s) {
	        Map<Character, Integer> map = new HashMap<>();
	        int begin = 0, end = 0, counter = 0, d = 0;

	        while (end < s.length()) {
	            // > 0 means repeating character
	            //if(map[s.charAt(end++)]-- > 0) counter++;
	            char c = s.charAt(end);
	            map.put(c, map.getOrDefault(c, 0) + 1);
	            if(map.get(c) > 1) counter++;
	            end++;
	            
	            while (counter > 0) {
	                //if (map[s.charAt(begin++)]-- > 1) counter--;
	                char charTemp = s.charAt(begin);
	                if (map.get(charTemp) > 1) counter--;
	                map.put(charTemp, map.get(charTemp)-1);
	                begin++;
	            }
	            d = Math.max(d, end - begin);
	        }
	        return d;
	    }

}
