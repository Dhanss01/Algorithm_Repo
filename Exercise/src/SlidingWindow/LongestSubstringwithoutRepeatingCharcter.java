package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubstringwithoutRepeatingCharcter {


	@Test
	public void Test1() {
		
		String s ="PWWKEW";
		
		System.out.println(LongestSubstringwithoutRepeating(s));
	}
	
	public int LongestSubstringwithoutRepeating (String s)
	{
		if(s.length()==0||s==null)
		{
			return 0;
		}
		
		int i=0, j=0, maxwindowlength=0;
		Set<Character> set = new HashSet<Character>();
		while(i<s.length())
		{
		  if(set.contains(s.charAt(i)))	
		  {
			  set.remove(s.charAt(j));
			  j=j+1;
		  }
		  set.add(s.charAt(i));
		  maxwindowlength =Math.max(maxwindowlength, i-j+1);  //i-j+1 will give window length
		  i=i+1;
		}
		
		return maxwindowlength;	
	}
}
