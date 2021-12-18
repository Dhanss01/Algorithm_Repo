package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class FindAndReplacePattern {
	
	@Test
	public void test1() {
		String[] s= {"abc","deq","mee","aqq","dkd","ccc"};
		String pattern="abb";	
		System.out.println(findAndReplacePattern(s,pattern));
	}

    public List<String> findAndReplacePattern(String[] words, String pattern) {
    	
    	
    	int[] asciiword1= new int[26];
    	for(int i=0;i<pattern.length();i++) {
    		 asciiword1[pattern.charAt(i)-'a']++;	    	
    	}
    	HashMap<Character,Integer> map= new HashMap<Character,Integer>();
    	List<String> list =new ArrayList<String>();
    	for(int i=0;i<words.length;i++)
    	{   
    		
    		List<Integer> countlist = new ArrayList<Integer>();
    		String c=words[i];
    		for(int j=0;j<c.length();j++) {
    			map.put(c.charAt(j), map.getOrDefault(c.charAt(j), 0)+1);
    		}
    		
    		for(Entry<Character, Integer> entry : map.entrySet()) {
    			if(entry.getValue()!=0)
    				countlist.add(entry.getValue());	
    		}
    		int[] count=new int[countlist.size()];
    		for(int m=0;m<count.length;m++) {
    			count[m]=countlist.get(m);
    		}
    		Arrays.sort(count);
    	
    	
    		if(Arrays.equals(asciiword1, count)) {
    			list.add(c);
    		}
    		
    		map.clear();
    	}
    	return list;
    }
	
	
}
