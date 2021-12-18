package algo_TwoPointer;

import org.junit.Test;

public class Ispalindrome {
	
	
	@Test
	public void example()
	{
		String s = "aacecaaa";
		Indexvalues ( s,  left,  right);
		
		
	}
	
	
	
	
	
	//Checking left and right digit if it is equal then palindrome is true and incrementing leftt++ an Right -- 
	//else return false
	//left is not equal to right then increment left plus 1 and compare with right
	//drop the right and compare the left values
	//left plus+1, right+1
	
	
	 public boolean Indexvalues (String s, int left, int right) {
		 
		 int left1 = 0;
	        int right1 = s.length()-1;
	        while (left1 < right1) {
	            if (s.charAt(left1) != s.charAt(right1)) return isPalindrome(s, left1 + 1, right1) || isPalindrome(s, left1, right1 - 1);
	            left1++;
	            right1--;
	        }
	        return true;
		 
		 
	 }
	 
	 
	 
	  public boolean isPalindrome(String s, int left, int right){
	        while (left < right){
	            if (s.charAt(left) == s.charAt(right))
	            	return true;
	            left++;
	            right--;
	        }
	        return false;
	    }
}
