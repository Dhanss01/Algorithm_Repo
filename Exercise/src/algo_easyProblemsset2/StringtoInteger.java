package algo_easyProblemsset2;

import org.junit.Test;

public class StringtoInteger {
	
	@Test
	public void test1()
	{
		String s = "00000-42a1234";
		System.out.println(convertoInteger(s));
		
		
	}
	
	//@Test
	public void test2()
	{
		String s = "91283472332";
	
	}
	
	
	public int convertoInteger(String s)
		{   
		  int r= 0, m=0;
		    if(s.length()==0)
		        return 0;
		    if(s.contains("+")&&s.contains("-"))
		    	return 0;
			
		   char[] split = s.toCharArray();	
			StringBuilder sb= new StringBuilder();			
			int sign=1;
		for(int i=0;i<split.length;i++)
		{
			int intvalue =0;	
			  	if (split[i] == ' '|| split[i]== '0') 
			  		{
			  		  continue;
			  		}
			  	
			  	else if(split[i]=='-')
			  	{
			  		sign=-1;
			  	}
				
			  	else if(!(Character.isDigit(split[i]) || split[i]=='+'))
			  	{                
	               break;
	            }
			  	
	            else if(!(split[i]=='+'))
	            {
	            	 //intvalue = Character.getNumericValue();
	            	
	 			  	sb.append(split[i]);
	            }            
	           
	
	        }
	    if(sb.length()==0)
	    {
	        return 0;
	    }
		String output =sb.toString();
		double k = Double.parseDouble(output)*sign;
		
		if(k<-2147483648)
			 return -2147483648;
		else if(k> 2147483647)
			return 2147483647;
	
	        
	        return (int)k;
		}
		
}
