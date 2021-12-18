package algo_easyproblmes;

import java.util.PriorityQueue;

import org.junit.Test;

public class Prioritylargest {
	
	@Test
	public void test1() {
		int[] nums = {3,2,1,5,6,4};
		int k=3;
		findKthLargest(nums,k);
	}

	
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue max_h = new PriorityQueue<>();
		for(int i = 0;i<nums.length;i++)
		{
		max_h.add(nums[i]);
		/*if(max_h.size()>k)
		{
		max_h.poll();
		}*/
		}
		return (int) (max_h.peek());

		}

}

