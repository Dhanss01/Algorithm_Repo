package binarySearch;

import org.junit.Test;

/*Given a sorted character array and a target character, find the next biggest character in the array.
 char[] cha = {‘b’, ‘d’ , ‘h’};
char k = ‘e’
Output ->  h
 * 
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

public class FindtheBiggestCharofTarget {
	
	@Test
	public void test1()
	{
		char[] chr=  {'a','b','c','g'};
		char c = 'e';
		System.out.println(retrunbiggestcharoftarget(chr,c)); 
	}
	@Test
	public void test2()
	{
		char[] chr=  {'a','b','c',};
		char c = 'e';
		System.out.println(retrunbiggestcharoftarget(chr,c)); 
	}
	@Test
	public void test33()
	{
		char[] chr=  {};
		char c = 'e';
		System.out.println(retrunbiggestcharoftarget(chr,c)); 
	}

	//binary search
	
	public char retrunbiggestcharoftarget(char[] chr, char c)
	{
		int low = 0, high = chr.length-1;int mid=0;
		
		while(low<=high)
		{
			 mid= (low+high)/2;
			
			if(chr[mid]<=c)
			{
				low = mid+1;
			}
			else if(chr[mid]>c)
			{
				return chr[mid];
			}
			else
			high= mid-1;		
			
		}
		
		return ' ';
	}
	
	
	//brouteforce
	 public char retrunbiggestcharoftargetBF(char[] chr, char target) {
	        for (char ch: chr)
	            if (ch > target) 
	            	return ch;
			return target;
	        
	    }
}
//return chr[0];