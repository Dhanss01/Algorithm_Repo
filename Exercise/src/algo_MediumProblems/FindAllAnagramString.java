package algo_MediumProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import Assesment.LinkedList;

//6:10
public class FindAllAnagramString {

	@Test
	public void test1()
	{
	String  s ="cbaebabacd";
	String target= "abc";
	findAnagramsIndicies(s, target);	
	}
	


	private void findAnagramsIndicies(String s, String target) {
		// TODO Auto-generated method stub
		int start=0, end=0,max=Integer.MIN_VALUE;
		List<Integer> list = new ArrayList<Integer>();
		Map<Character, Integer> targetmap =new HashMap<Character, Integer>();
		for(int i=0;i<target.length();i++)
		{
		   	targetmap.put(target.charAt(i), targetmap.getOrDefault(target.charAt(i), 0)+1);
		}
		Map<Character,Integer> inputMap = new HashMap<Character,Integer>();
		for(end=0;end<s.length();end++)
		{
			char c= s.charAt(end);
			inputMap.put(c, inputMap.getOrDefault(c, 0)+1);
			if(end<target.length())
			{
				if(targetmap.equals(inputMap))
				{
				  list.add(start);	
				}
				start++;
			}
			
			
			
		}
		
		
		
		
	}
}
