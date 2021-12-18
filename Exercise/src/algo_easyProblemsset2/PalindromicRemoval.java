package algo_easyProblemsset2;

import org.junit.Test;

public class PalindromicRemoval {
	
	@Test
	public void test1()
	{
		String s = "ababaababa";
		System.out.println(removepalindormicSequence(s));
	}

	public int removepalindormicSequence(String s)
	{
		 if (s.isEmpty()) {
	            return 0;
	        }
		 if (palindromecheck(s)) 
		 {
			 return 1; 
		 }    
	        
	        return 2;
		
	}
	public boolean palindromecheck(String s)
	{
		int start=0,end = s.length()-1;
		while(start<end)
		{
			if(s.charAt(start)==s.charAt(end))
			{
				start++;
				end--;
			}
			else
				return false;
		}
		return true;
	}
}
