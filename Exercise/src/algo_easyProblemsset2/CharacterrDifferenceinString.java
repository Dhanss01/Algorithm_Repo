package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CharacterrDifferenceinString {

	@Test
	public void test1()
	{
		String s="abcd";
		String t="abcde";
		System.out.println(findTheDifference(s,t));
		
		
	}
	
	 public char findTheDifference1(String s, String t)
	 {
	 int[] ascii= new int[26];
	 char c = 0;
	 for(int i=0;i<t.length();i++)
	 {
		 ascii[t.charAt(i)-'a']++;
	 }
	 for(int i=0;i<s.length();i++)
	 {
		 ascii[s.charAt(i)-'a']--;
	 }
	 for(int i=0;i<ascii.length;i++)
	 {
		 if(ascii[i]==1)  //(char)98
	     c = (char)i;	
	 }
	 
	 return c;
	 }
	
	
	
	  public String findTheDifference(String s, String t) {
	       List<Character> list= new ArrayList<Character>();
	       StringBuilder sb=new StringBuilder();
	       for(int i=0;i<t.length();i++)
	       {
	    	   list.add(t.charAt(i));
	       }
	       
	         for(int i=0;i<s.length();i++)
	         {
	           if(list.contains(s.charAt(i)))
	           {
	        	list.remove(s.charAt(i));
	           }	 
	          
	         }
	         
	         for(int i=0;i<list.size();i++)
	         {
	        	 sb.append(list.get(i));
	         }
	        
	        return sb.toString();
	        
	    }
}
