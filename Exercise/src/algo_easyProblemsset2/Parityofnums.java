package algo_easyProblemsset2;

import java.util.HashMap;

import org.junit.Test;

/* Problem (Solve it using Optimised approach)
I/p->[10, 20, 20, 10, 10, 30, 50, 10, 20] -> 3
10 - 4 - 2 pair of 10
20 - 3 - 1 pair
30, 50 - 1
Output -> 3
 * 
 */
public class Parityofnums {
	@Test
	public void test1()
	{
		int[] nums = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		getPairsoNums(nums);
	}
	
	public int getPairsoNums(int[] nums)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			map.put(nums[i],map.getOrDefault(nums[i],0)+1);
		}
		
	
		
		//get the value of each key
		// if value module/2==0, get the count untill reminder reaches to  0, 
		//else count until it is greater than 2
		
		/*for(Integer i : map.keySet())
		{
			int m= map.get(i);
			
			int reminder=0;
			if(m%2==0)
			{   reminder =m/2;
				count++;
				while(reminder>0)
				{
					reminder= reminder/2;
					count++;
				}					
			}
			else
			{
				if(m>2)
				{
					reminder=m/2;
					count=1;
					while(reminder>2)
					{
						reminder= reminder/2;
						count++;
					}
				}			
			}		
		}*/
		return count;
	}
	

}
