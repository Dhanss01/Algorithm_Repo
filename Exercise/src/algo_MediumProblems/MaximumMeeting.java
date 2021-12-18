package algo_MediumProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class MaximumMeeting {

	@Test
	public void example() {
		List<Integer> scheduleStart = new ArrayList<>(Arrays.asList(1, 1, 2));
		List<Integer> scheduleEnd = new ArrayList<>(Arrays.asList(3, 2, 4));

		int maxPresentations = maxPresentations(scheduleStart, scheduleEnd);
		System.out.println(maxPresentations);
	}

	private int maxPresentations(List<Integer> scheduleStart, List<Integer> scheduleEnd) {
		// TODO Auto-generated method stub
		
		int[][] conference =new int[scheduleStart.size()][2];
		
		for(int i =0; i<conference.length;i++)
		{
			conference[i][0] = scheduleStart.get(i);
			conference[i][1] = scheduleEnd.get(i);
			
		}
		
		Arrays.sort(conference, (a, b) -> {
			if (a[1] != b[1])
				return a[1] - b[1];// end times
			else
				return a[0] - b[0];// start times
		});

		
		/*Arrays.sort(conference, new Comparator<Integer[]>() {
		   	@Override
	                //arguments to this method represent the arrays to be sorted   
			public int compare(Integer[] a, Integer[] b) {
	                    //get the item ids which are at index 0 of the array
		            Integer meetingendone = a[0];
		            Integer meetingendtwo = b[0];
			    // sort on item id
			    return meetingendone.compareTo(meetingendtwo);
			}
		});*/
		
		return 0;
	}

}
