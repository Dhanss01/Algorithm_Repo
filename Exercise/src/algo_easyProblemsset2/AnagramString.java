package algo_easyProblemsset2;

import java.util.Arrays;

import org.junit.Test;

public class AnagramString {

	@Test
	public void test1()
	{
	String S = "hello";
	String t ="olleh";
	System.out.print(isAnagram1(S,t));
	}
	
	//s and convert them in to ascii character 
	// convert t string in to ascii character 
	//check if both are equal 
	public boolean isAnagram(String s, String t)
	{
		char[] schar = s.toCharArray();
		char[] tchar = t.toCharArray();
		
		Arrays.sort(schar);
		Arrays.sort(tchar);
		if(Arrays.equals(schar,tchar))
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isAnagram1(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] source = new int[26];
        int[] target = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            source[s.charAt(i)-'a']++;
           
        }
        for(int i=0;i<t.length();i++) {
        	 target[t.charAt(i)-'a']++;
        }
        
        if(Arrays.equals(source, target)){
            return true;
        } else {
            return false;
        }
    }
	
	

}
