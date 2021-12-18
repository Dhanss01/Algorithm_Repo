package brouteforceproblems;

import org.junit.Test;

public class Daytimeconversion {
	
//Test
	public void test()
	{
		String s = "12:05:33PM";
		timeConversion(s);
	}
	//06:40:03
	@Test
	public void test1()
	{
		String s = "06:40:03AM";
		timeConversion(s);
	}
	
	
	public static String timeConversion(String s) {
	    // Write your code here
	    
	    String[] time = s.split(":");
	    String hr = time[0];
	    String min= time[1]; //60PM
	    String seconds = time[2].substring(0,2);
	    String cc =time[2].substring(2,4);
	    
	    String daytime= "";
	    if(cc=="AM" || cc=="am")
	    {
	        if(hr=="12")
	        {
	            hr="00";
	            System.out.println(hr);
	            
	        }
	        else
	        {
	            //ystem.out.println(hr);
	        }
	    }
	    else if(cc=="PM"||cc=="pm")
	    {
	    	if(hr!="12")
	    	{
	    		int k =Integer.parseInt(hr);
	    	   k= k+12;
	    	   hr = ""+k;
	    	   int l=Integer.parseInt(min);
	    	   if(k==24&& l>1)
	    	   {
	    		   hr="00";
	    	   }
	    	}
	    	//System.out.println(hr+":"+min+":"+seconds);
	        
	    }
	    
	    daytime= hr+":"+min+":"+seconds;
	    System.out.println(daytime);	    
	    return daytime;

	}


}
