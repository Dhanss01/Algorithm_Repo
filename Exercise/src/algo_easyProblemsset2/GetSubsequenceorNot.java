package algo_easyProblemsset2;

import org.junit.Test;

public class GetSubsequenceorNot {
	
	@Test
	public void test1()
	{
		String s= "abc";
		String t="ahbgdc";
		getSubsequence(s,t);
		
	}
	
	//if right char == left char increment right and left
	//else right char != left increment right provided right length< t.length
	//
	public boolean getSubsequence(String s, String t)
	{
		int right=0,left=0;
		
		while(left<s.length()&&right<t.length())
		{
		   char leftchar=s.charAt(left);
		   char rightchar=t.charAt(right);
		   if(leftchar==rightchar&&left==s.length()-1)
		   {
			   return true;
		   }
		   
		   else if(leftchar==rightchar)
		   {
			   left++;
			   right++;
		   }
		   right++;
		}	
		
		return false;
	}

}
