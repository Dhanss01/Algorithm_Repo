package algo_TwoPointer;
import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

 

import org.junit.Assert;

import org.junit.Test;

 

public class Missingnumber {


	       /**

	       * P2) Given an array arr of positive integers sorted in a strictly increasing

	       * order, and an integer k. Find the kth positive integer that is missing from

	       * this array.

	       *

	        * Example 1:

	       *

	        * Input: arr = [2,3,4,7,11], k = 5 Output: 9 Explanation: The missing positive

	       * integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

	       *

	        * Example 2:

	       *

	        * Input: arr = [1,2,3,4], k = 2 Output: 6 Explanation: The missing positive

	       * integers are [5,6,7,...]. The 2nd missing positive integer is 6.

	       *

	        */

	 

	       /*

	       * Get the integer array If the value in array is not in integer order store it

	       * in array return the expected target element

	       *

	        */

	       @Test

	       public void test1() {

	              int n[] = { 2, 3, 4, 7, 11 };

	              int k = 5;

	              Assert.assertEquals(9, findMissingNumber(n,k));

	       }

	 

	       @Test

	       public void test2() {

	              int n[] = { 1, 2, 3,6 };

	              int k = 3;

	              Assert.assertEquals(5, findMissingNumber(n,k));

	       }

	 

	       /**

	       * Get the integer array store in list initialize another list to store missing

	       * numbers check if the integer i--> 1 is present if not add to missing list

	       * increment the integer i when the missing list size equals the target return

	       * it

	       *

	        * @param n

	       * @param k

	       * @return

	       */

	       private int findMissingNumber(int[] n, int k) {

	              List<Integer> givenList = new ArrayList<Integer>();

	 

	              for (int i : n) {

	                     givenList.add(i);

	              }

	              List<Integer> missingNo = new ArrayList<Integer>();

	              int i = 1;

	              while (missingNo.size() < k) {

	 

	                     if (!givenList.contains(i)) {

	                           missingNo.add(i);

	 

	                           if (missingNo.size() == k) {

	                                  System.out.println(missingNo.get(k - 1));

	                                  return missingNo.get(k - 1);

	                           }

	 

	                     }

	                     i++;

	 

	              }

	              return -1;

	              // TODO Auto-generated method stub

	 

	       }
	       
 public int findmissingnumbers(int[] num)
 {
	 int n =num.length;
	 int sum = n*(n+1)/2;
	 for(int i =0;i<n;i++)
	 {
		 sum=sum-num[i];
	 }
	 
	 return sum;
	 
 }
 

}
