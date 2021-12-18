package SlidingWindow;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Productoftwonumbersmatchesthetarget {
	

	//Problem
	/* given a integer array and target value find the distinct product of two numbers 
	that matches the target
	int[] nums= {2,3,1,5}; int  target =5
	int[] nums= {6,3,2,1}; int  target =6
	int[] nums = {6,2,8,2,16,1} int k=15;
	
	 */
	
	
	/*1) Did I understand the problem? 
	 * 
	 * 2)What is the input(s)? What is the expected output?
	 * 
	 * 3)Test data set
	 * Positive : Negative:  Edge:
	 * 
	 * 4) how to solve it?
	 * 
	 * 5)Alternate approach
	 * 
	 * 6)pseudo code
	 *
	 */

	
	@Test
	public void test1()
	{
		//int[] nums= {6,3,2,1}; 
		int[] nums = {10,2,41,7,40,36};
        int target =70;
        System.out.println(prodoftwo(nums,target));
		
	}
	
	public Set<Integer>  prodoftwo (int[] nums, int k) {
       
		List<Integer> inputs = new LinkedList<Integer>();
       for(int i :nums)
       {
    	   inputs.add(nums[i]);
       }

        int opt = 0;    
        int newSum=0;// optimal solution so far          

        Set<Integer> sums = new HashSet<>();
        sums.add(opt);
        Set<Integer> newSums = new HashSet<>();

        // loop over all input values
        for (Integer input : inputs) {
           

            // loop over all sums so far                        
            for (Integer sum : sums) {
                 newSum = sum * input;

                // ignore too big sums
                if (newSum <= k) {
                    newSums.add(newSum);

                    // update optimum                       
                    if (newSum > opt) {
                        opt = newSum;
                    }
                }
            }

            sums.addAll(newSums);
        }
	//@Test
		return newSums;

	}


}
