package algo_easyProblemsset2;

import org.junit.Test;

public class ConsecutiveOne {

	@Test
	public void test1()
	{
		int[] nums= {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
		
	}
	
	//left 0, right=0; nums[right]==1 right++, count++
	//if nums[right]=0 left =right; max= max(count,max)
	//0,1,0
	
	/*/*left ->0, right-->0
	 *if left and right points to value 1--> increment right, increment count
	 *if left points to 1 ,right points to ->track the max count and move left to right 
	 *if both left and right points to value 0--> increment left and right 
	*/
	
	
	 public int findMaxConsecutiveOnes(int[] nums) {
		 
		 int left=0, right=0,count=0,max=0;
		 while(right<nums.length)
		 {
			 if(nums[right]==1)
			 {
				 right++;
				 count++;
			 }
			 else if(nums[right]==0||right==nums.length-1)
			 {
				 max=Math.max(count,max);
				 left=right;
				 right++;			
				 count=0;
			 }
			 		 
			 
		 }
		 return max;
	        
	    }
}
