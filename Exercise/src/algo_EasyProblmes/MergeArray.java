package algo_EasyProblmes;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeArray {
	@Test
	public void testcase1() {
		int[] intarr= {1,2,3,4,5,6};
		assertArrayEquals(new int[] {1,6,2,5,3,4}, rearrangeArr(intarr));
		//{1,6,2,5,3,4}
	}
	@Test
	public void testcase3() {
		int[] intarr= {1,2,3,4,5,6,7};
		assertArrayEquals(new int[] {1,7,2,6,3,5,4}, rearrangeArr(intarr));
		//{1,7,2,6,3,5,4}
	}

	private int[] rearrangeArr(int[] nums) {
		// TODO Auto-generated method stub
		int left=0, right=nums.length-1;
		int[] arr= new int[nums.length];
		int index=0;
		while(index<nums.length && left<=right) {
		    
			if(left==right) {
				arr[index]=nums[left];
			}
			else {
			arr[index]=nums[left];
			index++;
			left++;
			arr[index]=nums[right];
			index++;
			right--;
			}
			
		}
		
		
		return arr;
	}
	
	
	
}
