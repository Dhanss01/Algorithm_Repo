package brouteforceproblems;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PlusMinus {

	@Test
	public void test1()
	{
		 List<Integer> list = Arrays.asList(1,1,0,-1,-1);
		 plusMinus(list);
		 
	}
	
	 public static void plusMinus(List<Integer> list) {
		    // Write your code here
		 	int zerocount;
			int positivecount=0, negativecount=0, zerocount1=0;
			double k=list.size();
		 for(int i=0;i<list.size();i++)	
		 {
		 	if(list.get(i)<0 )//&& list.get(i)<=Integer.MIN_VALUE)
		 	{
		 		negativecount=negativecount+1;	
		 	}
		 	else if(list.get(i)>0)// && list.get(i)<=Integer.MAX_VALUE
		 	{
		 		positivecount=positivecount+1;	
		 	}
		 	else
		 	{
		 		zerocount1=zerocount1+1;
		 	}
		 }
		 System.out.println(positivecount/k);
		 System.out.println(negativecount/k);
		 System.out.println(zerocount1/k);
		 
		 
		    }
}
