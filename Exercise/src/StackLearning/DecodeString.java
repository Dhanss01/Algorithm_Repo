package StackLearning;

import org.junit.Assert;

public class DecodeString {
	
	public void test1()
	{
		String s = "2[ab3[b]]";
		Assert.assertTrue(s.equals("abbbbabbbb"));
	}
	
	public void test2()
	{
		String s = "a3[c]";
		Assert.assertTrue(s.equals("accc "));
	}
	

}
