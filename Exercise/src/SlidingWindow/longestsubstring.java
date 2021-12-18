package SlidingWindow;

import org.junit.Test;

public class longestsubstring {
	
	/*Given a string s, find the length of the longest substring without repeating characters.

	 

	Example 1:

	Input: s = "abcabcbb"
	Output: 3
	Explanation: The answer is "abc", with the length of 3.
	Example 2:

	Input: s = "bbbbb"
	Output: 1
	Explanation: The answer is "b", with the length of 1.
	Example 3:

	Input: s = "pwwkew"
	Output: 3
	Explanation: The answer is "wke", with the length of 3.
	Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
	
	

	//Input: s = "abcabcbb"
	/*
	 * create a new assci array with the length as 128
	 * create two pointers left, Right  as a starting index.
	 * max = 0; 
	 * by using right index loop through the s.chart(i)
	 * if value in ascii array is zero then add the count as 1;
	 * if the value in ascii is > 1 then we need increment left and  decrement value at the left index
	 * get the max value with max and right-left
	 * return max
	 */
 
 
	@Test 
	public void test1()
	{
		String s = "abcabcbb";
		System.out.println(gettheLogestsubstringcount(s));
	}
	
	@Test 
	public void test2()
	{
		String s = "";
		System.out.println(gettheLogestsubstringcount(s));
	}
	@Test 
	public void test3()
	{
		String s = "bbb";
		System.out.println(gettheLogestsubstringcount(s));
	}
	@Test 
	public void test4()
	{
		String s = "abc";
		System.out.println(gettheLogestsubstringcount(s));
	}
	public int gettheLogestsubstringcount(String s)
	{
		
		int[] count = new int[128];
		 int left=0; int right =0, max=0;
		 for( right =0 ;right < s.length();right++ )
		 {
			 //count[s.charAt(right)];			
			 if(count[s.charAt(right)]++==1) 
				 while(count[s.charAt(right)] >1)	 
				 {
					 
					 --count[s.charAt(left++)];
					 
				 }
			 
			 max = Math.max(max,right-left+1);
			 
		 }
		 
		 
		return max;
	}
}
