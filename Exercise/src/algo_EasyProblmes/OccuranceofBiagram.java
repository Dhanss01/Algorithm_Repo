package algo_EasyProblmes;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OccuranceofBiagram {
	
	@Test
	public void test1() {
		String text = "alice is a good girl she is a good student", first = "a", second = "good";
		System.out.println(findOcurrences(text,first,second).toString());
	}
	
	//add splited string based on a space
	//if a list contains the same word
	//if i= first i+1 =second
	//
	 public String[] findOcurrences(String text, String first, String second) {
		List<String> list= new ArrayList<String>();
		 String[] split= text.split(" ");
		 for( int i=0;i<split.length-2;i++) {
			 if(split[i].equals(first)&& split[i+1].equals(second))
				list.add(split[i+2]); 
		 }
		 String[] arr = new String[list.size()];
		 for(int k=0;k<list.size();k++) {
			 arr[k]=list.get(k);
		 }
		 
		 return arr;        
	    }
}
