package brouteforceproblems;

import org.junit.Test;

public class SubsequenceOccurance {
	@Test
	public void test1()
	{
		String s="AAAABBCCEEEEABD";
		System.out.println(getOccurance(s));
				//Output: 4A2B2C4E1A1B1D
	}
	
	//init left and righ, count and StringBuilder
	//left=0, right=0; 
	    //increment right check if leftchar == rightchar
	        //yes count++ and right++ 
		//if leftchar != rightchar  
			//stringBuilder = append count, left=right,resetcount =0
			
	
	
	public String getOccurance(String s)
	{
		int left=0,right=0, count=0;
		StringBuilder builder=new StringBuilder();
		while(right<s.length())
		{
			char leftchar=s.charAt(left);
			char rightchar=s.charAt(right);
			if(leftchar==rightchar) {
				right++;
				count++;
			}
			else {
				String c =String.valueOf(count);
				builder.append(c);
				builder.append(leftchar);
				left=right;
				count=0;
			}
		}
		
		return builder.toString();
		
		
	}
	
}


