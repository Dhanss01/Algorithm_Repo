package brouteforceproblems;

import org.junit.Test;

/*Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
 * 
 */

public class LongestCommonPrefix {
	
	@Test
	public void test1()
	{
		String[] str= {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(str));
	}
	@Test
	public void test2()
	{
		String[] str= {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(str));
	}
	@Test
	public void test3()
	{
		String[] str= {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(str));
	}

	
	//Take a string and keep that in outer array
	//compare each character in that first string with all other string's character
	//if both characters are equal then get append that in to a subsstring called m
	//if its not equal or string length of that inner loops is greater than then stop the process and exit 
	//
	
	public String longestCommonPrefix(String[] strs) {
		  StringBuilder sbf = new StringBuilder();
		  if(strs.length==0)
		  {
			  return "";
		  }
			  
		for(int i =0; i< strs[0].length();i++)
		{
			for(int j=1; j<strs.length;j++)
			{
				int index=0;
			   if(strs[0].charAt(i)!=strs[j].charAt(i)|| i>=strs[j].length())
			   {
				  return strs[0].substring(0,j);
				 
			   }
			   index++;
			  
			}
			
		}
		
		
	   return strs[0];
	   
	   
	}
}
