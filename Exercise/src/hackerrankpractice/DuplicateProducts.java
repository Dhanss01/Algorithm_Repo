package hackerrankpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DuplicateProducts {
	
	
@Test
public void test1()
{
	//String[] name= new String[]{"bat","bat","glove","glove","glove"};
	//int[] price = new int[] {2,3,1,2,1};
	//int[] weight = new int[] {2,5,1,1,1};
	List<String> name = new ArrayList<>(Arrays.asList("bat","bat","glove","glove","glove"));
	List<Integer> price = new ArrayList(Arrays.asList(2,3,1,2,1));
	List<Integer> weight = new ArrayList(Arrays.asList(2,5,1,1,1));
	System.out.println(numDuplicates1(name,price,weight));
	
	
 }
	
/*Get the map and assign the name as keys
 * and get the price and weight when price and weight are same put it in hte same list of integer 
 * 
 * 
 * 	
 */


public static int numDuplicates1(List<String> name, List<Integer> price, List<Integer> weight) {
	int count=0;
	HashSet<String> unique = new HashSet<String>();
	
	for(int i= 0; i<name.size();i++)
	{
		if(!unique.add(name.get(i)+"-"+price.get(i)+"-"+weight.get(i)))
		{
			count=count+1;
		}
	} 
	
	return count;
	
}

	
	
	

}
