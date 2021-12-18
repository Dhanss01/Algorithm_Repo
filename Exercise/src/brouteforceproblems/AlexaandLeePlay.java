package brouteforceproblems;

import org.junit.Test;

public class AlexaandLeePlay {
	
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
	
	
	
	
	/*add the values in list
	 * Intilialize count =0 and i as list's starting index and j as size-1
	 * when count is even let alexa to pic the greater number from i or j(i(Starting index) and j(ending index) will be adjusted based on size of the list
	 * find the greater number and remove that from list 
	 * sum up the alexa values 
	 *when count is odd let lee to pic the greater number from i or j
	 * find the greater number and remove that from list 
	 * sum up the lee values
	 * if alexa is greater than lee then return true else return false	
	 */
	

	/*Intilialize count =0 and left as starting index and right as length-1
	 * when count is 0 let alexa to pic the greater number from left or right
	 * if left is greater  right then increment the left 
	 * else right is greater than left decrement  the right
	 * sum the alexa values
	 * when count is 1 then let Lee to pick the greater value from left or right 
	 * continue same 
	 *sum the lee values
	 *if alexa is greater than lee then return true else return false	
	 */
	
	
	@Test
	public void test1() {
		int[] data= { 5,3,4,5 };
		System.out.println(stonewinner(data));
		
	}
	
	 public boolean stonewinner(int[] data) {
	        
	        int firstperson=0, secondperson=0;
	        int left= 0, right=data.length-1;
	        
	        while(left<right)
	        {
	            int count=1;
	            if(count%2!=0)
	            {
	            if(data[left]>data[right])
	            {
	                firstperson=firstperson+data[left];
	                left++;
	            }
	            else
	                firstperson=firstperson+data[right];
	                right--;
	            }

	            
	            else
	            {
	            if(data[left]>data[right])
	            {
	                secondperson=secondperson+data[left];
	                left++;
	            }
	            else
	                secondperson=secondperson+data[right];
	                right--;
	            }
	            count ++;
	        }
	        
	        if(firstperson>secondperson)
	        {
	            return true;
	        }
	        else
	        {
	           return  false;
	        }
	    }

}
