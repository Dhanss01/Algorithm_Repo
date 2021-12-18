package SlidingWindow;

import org.junit.Test;

public class Asciiproblem {
	
	@Test
	public void test1()
	{
		String s ="abcabcbb";
		int target =3;
		System.out.println(findLongestSubStringUniqueOccurence(s,target));
	}
	

	@Test
	public void test2()
	{
		String s ="x";
		int target =1;
		System.out.println(findLongestSubStringUniqueOccurence(s,target));
	}
	
	@Test
	public void test3()
	{
		String s ="BBB";
		int target =1;
		System.out.println(findLongestSubStringUniqueOccurence(s,target));
	}
	
	
	private int findLongestSubStringUniqueOccurence(String s, int k) {
        int left=0,right=0,max=0,uniquecount=0;
        int[] count = new int[128];
        
        for (right = 0; right < s.length(); right++) {
        	
            if(count[s.charAt(right)]==0) {
                uniquecount++; 
               count[s.charAt(right)]++;
            }
            
            if(uniquecount>k) {
                while(--count[s.charAt(left++)] > 0);
                uniquecount--;
            }
            max=Math.max(max, right-left);
        }
        
        return max;
    }
	
	

	//Input: s = "abcabcbb"
	/*
	 * create a new assci array with the length as 128
	 * create two pointers left, Right  as a starting index.
	 * max = 0; 
	 * by using right index loop through the s.chart(i)
	 * if value in ascii array is zero then add the count as 1;
	 * if the value in ascii is > 1 then we need increment left and  decrement value at the left index
	 * get the max value with max and right-left
	 * return max
	 */

}
