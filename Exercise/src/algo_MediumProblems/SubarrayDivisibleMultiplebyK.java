package algo_MediumProblems;

import java.util.HashMap;
import java.util.Map;

public class SubarrayDivisibleMultiplebyK {
	
	public void test1(){
		int[] nums= {23,2,6,4,7};
		int k =6;		
		System.out.println(SubarraydivisiblebyK(nums,k));
	}

	/*traverse through an array declare the previous reminder value
	 * add the reminder value in map key and value as index
	 * if reminder value exist in map already then that would make one subarray
	 * return true
	 * 
	 * 
	 */
	
	public boolean SubarraydivisiblebyK(int[] nums, int k)
	{
		Map<Integer, Integer> mymap= new HashMap<Integer, Integer>();
		int previousreminder =0; int currentreminder=0;
		for(int i=0; i<nums.length;i++)
		{
			currentreminder=(nums[i]+previousreminder)%k;
			if(mymap.containsKey(currentreminder))
			{
				if(Math.abs(mymap.get(currentreminder)-i)>1)
				return true;
			}
			
			mymap.put(currentreminder,i);
			previousreminder=currentreminder;
		}
		
		return false;
		
	}
}
