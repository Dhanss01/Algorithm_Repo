package binarySearch;

import org.junit.Test;

/*Given a string s consists of some words separated by some number of spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
 * 
 * 
 * 
 */
public class Lengthoflastwords {
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
		public void test1() {
			String s= "Hello World";
			System.out.println(lengthOfLastWord(s));
			
			
		}
		@Test
		public void test2() {
			
			String s= "fly me   to    the moon "; 
			System.out.println(lengthOfLastWord(s));
		}
		@Test
		public void test3() {
			
			String s= "luffy is still joyboy "; 
			System.out.println(lengthOfLastWord(s));
		}
	
	
	
	public int lengthOfLastWord(String s) {
	      String[] str = s.split(" ");
	     String k = str[str.length-1];
	     return k.length();
	    }

}
