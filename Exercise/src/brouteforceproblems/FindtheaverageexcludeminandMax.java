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

	
	
	
public class FindtheaverageexcludeminandMax {
	
	@Test
	public void test1() {
     double[] nums = {15000,30000,6000,700.45,5999};		
		System.out.println(averageofarray(nums));
	}
	@Test
	public void test2() {
		
		double[] nums = {30.33,60.50,700.45,5.999};		
		System.out.println(averageofarray(nums));
	}
	
	
	public double averageofarray(double[] nums)
	{
		
		double minimum = nums[0];
		double maximum=nums[0];
		int sum= 0, count=0;
		
		if(nums.length==0)
		{
			return 0;
		}
		
		for(double values : nums)
		{
			maximum= Math.max(values, maximum);
			minimum = Math.min(values, minimum);
		}
		
		for(int i = 0; i<nums.length;i++)
		{
			if(nums[i]!=maximum || nums[i]!= minimum)
			{
				sum+=nums[i];
				//n++;
			}
			else
			{
				count++;
			}
			
		}
		
		double maximumaverage = (sum /((nums.length)-count));
		
		return maximumaverage;
	}
	
	
}
