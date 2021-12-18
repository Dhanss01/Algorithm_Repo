package queue;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.Test;

public class Interlinkingqueue {
	
	  @Test
	    public void test4() {
	        int[] data = {1,3,5,7,2,4,6,8};
	        // {1,2,3,4,5,6,7,8}
	        inerlinkvalues(data);        
	        
	    }
	    
	    @Test
	    public void test5() {
	        int[] data = {1,2,3,4,11,12,13,14};
	        // {1,11,2,12,3,13,4,14}
	        inerlinkvalues(data);
	    }
	    @Test
	    public void test3() {
	        int[] data = {3,4,6,1,3,5,9,6,0};
	        // {1,11,2,12,3,13,4,14}
	        inerlinkvalues(data);
	    }
	    
	  
	    // left= starting index, right = mid 
	    //initialize the queue
	    //add the left value and followed which add the right value
	    //continue this till the length
	    
	    public void inerlinkvalues(int[] nums)
	    {
	    	int  left = 0; int right = nums.length/2;
	    	
	    	Deque<Integer> result = new ArrayDeque<>();
	    	
	    	while(left< nums.length/2)
	    	{
	    		result.offer(nums[left++]);
	    		result.offer(nums[right++]);
	    		
	    	}
	    	
	    	System.out.println(result);
	    }
	    

}
