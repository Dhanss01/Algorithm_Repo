package algo_easyProblemsset2;

import org.junit.Test;

public class MaximumNumberOndeletingK {

	
	@Test
	public void test1()
	{
		int n=15958;
		System.out.println(getMaximumnumberonRemovalofK(n));
	}
	
	
	public int getMaximumnumberonRemovalofK(int n)
	{
		String s=Integer.toString(n);
		int max=0, min=Integer.MAX_VALUE;
		int k=0, m=0, value0;
		
		if(n==0)
			return 0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)=='5') {
			 k = Integer.parseInt(s.substring(0,i)+s.substring(i+1, s.length()));
			 max = Math.max(k, max);
			}
		   
		}
		
	
		return  max;
	}
}
