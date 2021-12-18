package Assesment;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class UDRL {
	
	@Test
	public void test1()
	{
		String s = "RRR";
				finalPosition(s);		
	}

	
	static void finalPosition(String move)
    {
	int l = move.length();
    int countUp = 0, countDown = 0;
    int countLeft = 0, countRight = 0;

   
    for (int i = 0; i < l; i++)
    {
        
        if (move.charAt(i) == 'U')
            countUp++;

        else if (move.charAt(i) == 'D')
            countDown++;

        else if (move.charAt(i) == 'L')
            countLeft++;

        else if (move.charAt(i) == 'R')
            countRight++;
    }

   
   int s= (countRight - countLeft)+ (countUp - countDown);
    System.out.println(l-s);
}

}
