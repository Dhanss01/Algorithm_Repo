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



public class InsertaMissedElement {
	

	@Test
	public void test1() {
		int[] nums= {1,3,5,6};
		int k=4;
		System.out.println(insertpositions(nums,k));
		
	}

	@Test
	public void test2() {
		int[] nums= {1,3,4,5,6};
		int k=5;
		System.out.println(insertpositions(nums,k));
		
	}
	@Test
	public void test3() {
		int[] nums= {1,3,5,6};
		int k=7;
		System.out.println(insertpositions(nums,k));
		
	}
	@Test
	public void test4() {
		int[] nums= {1,3,5,6};
		int k=0;
		System.out.println(insertpositions(nums,k));
		
	}
	@Test
	public void test5() {
		int[] nums= {1};
		int k=0;
		System.out.println(insertpositions(nums,k));
		
	}
	/*go through the array
	 * if target is zero then return  0;
	 * if target value is greater then values in array then return length+1
	 * if value is less k and values greater than k are available in array
	 * then return the index when i > k 
	 * 
	 * 
	 * 
	 */

	private int insertpositions(int[] nums,int k) {
		// TODO Auto-generated method stub
		if(k==0)
		{
			return 0;
		}
		
		for(int i=0; i<nums.length;i++)
		{
			if(nums[i]==k)
			{
				return i;
			}
			else if(nums[i]>k)
			{
				return i;
			}
					
		}
			
		return nums.length;
		
	}

}
