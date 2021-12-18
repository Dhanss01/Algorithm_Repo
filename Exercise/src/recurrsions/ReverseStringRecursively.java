package recurrsions;

import org.junit.Test;

public class ReverseStringRecursively {
	
	
	/*Identify the base case  when string.length meets zero then stop the recursive
	  develope the postive test data which can assist easily  : "hello" output: "olleh"
		go for a edge and negative cases "" empty string
		know the patent :    remove the last element and return the string 
		implement
	 * 
	 * 
	 */
	
	@Test
	public void test1() {		
		String s= "test";
		reversestrig(s);
		
	}
	public void reversestrig(String s)
	{
		StringBuilder sb= new StringBuilder();
		String m;
		
		
	   if ((s.length()==0))
	   {
		   System.out.println("");	    
	   }
		
		else  
		{   
			
		char output= s.charAt(s.length());
	    System.out.println(output);	   
	    m =s.substring(0,s.length()-1); 
	    reversestrig(m);
		   
		} 
	
	}

}
