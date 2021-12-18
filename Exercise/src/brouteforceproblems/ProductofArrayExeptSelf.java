package brouteforceproblems;

import org.junit.Test;

public class ProductofArrayExeptSelf {
	
	
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

		
		
		//@Test
		public void test1() {
			int[] data = {3,8,2,16,7};
			GetProductofanarraysexceptself(data);
			
			
		}
		//@Test
		public void test2() {
			int[] data = {3,3,3,3,3};
			GetProductofanarraysexceptself(data);
		}
		@Test
		public void test3() {
			int[] data = {3,0,4,6};
			GetProductofanarraysexceptself(data);
			
		}
		//@Test
		public void test4() {
			int[] data = {7,4,-1};
			GetProductofanarraysexceptself(data);
			
		}

		
		public int[] GetProductofanarraysexceptself(int[] data)
		{ 
			int[] output = new int[data.length];
			
			for(int i=0; i<data.length;i++)
			{
				int product=1;
				for(int j=0; j <data.length;j++)
				{
					if(i==j)
					{
						continue;
					}
					else if(data[i]==0)
						
						
					{
						continue;
					}
					else
					{
						product= product*data[j];
					}
				}
				output[i]=product;
				System.out.println(output[i]); 
			}
			return output;
		}
		
		

}
