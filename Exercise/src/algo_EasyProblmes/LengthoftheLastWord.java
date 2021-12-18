package algo_EasyProblmes;

import org.junit.Test;

public class LengthoftheLastWord {
	
	//@Test
	public void test1()
	{
		String s = "Hello World";
		System.out.println(getLengthofLastWord(s));
	}
	
	@Test
	public void test3()
	{
		String s = "a";
		System.out.println(getLengthofLastWord(s));
	}
	
	
	//@Test
	public void test2()
	{
		String s = "   fly me   to   the moon  ";
		System.out.println(getLengthofLastWord(s));
		
	}
	
	public int getLengthofLastWord(String s)
	{
		int left= s.length()-1;
		int right=s.length()-1;
		char c=s.charAt(left);
		if(s.length()==1)
			return 1;
		while(right>=0)
		{
		if(left==s.length()-1 && s.charAt(left)==' ')
		{
			int k =s.length();
			s=s.substring(0,k-1);
			left--;
			right--;
		}
		else if(Character.isLetter(s.charAt(right)))
		{
			right--;
		}
		else if(s.charAt(right)==' '||s.charAt(right)==0)
		{
			int diff=left-right;
			return diff;
		}
		}
		return 0;
	}
}
