package mocpractice1;

import org.junit.Test;

public class TargetOnRoatedArray {
	
	/*
	 * 1) Did I understand the problem? 
	 * 
	 * 2) What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? 
	 * 
	 * Input- int[] nums =
	 *  Output -int[] nums =
	 *  Constraint- 
	 * 
	 * 3) Test data set
	 * 
	 * Positive- : s =[0,0,1,1,2,2]
	     Negative -: s=[0]
	      Edge -: s=[]
	 * 
	 * 
	 * 4) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate? 
	 * 4) Ask for hint if don't know to solve? 
	 * 
	 * 5) Do i know any alternate solution? 
	 *    -> No, Solve with the known solution
	 *    
	 *    Pseudo code
	 */

		
		
		@Test
		public void test1() {
			int[] nums = {4,5,6,7,0,1,2};
			int target=0;
			System.out.println(searchNumberAfterRotate(nums, target));
			
		}
		
		//@Test
		public void test2() {
			int[] nums= {4,5,6,7,0,1,2};
			int target=-1;
			System.out.println(searchNumberAfterRotate(nums, target));
			
		}
		/*start =0 and end =length-1;
		 *mid= length/2;
		 *if(target < mid) and end > tartget 
		 *move start mid+1;
		 *else move start to mid-1;
		 * 
		 * 
		 * 
		 */
		private int searchNumberAfterRotate(int[] n, int target) {
			// TODO Auto-generated method stub
			int low = 0, high = n.length - 1; //4,5,6,7,0,1,2
			int mid = 0;
			while (low <= high) {
				mid = (low + high) / 2;


				
				
				
				if (n[mid] == target) {
					System.out.println(mid);
					return mid;
				} else if (n[mid] < target) {
					if (n[high] < n[mid]) {
						low = mid + 1;

					} else {
						if (n[high] >= target) {
							low = mid + 1;

						} else
							high = mid - 1;

					}
				} else {
					if (n[high] < n[mid]) {
						if (n[mid] >= target) {
							low = mid + 1;
						} else
							high = mid - 1;
					} else
						high = mid - 1;
				}
			}
			return -1;

		}
		
		
}
