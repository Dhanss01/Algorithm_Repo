package algo_easyProblemsset2;

import org.junit.Test;

public class ReversanArray {

	
	@Test
	public void test1()
	{
		int[] arr= {2,3,6,7,1};
		//1,7,6,3,2
		System.out.println(getReversedArrayElements(arr));
		
	}
	

	private int[] getReversedArrayElements(int[] arr) {
		// TODO Auto-generated method stub
		int[] reversedarray =new int[arr.length];
		int k=0;
		if(arr.length<=1)
		{
			return arr;
		}
		
		for(int i=arr.length-1;i>=0;i--)
		{
			reversedarray[k]=arr[i];
			k++;
		}
		
		return reversedarray;
		
		
	}
	
}
