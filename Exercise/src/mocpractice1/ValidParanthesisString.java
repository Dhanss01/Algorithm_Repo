package mocpractice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class ValidParanthesisString {

	@Test
	public void test1()
	{
		String s = "a)b(c)d";
		String output ="ab(c)d";
		System.out.println(removeUnwantedParanthesis(s));
	}
	@Test
	public void test2()
	{
		String s = "abc(a(c)e)de)";
		String output ="ab(c)d";
		System.out.println(removeUnwantedParanthesis(s));
	}
	@Test
	
	public void test3()
	{
		String s = "))((";
		String output ="";	
		System.out.println(removeUnwantedParanthesis(s));
	}
	
	public String removeUnwantedParanthesis(String s)
	{
		Stack<Character> stackbrackets = new Stack<Character>();
		Stack<Integer> stackIndex = new Stack<Integer>();
		List<Integer> index = new ArrayList<Integer>();
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)== '(')
			{
				stackbrackets.push(s.charAt(i));
				stackIndex.push(i);
			}
			else if(s.charAt(i)== ')' && !stackbrackets.isEmpty() && !stackIndex.isEmpty())
			{
				stackbrackets.pop();
				stackIndex.pop();
			}	
		
		   	
			else if(stackIndex.isEmpty() &&Character.isAlphabetic(s.charAt(i)))
			{
				index.add(i);	
			}		
				
			
		}
		
		while(!stackIndex.isEmpty())
		{
			index.add(stackIndex.pop());
		}
		
		int value=0;
		for(int p=0;p<s.length();p++)
		{
			if(p!=index.get(value))
			{
				 sb.append(s.charAt(p));
				 value++;
			}
		}
		return  sb.toString();
	}
}
