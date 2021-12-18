package hackerrankpractice;

import java.util.Arrays;

import org.junit.Test;

public class MaimumBox {
	/*You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

numberOfBoxesi is the number of boxes of type i.
numberOfUnitsPerBoxi is the number of units in each box of the type i.
You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.

Return the maximum total number of units that can be put on the truck.

 

Example 1:

Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
Output: 8
Explanation: There are:
- 1 box of the first type that contains 3 units.
- 2 boxes of the second type that contain 2 units each.
- 3 boxes of the third type that contain 1 unit each.
You can take all the boxes of the first and second types, and one box of the third type.
The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
Example 2:

Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
Output: 91
	/*
	 * test data
	
	Positive
	 int[][] = [[1,3],[2,2],[3,1]], limit =8
	
	negative
	int[][] = [[1,3],[3,1]], limit=2
	
	edge: int[][] = 
	
	/*create a two-D array first column has noofBox and second column has units
	 * create a productsum variable to hold the results
	 
	 * Iterate through the units and find the max units and multiply with box 
	 * sort the arrays based units  by using comparatator
	 
	 * productsum= productsum+productsofunits
	 
	 * if productsum is < trucksize then sum all the products 
	 * Check the No of box each time which should be < truck size
	 
	   when No of box > trucksize
	 * look for the second max which should accomadate with in the tucksize
	 * if yes --> countinue adding them in sum
	 * 
	 * 
	 */
	@Test
	public void test1()
	{
		int[][] nums= {{1,3},{2,2},{3,1}};
		int limit=8;
		System.out.println(maximumboxTruck(nums, limit));
	}
	@Test
	public void test2()
	{
		int[][] nums= {{1,3},{3,1}};
		int limit=2;
		System.out.println(maximumboxTruck(nums, limit));
	}
	
	
	private int maximumboxTruck(int[][] nums, int limit) {
		// TODO Auto-generated method stub
	
	int productsum=0;
	Arrays.sort(nums, (a,b) ->{
			
		if(a[1]!=b[1])
		{
			return a[1] -b[1];
		}
		else
			return a[0]-b[0];
		
	});
	
		
	for(int i =0; i< limit;i++)
	{
		int product= nums[i][0]*nums[i][1]; //check all the possible iterations
		if(product<limit)
		{
			productsum+=product;
		}			
		
	}
	
	return productsum;
}

}
