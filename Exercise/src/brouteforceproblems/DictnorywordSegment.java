package brouteforceproblems;

import org.junit.Test;

public class DictnorywordSegment {

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
		 String s= "thedailyhabbit";
		 String[] dict= {"the","daily","habbit"};
		 System.out.print(findDictinString(s,dict));
			
		}
		@Test
		public void test2() {
			 String s= "thedailydaily";
			 String[] dict= {"the","daily"};
			 System.out.print(findDictinString(s,dict));
			
		}
		
		
		public boolean findDictinString(String s, String[] dict)
		{
			for(int i=0;i<dict.length;i++)
			{
				if(s.contains(dict[i]))
				{
					s=s.replaceAll(dict[i], "");
				}
			}
			if(s.length()==0)
			{
				return true;
			}
			else
			return false;
			
		}
}
