package algo_MediumProblems;

import org.junit.Test;

public class MeetingSlotDuration {

	
	@Test
	public void test1()
	{
		int[][] arr1= {{10,50},{60,120},{140,210}};
		int[][] arr2= {{0,15},{60,70}};
		int duration=8;
		System.out.println(" " +slotsDuration(arr1,arr2,duration));
		
		
	}

	@Test
	public void test2()
	{
		int[][] arr1= {{10,50},{60,120},{140,210}};
		int[][] arr2= {{0,15},{60,70}};
		int duration=12;
		System.out.println(" " +slotsDuration(arr1,arr2,duration));
		
		
	}
	
	/*when slot1 startingtime and slot2 starting times are equal which works for both of them
	 * and find the min value of both slot ending time
	 * if min value is < = durations then add startingtime+duration as ending time and starting time 
	 * else return -1-1; 
	 */
	
	public int[][] slotsDuration(int[][] arr1, int[][]arr2,int duration)
	{
		
		int maxlength=0;
		int min=Integer.MAX_VALUE;
		
	if(arr1.length>arr2.length)
	{
	 maxlength =arr1.length;
	}
	else
	{
		 maxlength=arr2.length;
	}
		for(int i=0; i<=maxlength;i++)
		{
			
				int slot1startingtime = arr1[i][0];
				int slot2startingtime = arr2[i][0];
				
				if(slot1startingtime==slot2startingtime)
				{
					int slot1endingingtime=arr1[i][1];
					int slot2endingingtime=arr2[i][1];
					 min=Math.min(slot1endingingtime, slot2endingingtime);
					 if(slot1startingtime-min<=duration)
					 {
						 int result =slot1startingtime+duration;
						 return new int[][]{{slot1startingtime,result}};
					 }
				}		
			}
		
		return new int[][] {{-1,-1}} ;
	}
	
	
	
}
