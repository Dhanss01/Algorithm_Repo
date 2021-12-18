package algo_easyProblemsset2;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestNicesestSubstring {
	
	@Test
public void test1()
{
	String s="TeEeSst";
	System.out.println(longestNiceSubstring(s));
}
	
	public String longestNiceSubstring(String s) {
        String result = "";
		for (int i = 0;i<s.length(); i++){        
          
			for (int j = i+1;j<=s.length(); j++){
               
				String temp = s.substring(i, j);
               
				if (temp.length() > 1 && result.length() < temp.length() && checkNice(temp)) result = temp;
            }    
        }
        return result;
    }
    
	
    public boolean checkNice(String temp){
        
		Set<Character> s = new HashSet<Character>();
        for (char ch : temp.toCharArray()) s.add(ch);
        
        for (char ch : s)
            if (s.contains(Character.toUpperCase(ch)) != s.contains(Character.toLowerCase(ch))) return false;  
        return true;
    }
}
/*
 * class Solution {
public String longestNiceSubstring(String s) {
    int max = -(int)1e8;
    String res = "";
    for(int i = 0; i < s.length(); i++){
        for(int j = i + 1; j <= s.length(); j++){
            String ss = s.substring(i,j);
            if(isValid(ss) == true){
                if(ss.length() > max){
                    max = ss.length();
                    res = ss;
                }
            } 
        }
    }
    
    return res;
}

public boolean isValid(String ss){
    if(ss.length() == 1) return false;
    
    int freq[] = new int[128];
    for(int i = 0; i < ss.length(); i++){
        freq[ss.charAt(i)]++;
    }
    
    for(int i = 0; i < ss.length(); i++){
        if(ss.charAt(i) >= 97 && ss.charAt(i) <= 122){ //lower case char
            if(freq[ss.charAt(i) - 32] == 0) return false;
        }else{ // upper case char
            if(freq[ss.charAt(i) + 32] == 0) return false;
        }
    }
    
    return true;
  }
}
 * */
