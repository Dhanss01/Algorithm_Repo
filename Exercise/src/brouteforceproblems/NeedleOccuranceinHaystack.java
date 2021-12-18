package brouteforceproblems;

import org.junit.Test;/*
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



public class NeedleOccuranceinHaystack {

	@Test
	public void test1() {
		
		String haystack = "hello", needle = "ll";
		System.out.print(Needleoccurancebrouteforce(haystack,needle));
	}
	@Test
	public void test2() {
		String haystack = "aaaaa", needle = "bbb";
		System.out.print(Needleoccurancebrouteforce(haystack,needle));
		
	}
	/*read the character from needle string 
	 * ensure that charcter is appeared in haystack as a substring
	 * 
	 * 
	 */

	public int  Needleoccurance(String haystack,String needle)
	{
		if(haystack.contains(needle))
		{
			return haystack.indexOf(needle);
		}
		return -1;
	}
	
	public int  Needleoccurancebrouteforce(String haystack,String needle)
	{
		if(haystack.length()<needle.length() || needle.length()==0||haystack.length()==0)
		{
			return -1;
		}
		
		for(int i=0;i<haystack.length();i++)
		{
			for(int j=0;j<needle.length();j++)
			{
				if(needle.charAt(j)==haystack.charAt(i))
				{
					return haystack.indexOf(haystack.charAt(i));
				}			
		
			}
		}
		return 0;
	}
	
}
