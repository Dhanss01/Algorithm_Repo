package hackerrankpractice;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class FirstUniqueCharacter {
	
	
	@Test
	public void test1()
	{
		String s = "statistics";
		System.out.print(Retutnfirstoccur(s));		
	}
	@Test
	public void test2()
	{
		String s = "ssss";
		System.out.print(Retutnfirstoccur(s));		
	}

	@Test
	public void test3()
	{
		String s = "abcde";
		System.out.print(Retutnfirstoccur(s));		
	}
	@Test
	public void test4()
	{
		String s = "g";
		System.out.print(Retutnfirstoccur(s));		
	}

	/*Pseudo code
	 * Initialize the TreeMap to preseve the insertion order , and traverse througt the string add the s.chartAt(i) from string
	 * if map contains a character already then using getordefault increment the duplicates value by1
	 * continue till  end of the string
	 * when value==1 then return corresponding the keys from the Map
	 * form that as an array and get the index[0] and increment by 1 
	 * 
	 * staticsa
	 */
	public int Retutnfirstoccur(String s)	
	{
		
		Map<Character,Integer> mymap= new TreeMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			mymap.put(s.charAt(i), mymap.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(int j=0; j<s.length();j++)
		{
		if(mymap.get(s.charAt(j))==1)
		{
			return j+1;
		}
		}
	 	return -1;
	}
	
	private int findFirstUniqueCharacter(String s) {
		for (int i = 0; i < s.length(); i++) {
			int indexOf = s.indexOf(s.charAt(i));
			int lastIndexOf = s.lastIndexOf(s.charAt(i));
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				return i + 1;
			}
		}
		return -1;
	}
}
