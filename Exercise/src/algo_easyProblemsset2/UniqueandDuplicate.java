package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class UniqueandDuplicate {
	@Test
	public void test1()
	{
		int[] arr = {5,2,3,4,1,6,2,5};
		getUnique(arr);
		
	}
	
	
	public void getUnique(int[] arr)
	{
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i =0 ;i< arr.length;i++)
		{
			if(!set.contains(arr[i]))
				set.add(arr[i]);
			else
			{
				list.add(arr[i]);
				set.remove(arr[i]);
			}
				
		}
		System.out.println("Unique Numbers are");
		for (int i : set) {
		    System.out.println(i);
		}
		System.out.println("duplicate Numbers are");
		for (int i : list) {
		    System.out.println(i);
		}
		
	}

}
