package mocpractice1;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LongestSubsString {

	/*
	 * 1) Did I understand the problem? 
	 * 
	 * 2) What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? 
	 * 
	 * Input- int[] nums =
	 *  Output -int[] nums =
	 *  Constraint- 
	 * 
	 * 3) Test data set
	 * 
	 * Positive- : s =[0,0,1,1,2,2]
	     Negative -: s=[0]
	      Edge -: s=[]
	 * 
	 * 
	 * 4) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate? 
	 * 4) Ask for hint if don't know to solve? 
	 * 
	 * 5) Do i know any alternate solution? 
	 *    -> No, Solve with the known solution
	 *    
	 *    Pseudo code
	 */

		

	@Test
	public void test1()
	{
		String s= "abcabcbb";
	}
	@Test
	public void test2()
	{
		String s= "bbbbb";
	}
	@Test
	public void test3()
	{
     String s= "pwwkew";
     findMaximumSubstring(s);
	}
	/* init two variables start as  0, end as start+1;
	 * itrate through the string  and add each unique char in map till you find the duplicate character
	 * when you find the duplicate character get the length start-end;
	 *  --> compare with the maximum length and get the maxlength
	 * increase start index till you get the first occurance.
	 * 
	 * 
	 */
	
	public int findMaximumSubstring(String s)
	{
		Map<Character, Integer> stringmap = new HashMap<Character,Integer>();
		int start =0 , end=0;
		int max=Integer.MIN_VALUE;
		while(start < s.length())
		{
			char c= s.charAt(end);
			if(!stringmap.containsKey(c))
			{
				stringmap.put(c, 1);	
			}
			
			else
			{
			
					stringmap.clear();
					start=end;
					stringmap.put(c, 1);
				
			}
			end++;
			
			int length = end-start;
			max=Math.max(max, length);
			
		}
	
		return max;
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
