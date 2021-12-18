package brouteforceproblems;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Stack;

import org.junit.Test;

/*
 * 1) Did I understand the problem? 
 * 
 * 2) What is the input(s)? What is the expected output? Do I have constraints to
 * solve the problem? 
 * 
 * Input- int[] nums =
 *  Output -int[] nums =
 *  Constraint- 
 * 
 * 3) Test data set
 * 
 * Positive- : s =[0,0,1,1,2,2]
     Negative -: s=[0]
      Edge -: s=[]
 * 
 * 
 * 4) Do I know how to solve it?
 * 
 * Yes - great, is there an alternate? 
 * 4) Ask for hint if don't know to solve? 
 * 
 * 5) Do i know any alternate solution? 
 *    -> No, Solve with the known solution
 *    
 *    Pseudo code
 */
public class ValidBalancedBrackets {

	
	
	@Test
	public void test1() {
		String s= "()";
		assertEquals(true, isValid(s));
		
	}
	@Test
	public void test2() {
		String s= "()[]{}";
		assertEquals(true, isValid(s));
		
	}
	@Test
	public void test3() {
		String s= "([)]";
		assertEquals(false, isValid(s));
		
	}
	@Test
	public void test4() {
		String s= "{[]}";
		assertEquals(true, isValid(s));
	}
	
	
	/*get the string, read each character
	 * if the charcter is Open parentheses then push that in stack
	 * if character is Closed Parenthese then pop it out 
	 * 
	 * 
	 */
	
	 public boolean isValid(String s) {
	        Stack<Character> mystack= new Stack<Character>();
	        
	        for(int i=0; i<s.length();i++)
	        {	            
	            if(s.charAt(i)== '('|| s.charAt(i)== '{'|| s.charAt(i)== '[')
	            {
	                mystack.push(s.charAt(i));
	            }
	            //(({)})
	            else if( s.charAt(i)== ')' &&  !mystack.empty() && mystack.peek()=='(')
	            {
	                mystack.pop();
	            }
	            else if( s.charAt(i)== '}' &&  !mystack.empty() && mystack.peek()=='{')
	            {
	                mystack.pop();
	            }
	            else if( s.charAt(i)== ']' &&  !mystack.empty() &&mystack.peek()=='[')
	            {
	                mystack.pop();
	            }
	           else
	               return false;
	        
	        }
	        
	        return mystack.isEmpty();
	        
	    }
	
}
