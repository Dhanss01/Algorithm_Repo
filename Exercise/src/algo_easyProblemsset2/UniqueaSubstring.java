package algo_easyProblemsset2;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class UniqueaSubstring {

	@Test
	public void test1()
	{
		String s= "xyzzaz";
		System.out.println(countGoodSubstrings(s));
	}
	
	 public int countGoodSubstrings(
			 String s) {
		 
		       Map<Character,Integer> map = new HashMap<Character,Integer>();
		       int left=0, right=0,max=0,length=0; int counter=0;
		       while(left<s.length())
		       {
		    	   char c = s.charAt(right);
		    	   map.put(c, map.getOrDefault(c, 0)+1);
		    	   if(map.get(c)>1)
		    	   {
		    		   counter++;
		    	   }
		    	  right++;
		    	  while(counter>0)
		    	  {
		    		  char temp=s.charAt(left);
		    		  if(map.get(temp)>1)
		    		  {
		    			  counter--;
		    		  }
		    	      map.put(temp, map.get(temp)-1);
		    	      left++;
		    	  }
		    	  
		    		max=Math.max(max,right-left); 
		       }
		       return max;
		    }
	        
	    
	
}
