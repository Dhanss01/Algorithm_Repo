package algo_MediumProblems;

import java.util.HashSet;

import org.junit.Test;

public class RemoveDuplicatesfromSortedArray {
/*Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

 * 
 * 
 * 
 * 
 * 
 */
	
	@Test
	public void test2() {
		int[] nums= {1,1,2};
		System.out.println(removeDuplicates1(nums));
	}
	
	public int removeDuplicates(int[] nums)
	{
		HashSet<Integer> numset = new HashSet<Integer>();
		int output=0;
		for(int i=0;i<nums.length;i++)
		{
			if(!numset.contains(nums[i]))
			{
				numset.add(nums[i]);
				output++;
			}
			
			
		}
		
		return output;
		
	}
	
	public int removeDuplicates1(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    System.out.println(i+1);
	    return i + 1;
	}
}
