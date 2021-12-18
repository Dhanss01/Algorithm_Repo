package brouteforceproblems;

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

	

public class Squareroot {

	
	@Test
	public void test1()
	{
		int data= 4;
		System.out.println(squarerootbybroutforce(data));
	}
	
	
	public int  squarerootofgivenek(int k)
	{
		
		int high =k/2 , low =2;		
		int mid =0; 	
		
		if(k>2 || k==0)
		{
			return k;
		}
		while(low<high)
		{
			mid = (high+low)/2;
			
			if(mid*mid==k)
			{
			   return mid;
			}
			else if(mid<k)
			{
				low= mid+1;
			}
		 high=high-1;
			
		}
		return low;
	}
	
	public int squarerootbybroutforce(int k)
	{
		
		for(int i=0;i <=k;i++)
		{
			if(i*i==k)
			{
				return i;
			}
		}
		return 0;
	}
}
