package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionsArrays {

	/*
	 * 1) Did I understand the problem? 
	 * 
	 * 2) What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? 
	 * 
	 * Input- int[] nums = {2,2,3,4,5,6}, {2,2,4,4,9}
	 *  Output -int[] nums ={2,2,4}
	 *  Constraint- 
	 * 
	 * 3) Test data set
	 * 
	 * Positive- :  = {6,6,3}, {1,2,6,6}
	     Negative -: ={1,3,5}{4,2,7}
	      Edge -:  = {2,2,3,4,5,6}, {2,2,4,4,9}
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
	 *    create a two pointer
	 *    traverse through the first input array and check each element consist in array2
	 *    if so add that in output array ,
	 *    
	 */
	//05:00 PM
	@Test
	public void test1()
	{
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		Assert.assertArrayEquals(new int[]{2,2},intersections(nums1,nums2));
	}
	
	@Test
	public void test2()
	{
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		Assert.assertArrayEquals(new int[]{4,9},intersections(nums1,nums2));
	}
	
	public int[] intersections(int[] nums1,int[] nums2)
	{
		int size= nums1.length>nums2.length? nums2.length:nums1.length;
		int[] output = new int[size];
		List<Integer> templist = new ArrayList<>();
		 int left=0,right=0;
	        
		 Arrays.sort(nums1);
		 Arrays.sort(nums2);
	        
	        while(left < nums1.length && right < nums2.length){
	            if(nums1[left] < nums2[right])
	            {
	                left++;
	            } 
	            
	            else if(nums1[left] == nums2[right])
	            {
	                templist.add(nums1[left]);	               
	                left++;
	                right++;
	            }
	            else  
	            {
	                right++;
	            }
	            
	        }
	        
	        
	        int index = 0;
	        int[] result = new int[templist.size()];
	        for(int i : templist){
	            result[index] = i;
	            index++;
	        }
	        return result;
	  
	}
	
}
