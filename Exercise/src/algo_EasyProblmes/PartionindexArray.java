package algo_EasyProblmes;

import org.junit.Test;

public class PartionindexArray {
	@Test
	public void test1() {
		int[] arr= {5,2,2,2,5};
		System.out.println(getPartionIndex(arr));
		
	}
	
	public int getPartionIndex(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			
			int right=i+1;int rightsum=0;
			while(right<arr.length) {				
				rightsum=rightsum+arr[right];
				right++;
			}
			int leftsum=0;
			if(i==0) {
				leftsum=0;
			}
			
			else {
			int left=i-1;
			
			while(left>=0)
			{
				leftsum=leftsum+arr[left];
				left--;						
			}
			}
			
			if(leftsum==rightsum)
			{
				return arr[i];
			}
		}
		
		return -1;
	}

}
