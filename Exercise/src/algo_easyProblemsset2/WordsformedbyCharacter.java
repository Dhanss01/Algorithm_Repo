package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class WordsformedbyCharacter {

	@Test
	public void test1()
	{
		String[] stringarray ={"cat","bt","hat","tree"};
		String s= "atach";
		System.out.println(findMatchingWords(stringarray, s));
	}
	
	public int findMatchingWords(String[] sarray, String s)
	{
		List<Character> list = new ArrayList<Character>();
		int sum=0;
		for(char c : s.toCharArray())
		{
			list.add(c);
		}
		for(int m=0; m<sarray.length;m++)
		{
			int count=0;
			
			for(int i=0;i<sarray[m].length();i++)
			{
				char c =sarray[m].charAt(i);
				if(list.contains(c))
				{
					count++;
				}
				if(count==sarray[m].length())
				{
					sum=sum+count;
				}				
					
			}
			
		}
		return sum;
	}
}
