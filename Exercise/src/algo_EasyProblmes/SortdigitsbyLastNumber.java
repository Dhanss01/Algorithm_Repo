package algo_EasyProblmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class SortdigitsbyLastNumber {
	@Test
	public void test() {
		List<Integer> nums= new ArrayList<Integer>(Arrays.asList(305,881,206,303,402,577));
		getListsortbylastDigit(nums);
	}
	
	
	public List<Integer> getListsortbylastDigit(List<Integer> nums){
		

		Comparator<Integer> com = (o1,o2)  ->{			
			
				// TODO Auto-generated method stub
				return o1%10 > o2%10 ? 1:-1;		
		};
		
		Collections.sort(nums, com);
		
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		
		return nums;
	}

}
