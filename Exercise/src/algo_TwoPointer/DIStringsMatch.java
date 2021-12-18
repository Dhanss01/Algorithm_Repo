package algo_TwoPointer;

import org.junit.Test;

public class DIStringsMatch {
	
	
	@Test
	public void example1()
	{
		String s = "IDID";
		System.out.print(DImatchfound(s));
		
	}
	
	public int[] DImatchfound(String s)
	{
		int[] output = new int[s.length()+1];
		int icount=0;
		int dcount=s.length();
		for(int i = 0; i<=s.length();i++)
		{
			
			if(s.charAt(i)=='I')
			{
				output[i]=icount;
				icount++;
			}
			else if(s.charAt(i)=='D')
			{
				output[i]=dcount;
			    dcount--;
			}
			
			output[i+1]=icount+1;
			    
		}		
		
		return output;
	}

}
