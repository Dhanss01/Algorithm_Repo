package algo_easyProblemsset2;

import org.junit.Test;

public class BalancedString {

	@Test
	public void test1()
	{
		String s="RLRRLLRLRL";
		System.out.println(getBalancedstringCount(s));
		
	}
	
	public int getBalancedstringCount(String s)
	{
		int Rcount=0, Lcount=0,result=0;
		for(char c : s.toCharArray())
		{
			if(c=='R')  //get R count 
				Rcount++;
			else if(c=='L') //get L count
				Lcount++;
			if(Rcount==Lcount)
			{
				result++;
			}
			
		}
		
		return result;
	}
}
