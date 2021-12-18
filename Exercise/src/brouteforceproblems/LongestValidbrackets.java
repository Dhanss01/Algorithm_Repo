package brouteforceproblems;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class LongestValidbrackets {
	
	@Test
	public void test2() {
		String s= "()[]{}";
		 isValid(s);
		
	}
	
	 public void isValid(String s) {
	        Stack<Character> openstack= new Stack<Character>();
	        Stack<Character> closestack= new Stack<Character>();
	        
	        
	        for(int i=0; i<s.length();i++)
	        {	
	        	
	            if(s.charAt(i)== '('|| s.charAt(i)== '{'|| s.charAt(i)== '[')
	            {
	            	openstack.push(s.charAt(i));
	            }
	            
	            if(s.charAt(i)== ')'|| s.charAt(i)== '}'|| s.charAt(i)== ']')
	            {
	            	closestack.push(s.charAt(i));
	            }
	            else if(!openstack.empty() && !closestack.empty()&&openstack.peek()=='('&&closestack.peek()==')')
	            {
	                System.out.println(openstack.peek());
	                System.out.println(closestack.peek());
	                //openstack.pop();
	                //closestack.pop();
	            } 
	            else if(!openstack.empty() && !closestack.empty()&&openstack.peek()=='{'&&closestack.peek()=='}')
	            {
	            	System.out.println(openstack.peek());
	                System.out.println(closestack.peek());
	                //openstack.pop();
	                //closestack.pop();
	            } 
	            else if(!openstack.empty() && !closestack.empty()&&openstack.peek()=='['&&closestack.peek()==']')
	            {
	            	System.out.println(openstack.peek());
	                System.out.println(closestack.peek());  
	                //openstack.pop();
	                //closestack.pop();
	            } 
	        	    }

}
	 
	 
	
	 
	 
	 
}