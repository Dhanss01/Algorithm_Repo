package hackerrankpractice;

import org.junit.Assert;
import org.junit.Test;

public class IncreasingSubarray {
	
	public class CountIncreasingSubArray {

		@Test
		public void testcase1() {
			int[] intarr= {5,3,5,7,8};
			int k=3;
			Assert.assertEquals(2, findCounts(intarr,k));
		}

		@Test
		public void testcase2() {
			int[] intarr= {5,3,5,7,8};
			int k=2;
			Assert.assertEquals(3, findCounts(intarr,k));

		}
		@Test
		public void testcase3() {
			int[] intarr= {1,2,3,4,2,1,3};
			int k=2;
			Assert.assertEquals(4, findCounts(intarr,k));

		}

		@Test
		public void testcase4() {
			int[] intarr= {1,2,3,4,5};
			int k=3;
			Assert.assertEquals(3, findCounts(intarr,k));

		}

	    /*keep left  at 0 and right at 1
		 * check if the left value is greater than the right value
		 *                          if yes-->move left to right 	 *                          
		 *                          
		 *when left <right and (distance between left and right pointer becomes equal to K)
		 *                -->increment left pointer
		 *                -->increment counter value
		  *
		*/
		private int findCounts(int[] intarr, int k) {

			int count=0;
			int windowstart=0;
			for (int windowend = 1; windowend < intarr.length; windowend++) {
				if(intarr[windowstart]>intarr[windowend]) {
					windowstart=windowend;
				}
				while(intarr[windowstart]<intarr[windowend] && ((windowend-windowstart)+1==k)) {
					count++;
					windowstart++;
				}

			}

			System.out.println(count);
			return count;
		}

	}

}
