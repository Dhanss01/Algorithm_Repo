
package hackerrankpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ReverList {
	
	
	@Test
	public void test1()
	{
		List<Integer> inputlist =new ArrayList<Integer>(Arrays.asList(1,2,3,5,6));	
		List<List<Integer>> operations = new ArrayList<List<Integer>>();
	    List<Integer> innerList = new ArrayList<>(Arrays.asList(1,4));
	    operations.add(innerList);
	    List<Integer> innerList1 = new ArrayList<>(Arrays.asList(2,3));
	    operations.add(innerList1);
	     
		System.out.println(performOperations(inputlist,operations));
	}
	
	public static List<Integer> performOperations(List<Integer> arr, List<List<Integer>> operations) {
	    // Write your code here
	      int left = 0;
	      int right = 0;    
	        
	    for(int i=0; i< operations.size();i++)
	    {
	        List<Integer> s= operations.get(i);
	        System.out.println();
	        
	         left =s.get(0);
	         right=s.get(1);
	        //1,2,3,5,6
	        
	        while (left < right) {
	            int temp = arr.get(left);
	            arr.add(left, arr.get(right));
	            arr.remove(left+1);
	            arr.add(right, temp);
	            arr.remove(right+1);
	          left++;
	          right--;
	        }
	        
	    }
	     
	        return arr;

	    }

	    
	
	
	private List<Integer> Listreverseusingtwopointer(List<Integer> list ) {
		int left = 0;
		int right = list.size()-1;
		while (left < right) {
			int temp = list.get(left);
			list.add(left, list.get(right));
			list.remove(left+1);
			list.add(right, temp);
			list.remove(right+1);
			left++;
			right--;
		}
		return list;

	}
}


