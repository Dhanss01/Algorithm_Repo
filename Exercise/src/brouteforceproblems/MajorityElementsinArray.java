package brouteforceproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class MajorityElementsinArray {

	@Test
	public void test1()
	{
		List<Integer> inputlist =new ArrayList<Integer>(Arrays.asList(2,2,1,1,1,2,2));	
		System.out.println(getMaximumoccurance(inputlist));
	}
	
	
	public int getMaximumoccurance(List<Integer> list)
	{
		HashMap<Integer, Integer> mymap = new HashMap<Integer,Integer>();
		for(int i=0; i<list.size();i++)
		{
			if(mymap.containsKey(list.get(i)))
			{
				mymap.put(list.get(i), mymap.getOrDefault(list.get(i),0)+1);
			}
			else {
				mymap.put(list.get(i), 0);
			}
			
			
		}
		
	//	List<Entry<Integer, Integer>> collect = new ArrayList<>(mymap.entrySet());
		
	//	Collections.sort(collect, Map.Entry.comparingByValue());

		int maxocc= Integer.MIN_VALUE;
		int output=0;
				
		for(Map.Entry<Integer, Integer> entry : mymap.entrySet())
		{	 
	      if(entry.getValue()>maxocc)
	      {	                
	    	  maxocc = entry.getValue();
		     output=entry.getKey();
		  }
		            
		        
		}
		
		
		
		return output;
		
	}


	
	
	
}
