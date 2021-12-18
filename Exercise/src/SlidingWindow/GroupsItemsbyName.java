package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class GroupsItemsbyName {

	
	@Test
	public void Test2() {
		
		List<String> transactions = Arrays.asList("apple", "pen","apple");
		groupTransactions(transactions);
	}

	
	public List<String>  groupTransactions(List<String> transactions) {
	    // Write your code here
		
		
		Map<String, Integer> Itemsmap = new HashMap<String, Integer>();
		
		  for (String str : transactions) {
			  
			  Itemsmap.put(str, Itemsmap.getOrDefault(str, 0)+1);
				
	        }
		  for (Map.Entry<String, Integer> entry :Itemsmap.entrySet()) {
	  
	            System.out.println(entry.getKey() + " : "
	                               + entry.getValue());
	        }
		  List<String> Itemlist = new ArrayList<String> (Itemsmap.entrySet());
		  return Itemlist;
	    }
	

}
