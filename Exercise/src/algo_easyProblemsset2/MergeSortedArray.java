package algo_easyProblemsset2;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray {

	@Test
	public void test1()
	{
		int nums1[] = {1,2,3,0,0,0};
		
		int nums2[] = {2,5,6};
		int n=nums2.length;
		int m=nums1.length -n;
		merge(nums1,m,nums2,n);
	}

	/*pseudo code
	 * compare the length and take the array which has maximum length and manuplate
	 * set two pointer for nums1 and nums2 p1 in =m-1,p2=n-1 and i as m+n-1
	 * compare  p1 and p2 from both the array and whichever is max put that in nums1 
	 * continue this process untill nums2 become -1
	 * 
	 * 
	 * 
	 * 
	 */
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	  int p1=m-1, p2=n-1, i= m+n-1;
	  
		 while(p2>=0)
		 {
			 if(nums1[p1]<nums2[p2]) {
				 nums1[i]=nums2[p2];
			 		p2--;
			 		i--;
			 }
			 else
			 {
				 nums1[i]=nums1[p1];
			 p1--;
			 i--;
			 }
		 }
		 
	 }
	 
	 
	 public void merge1(int[] nums1, int m, int[] nums2, int n) {
	        int index = 0;
	       
			for (int i =nums1.length-1 ; i >=0; i--) {
			if(index!=nums2.length)
	        {
	            if (nums1[i] == 0 )
	            {              
	                    nums1[i] = nums2[index++];           
	            }
	        }
	            else
	            {
	                break;
	            }
			}
	        Arrays.sort(nums1);
			System.out.println(Arrays.toString(nums1));
	        
	        
	    }
}
