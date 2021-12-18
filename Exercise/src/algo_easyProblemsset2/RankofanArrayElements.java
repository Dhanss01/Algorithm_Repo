package algo_easyProblemsset2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

//import com.sun.tools.javac.util.ArrayUtils;

public class RankofanArrayElements {

	
	@Test
	public void test1()
	{
		int[] arr= {100,100,100};
		//[4,1,2,3]
		arrayRankTransform(arr);
	}
	
	
	/*pseudo code
	 * initiate LinkedhashMap
	 * get the array and assign it to list and sort it
	 * pass the Array into Hashmap key 
	 * check that value is available in list and pass that index as map value
	 * 
	 * 
	 * 
	 */
public int[] arrayRankTransform(int[] arr) {
        
	Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();        
    List<Integer> list1 = new ArrayList<Integer>();
    for(int i: arr)
    {
    	list1.add(i);
    }
    Collections.sort(list1);
    
       for(int i=0;i<arr.length;i++)
       {
    	 int k = arr[i];
    	 int index=0;int keyvalue=0;
    	 while(index <list1.size())
    	 {
    	 if(list1.get(index)==k)
    	 {
           keyvalue=index+1;
           break;
    	 }
    	 index++;
    	 }
    	 if(!map.containsKey(k))
    	 {
    		 map.put(k, map.get(k));
    	 }
    	 
       }
       int[] array = new int[list1.size()];
       int index = 0;
       for(Integer element : map.values()) 
       {
    	   array[index++] = element.intValue();  
       }
    	   
       
	return array;

    }
}
