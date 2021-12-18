package binarySearch;

import java.util.ArrayList;

import org.junit.Test;

public class Reverseacharacter {
	@Test
	public void test1()
	{
		String s = "A man, a plan, a canal: Panama";
		 System.out.print(isPalindrome(s));
	}
	
	public boolean isPalindrome(String s) {
	     String m = s.toLowerCase();  
	        if(s.length()==0)
	        {
	            return false;
	        }
	       ArrayList<Character> ch = new ArrayList<Character>();
	        for(char i=0; i<m.length();i++)
	        {
	            if(Character.isDigit(m.charAt(i))||Character.isLetter(m.charAt(i)))
	            {
	                ch.add(i);
	            }
	            else
	                continue;
	        }
	        int left=0; int right= ch.size()-1;
	        while(left<=right)
	        {
	            if(ch.get(left)==ch.get(right))
	            {
	                left++;
	                right--;
	            }
	            else
	                return false;
	            
	        }
	            
	        return true;
	    }

}
