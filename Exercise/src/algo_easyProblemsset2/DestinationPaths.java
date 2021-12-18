package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class DestinationPaths {
	@Test
	public void test1()
	{
		List<String> l1= new ArrayList<>(Arrays.asList("London","New York"));
		List<String> l2= new ArrayList<>(Arrays.asList("New York","Lima"));
		List<String> l3= new ArrayList<>(Arrays.asList("Lima","Sao Paulo"));
		List<List<String>> paths = new ArrayList<List<String>>(Arrays.asList(l1,l2,l3));
		System.out.println(destCity(paths));
	}
	
	public String destCity(List<List<String>> paths) {
		List<String> sources = new ArrayList<String>();		
		for(int i=0;i<paths.size();i++)
		{
		  sources.add(paths.get(i).get(0));
		  
		  
		}
		
		List<String> destinatios = new ArrayList<String>();
		for(int i=0;i<paths.size();i++)
		{
		if(!sources.contains(paths.get(i).get(1)))
		  {
			destinatios.add(paths.get(i).get(1));
		  }
		}
		 return destinatios.toString() ;
	
}
	
	
/*public String destCity1(List<List<String>> paths) {
        
        Map<String, Integer> dmap = new HashMap<String, Integer>();
        
        for(int i=0;i<paths.size();i++)
        {
        	List<String> temp = new ArrayList<String>();
        	temp.addAll(paths.get(i));
            for(int j=0;j<temp.size();j++)
            {
            	String s=temp.get(j);
            	if(dmap.containsKey(s))
            	{
            		dmap.put(s, dmap.getOrDefault(dmap.get(s), 1)+1);
            	}
            	else
            		dmap.put(s, 1);
            	
            }
            temp.clear();
        }
        
        Integer destinationCity = paths.get(0).get(1); // Start from any destination city
        while (dmap.get(destinationCity) != null) { // Stop when can't traverse further
            destinationCity = dmap.get(destinationCity);
            // Current Destination City will be the Start City for next iteration
        }
        
        
     /* for(Entry<String, Integer> entry : dmap.entrySet())
      {
    	  if(entry.getValue()==1)
    	  {
    		  return entry.getKey();
    	  }
      }
        return " ";*/
    
}	

