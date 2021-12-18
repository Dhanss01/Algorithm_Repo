package algo_MediumProblems;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.Test;

/*1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
 * Given an array of integers nums and an integer limit, return the size of the longest non-empty subarray such that the absolute difference between any two elements of this subarray is less than or equal to limit.

 

Example 1:

Input: nums = [8,2,4,7], limit = 4
Output: 2 
Explanation: All subarrays are: 
[8] with maximum absolute diff |8-8| = 0 <= 4.
[8,2] with maximum absolute diff |8-2| = 6 > 4. 
[8,2,4] with maximum absolute diff |8-2| = 6 > 4.
[8,2,4,7] with maximum absolute diff |8-2| = 6 > 4.
[2] with maximum absolute diff |2-2| = 0 <= 4.
[2,4] with maximum absolute diff |2-4| = 2 <= 4.
[2,4,7] with maximum absolute diff |2-7| = 5 > 4.
[4] with maximum absolute diff |4-4| = 0 <= 4.
[4,7] with maximum absolute diff |4-7| = 3 <= 4.
[7] with maximum absolute diff |7-7| = 0 <= 4. 
Therefore, the size of the longest subarray is 2.

 * 
 * 
 * 
 */
public class SubarrayAbosoluteDifference {

	@Test
	public void test1()
	{
		int[] nums = {8,2,4,7};
		int k =4;
		longestSubarray(nums, k);
	}
	
	
	//public void test2()
	{
		
	}
	
	
	public int longestSubarray(int[] nums, int limit) {
        if (nums == null || nums.length == 0 || limit < 0) {
            return 0;
        }
        
        Deque<Integer> minDeq = new ArrayDeque<>();
        Deque<Integer> maxDeq = new ArrayDeque<>();
        minDeq.offer(nums[0]);
        maxDeq.offer(nums[0]);
        int size = 1;
        int start = 0;
        int end = 1;
        while (end < nums.length) {
            while (!minDeq.isEmpty() && minDeq.peekLast() > nums[end]) {
                minDeq.pollLast();
            }
            minDeq.offer(nums[end]);
            while (!maxDeq.isEmpty() && maxDeq.peekLast() < nums[end]) {
                maxDeq.pollLast();
            }
            maxDeq.offer(nums[end]);
            
            while(maxDeq.peekFirst() - minDeq.peekFirst() > limit) {
                // move start forward
                if (minDeq.peekFirst() == nums[start]) {
                    minDeq.removeFirst();
                }
                if (maxDeq.peekFirst() == nums[start]) {
                    maxDeq.removeFirst();
                }
                start++;
            }
            size = Math.max(size, end - start + 1);
            end++;
        }
        return size;
    }
}
