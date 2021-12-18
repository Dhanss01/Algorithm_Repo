package recurrsions;

import java.util.ArrayList;

import org.junit.Test;

public class Find1sand0s {

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
		int[] nums= {1,0,0,0,1,1,0,1};
		//ArrayList<Integer> nums= new ArrayList<Integer>();

	}
	@Test
	public void test2() {


	}

			/*Identify the base case index<length;
				develope the postive test data which can assist easily if(index=1),count ++;,return count 
				go for a edge and negative cases {},{0,0,0}, 
				know the patent: call the functions
				implement
			 * 
			 * 
			 */
	/*
	public int callfind1(int num, int reminder)
	{
         int count;
		num=num%10;
		reminder=num/10;
		if(reminder==1)
		{
			return 1;
		}
		
		
		//int count +=callfind1(num,reminder);
		
	}

*/
}
