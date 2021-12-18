package algo_EasyProblmes;

import org.junit.Test;

public class CheckWhetherTwoStringsareAlmostEquivalent {
	
	@Test
	public void test1() {
		String s="aaaa";
		String t="aaaa";
		checkAlmostEquivalent(s,t);
	}

	
	
	/*add the calues in to ascii
	 * 
	 * 
	 * 
	 * 
	 */
public boolean checkAlmostEquivalent(String word1, String word2) {
        
	int[] asciiword1= new int[26];
	int[] asciiword2=new int[26];
	for(int i=0;i<word2.length();i++) {
	 asciiword2[word2.charAt(i)-'a']++;	
	 asciiword1[word1.charAt(i)-'a']++;	
	}
	
	for(int i=0;i<word1.length();i++) {
		
		int count1= asciiword1[word1.charAt(i)-'a'];
		int count2= asciiword2[word2.charAt(i)-'a'];
		
		if((count2-count1)>=3) {	
			return true;
			
		}
	}    

return false;
}
}
//char c=(char)asciiword2[word1.charAt(i)-'a'];	
//String s= String.valueOf(asciiword2[i-'a']);
//if(word1.contains(s)) {
	//return true;
//}