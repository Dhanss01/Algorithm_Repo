package hackerrankpractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class LonelyNumber {
	@Test
	public void test1()
	{
		List<Integer> li = Arrays.asList(1,2,3,2,1,4,5,3,3,4);
		System.out.println(lonelyinteger1(li));
	}
	   public static int lonelyinteger(List<Integer> a) {
		    // Write your code here
		   Integer k=0; int m1=0;
		   int[] arr =new int[a.size()];
				   Set<Integer> m = new HashSet<Integer>();
		    Set<Integer> dupslist = new HashSet<Integer>();
		    for(int i=0; i<a.size();i++)
		    {
		        if(m.contains(a.get(i))|| dupslist.contains(a.get(i)))
		        {
		        	dupslist.add(i);
		            m.remove(a.get(i));		            
		        }
		    }
		    Iterator<Integer> i = m.iterator();
	        while (i.hasNext())
	        	m1 = (int)k;
	            //System.out.println(i.next());
				return m1;
	    } 
	   
	   public static int lonelyinteger1(List<Integer> a)
	   {
		  Map<Integer, Integer> mymap = new HashMap<Integer, Integer>();
		  int k=0;
		  
		  for(int i=0; i<a.size();i++)
		  {
			mymap.put(a.get(i), mymap.getOrDefault(a.get(i), 0)+1); 
		  }  
		
	  
		 for(Map.Entry<Integer, Integer> entry : mymap.entrySet())
		 {
			 if(entry.getValue()==1)
	           k=(int) entry.getKey();
	           
		 }
		   return k;
	   }
}
