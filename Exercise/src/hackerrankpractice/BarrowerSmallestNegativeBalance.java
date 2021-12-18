package hackerrankpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BarrowerSmallestNegativeBalance {
	@Test
	public void test1() {
		String[] str = { "Alex Blake 2", "Blake Alex 2", "Casey Alex 5", "Blake Casey 7", "Alex Blake 4",
				"Alex Casey 4" };
		Assert.assertTrue(Arrays.equals(new String[] { "Alex", "Blake" }, findSmallestNegativeBalance(str)));
		
		List<String> listinput =new ArrayList<String>(Arrays.asList("Alex Blake 2", "Blake Alex 2", "Casey Alex 5", "Blake Casey 7", "Alex Blake 4",
				"Alex Casey 4"));
		Assert.assertTrue(Arrays.equals(new String[] { "Alex", "Blake" }, findSmallestNegativeBalance(str)));
	}

	@Test
	public void test2() {
		String[] str = { "Alex Blake 4", "Blake Alex 4" };
		List<String> listinput =new ArrayList<String>(Arrays.asList("Alex Blake 4", "Blake Alex 4"));
		Assert.assertTrue(Arrays.equals(new String[] { "Nobody ", "has ", "a ", "negative ", "balance" },
				findSmallestNegativeBalance(str)));
	}

	

	private Object[] findSmallestNegativeBalance(String[] str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void test3() {
		//String[] str = { "Alex Blake 4" };
		List<String> listinput =new ArrayList<String>(Arrays.asList("Alex Blake 4"));
		//Assert.assertTrue(Arrays.equals(new String[] { "Alex" }, findSmallestNegativeBalance(str)));
	}
	
	
	

}
