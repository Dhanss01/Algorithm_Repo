package algo_EasyProblmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DestinationCity {

	@Test
	public void test1()
	{
		List<List<String>> list=new ArrayList<List<String>>();
		List<String> list1 = new ArrayList<String>(Arrays.asList("London","New York"));
		List<String> list2 = new ArrayList<String>(Arrays.asList("New York","Lima"));
		List<String> list3 = new ArrayList<String>(Arrays.asList("Lima","Sao Paulo"));
		list.add(list1);
		list.add(list2);
		list.add(list3);
		System.out.println(getDestinationPlace(list));
		
		
	}
	//Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

	public String getDestinationPlace(List<List<String>> list)
	{
		List<String> source = new ArrayList<String>();
		List<String> destination= new ArrayList<String>();
		for(int i=0;i<list.size();i++)
		{
			List<String> temp= list.get(i);
		    source.add(temp.get(0));
		    destination.add(temp.get(1));
		}
		
		for(int i=0; i<destination.size();i++)
		{
			if(!source.contains(destination.get(i))) {
				return destination.get(i).toString();
			}
		}
		
		return "";
	}
	
}
