package algo_TwoPointer;

import org.junit.Test;

public class IndexDistancetoCharacter {
	
	//from string if charat{i) containts e then return 0;
	//from e to left , decrease the index by-1
	//from e to right , decrease the index by -1
	
	@Test
	public void example()
	{
		String s = "aacecaaa";
		char c = 'e';
		
	}
	

	
	private int[] shortDistanceToCharacterUsingTwoPointer(String s, char c) {
		int left = 0, right = s.length() - 1;
		int[] index = new int[s.length()];
		int position =-1 ;
		while (left <= s.length() - 1) {// O(n)
			if (s.charAt(left) == c) {
				index[left] = 0;
				position = left;
			} else if (position > -1) {
				index[left] = left - position;
			} else {
				index[left] = Integer.MAX_VALUE;
			}
			left++;

		}
		position=-1;
		while (right >= 0) {// O(n)
			if (s.charAt(right) == c) {
				position = right;
			}
			if (position > -1) {
				index[right] = Math.min(position - right, index[right]);
			}
			right--;
		}
		return index;

	}
}
