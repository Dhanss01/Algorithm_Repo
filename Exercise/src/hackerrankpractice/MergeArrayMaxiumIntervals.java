package hackerrankpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MergeArrayMaxiumIntervals {
	/*Given an array of intervals [[1,3],[2,4],[6,9]], merge the overlapping intervals, i.e to [[1,4],[6,9]]
	[[1,4],[2,3],[3,6]]


	 * pseudocode
	 * ensure all the starting numbers are in sorted 
	 * when start is lest than end and end > end+1 and start+1 then take the subset as {start,end}
	 * When end <end+1 and end>start+1 then take the {start , end+1} as a subset  
	 * if end <end+1 and end<start+1 then take the {start , end+1} as a subset  
	 */
	
	@Test
public void example() {
		
		int[][] arr = { {1,4},{2,3},{3,6}};
		maxintervals(arr);
		
	}
	
	//1 2 3
	//4 3 6
	
	public void maxintervals(int[][] arr)
	{
		List<Integer> list1 = new ArrayList<Integer>();
		int endvalue = arr[0][1];
		int maxendvalue= arr[0][1];
		//get the end value and compare with the start  if its greater than then increment the end pointer
		//else make the start and max end addd the list
		for(int i=0; i<arr.length;i++)
		{
				
			 if(endvalue>arr[i][0]&& endvalue>arr[i][1])
			{				
				endvalue = Math.max(maxendvalue,endvalue);
			}
			 
			 else if(endvalue <arr[i][0])
			 {
				list1.add(arr[1][0]);
				list1.add(endvalue);
				endvalue = arr[i][1];
			 }
			
		}
	}

}
