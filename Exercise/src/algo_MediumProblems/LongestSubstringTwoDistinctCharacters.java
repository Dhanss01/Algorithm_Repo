package algo_MediumProblems;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LongestSubstringTwoDistinctCharacters {
	
	//@Test
	public void test1()
	{
		String s ="eceba";
		findLongestSubstringwithTwodistincchar(s);
	}
	
	@Test
	public void test2()
	{
		String s1= "ccaabbb";
		findLongestSubstringwithTwodistincchar(s1);
	}
		/*pseudo code
		 * Initialize start as 0 in string and end as 0;
		 * iterate through the string when map key value as 2
		 * if you find the duplicate value of the key increment the value by 1
		 * When character value in map key is > 2 then 
		 * find the length of staring and ending index and compare with the max and take the math.max
		 * while map.get(start) count <0 remove that charcter from map 
		 * increment the right index and add character in map till u find the 3rd unique letter
		 * 
		 */
	private int findLongestSubstringwithTwodistincchar(String s) {
		// TODO Auto-generated method stub
		Map<Character, Integer> mymap = new HashMap<Character, Integer>();
		int start=0, end= 0, max=Integer.MIN_VALUE;
		int counter =0;
		
		while(end<s.length())
		{
			char c= s.charAt(end);
			mymap.put(c, mymap.getOrDefault(c, 0)+1);
			if(mymap.get(c)==1)
			{
				counter = counter+1;
				
			}
			end++;
			while(counter>2)
			{
				char temp = s.charAt(start);
				mymap.put(temp, mymap.get(temp)-1);
				if(mymap.get(temp)==0)
				{
				counter--;
				}
				
				start++;
			}
			
			
			max= Math.max(max, end-start);
	    }		
		System.out.println(max);
		return max;
	}
}
