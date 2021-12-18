package brouteforceproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class IsAnagramProblem {
@Test
public void test()
{
	String s = "uracbcba";
	String p= "abc";
	System.out.println(findAnagramUsingAscii(s,p));
	
}



public List<Integer> isanagram(String s, String p)
{
	Map<Character,Integer> targetmap =new HashMap<Character, Integer>();
	Map<Character,Integer> currentmap =new HashMap<Character, Integer>();
	ArrayList<Integer> list= new ArrayList<Integer>();
	int left=0, right=0;
	for(int i=0;i<p.length();i++)
	{
		targetmap.put(p.charAt(i),targetmap.getOrDefault(p.charAt(i), 0)+1);
		
	}
	
	while(right<=s.length()-p.length())
	{
		currentmap.put(s.charAt(right),currentmap.getOrDefault(s.charAt(right), 0)+1);
		if(left-right+1==targetmap.size() && currentmap.equals(targetmap))
		{
			list.add(left);
		}
		if(currentmap.get(s.charAt(left))>1)
		{
			currentmap.put(s.charAt(right),currentmap.getOrDefault(s.charAt(right), 0)-1);
		}
		
			else {
				currentmap.remove(s.charAt(left));
			}
			left++;
		}
		right++;
	
	return list;
	}



/*get the two string input and target
 * initiate to int array, output list;
 * add the p int values in targetarray,
 * left is slow pointer =0, right is fastpointer =0
 * increment the left value in s, till it matches to target length;
 * when both size are equal and int  values of the arrays are equal then find the left index and add it to output
 * then delete the left -1, and decrement the left pointer to next position 
 * again increment the right  till target map 
 * continue this process till the end off an input string when left-p.length();
 */
public List<Integer> findAnagramUsingAscii(String s, String p)
{
	int[] targetarray= new int[128];
	int[] inputarray= new int[128];
	int left=0; int right=0;
	ArrayList<Integer> output= new ArrayList<>();
	List<String> anagramlist = new ArrayList<String>();
	
	for(int i=0;i<p.charAt(i);i++) {
		targetarray[s.charAt(i)]++;
	 
	}	
	while(left<=s.length()-p.length() && right<=s.length()-1)
	{
		inputarray[s.charAt(right)]++;
		if(inputarray.length == targetarray.length)
		{
			if(inputarray.equals(targetarray))
			{
				output.add(left);
				anagramlist.add(s.substring(left,right+1));
			}
			else
			{
				inputarray[s.charAt(left)]--;
				left++;
				
			}
			
		}
		right++;
	}
	
	System.out.println(anagramlist.get(anagramlist.size()-1));
	
	return output;
	

}

}
