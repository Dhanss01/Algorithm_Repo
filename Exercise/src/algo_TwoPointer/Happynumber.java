package algo_TwoPointer;

import java.util.HashSet;

import org.junit.Test;


/*
 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
 * provide more detail with example(s) -> If yes, go to next step !!
 * 
 * Yes
 * 
 * What is the input(s)? What is the expected output? Do I have constraints to
 * solve the problem? Do I have all informations to go to next step!! How big is
 * your test data set will be?
 * 
 * Input- int[] nums = {2,0,2,1,1,0}
 *  Output -int[] nums = {0,0,1,1,2,2}
 *  Constraint- should not remove the space and special characters
 * 
 * 2) Test data set
 * 
 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
 * interviewer if the data set is fine by his/her assumptions - Comparision
 * between
 * 
 * Positive- : n = 19
     Negative :n=0
      Edge -: 
 * 
 * 
 * 3) Do I know how to solve it?
 * 
 * Yes - great, is there an alternate? 
 * 4) Ask for hint if don't know to solve? 
 * 
 * 5) Do i know any alternate solution? 
 *    -> No, Solve with the known solution
 *    
 * 6) If alternate solution found -> Find the O notation 
 *     -> Explain either or the best one depends on time
 *     -> Approach 01 : Starts with worst(Brute force)
 *     -> Approach 02: Write the options and benefits of it 
 *     -> Always start from worst to best
 *     
 * 7) Proceed with pseudocode 
 * 
 * 8) Implement code in editor
 * 
 * 9) Test against data set
 * 
 * 10) Debug if it fails    
 */

	
	

public class Happynumber {
	/**
	Write an algorithm to determine if a number n is happy. A happy number is a number defined by the following process:

		Starting with any positive integer, replace the number by the sum of the squares of its digits.
		Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
		Those numbers for which this process ends in 1 are happy.
		Return true if n is a happy number, and false if not.

		Example 1:

		Input: n = 19
		Output: true
		Explanation:
		12 + 92 = 82
		82 + 22 = 68
		62 + 82 = 100
		12 + 02 + 02 = 1

		Example 2:
		Input: n = 2
		Output: false
		
		*/
	
	
	@Test
	public void test1() {
		
		System.out.println(isHappye3(19));
		

	}
   @Test
	public void test2() {
		
		System.out.println(isHappye3(2));
		

	}
 @Test
	public void test3() {
		
		System.out.println(isHappye3(1));
		

	}
	//@Test
	public void test4() {
		
		System.out.println(isHappye3(0));
		

	}

	
	
	//get the sum of squares of a given number
	//repeat the process of squaring and add the digtis till it get to 1   o(n/2), o(1)
	// if we get n == 1 we return true otherwise we return false;
	private boolean findnumber1(int i) {
		
		if(i==1) {
			return true;
		}
		else if (i>1 && i<=6 || i==0) {
			return false;	
		}
		
		int n =0;
		while(i>0) {
			n+=(int) (Math.pow(i%10, 2)); //81 +1
		//	System.out.println("Value of n"+n);   // i % 10;
			i/=10; //1                             // i / 10;   //n = n+(d * d)
		//	System.out.println("Value of i"+i);
			
		}
		return findnumber1(n);
	}
	
	
	public boolean isHappy(int n) {
	    HashSet<Integer> set = new HashSet<Integer>();
	 
	    while(!set.contains(n)){
	        set.add(n);
	 
	        n = getSum(n);
	 
	        if(n==1)
	            return true;
	    }
	 
	    return false;
	}
	 
	public int getSum(int n){
	    int sum =0;
	    while(n>0){
	        sum+=(n%10)*(n%10);
	        n=n/10;
	    } 
	    return sum;    
	}
	
	
	
	public boolean isHappye3(int n)
	{
		///if n = 4, there will be endlessly cycle
			      while (n<=6) {
			          int sum = 0;			          
			          while (n != 0) {
			              sum += Math.pow(n%10, 2);
			              n /= 10;
			          }
			          n = sum;
			          if(n == 1){
			              return true;
			          }
			      }
			      return false;
			  
	}
	//Twopointer
	/*
	 * Input: n = 19
		Output: true
		Explanation:
		12 + 92 = 82
		82 + 22 = 68
		62 + 82 = 100
		12 + 02 + 02 = 1

	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	 
	

}
