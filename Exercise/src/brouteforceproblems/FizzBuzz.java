package brouteforceproblems;

import org.junit.Test;

public class FizzBuzz {
	
	/*
	 * 1) Did I understand the problem? 
	 * 
	 * 2) What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? 
	 * 
	 * Input- int nums =5
	 *  Output -int[] nums =
	 *  Constraint- 
	 * 
	 * 3) Test data set
	 * 
	 * Positive- : s = 6
	     Negative -: s= 2
	      Edge -: 0
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
			
			int num =3;
			fizzBuzz(num);			
		}
		
		@Test
		public void test2() {
			int num =15;
			fizzBuzz(num);			
		}
		@Test
		public void test3() {
			int num =0;
			fizzBuzz(num);				
		}
		
	/*get the n value
	 * if the n value is divisible by 3 then instead of number print fizz
	 * if the n value divisible by 5 then print buzz instead that n value
	 * if n is divisible by both 3 and 5 then print fizzbuzz
	 * 
	 * 
	 */
		 public void fizzBuzz(int num) {		  
			

			    for (int i = 0; i <= num; i++) {		     

			      if (i%3==0 && i%5==0) {			        
			        System.out.println("FizzBuzz");
			      }

			      if (i%3==0 && i%5!=0) {			        
			    	  System.out.println("Fizz");
			      }
			      
			      if (i%3!=0 && i%5==0) {				       
				    	  System.out.println("Buzz");
				  }
			      else
			      {
			    	  System.out.println(i);
			      }

			  }
			}
		 
	
	/* init left =1,right=left+1;
	 * if the left value is divisible by 3 then instead of number print fizz
	 * if the n value divisible by 5 then print buzz instead that n value
	 * if n is divisible by both 3 and 5 then print fizzbuzz
	 * 	
	 */
		 
		 
	
}
