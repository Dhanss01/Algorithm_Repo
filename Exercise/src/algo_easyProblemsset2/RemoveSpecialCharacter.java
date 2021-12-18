package algo_easyProblemsset2;

import org.junit.Test;

public class RemoveSpecialCharacter {

	
	@Test
	public void test1()
	{
		String s ="“asdfdsfs&*%(";
		System.out.println(getVlaidString1(s));
	}
	
	public String getVlaidString(String s)
	{
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLetterOrDigit(s.charAt(i)))
					{
						sb.append(s.charAt(i));
						
					}
		}
		return sb.toString();
	}
	
	public String getVlaidString1(String s)
	{
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		
		return s;
	}
	
}
