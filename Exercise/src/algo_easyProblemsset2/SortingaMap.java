package algo_easyProblemsset2;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class SortingaMap {

	//sort the keys 
	
	@Test
	public void test1()
	{
		String s= "FlaG";
		detectCapitalUse(s);
		
	}
	
	 public boolean detectCapitalUse(String s) {
         char c =s.charAt(0);
		 
		   
		   if(Character.isUpperCase(c) &&Character.isUpperCase(s.charAt(1)))
		   {
			   for(int i =2;i<s.length();i++)
				{
				    	if(Character.isUpperCase(s.charAt(i)))
				    		return true;
				}
				
		   }
		   
		   else if(Character.isUpperCase(c))
		   {
			for(int i =1;i<s.length();i++)
			{
			    	if(Character.isUpperCase(s.charAt(i)))
			    		return false;
			    		
			}
			
		   }
	   
	return false;  
	
    }
	
}
