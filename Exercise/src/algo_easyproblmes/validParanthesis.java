package algo_easyproblmes;

import org.junit.Test;

public class validParanthesis {

	@Test
	public void test1() {
		String s = "{[]()}";
		isValid(s);
		
	}
	/*
	 * 	']' - 2 = '['
		'}' - 2 = '{'
		')' - 1 = '('
	 * 
	 * 
	 */
	public boolean isValid(String s) {
		
		  char[] arr = new char[s.length()];
	        int i = 0;
	                
	        for(char ch: s.toCharArray()) {
	            
	            if (ch == '{' || ch == '[' || ch == '(') {
	                arr[i++] = ch;
	                continue;
	            }  
	        
	            if (i > 0 && (arr[i - 1] == ch - 2 
					|| arr[i - 1] == ch - 1)) i--;
	            else return false;
	        }
	        return i == 0;

    }
}
