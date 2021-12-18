package recurrsions;

import org.junit.Test;

public class FindFibinocci {

	
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
	 *    Identify the base case 
develope the postive test data which can assist easily 
go for a edge and negative cases
know the patent
implement
	 */

		
		
		@Test
		public void test1() {
			int n =5;
			System.out.print(callfibinocci(n));
		}
		@Test
		public void test2() {
			
			
		}
		
		
		
		/* when N less or equal to zero
		 * postive test data:2 n1=0,n2 =1, n3= (0+1), then n1=n2,n2=n3;
		 *  edge =0 , negative cases negative integers
		 *  n1=n2,n2=n3, sum
		 */
		
		
		public int callfibinocci(int n)
		{
			int output=0;int n1=0,n2=1;
			if(n==0)
			{
				return n;
			}
			if(n>0)  
			{	
			 System.out.println(output= n1+n2);  // 3, 0+1= 1 ,1+1=2
				n1=n2;
				n2=output;			
			}
			
			return callfibinocci(n-1) + callfibinocci(n-2);
		}
		
		
}
