package algo_TwoPointer;

import java.util.HashSet;

import org.junit.Test;

public class ShortestsubstringofUniquechar {

	@Test
	public void eg1()
	{
		String s = "abbcafcb";
		s=s.toLowerCase();
		Uniquechar(s);		
	}
	
	public void Uniquechar(String s) {
		
		
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			 
			if(hs.contains((s.charAt(i))))
			{
				hs.remove(s.charAt(i));
			}
			else
				hs.add(s.charAt(i));
		}
		System.out.println(hs);
		
	}
	
}
