package SlidingWindow;

import org.junit.Test;

/*1) Did I understand the problem? 
 * 
 * 2)What is the input(s)? What is the expected output?
 * 
 * 3)Test data set
 * Positive : Negative:  Edge:
 * 
 * 4) how to solve it?
 * 
 * 5)Alternate approach
 * 
 * 6)pseudocode
 * get the array and traverse through till the target and sum it up and keep that as a currentsum
 * for next window create a another for loop from target to till n.length
 * find the firstfindow sum and keep that as a currentsum
 * to move to the next window decrement the i from the sum and add the next element in the sum
 * 
 */

public class Maximumsum {
	public void tetscase1() {
		String s ="abceabcdabceabcd";
		String p="abcd";
		findPAttern(s,p);
	}
	
	
	
	

	private int findPAttern(String s, String p) {
		int left = 0, right = 0;
		while (left < s.length() && right < p.length()) {
			char leftchar = s.charAt(left);
			char rightchar = p.charAt(right);
			
			if (leftchar == rightchar && right == p.length()-1) {
				System.out.println(left -right);
				return left - right;
			}

			else if (leftchar == rightchar) {
				left++;
				right++;
			}

			else if (leftchar != rightchar) {
				left++;

			}

		}

		return -1;

	}



}
