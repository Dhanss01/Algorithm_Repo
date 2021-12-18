package algo_easyProblemsset2;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MaxOccuranceofaString {

	@Test
	public void test1()
	{
		String s= "AAAaAAAbcadbb";
		findMaxoccuranceofCharacter(s);
	}
	
	public char maximumCharacterOccurance(String s)
	{
		int max=Integer.MIN_VALUE; char output=' ';
		int[] asciiarray =new int[256];
		
		for(int i=0;i<s.length();i++)
		{
			asciiarray[s.charAt(i)]++;
		}
		
		for(int j=0;j<s.length();j++) {
			if(max<asciiarray[j])
			{
				max=asciiarray[s.charAt(j)];
				output = s.charAt(j);
			}
		}
		
		System.out.println(output);
		return output;
	}
	
	
	public char findMaxoccuranceofCharacter(String s)
	{
		int maxcount=0; char output=  ' ';
		Map<Character, Integer>  mymap= new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
		  mymap.put(s.charAt(i), mymap.getOrDefault(mymap.get(s.charAt(i)),0)+1);
		 
		  if(mymap.get(s.charAt(i)) > maxcount)
		  {
			  maxcount=mymap.get(s.charAt(i));
		  }
		}
		
		
		
		
		 for (Map.Entry<Character, Integer> entry : mymap.entrySet()) {
			if(entry.getValue()==maxcount)
			{
				output = entry.getKey();
			}
		}
		 System.out.println(output);
		return output;
		
	}
}
