package algo_easyproblmes;

import java.util.PriorityQueue;

import org.junit.Test;

public class FindingnLargestNumbers {
	
	
	@Test
	public void test1() {
		int[] arr= {11,3,5,15,4,18,1};
		int k=3;
		System.out.println(getlargestusingPriorityQueue(arr,k));
	}
	
	public int getlargestusingPriorityQueue(int[] nums, int k) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for(int i =0;i<k;i++) {
			minHeap.add(nums[i]);
		}
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<minHeap.peek()) {
				continue;
			}
			else {
				minHeap.poll();
				minHeap.add(nums[i]);
			}
		}
	  return minHeap.peek();	
	}

}
