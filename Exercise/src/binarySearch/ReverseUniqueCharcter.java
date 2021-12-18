package binarySearch;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class ReverseUniqueCharcter {
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
	 * Create a linked hash set, where it maintains the insertion order,
	 * since we need to reverse the unique char, keep the starting index as length-1
	 * add each char in set
	 * if that character is already exist in the set, then remove the existing one
	 */

	
	@Test
	public void test1()
	{
		char[] chr = {'c','d','e','e','h'};
		System.out.println( reverseuniquechar(chr));
		//Assert.assertTrue(Arrays.equals(new char[] {'h','d','c'},reverseuniquechar(chr)));
	}
	@Test
	public void test2()
	{
		char[] chr = {'e','e','e','e'};
		System.out.println( reverseuniquechar(chr));
		
	}
	@Test
	public void test3()
	{
		char[] chr = {};
		System.out.println( reverseuniquechar(chr));
	}
	
	public Set<Character> reverseuniquechar(char[] chr)
	{
		Set<Character> set = new LinkedHashSet<>();

		Set<Character> duplicates = new LinkedHashSet<>();
		for(int i=chr.length-1;i>=0;i--)
			{
			if(set.contains(chr[i])|| duplicates.contains(chr[i]))
			{
				set.remove(chr[i]);
				duplicates.add(chr[i]);
			}
			else
			set.add(chr[i]);
			}
		//System.out.println(set);
		return set;	
		
	}

}
