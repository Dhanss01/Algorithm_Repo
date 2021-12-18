package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MaximumPossible3Digits {

	@Test
	public void test1()
	{
		int n =512;
		int k=10;
		System.out.println(getMaximumPossible3Dgitis(n,k));
	}
	@Test
	public void test2()
	{
		int n =191;
		int k=4;
		System.out.println(getMaximumPossible3Dgitis(n,k));
	}
	@Test
	public void test3()
	{
		int n =285;
		int k=20;
		System.out.println(getMaximumPossible3Dgitis(n,k));
	}
	
	
	public int getMaximumPossible3Dgitis(int n, int k)
	{
		int reminder=0, sum=0, kreminder=k;
		List<Integer> list =new ArrayList<Integer>();
		StringBuilder sb =new StringBuilder();
		
		while(n>0)
		{
			reminder=n%10;
			list.add(reminder);
			n=n/10;
		}

		//substract first digit value from k  and add the value plus+sum
		int m= list.size()-1;
		while(kreminder>0 && m>=0)
		{
			sum=list.get(m)+kreminder;
			if(sum>9)
			{
				kreminder= sum-9;
				sum=9;
			}
			
			else
			{	
				kreminder=0;
			}
			//kreminder=(kreminder-value)+carry;
			list.remove(m);
			list.add(m, sum);			
			m--;
		}			
				
		for(int i=0;i<list.size();i++)
		{
			sb=sb.append(list.get(i));			
		}
		sb=sb.reverse();
		int r= Integer.parseInt(sb.toString());
		return r;			
	}
	
	
	

	
}
