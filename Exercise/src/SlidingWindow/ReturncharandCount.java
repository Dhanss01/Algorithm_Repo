package SlidingWindow;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class ReturncharandCount {
	//Problem
		/* 
		 */
		
		
		/*1) Did I understand the problem? 
		 * 
		 * 2)What is the input(s)? What is the expected output?
		 * 
		 * 3)Test data set
		 * Positive : Negative:  Edge:
		 * 
		 * 4) how to solve it?
		 * 
		 * 5)Alternate approach
		 * 
		 * 6)pseudo code
		 *
		 */

		
	@Test
	public void test1()
	{
		String str = "aaabccdde";
		System.out.println(charscountofstring(str));
	}
	@Test
	public void test2()
	{
		String str = "e";
		System.out.println(charscountofstring(str));		
	}
	@Test
	public void test3()
	{
		String str = "";
		System.out.println(charscountofstring(str));
	}
	
	public StringBuilder charscountofstring(String str)
	{
		Map<Character,Integer> mymap = new LinkedHashMap<Character,Integer>();
		StringBuilder usestring= new StringBuilder();
	for(int i=0;i<str.length();i++) {		
		mymap.put(str.charAt(i), mymap.getOrDefault(str.charAt(i), 0)+1);
		}
	  for(Map.Entry<Character,Integer> entry : mymap.entrySet())
	  {
		  usestring.append(entry.getKey()+""+entry.getValue());
	  }
	  return usestring;
	  
	}

}

