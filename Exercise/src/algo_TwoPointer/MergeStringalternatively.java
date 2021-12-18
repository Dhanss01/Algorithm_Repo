package algo_TwoPointer;

import org.junit.Test;

public class MergeStringalternatively {
	
	@Test
	public void eg1()
	{
		String word1 = "abcd";
		String word2 = "pqrs";
		System.out.println(mergeAlternately( word1,  word2));
		
	}
	
	@Test
	public void eg2()
	{
		String word1 = "ab";
		String word2 = "pqrs";
		System.out.println(mergeAlternately( word1,  word2));

	}
	@Test
	public void eg3()
	{
		String word1 = "abif";
		String word2 = "s";
		System.out.println(mergeAlternately( word1,  word2));

	}
	@Test
	public void eg4()
	{
		String word1 = "";
		String word2 = "s";
		System.out.println(mergeAlternately( word1,  word2));

	}
	
	public String mergeAlternately(String word1, String word2) {
        
   String output = "";
   int lengthvalue= Math.max(word1.length(), word2.length());
   
        int i=0; 
        
        if(word1.length() > 100 || word2.length()>100)
        {
        	throw new RuntimeException("Words length is higher than 100");
        }
        for(i = 0; i < lengthvalue; i++)
        {
        
        if(i < word1.length())
        {
            output = output + word1.charAt(i);
        }
        if(i < word2.length())
        {
            output = output + word2.charAt(i);
        }  
        
            
        }
   
return output;
}
}
