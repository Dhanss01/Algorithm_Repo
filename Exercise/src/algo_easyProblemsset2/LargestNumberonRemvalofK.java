package algo_easyProblemsset2;

import org.junit.Test;

public class LargestNumberonRemvalofK {

	@Test
	public void test1()
	{
		String num= "15958";
		System.out.println(removalofK(num));
	}
	
	public int removalofK(String s)
	{
		
		StringBuilder sb= new StringBuilder(s);
		StringBuilder sb1= new StringBuilder(s);
		int m=0,n=0;
		
		for(int i=0;i<sb.length()-1;i++)
		{
			char l =sb.charAt(i);
			if(l=='5')
			{
				sb.deleteCharAt(l);
				break;
			}		
			
		}
		m= Integer.parseInt(sb.toString());
		
		for(int j=sb1.length()-1;j>0;j--)
		{
			if(sb1.charAt(j)=='5')
			{
				sb1.deleteCharAt(s.charAt(j));
				break;
			}		
			
		}
		
		 n= Integer.parseInt(sb1.toString());
		if(n<m)
			return m;
			else
				return n;
		
	}
	
	/*
	
	boolean isNegative = false;
    if (n < 0) {
        isNegative = true;
    }
    String s = Integer.toString(n);
    int max = 0, min = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '5') {
            String temp = s.substring(0, i) + s.substring(i + 1);
            int tempInt = Integer.parseInt(temp);
            if (isNegative)
                min = Math.min(tempInt, max);
            else
                max = Math.max(tempInt, max);
        }
    }
    return isNegative ? min : max;
    */
    

}