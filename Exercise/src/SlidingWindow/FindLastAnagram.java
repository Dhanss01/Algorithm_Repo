package SlidingWindow;

import java.util.HashMap;

public class FindLastAnagram {
	
	public void test1()
	{
		String s1 = "acbhccbabbcaac";
		String s2= "abc";
	}
	
	
	public void anagraminstring(String s1, String s2)
	{
		int s1len=s1.length();
		int s2len=s2.length();
		if(s1len<s2len)
		{
			throw new RuntimeException("anangaram is nit found");
		}
		HashMap<Character,Character> s2map = new HashMap<>();
		HashMap<Character,Character> s1map = new HashMap<>();
		for(int i =0; i<s2len;i++)
		{
			s2map.put(s2.charAt(i), (char) (s2map.getOrDefault(s2.charAt(i), (char) 0)+1));
		}
		for(int i =0; i<s1len;i++)
		{
			char ch =s1.charAt(i);
			s1map.put(s1.charAt(i), (char) (s1map.getOrDefault(s1.charAt(i), (char) 0)+1));
			if(i>=s2len)
			{
				ch=s1.charAt(i-s2len);
				if(s1map.get(ch)==1)
				{
					s1map.remove(ch);
				}
				else
				{
					s1map.put(ch,(char) (s1map.get(ch)-1));
				}
				
			}
			if(s1map.equals(s2map))
			{
				System.out.println(s1map);
			}
		}
	}
	
		

}
