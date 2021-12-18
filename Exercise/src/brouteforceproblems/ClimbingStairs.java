package brouteforceproblems;

import org.junit.Test;

/*You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * 
 * 
 */

public class ClimbingStairs {
	
	@Test
	public void test1() {
		int k =3;
		System.out.println(climbstairs(k));
		
	}
	@Test
	public void test2() {
		int  k=2;
		System.out.println(climbstairs(k));
	}

	
	 public int climbstairs(int n)
	 {
		 
		       if(n==1) {
		    	   return 1;
		       }
		       int first =1,  second =2;
		       for(int i=3; i<n;i++)
		       {
		    	   int third= first+second;
		    	   first=second;
		    	   second=third;
		       }
		       return second;
		       
	 }

}
