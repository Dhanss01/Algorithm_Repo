package algo_easyProblemsset2;

import org.junit.Test;

public class IndexOfExample {

	
	@Test
	public void test1()
	{
		String s ="xyxzxe";
		char ch='z';
		reversePrefix(s,ch);
	}
		//passing substring
		public String reversePrefix(String s, char ch) {
	        char s1 =ch;
	        
	      int left=0, right=s.indexOf(ch);
	      StringBuilder sb= new StringBuilder();
	    String R=  s.substring(right+1, s.length());  
	        
	        while(right>=left)
	        {
	           sb.append(s.charAt(right));
	           right--;
	        } 
	           sb.append(R);
	        
	       return sb.toString(); 
	       
	    }
	
}
