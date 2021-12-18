package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class RemoveDuplicatechar {

	
	@Test
	public void test1()
	{
		String s = "abaacdebbe";
		System.out.println(getRemoveDuplicates(s));
	}
	
	public String getRemoveDuplicates(String s)
	{
		StringBuilder sp = new StringBuilder();
		Set<Character> set =new HashSet<Character>();
		List<Character> list = new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(!set.contains(s.charAt(i)))
			{
				if(!list.contains(s.charAt(i)))
				{
					set.add(s.charAt(i));
					sp.append(s.charAt(i));

				}
			  	
			}
			else
				list.add(s.charAt(i));
		}
		
		list.clear();
		
		return sp.toString();
		
	}
	
	public String getDuplicateremoved(String s)
	{
		Map<Character, Integer> hmap= new LinkedHashMap<Character, Integer>();
		StringBuilder sp = new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(hmap.containsKey(s.charAt(i)))
			{
				hmap.put(s.charAt(i),hmap.getOrDefault(hmap.get(s.charAt(i)),0)+1);
			}
			hmap.put(s.charAt(i),0);
		}
			
		for(int i=0;i<s.length();i++)
		{
			if(hmap.get(s.charAt(i))==1)
					{
				sp.append(s.charAt(i));
					}
		}
		return sp.toString();
	}
}
