package hackerrankpractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class SubArrayMultiplesofK {
	
	
	@Test
	public void test1()
	{
		int [] nums = {23,2,4,6,7}; //positive
		int k = 6;
		Assert.assertEquals(true,isMultiple(nums, k));
	}
	@Test
	public void test2()
	{
		int [] nums = {23,2,6,4,7}; //positive
		int k = 6;
		Assert.assertEquals(true,isMultiple(nums, k));
	}
	@Test
	public void test3()
	{
		int [] nums = {23,2,6,4,7}; //negative
		int k = 13;
		Assert.assertEquals(false,isMultiple(nums, k));
	}
	@Test
	public void test4()
	{
		int [] nums = {6,0,4,7}; //edge
		int k = 6;
		Assert.assertEquals(true,isMultiple(nums, k));
	}
	
	
	/*add the summ of contigious array
	 * if that sum value is divied by k and if get that reminder
	 * add that reminder value in Map
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static long isMultiple(int[] nums, int k) {

        int sum=0, count =0; int remainder = 0; 
          Map<Integer, Integer> map = new HashMap();      	    
          for(int i=0; i<nums.length; i++){
              sum= sum+nums[i];
              remainder = sum % k;
              while(remainder <0)
                  remainder=remainder+k;
              if(map.containsKey(remainder))
              {
                  count+=map.get(remainder);
              }
              map.put(remainder, map.getOrDefault(remainder, 0)+1);
          }
          return count;
          
      }
  }


