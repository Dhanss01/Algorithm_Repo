package StackLearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class ValidParanthesis {
	@Test
	public void test1()
	{
		String Brackers = "(((";
		isvalidBrackets(Brackers);
	}
	
	//@Test
	//public void test2()
	{
		String Brackers = "(())";
	}
	
	//@Test
	//public void test3()
	{
		String Brackers = "))";
	}
	
	/*assing the opening/closing brackets in map and keep its partners as value
	 * if its not finding its partner then push it stack
	 * else pop it out
	 * 
	 */
	private int isvalidBrackets(String brackets)
	{
		char[] eachchar = brackets.toCharArray(); int count =0;
		Map<Character, Character> mymap =new HashMap<Character,Character>();
		Stack<Character> stackie = new Stack<Character>();
		mymap.put('(', ')');
		mymap.put(')', '(');
		
		for(Character c :eachchar)
		{
			if(mymap.containsKey(c))
			{
				stackie.push(c);
				count++;
			}
			else
			{
				if(stackie.pop()!=mymap.get(c))
				count--;
				
			}
		 
		}
		System.out.print(count);
		return count;	
		
			
	}

}
