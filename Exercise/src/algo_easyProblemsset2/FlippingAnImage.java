package algo_easyProblemsset2;

import org.junit.Test;

public class FlippingAnImage {
	
	@Test
	public void test1()
	{
		int[][] nums= {{1,1,0},{1,0,1},{0,0,0}};
		flipAndInvertImage(nums);
	}
	
	public int[][] flipAndInvertImage(int[][] nums) {
		for(int i = 0;i < nums.length;i++) {
			
			int[] a= nums[i];
			flip(nums[i]);
			invert(nums[i]);
		}
		return nums;
	}	
		public int[] flip(int[] a)
		{
		  int left=0,right=a.length-1;
		  while(left<right)
		  {
			  int temp =a[left];
			  a[left]=a[right];
			  a[right]=temp;
			  left++;
			  right--;
		  }
	 
		  return a;
		}
		
		public int[] invert(int[] a)
		{
			for(int i=0;i<a.length;i++)
			{
				a[i]=a[i]^1;
			}
			return a;
		}

}
