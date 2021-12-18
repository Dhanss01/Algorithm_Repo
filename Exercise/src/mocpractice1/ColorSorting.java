package mocpractice1;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;


public class ColorSorting {
	
	@Test
	public void test2()
	{
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
	}
	
	
    public void sortColors(int[] nums) {
	        
	      Map<Integer,Integer> colormap = new TreeMap<Integer,Integer>();
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            colormap.put(nums[i], colormap.getOrDefault(colormap.get(i),0)+1);
	              
	        }
	        
	        
	    }
}


