package algo_easyProblemsset2;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class UncommonCharacters {
	
	
	@Test
	public void test1()
	{
		  String s = "aabde ";
		     String s1 = "cbax";
		     System.out.println(getuncommonvharacter(s,s1));
	}
	
	
	
	 public String getuncommonvharacter(String s1, String s2)
	    {
	        Set<Character> set =new HashSet<Character>();
	        
	        for(char c : s1.toCharArray())
	        {
	           set.add(c); 
	        }
	        for(int i=0;i<s1.length();i++)
	        if(set.contains(s2.charAt(i)))
	        set.remove(s2.charAt(i));
	        else
	        set.add(s2.charAt(i));
	   	 return set.iterator().toString();   
	        
	    }
	 
	 


}
