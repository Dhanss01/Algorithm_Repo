package algo_easyproblmes;

import java.util.Stack;

import org.junit.Test;

public class AdjecentDuplicates {
	//1209. Remove All Adjacent Duplicates in String II
	@Test
	public void test1()
	{
		String s= "deeedbbcccbdaa";
		int k=3;
		removeDuplicates(s,k);
	}

public String removeDuplicates(String s, int k) {
	
	Stack<Character> stack = new Stack<Character>();
	StringBuilder sb= new StringBuilder();
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(i==0||s.charAt(i)!=s.charAt(i-1)) {
			stack.push(s.charAt(i));
		}
		else {
		    char r =stack.pop();
			count =count+1;
			if(count ==k) {
				sb.delete(i-k+1, i+1);
				i=i-k;
			}
			else {
				stack.push(r);
			}
		}
	}
	return sb.toString();
	
	        
}
	
	
	

}
