package algo_easyProblemsset2;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class HappyNumbers {

	
	@Test
	public void test1()
	{
		int num= 19;
		System.out.println(isHappyNumber(num));
	}
	
	
	/*get the N and spit the digits and square each digits 
	 * add squares of each digit and sum up in other variable
	 * continue this process until n becomes 0
	 * get the sum digit check if its 1
	 *   --> yes return true
	 *   --> else assign the N the value as sum and continue this process again
	 * add the sum values in to set 
	 * if this set contains N value already then   return false
	 * else return true
	 * 
	 * 
	 */
	 public boolean isHappyNumber(int n)
	 {
		 Set<Integer> numsset = new HashSet<Integer>();
		 
		while(!numsset.contains(n))
		{
			numsset.add(n);
			int sum=0;
			while(n>0)
			{
				int reminder = n%10;
				 sum= reminder*reminder;
				 n=n/10;
			}
			
			if(sum==1)
			{
				return true;
			}
			else
				n=sum;
		}
		return false;		
	 }
	 
}
