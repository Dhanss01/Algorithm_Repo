package algo_easyProblemsset2;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class NiceSubstring {

	
	@Test
	public void test1()
	{
		String s = "YazaAay";
		longestNiceSubstring(s);
	}
	public void test2()
	{
		String s = "BPpb";
		longestNiceSubstring(s);
	}
	@Test
	public void test3()
	{
		String s = "AzABaabza";  //ABaab
		solution5(s);
	}
	
   /*
    * init left and right as 0,
    * increase the right and read each character from the string
    * append that character in stringbuilder
    *  
    * 
    * 
    * 
    */
	private void longestNiceSubstring(String s) {
		// TODO Auto-generated method stub
      
	}
	
	private int solution5(String s) {
		Set<Character> lower = new HashSet<>();
		Set<Character> upper = new HashSet<>();
		Set<Character> lowerTemp = new HashSet<>();
		Set<Character> upperTemp = new HashSet<>();
		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c))
				upper.add(c);
			else
				lower.add(c);
		}
		if (lower.isEmpty() || upper.isEmpty())
			return -1;
		int left = 0, right = 0;
		while (right < s.length()) {
			char current = s.charAt(right);
			if (lower.contains(Character.toLowerCase(current)) && upper.contains(Character.toUpperCase(current))) {
				if (Character.isLowerCase(current))
					lowerTemp.add(current);
				else
					upperTemp.add(Character.toLowerCase(current));
			} else {
				while (left <= right) {
					char remove = s.charAt(left);
					if (Character.isLowerCase(remove))
						lowerTemp.remove(remove);
					else
						upperTemp.remove(Character.toLowerCase(remove));
					left++;
				}
			}
			if (!lowerTemp.isEmpty() && !upperTemp.isEmpty() && lowerTemp.equals(upperTemp))
				return right - left + 1;
			right++;
		}
		return -1;
	}

	
	
	
	
	
	
	
	private int solution4(String s) {
		int[] lowerChars = new int[26];
		int[] upperChars = new int[26];
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (Character.isLowerCase(s.charAt(i)))
				lowerChars[s.charAt(i) - 'a']++;
			else
				upperChars[s.charAt(i) - 'A']++;
		}
		int left = 0, right = 0, length = -1;
		while (right < s.length()) {
			if (lowerChars[Character.toLowerCase(s.charAt(right)) - 'a'] > 0
					&& upperChars[Character.toUpperCase(s.charAt(right)) - 'A'] > 0) {
				length = Math.max(length, right - left + 1);
				right++;
			} else {
				right = left += 2;
			}
		}
		return length == 1 || length == 0 ? -1 : length;
	}
}
