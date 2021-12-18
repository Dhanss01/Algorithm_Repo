package brouteforceproblems;

import java.util.HashMap;
import java.util.Map;
/*
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
 * 
 */


import org.junit.Test;
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

	

public class RomantoInteger {	
	
		
		@Test
		public void test1() {
			
			String s= "III";
			System.out.println(convertintegertoroman(s));
			
			
		}
		@Test
		public void test2() {
			String s= "IV";
			System.out.println(convertintegertoroman(s));
			
		}
		
		@Test
		public void test3() {
			String s= "LVIII";
			System.out.println(convertintegertoroman(s));
			
		}
		
		@Test
		public void test4() {
			String s= "MCMXCIV";
			System.out.println(convertintegertoroman(s));
			
		}
		
		
		public int convertintegertoroman(String s)
		{
	       int result=0;
	       if(s==null||s.length()==0)
	       {
	    	return 0;   
	       }
	       
	       Map<Character, Integer> map = new HashMap<Character,Integer>();
	       
	       map.put('I', 1);
	       map.put('V',5 );
	       map.put('X', 10);
	       map.put('L', 10);
	       map.put('C', 100);
	       map.put('D', 500);
	       map.put('M', 1000);
	       
	       for(int i=0; i<s.length()-1;i++)
	       {
	    	   if(map.get(s.charAt(i))>=map.get(s.charAt(i+1)))
	    	   {
	    		result =result+map.get(s.charAt(i));
	    	   }
	    	   else
	    	   {
	    		  result= result-map.get(s.charAt(i));;
	    	   }	    	   
	       } 
	       result =result+map.get(s.charAt(s.length()-1));
	       
	       return result;
		}

}
