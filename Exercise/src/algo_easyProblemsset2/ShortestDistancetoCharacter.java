package algo_easyProblemsset2;

import org.junit.Test;

public class ShortestDistancetoCharacter {
	
	@Test
	public void test1()
	{
		String s = "loveLeetCode";
		char c= 'e';
		shortestToChar(s,c);
	}	
	
	/*pseudocode
	 * create a outputarray witht he size of s.length
	 * traverse through from string 
	 * if s.chartAt(i) is not equal to given Character
	 * then fill the remaining elements Integer.Maxvalue
	 * the in second pass iterate through from 0 -length the array whenever arr[i] is not equal to Maxvalue 
	 * then near by element output[i+1] should be Min( exisiting value ,summed up by value in output[i]+1)
	 * 
	 * in third pass iterate through  from length -0 
	 * then  (i-1) should be min(output[i-1], output[i]+1)
	 * 
	 * 
	 */
		
		 public int[] shortestToChar(String s, char c) 
		 {
			int[] output= new int[s.length()];
			for(int i=0; i<s.length();i++)
			{
				if(s.charAt(i)!=c)
				{
					output[i]=Integer.MAX_VALUE;
				}
			}
			for(int j=0;j<s.length()-1;j++)
			{
				if(output[j]!=Integer.MAX_VALUE)
				{
					output[j+1]=Math.min(output[j+1], output[j]+1);
				}
			}
			for(int j=s.length()-1;j>0;j--)
			{
				
					output[j-1]=Math.min(output[j-1], output[j]+1);
				
			}
			return output;
		 }
	

	
}
