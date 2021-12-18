package hackerrankpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class PriceCheck {
	
	
	@Test
	public void test1()
	{
		List<String> products =new ArrayList<String>(Arrays.asList("eggs","milk","cheese"));
		List<Float> productPrices = new ArrayList<Float>();
		productPrices.add((float) 2.89);
		productPrices.add((float) 3.29);
		productPrices.add((float) 5.79);
		
		List<String> productSold =new ArrayList<String>(Arrays.asList("eggs","eggs","eggs","milk","milk","cheese"));
		List<Float> soldPrice = new ArrayList<Float>();
		soldPrice.add((float) 2.89);
		soldPrice.add((float) 2.99);
		soldPrice.add((float) 2.89);
		soldPrice.add((float) 3.29);
		soldPrice.add((float) 4.29);
		soldPrice.add((float) 5.79);
		System.out.println(priceCheck(products, productPrices,  productSold, soldPrice));
	}
	
	
	
	
	public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
	    // Write your code here
		  HashMap<String, Float> productsmap = new HashMap<String,Float>();
		  HashMap<String, Float> productSoldmap = new HashMap<String,Float>();
		   float  s =0; float value=0, value1=0; int errorcount=0;
		 
		  for(int i=0; i<productPrices.size();i++)
	        {
	           s=productPrices.get(i);
	           productsmap.put(products.get(i),s);
	        }
		  for(int i=0; i<soldPrice.size();i++)
	        {
	           s=soldPrice.get(i);
	           //
	           String m=null;
	           if(productSoldmap.containsKey(productSold.get(i)))
	           {
	        	  m=productSold.get(i);
	        	  if(productsmap.containsKey(m))
	        	  {
	        		  value = productsmap.get(m); 
	        	  }
	        	  productSoldmap.put(productSold.get(i),s);
	        	   value1=productSoldmap.get(productSold.get(i));
       		    
	       		    //System.out.println(value);
	       		    //System.out.println(value1);
	       		    
	       		    if(value!=value1)
	       		    {
	       		    	errorcount=errorcount+1;
	       		    }
	       		   
	           }
	           else {
	        	   productSoldmap.put(productSold.get(i),s);
	           }
	           
	           
	        }
		  
		
		return errorcount;
	}
	
	
	
	 public static int priceCheck1(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
		    // Write your code here
		 
		 
		    HashMap<String, Float> mymap = new HashMap<String,Float>();
		     float  s =0; float value=0;
		     String k=null;
		     int errorcount=0;
		        for(int i=0; i<soldPrice.size();i++)
		        {
		           s=soldPrice.get(i);
		           mymap.put(productSold.get(i),s);
		           if(mymap.containsKey(productSold.get(i)))
		           {
		        		    value = mymap.get(productSold.get(i));        		    
		        		    
		        		    System.out.println(value);
		        		    if(value!=soldPrice.get(i))
		        		    {
		        		    	errorcount=errorcount+1;
		        		    }      		    	    		        		 
		           }
		            
		        }

	 return errorcount;

	 }
}
