package brouteforceproblems;

import org.junit.Test;

import junit.framework.Assert;

public class Subsequence {
@Test
public void test1()
{

	String s= "abc";
	String t="ahbgdc";
	Assert.assertEquals(true,getSubsequence(s,t));
}
	
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
