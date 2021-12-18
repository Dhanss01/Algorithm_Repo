package algo_easyProblemsset2;

import java.util.Stack;

import org.junit.Test;

public class ReversestringParanthis {

	@Test
	public void test1()
	{
		String s= "(u(love)i)";
		getReversedStringofParanthis(s);
	}

	private String getReversedStringofParanthis(String s) {
		
		Stack<Character> stack=new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		
		int left=0, right=0;
		while(right<s.length())
		{
			if(s.charAt(right)==')')
			{
			while(stack.peek()!='(')
			{
				
				if(!(stack.pop()=='('||stack.pop()==')'))
				{
				sb.append(stack.pop());
				}
				right--;
			}
			int k=0;
			while(k<=sb.length()-1)
			{
				stack.push(sb.charAt(k));
				k++;
			}
			sb.setLength(0);
			}
			
			else
			{
				if(s.charAt(right)=='(')
				{
					left=right;
				}
				stack.push(s.charAt(right));
				right++;
			}
		}
		
		
		
		
		return s;
		// TODO Auto-generated method stub
		
	}
	
	
	
}
