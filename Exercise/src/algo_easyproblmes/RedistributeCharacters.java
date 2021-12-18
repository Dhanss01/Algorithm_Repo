package algo_easyproblmes;

import org.junit.Test;

public class RedistributeCharacters {
	
	@Test
	public void test1() {
		 String[] words = {"abc","aabc","bc"}; 
		 makeEqual(words);
		
	}
	
	
public boolean makeEqual(String[] words) {
     int[] ascii1 = new int[26]; 
     int[] ascii2 = new int[26];
	 for(int i=0;i<words[0].length();i++) {
		 char c= words[0].charAt(i);
		 ascii1[c-'a']++;
		 ascii2[c-'a']++;
    }
	
	 for(int i=0;i<words[1].length();i++) {
		 char c= words[1].charAt(i);
		 ascii2[c-'a']++;
    }

	 return true;

}
}
