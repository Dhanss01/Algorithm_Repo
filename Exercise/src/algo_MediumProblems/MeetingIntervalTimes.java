package algo_MediumProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MeetingIntervalTimes {
	
	
	/*A person could attend all the meeting then return true
	 * sort the array based on ending index
	 * set the first ending index of meeting[0][1]
	 * if all  ending index are greater that meeting[i][1]
	 * then return true
	 * else return false
	 */

	
	//@Test
	public void example() {
		
		int[][] arr = { {0,30},{5,10},{15,20}};
		boolean value = intervalsOfalltheMeeting(arr);
		System.out.println(value);
	}

	
	@Test
	public void example2()
	{
		int[][] arr = { {7,10},{2,4}};
		boolean value = intervalsOfalltheMeeting(arr);
		System.out.println(value);
	}
	
	
private boolean intervalsOfalltheMeeting(int[][] meetingtime) {
		// TODO Auto-generated method stub
		
	Arrays.sort(meetingtime, (a,b) ->{
			
		if(a[1]!=b[1])
		{
			return a[1] -b[1];
		}
		else
			return a[0]-b[0];
		
	});
	
	int endtime = meetingtime[0][1];

	boolean result =false;
	
	for(int i =1; i< meetingtime.length;i++)
	{
		
		if(endtime>meetingtime[i][0])
		{
			return false;
		}	
		endtime = meetingtime[i][1];
		
	}
	
	    result =true;
		return result;
	}

}
