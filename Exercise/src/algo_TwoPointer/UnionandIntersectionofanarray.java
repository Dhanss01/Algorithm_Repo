package algo_TwoPointer;
import java.util.*;
import java.util.Map.Entry;

import org.junit.*;
import org.junit.Assert;
import org.junit.Test;


/*
 * 
 * 4.Solve array intersection problem with 2 pointers
Class Work: Achieve space complexity of O(1) for yesterday's leet code problem-Counting no of occurance of smaller number
 * */

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
 * Input- a = {1, 3, 4, 5, 7}, b= {1,3,6}
 *  Output n= {1,3} ;
 *  Constraint- should not remove the space and special characters
 * 
 * 2) Test data set
 * 
 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
 * interviewer if the data set is fine by his/her assumptions - Comparision
 * between
 * 
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

	
 
public class UnionandIntersectionofanarray {
	
	//@Test 
	public void example1()
	{
		int[] a = {1, 3, 4, 5, 7};
        int[] b= {2, 3, 5, 6} ;
		
        intersection1(a, b);
	}
	

	@Test 
	public void  test3()
	{
		int[] a = {1, 3, 7};
        int[] b= { 5, 6} ;
		
        intersection1(a, b);
	}
	
	//@Test 
	public void example3()
	{
		int[] a = {1, 3, 7};
        int[] b= {} ;
		
        intersection1(a, b);
	}

	
	
	
	public int [] intersection(int[] a, int[] b)
	{
		
		
		HashSet<Integer> sets1 =  new HashSet<Integer>();
		for(int i : a)
		{
			sets1.add(i);
		}
		
		HashSet<Integer> intersections =  new HashSet<Integer>();
		for(int i : b)
		{
			if(sets1.contains(i)) {
				intersections.add(i);
		}}
		int[] result =new int[intersections.size()];
		int index= 0;
		for(int i :intersections)
		{
			 result[index] =i;
			index++;
			System.out.println(result[index]);
		}
		return result;
	}
	
	
	
	//Twopointer
	//pseudocode
	/*1)  initial values  LEFT = 0, RIGHT = 0 
		2) If arr1[LEFT] < arr2[RIGHT] then print arr1[LEFT] and  LEfT++. 
		3) If arr1[LEFT] >  arr2[RIGHT] then print arr2[RIGHT],  RIGHT--. 
		4) If both are same then print  both LEFT and RIGHT.		
	 
	 */
	public void intersection1(int num1[], int num2[])
    {
        int left = 0, right = 0;
        while (left < num1.length && right < num2.length) {
            if (num1[left] < num2[right])
                left++;
            else if (num2[right] < num1[left])
                right++;
            else {
                System.out.print(num2[right++] + " ");
                left++;
        }
    }

}
}
