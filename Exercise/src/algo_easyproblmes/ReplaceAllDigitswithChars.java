package algo_easyproblmes;

import java.util.Arrays;

import org.junit.Test;

public class ReplaceAllDigitswithChars { 
	
	@Test
	public void test() {
		String s="a1b2c3d4e";	
		System.out.println(getReplacedDigitswithChar(s));
		
	}
	// "abbdcfdhe"
	/*
	 * - s[1] -> shift('a',1) = 'b'
		- s[3] -> shift('b',2) = 'd'
	    - s[5] -> shift('c',3) = 'f'
		- s[7] -> shift('d',4) = 'h'
	 * start =0 end=start+1;
	 * start<=length-2;
	 */

	
	
	public String getReplacedDigitswithChar(String s) {
		int start=0, end=0;
		int[] ascii = new int[26];
		StringBuilder sb= new StringBuilder(s);
		StringBuilder res=new StringBuilder();
		while(start<s.length()-1) {
			end=start+1;
			char c= s.charAt(start);
			int val=(int)(s.charAt(end)-'0');
			char ch = (char)(c+val);
			String temp= Character.toString(ch);
			res.append(c);
			res.append(ch);
			start=start+2;
			end++;
			
		   
		}
		//res.append(s.charAt(s.length()-1));
		return res.toString();
	}

}
