package recurrsions;

import org.junit.Test;

public class DecodeString {
	
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
	 *    /**
     * 1.Find the base point
     *  2.Find simple test data 
     *  3.Chk logic with edge and
     * negative data 
     * 4.Identify Pattern/logic 
     * 5.Implement
     * 
     * fine the first close bracket, and then immedieate open bracket
     * add the in new string builder whihc has the values from open and close brackts
     * find the immediate open bracket's digit open bracket-1, 
     * based on digit , repeat the stringbuilder values multipletimes
     * clone the SB values is output and clear the string builder.
     * recursive it till there is no open/close brackets;
     * 
     */
	 

		String s1="";
		int i=1;
		int closeindex=0, openindex=0;
		@Test
		public void test1() {
			
			String s= "2[a]2[bc]";
			decodeString(s);
			
			//Output: "aaabcbc"
		}
		@Test
		public void test2() {
			
			
		}
		
		public String decodeString(String s)
		{
			
			StringBuilder sb=new StringBuilder();			
		    s1 = s.substring(s.length() - 1, s.length());
		    if(s1.equals("]"))
		    {
		    	closeindex = s1.indexOf(']');
		    	/*while(!s1.equals("["))
		    	{
		    		sb=sb.append(s.substring(s.length() - i, s.length()));
		    		i++;
		    	}*/
		    }
		    if(s1.equals("["))
		    {
		    	openindex = s1.indexOf('[');		    	
		    }
		    sb=sb.append(s.substring(openindex,closeindex));
			s = s.substring(0, s.length() - 1);
			decodeString(s);
			return "";
		}

}
