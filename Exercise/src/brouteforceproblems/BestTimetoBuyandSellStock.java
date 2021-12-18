package brouteforceproblems;

import org.junit.Test;

public class BestTimetoBuyandSellStock {
	
	@Test
	public void test1() {
		int[] data= {7,1,5,3,6,4};
		getbestday(data);
		
		
	}
	@Test
	public void test2() {
		int[] data= {7,6,4,3,1};
		getbestday(data);
	}

	
	public int getbestday(int[] data)
	{
		
		int i= 0, j=i+1; int profit =0, max=Integer.MIN_VALUE;
		for(;i<data.length-1;i++)
		{
			for(;j<data.length;j++)
			{
			 profit=data[j]-data[i];
			  max=Math.max(max, profit);
			}	
		}
		return max;
		
	}
}
