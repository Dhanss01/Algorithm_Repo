package brouteforceproblems;

import org.junit.Test;

public class TrainSpeenaAraival {

	
	@Test
	public void test1() {
		int[] nums = {1,3,2};
		float hours =6;
		System.out.println(kMperSpeed1(nums,hours));
	}
	//@Test
	public void test2() {
		int[] nums = {1,3,2};
		float hours =(float) 2.7;
		kMperSpeed1(nums,hours);
		
	}

	/*
	 *    Pseudo code
	 *    initialize all the numbers in the array 
	 *    get each i number and divide with j each values
	 *    and sum up on each ith time  when it matches to hour then return the divident
	 */
	
	public void  kMperSpeed(int[] nums, float hours)
	{
		float speed=0; float totalspeed=0;
		for(int i=0;i<nums.length;i++)
		{
			totalspeed=0;
			for(int j=0;j<nums.length;j++)
			{ 
				int l = nums[j]/nums[i];
				totalspeed= totalspeed + l;
				
			}
			if(totalspeed==hours)
			{
				System.out.println(nums[i]);
			}
						
		}
		//System.out.println(-1);	
		//return totalspeed;
	}
	
	
	/*get the array and assign a starting index as low and Ending index as 10
	 * mid as low+hight/2;
	 * identify the kilometerspeed by deviding the mid value with all the array values
	 * sum up the total values if total values are less than 1 we need to roundof it to one because minimum KMspeed is 1
	 * when array reaches to lenth-1 then dont round of it to 1 leave as it is
	 *  sum up the average speed  if its max less than hour then return tha value
	 */
	
	public int kMperSpeed1(int[] nums, double hour) {
		int maxrange=0,minrange=Integer.MIN_VALUE;
		 double time=0; double totalspeed=0;
				
		for(int i=1;i<nums.length;i++){
			maxrange = Math.max(maxrange, nums[i]);
			minrange = Math.min(minrange, nums[i]);
		}
		 int left=minrange;
	     int right = maxrange;
	        
		
     if((double) nums.length-1>=hour)
            return -1;     
       
      while(left<=right)
        {
            int mid=left+right/2;
            
            for(int i=0;i<nums.length;i++)
            {
            	if(i<nums.length-1)
            	{
            		time+=nums[i]/mid;
                    totalspeed=totalspeed+(Math.ceil(time));	
            	}
            	else
            	{
            		time+=nums[i]/mid;
                    totalspeed=totalspeed+time;
            	}
                
                
            }
            
            if(totalspeed<=hour)
            	return mid;
            if(totalspeed>hour)
                right=mid-1;
            else
                left=mid+1;
        }
        return left;
    }
    

}
