package recurrsions;

import org.junit.Test;

public class SumofdDigitsusingrecurrsion {

	@Test
	public void test()
	{
		int nums= 123;
		System.out.println(sumOfDigits(nums));
	}
	
	public int sumOfDigits(int numbers)
	{
		if(numbers==0)
			return 0;
		else
		{
			return (numbers%10+sumOfDigits(numbers/10));
		}
		
	}
}
