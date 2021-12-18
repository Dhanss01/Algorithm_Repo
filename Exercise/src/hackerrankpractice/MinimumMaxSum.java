package hackerrankpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class MinimumMaxSum {
	//@Test
	public void test1()
	{
		int[] nums = {2,4,-11,0,3,7};
		System.out.println(returnMaximumsubarraymin(nums));
		
	}
	@Test
		public void test2()
		{
			int[] nums = {2,2,2,-7,3,3};
			System.out.println(returnMaximumsubarraymin(nums));
			
		}

	//@Test
	public void test3() {
		int[] nums = {-5,-3,-2,-10,-11};
		System.out.print(returnMaximumsubarraymin(nums));
	}
	
	//iterate the array and find the sum of an array
	// when its positive increase the right pointer and
	//when the windowsum value is in negative then increment the left and right pointer
	//
	
	public List<Integer> returnMaximumsubarraymin(int[] nums)
	{
		int left=0, right=0; int currentsum=0; int windowsum=0; int max=Integer.MIN_VALUE;
		HashMap<Integer, List<Integer>> mymap = new HashMap<Integer,List<Integer>>();
		List<Integer> m= new ArrayList<Integer>();
		for( right=0;right<nums.length;right++)
		{
			windowsum=windowsum+nums[right];
			max=Math.max(max, windowsum);
			if(windowsum<=0)
			{
				m.add(left);
				m.add(right);
				mymap.put(max, m);				
				windowsum=0;				
				left=right+1;
			}
			else if(max == windowsum) {
				m.add(left);
				m.add(right);
				mymap.put(max, m);
			}
		
		}
		for(Map.Entry<Integer, List<Integer>> entry : mymap.entrySet())
		{
			if(entry.getKey()==max)
			{
			 return	entry.getValue();
			}
		}
		
		
		return new ArrayList(Arrays.asList(-1));
	}

}
