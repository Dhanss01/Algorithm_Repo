package hackerrankpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class FinAnagramList {
	@Test
	public void test1()
	{
		List<String> list1 = Arrays.asList("eat","tea","tan","ate","nat","bat");
		System.out.println(findAllAnagramslist(list1));
		//Assert.assertEquals(findAllAnagramslist(list1), new ArrayList<>([["eat", "tea", "ate"], ["bat"], ["tan","nat"]]));
		
	}
	
	/*create a <List<List output list , create a Hapmap
	 * iterate the give string list take each string and
	 * initialize a int array  add the ascii of that each character in a string 
	 * arr[0] = char c- 97;
	 * pass the int array to map  key and assin the string in the respective value
	 * if map.contains that assci array, append the string value , with the exiting values 
	 * else
	 * add the assci array and corresponding string values in to the map.
	 * by using entryset getvalue() from the map return the valuelist .
	 *   
	 */
	
	
	public List<List<String>> findAllAnagramslist(List<String> list1)
	{
		//List<List<String>> Outputlist = new ArrayList<List<String>>();
		
		Map<String, List<String>> mymap= new HashMap<String, List<String>>();
		
		for(int i=0; i<list1.size();i++)
		{
			int[] arr = new int[26];
			String temp =list1.get(i);
			for(int j=0; j<temp.length();j++)
			{
			  arr[temp.charAt(j)-97]++;
			}
			List<String> s1 = new ArrayList<String>();
			
			if(mymap.containsKey(Arrays.toString(arr)))
			{
				s1.addAll(mymap.get(Arrays.toString(arr)));
				s1.add(temp);
				mymap.put(Arrays.toString(arr), s1);	
			}
			else
			{
				s1.add(temp);			
				mymap.put(Arrays.toString(arr), s1);	
			}
			
					
		}
		
		
		
		return new ArrayList<>(mymap.values());
				//Outputlist;
	}
	

}
