package algo_easyProblemsset2;

import org.junit.Test;

public class GetMaximumnumberbyInsertingX {

	@Test
	public void test1()
	{
		int N = 1234, K = 5;
		maximizeNumber(N, K);
	}
	
	
	   
	public static void maximizeNumber(int N, int K)
	{
	    
	    String s = Integer.toString(N);
	    int L = s.length();
	 
	    String result =  "";
	    int i = 0;
	 // (int)s.charAt(i)-(int)'0'
	  
	    while ((i < L) && (K <= ((int)s.charAt(i) - (int)'0'))) {
	 
	        result += (s.charAt(i));
	        ++i;
	    }
	 
	    //((char) (k+ (int)'0'))
	    result += ((char)(K + (int)'0'));
	 
	  
	    while (i < L) {
	 
	        result += (s.charAt(i));
	        ++i;
	    }
	 
	    // Print the maximum number formed
	    System.out.println(result);
	}
	 
}
