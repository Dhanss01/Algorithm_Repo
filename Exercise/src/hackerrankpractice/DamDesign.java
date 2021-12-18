package hackerrankpractice;

import java.util.List;

public class DamDesign {
	
public static int maxHeight(List<Integer> wallPositions, List<Integer> wallHeights) {
	    // Write your code here
	
	//Find the difference between each wallpositions and wallheights
	//when difference is equal then find the min from wall height and wall height +difference
	// return that max as the maximum value

	int n= wallPositions.size();
	int maximumheight= 0;
	for(int i=0;i<n-1;i++)
	{
		int diff=Math.abs(wallHeights.get(i+1)-wallHeights.get(i));
		int gap =wallPositions.get(i+1)-wallPositions.get(i)-1;
		int max=0;
		if(gap>diff)
		{
			int low =Math.max(wallHeights.get(i+1),wallHeights.get(i)+1);
			int length=gap-diff-1;
			max=low+length/2;
		}
		else
		{
			max =Math.min(wallHeights.get(i+1),wallHeights.get(i))+gap;
		}
		maximumheight = Math.max(maximumheight, max);
	}
	
	
return maximumheight;
}


}
