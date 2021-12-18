package algo_easyProblemsset2;

import java.util.Arrays;

import org.junit.Test;

public class CheckStringsareAnagram {
	
	
	
	@Test
	public void test1()
	{
		String s= "anagram";
		String t= "nagaram";
		System.out.println(isAnagram(s,t));
	}
	
	 public boolean isAnagram(String s, String t) {
	        /*
	          ad the each caharcter from string in to ascii array
	          add the target string characters in to another ascii array 
	          check whether both are equal if so return true else return false
	                
	        
	        */
	        
	
    int[] firststring= new int[128];
    int[] secondstring = new int[128];
	
    
    if(s.length()!=t.length())
        return false;
   for(int i=0; i<s.length();i++)
   {
	   firststring[s.charAt(i)]++;
	   
   }
   for(int i=0; i<t.length();i++)
   {
	   secondstring[t.charAt(i)]++;
   }
   for (int index = 0; index < 128; index++) {
       if (firststring [index] != secondstring [index]) {
           return false;
       }  
	 }
	
   return true;
}
	 }
