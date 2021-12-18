package algo_TwoPointer;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public enum Minimumdifferencesum {
	
	@Test	
	public void example1()
	{
		//int[] nums= {1,12,-5,-6,50,3};
		List<Integer> nums = Arrays.asList(1,3,4,5,6,7);
		getsumofdifferece1(nums);
		
		
	}
	public int getsumofdifferece1(List<Integer> arr)
	{
		
		int[] num = new int[arr.size()];
		int numlength= num.length;
		//num = arr.toArray(num);
		int[] arraydiff= new int[numlength];
		for(int i=1; i<numlength; i++)
		{
			arraydiff[i]= arraydiff[i-1]+num[i-1];
		}
		int[] sum = new int[numlength];
		for(int i=numlength-2; i>0; i--)
		{
			sum[i]= sum[i+1]+num[i+1];
		}
		int[] output =new int[numlength];
		for(int i=0; i<numlength; i++)
		{
			output[i]= i*num[i]-(numlength-i-1)*num[i]-arraydiff[i]+sum[i];
		}
		
		Arrays. sort(output);  
		
		System.out.println("Minimum = " + output[0]);
		
		return output[0];
	}

}
