package brouteforceproblems;

import org.junit.Test;

public class BinnarySum {
	
	@Test
	public void test1()
	{
		String input0 = "11";
	    String input1 = "01";
	    System.out.println(addingbinarryarrays(input0,input1));
	    
	  //  String output = 

	}

	
	 public String addingbinarryarrays(String data1, String data2)
	 {		
		int i = Integer.parseInt(data1,2); 
		int j = Integer.parseInt(data2,2); 
		int sum= i+j;
		
		String m =Integer.toBinaryString(sum);
		 return m;
	 }
}
