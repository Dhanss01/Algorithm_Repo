package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MinimumDeletion {

	@Test
	public void test1()
	{
		String s = "abcabc";
		System.out.println(minDeletion1(s));
	}
	
	
	
	public int minDeletion1(String s) {
	 
		int deletecount=0;
		Set<Character> set = new HashSet<Character>();
		for(char c : s.toCharArray())
		{
			if(!set.contains(c))
			{
			 set.add(c);
			}
			else
				deletecount++;
		}
		
		
		return deletecount;
	}
	
	
	
	public int minDeletion(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0)+1);
		int toDel = 0;
		ArrayList<Map.Entry<Character,Integer>> list =  new ArrayList<>(map.entrySet());
		for(Map.Entry<Character, Integer> eachItem : list) {
			if(eachItem.getValue()>1) 
				toDel += eachItem.getValue()-1;
		}
		return toDel;
	}
}
