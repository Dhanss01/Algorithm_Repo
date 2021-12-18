package algo_easyProblemsset2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

public class FirstUniqueCharcter {
	
	@Test
	public void test1()
	{
		String s= "loveleetcode";
		getFirstUniqueCharacter1(s);
	}

	private int getFirstUniqueCharacter(String s) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char k = ' ';
		for(int i =0; i<s.length();i++)
		{
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(Entry<Character, Integer> entry: map.entrySet())
		{
           if(entry.getValue()==1)
           {
        	  k = entry.getKey();
        	  break;
           }
		}
		
		int  m = s.indexOf(k);
		System.out.println(m);
		return m;
		
	}
	
	
	private int getFirstUniqueCharacter1(String s) {
		int[] ascii = new int[26];
		for(char i : s.toCharArray())
		{
			ascii[i-'a']++;
			
		}
		for(int j=0; j<s.length();j++)			
		{
			if(ascii[s.charAt(j)-'a'] ==1)
				System.out.println(j);
				return j;
			
		}
		return -1;
		
	}
	
	

}
