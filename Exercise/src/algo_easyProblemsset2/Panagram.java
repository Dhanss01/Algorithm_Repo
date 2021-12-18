package algo_easyProblemsset2;

import org.junit.Test;

public class Panagram {

	@Test
	public void test1()
	{
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		checkIfPangram(sentence);
	}
	
	public boolean checkIfPangram(String sentence) {
		 int[] asciiarray = new int[26];
		 if(sentence.length()<26)
		 {
			 return false;
		 }
		 else
		 {
	        for (int i = 0;i<sentence.length();i++) 
	        {
	        	asciiarray[sentence.charAt(i) - 'a']++;
	        }
	        for (int j=0;j<asciiarray.length;j++) 
	        {
	            if (asciiarray[j] == 0) return false;
	        }
		 }  
		 return true;
	    
    }
}
