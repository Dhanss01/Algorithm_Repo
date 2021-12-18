package algo_easyProblemsset2;

import java.util.Stack;

import org.junit.Test;

public class ValidParanthesis {
	
	@Test
	public void tes1()
	{
		String s = "()[]{}";
		isValid(s);
	}

	public boolean getValidParanthesis(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			if(c=='('||c=='{'||c=='[')
			{
				stack.push(c);
			}
			else if(c==')'&&stack.peek()=='('&& !stack.isEmpty())
			{
				stack.pop();
			}
			else if(c=='}'&&stack.peek()=='{'&& !stack.isEmpty())
			{
				stack.pop();
			}
			else if(c==']'&&stack.peek()=='['&& !stack.isEmpty())
			{
				stack.pop();
			}
			else		
				return false;
				
		}
	
		return stack.isEmpty();
	}
	
	
	
	 public boolean isValid(String s) {
	        if (s.length() % 2 != 0) return false;
	        int top = -1;
	        StringBuilder sb = new StringBuilder(s);
	        for (int i = 0; i < sb.length(); i++) {
	            if (top < 0 || !isMatch(sb.charAt(top), sb.charAt(i))) {
	                top++;
	                sb.setCharAt(top, sb.charAt(i));
	            } else {
	                top--;
	            }
	        }
	        return top == -1;
	    }
	    
	    private boolean isMatch(char c1, char c2){
	        if(c1 == '(' && c2 == ')') return true;
	        if(c1 == '[' && c2 == ']') return true;
	        if(c1 == '{' && c2 == '}') return true;
	        return false;
	    }
}
