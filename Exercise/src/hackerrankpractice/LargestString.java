package hackerrankpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

import org.junit.Test;

public class LargestString {

	@Test
	public void test1()
	{
		//List<Character> products =new ArrayList<Character>(Arrays.asList());
		String s ="baccc";
		String output="ccbca";
		List<Character> stringlist = new ArrayList<Character>(Arrays.asList('z','z','z','z','a','z'));
		int k=2;
	}
	
	
	private String findLongString(String s, int k) {
		 // Write your code here
	    StringBuilder sb = new StringBuilder();
	    char[] charr= s.toCharArray();
	    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	    for (char c : charr) {
	        map.put(c, map.getOrDefault(c,0)+1);
	    }
	    
	    Character[] keychars= new Character[map.keySet().size()];
	    map.keySet().toArray(keychars);
	    Arrays.sort(keychars);
	    int add=0;
	    for(int i=keychars.length-1;i>=0;i--){
	        add=0;
	        if(map.get(keychars[i])!=0){
	            
	            while(map.get(keychars[i])!=0){
	                if(add%k==0 && add!=0){
	                    int temp=1;
	                    while(i-temp>=0){
	                        if(map.get(keychars[i-temp])>0){
	                            sb.append(keychars[i-temp]);
	                            map.put(keychars[i-temp],map.get(keychars[i-temp])-1);
	                            break;
	                        }
	                        else{
	                            temp++;
	                        }
	                    }
	                    if(i-temp<0){
	                        map.put(keychars[i],0);
	                        break;
	                    }
	                }
	                sb.append(keychars[i]);
	                add++;
	                map.put(keychars[i],map.get(keychars[i])-1);
	            }
	        }
	    }    
	    return sb.toString();
	}
	
	public String findlargeststringchar1(String s, int k)
	{
		
		//have two poiter keep value in greatest value in greatest value
		//keep second pointer in second greatest value
		Stack<Character> resultstack =new Stack<Character>();
		Stack<Character> tempstack = new Stack<Character>();
		StringBuilder sb= new StringBuilder();
		int count=0;
		
		Map<Character, Integer> mymap = new TreeMap<Character, Integer>();
		for(int i=0; i<s.length();i++)
		{
			mymap.put(s.charAt(i),mymap.getOrDefault(s.charAt(i), 0)+1);
			
		}
		
		
		
		
		
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String findlargeststringchar(String s, int k)
	{
		StringBuilder sb= new StringBuilder();
		int count=0;
		
		Map<Character, Integer> mymap = new HashMap<Character, Integer>();
		for(int i=0; i<s.length();i++)
		{
			mymap.put(s.charAt(i),mymap.getOrDefault(s.charAt(i), 0)+1);
			
		}
		for(Map.Entry<Character, Integer> entry : mymap.entrySet())
		{
			while(count<=2)
			{
				if(entry.getValue()>2)
				{
				  sb.append(entry.getKey());
				}
			}
			
			
		}
		return null;
	}
	
}
