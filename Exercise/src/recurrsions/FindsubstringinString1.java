package recurrsions;

import org.junit.Test;

public class FindsubstringinString1 {
	
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
	 *  Identify the base case when s does not contain s then exit
		develope the postive test data which can assist easily 
		go for a edge and negative cases
		know the patent s.replace
		implement
	 */

		
		
		@Test
		public void test1() {
			String s= "hello test, welcome to test leaf";
			String b= "test";
			
		}
		@Test
		public void test2() {
			
			
		}
		/*
		public int replacestring(String s, String b)
		{
			
			
			String s1=s.replaceFirst(b, "");
			if(s1.length()!=s.length())
			{
				return 1;
			}
			int count = replacestring(s1,b);
		}
*/
}
