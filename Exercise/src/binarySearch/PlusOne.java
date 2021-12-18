package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PlusOne {
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
	
		Integer[] data = {1,2,3};
		
		
		ArrayList<Integer> list1 =
	            new ArrayList<Integer>(Arrays.asList(data));
		System.out.println(plusOne(list1));
		
		
	}
	@Test
	public void test2() {
		
		
	}
		

	
	 public ArrayList<Integer> plusOne(ArrayList<Integer> list1) {				
			
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      int n= list.size();
	      list.set(n-1, list.get(n-1)+1);
	      int carry = list.get(n-1)/10;
	     
	      list.set(n-1, list.get(n-1)%10);
	       
	      
	      for(int i =n-2 ; i>1;i--)
	      {
	    	  list.set(i, list.get(i)+1);
		       carry = list.get(i)/10;
		      if (carry==1)
		      {
		    	  list.set(i, list.get(n-1)%10);
		      }
		      else
		      {
		    	  break;
		      }
	      }
	     if(carry==1)
	     {
	    	 list.set(0, 1); 
	     }
	     
	     return list; 
	    
	 }
}
