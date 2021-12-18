package hackerrankpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.HashMap;

import org.junit.Test;

public class ProductSort {
	
	private static final int HashMap = 0;

	@Test
	public void test1()
	{
		int[] array= new int[]{4,5,3,1,3,4,5};
		System.out.print(returnProductSort(array));		
	}

	private int[] returnProductSort(int[] n) {
		// TODO Auto-generated method stub
				Map<Integer, Integer> map = new TreeMap<Integer, Integer>(); // Sorted based on key

				for (int i = 0; i < n.length; i++) { //O(n)
					map.put(n[i], map.getOrDefault(n[i], 0) + 1);
				}

				List<String> list = new ArrayList<String>();

				map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
						.forEachOrdered(x -> list.add(x.getValue() + " " + x.getKey())); //O(n log n)

				int k = 0;
				for (int i = 0; i < list.size(); i++) { //O(n)
					String s = list.get(i);
					String[] c = s.split(" ");
					int j = 1;
					while (j <= Integer.valueOf(c[0])) { //O(m)
						n[k++] = Integer.valueOf(c[1]);
						j++;
					}
				}
				System.out.println(Arrays.toString(n));
				return n;
				
	}
	
	private void productSort1(int[] nums) {

		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		List<Entry<Integer, Integer>> collect = new ArrayList<>(map.entrySet());
		Collections.sort(collect, Map.Entry.comparingByValue());

		List<Integer> output = new ArrayList<>();

		for (Entry<Integer, Integer> ent : collect) {

			for (int i = 0; i < ent.getValue(); i++) {
				output.add(ent.getKey());
			}

		}
		System.out.println(output);

	}

	
	
}
