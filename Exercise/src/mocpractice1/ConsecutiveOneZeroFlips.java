package mocpractice1;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class ConsecutiveOneZeroFlips {

	
	@Test
	public void test2()
	{
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
	}

/*pseudo code
 * init start =0, end=0, start is slow pointer and end is fast pointer
 * init maxcount as Integer.Minvalue
 * move the end element and count each ones in counter
 * move end till you find the end element as 0
 *   --move the start element to the end 
 *   --if yes move end to next 1 position 
 *   find the shortest distance between end and start then flip the 0 to 1 
 *     
 * compare counter and max 
 * 
 * 
 */

public void sortColors(int[] nums) {
    
	 TreeMap<Integer, Integer> colormap = new TreeMap<Integer, Integer>();
      
      for(int i=0;i<nums.length;i++)
      {
          colormap.put(nums[i], colormap.getOrDefault(colormap.get(i),0)+1);
            
      }
      
      
  }



}
