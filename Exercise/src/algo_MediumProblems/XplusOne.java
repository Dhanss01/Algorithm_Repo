package algo_MediumProblems;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;



/**
 * Problem: Given an integer array arr, count how many elements x there are,
 * such that x + 1 is also in arr. If there are duplicates in arr, count them
 * separately. Example 1:
 * 
 * Input: arr = [1,2,3] Output: 2 Explanation: 1 and 2 are counted cause 2 and 3
 * are in arr. Example 2:
 * 
 * Input: arr = [1,1,3,3,5,5,7,7] Output: 0 Explanation: No numbers are counted,
 * cause there's no 2, 4, 6, or 8 in arr. Example 3:
 * 
 * Input: arr = [1,3,2,3,5,0] Output: 3 Explanation: 0, 1 and 2 are counted
 * cause 1, 2 and 3 are in arr. Example 4:
 * 
 * Input: arr = [1,1,2,2] Output: 2 Explanation: Two 1s are counted cause 2 is
 * in arr. Example 5:
 * 
 * Input: arr = [1,1,2] Output: 2 Explanation: Both 1s are counted because 2 is
 * in the array.
 */

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
 *
 * 
 * 2) Test data set
 * 
 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
 * interviewer if the data set is fine by his/her assumptions - Comparision
 * between
 * 
 * Positive- {1,3,2,3,5,0} Negative - {1,1,3,3,5,5,7,7} Edge - {-1,1,0,-2}
 * 
 * 
 * 3) Do I know how to solve it?
 * 
 * Yes - great, is there an alternate? No - Can I break down the problem into
 * sub problems?
 * 
 * Yes
 * 
 * 4) Ask for hint (If you do not know how to solve)
 * 
 * 
 * 5) Do I know alternate solutions as well?
 * 
 * Yes - What are those? No - That is still fine, proceed to solve by what you
 * know !!
 * 
 * Yes 1.
 * 
 * 6) If you know alternate solutions -> find out the O Notations (Performance)
 * 
 * Then, explain either both or the best (depends on the time)
 * 
 * Approach 1: Start with worst -> Improve (Optimize) -> End up with the best
 * Approach 2: Write down the options and benefits and code the best
 * 
 * 7) Start always with Psuedo code
 * 
 * 8) Implement them in the code (editor)
 * 
 * 9) Test against the different data set
 * 
 * 10) If it fails, debug them to solve it !!
 */



public class XplusOne {
	
	@Test
		public void test1() {
			int n[] = { 1, 3, 2, 3, 5, 0 };// 1/2/3/3/5
			Assert.assertEquals(3, xplusonecounter(n));
		}

	@Test
		public void test2() {
			int n[] = { 1, 1, 3, 3, 5, 5, 7, 7 };
			Assert.assertEquals(0, xplusonecounter(n));
		}

	@Test
		public void test3() {
			int n[] = { -1, 1, 0, -2 };
			Assert.assertEquals(3, xplusonecounter(n));
		}

  @Test
		public void test4() {
			int n[] = {1,1,2,2};
			Assert.assertEquals(2, xplusonecounter(n));
		}
		
  @Test
		public void test5() {
			int n[] = {1,1,2};
			Assert.assertEquals(2, xplusonecounter(n));
		}
		
 @Test
		public void test6() {
			int n[]= {1,3,2,3,5,0};
			Assert.assertEquals(3, xplusonecounter(n));
		}
@Test
			public void test7() {
			int n[] = { 1, 1, 1,2,2,3,3,3};
				Assert.assertEquals(5, xplusonecounter(n));
			}
// Pseudo code

	//get the array in list, create a count as 0
	// if an element has its element+1 value in the same list 
	// increment the count
	// if a duplicate element present in the array then also should check element+1 irrespective of redudant presence
	// return count vales
	// assert the count values 
	
// time Complexity O(2n)
//Space Complexity 0(n)


	private int xplusonecounter(int nums[]) 
	{
		List<Integer> list1 = new ArrayList<Integer>();		
		int count = 0;
		for (int i = 0; i < nums.length; i++)   //o{n}
		{
			list1.add(nums[i]);
		}
		for (int j = 0; j < nums.length; j++)   //o{n}
		{
			if (list1.contains(nums[j] + 1))
			{
				count++;
			}

		}

		return count; // O(1)

	}
}
