package algo_easyproblmes;

import org.junit.Test;

public class DistanceValueBetweenTwoArrays {
	
	@Test
	public void test1()
	{
		int[] arr1 = { 4, 5, 8 };
		int[] arr2 = { 10, 9, 1, 8 };
		int d = 2;
	 System.out.println(findTheDistanceValue(arr1,arr2,d));
	}
	@Test
	public void test()
	{
		int[] arr1 = {1,4,2,3};
		int[] arr2 = {-4,-3,6,10,20,30 };
		int d = 3;
		System.out.println(findTheDistanceValue(arr1,arr2,d));
	}

	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

		int diff;
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			int leftval= arr1[i];
			for (int j = 0; j < arr2.length; j++) {
				int rightval=arr2[j];
				diff = Math.abs(leftval- rightval);
				if (diff <= d)
					break;
				else if(diff>d && j==arr2.length-1) {
					count++;
				}
				
			}
		}

		return count;

	}

}
