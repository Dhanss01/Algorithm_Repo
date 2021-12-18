package hackerrankpractice;

import org.junit.Test;

public class LogestEvenLengthWord {
	
	
	@Test
	public void test1()
	{
		String s= "Time to Write Greate Code";
		System.out.println(firstOccurofLongestevenlength(s));
	}
	
	/*split the string in to words
	 * find the string.length of each words
	 * check whether length%2 == 0;
	 * add that to the list
	 * return the first occurance list.get(0);
	 * 
	 */
	public String firstOccurofLongestevenlength(String s)
	{
		String[] str = s.split(" ");		
		int max =Integer.MIN_VALUE;
		 String output = null;
		for(int i =0; i< str.length;i++)
		{	
			if (str[i].length()>max && str[i].length()%2==0) 
			{
	            max = str[i].length(); 
	             output=str[i]; // first maximum
	        }
			
			
		}		
		
		return output;		
	}

}
