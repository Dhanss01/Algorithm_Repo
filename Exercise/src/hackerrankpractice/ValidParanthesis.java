package hackerrankpractice;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class ValidParanthesis {
	/*confirm  you can use only three brackets as a valid parathis
		 {{())}}
[ { (
	 * test data
	 * input = {{())}}, output = false 
	 * input = {{(())}}, output = true 
	 * input = {<}  , output = false 
	 * input = {(})  , output = false 
	 */
	/*pseudo code
	 * create a stack
	 * add the string character(open brackets) in to stack 
	 *   --> if character should be either of them [ { (
	 *   --> else return false
	 * when ever you find the close bracket  check the corresponding open brackets exist on the 
	 * stack peek;
	 *   -> if so  pop the open bracket from the stack
	 *   -->if not return false
	 * 
	 */
	@Test
	public void test1()
	{
		String s = "{{())}}";
		Assert.assertEquals(false,checkValidBrackets(s));
	}
	@Test
	public void testw()
	{
		String s= "{{(())}}";
		Assert.assertEquals(true,checkValidBrackets(s));
	}
	//@Test
	public void test3()
	{
		String s= "{<}";
		Assert.assertEquals(false,checkValidBrackets(s));
	}
	//@Test
	public void test4()
	{
		String s= "{(}) ";
		Assert.assertEquals(false,checkValidBrackets(s));
	}
	
	
	public boolean checkValidBrackets(String s)
	{
		Stack<Character> st= new Stack<Character>();
	 for(int i=0;i<s.length();i++)
	 {
		 if(s.charAt(i) != '[' || s.charAt(i) !='{' || s.charAt(i)!= '(')
		 {
			 return false;
		 }
		 
		 else if(s.charAt(i) == '[' || s.charAt(i) =='{' || s.charAt(i)== '(')
		 {
			 st.push(s.charAt(i));
		 }
		 else if(s.charAt(i) == ']' &&!st.isEmpty() && st.peek()== '[' )
		 {
			 st.pop();
		 }
		 else if(s.charAt(i) == '}' &&!st.isEmpty() && st.peek()== '{'  )
		 {
			 st.pop();
		 }
		 else if(s.charAt(i) == ')' &&!st.isEmpty() && st.peek()== '('  )
		 {
			 st.pop();
		 }
		 else
			return false;
		 
		 
	 }
		
		return true;
	}
}
