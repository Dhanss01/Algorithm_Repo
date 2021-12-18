package brouteforceproblems;

import java.util.Arrays;

import org.junit.Test;

/* Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
sathish kumar8:39 PM
n1 = 4567
n2 = 2345
 * 
 * 
 */

public class Mergetwoarraywithacendingorder {
	
	/*left as nums1 starting index
	 * right as nums2 standing index
	 * create a output array and assign the size if nums1.length>nums2.length
	 * if left<right  and keep the right as it is and increment the left alone
	 * 	  output[i] = left,
	 * if right<left keep left as it is and increment the right alone
	 * if right=0||left=0 then ignore increment the respective pointer which has zero 
	 *  
	 * 
	 * 
	 */
	
	@Test
	public void test1()
	{
		int[] nums1= {1,2,3,4,0,0,0};
		int[] nums2= {0,2,5,6};
		System.out.println(getmergerdacendingarray(nums1,nums2));
	}
	
	
	public int[] getmergerdacendingarray(int[] nums1, int[] nums2)
	{
		//variable = Expression1 ? Expression2: Expression3
		int length;
		if(nums1.length>nums2.length)
		{
			length=nums1.length;
		}
		else
		{
			length=nums2.length;
		}
		 
		int[] output = new int[length];
		int left=0,right=0;
		int i=0;
		while(left<nums1.length)
		{
		if(nums2.length!=0)	
		{
			if(nums1[left]!=0 && nums2[right]!=0 &&nums1[left]<nums2[right])
			{
				output[i]=nums1[left];
				left++;
				i++;//
				
			}

			else if(nums1[left]!=0 && nums2[right]!=0 &&nums1[left]>nums2[right])
			{
				output[i]=nums1[right];
				right++;
				i++;
				
			}
			
		}	
			else
			{
				output[i++]=nums2[right++];
			}
		}
		
		
		return output;
	}
	
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
	      int index = 0;
			for (int i = nums1.length - 1; i >= 0; i--) {
	            if(index!=n){
				if (nums1[i] == 0)
					nums1[i] = nums2[index++];
	            }else{
	                break;           
	            }
			}
			Arrays.sort(nums1);
			System.out.println(Arrays.toString(nums1));
	    }

}
