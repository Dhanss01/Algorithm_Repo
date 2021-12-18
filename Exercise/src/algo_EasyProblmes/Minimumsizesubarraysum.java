package algo_EasyProblmes;

import org.junit.Test;

public class Minimumsizesubarraysum {
	
	@Test
	public void test() {
		int[] num= {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
		int target=15;
		
		 findSubarray(num, target);
		
		
	}
	 // maintains the sum of the current window
	 // maintain a window [low, high-1]
	// consider every subarray starting from the `low` index
	// if the current window's sum is less than the given sum,
    // then add elements to the current window from the right
	   // At this point, the current window's sum is more than the given sum.
    // Remove the current element (leftmost element) from the window
	public static void findSubarray(int[] nums, int target)
    {
       
        int windowSum = 0;       
        int high = 0;
        
        for (int low = 0; low < nums.length; low++)
        {
           
            while (windowSum < target && high < nums.length)
            {
                windowSum += nums[high];
                high++;
            } 
           
            if (windowSum == target)
            {
                System.out.printf("Subarray found [%d–%d]", low, high - 1);
                return;
            }
            else if(windowSum>target){
            	windowSum -= nums[low];
            }
            
        }
    }

}
