package algo_easyProblemsset2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class EqualnumberofOccurances {

	@Test
public void test1()
{
	String s= "abacbc";
	System.out.println(areOccurrencesEqual(s));
}
	
	
@Test
public void test2()
{
	String s= "aabcc";
	System.out.println(areOccurrencesEqual(s));
}

public boolean areOccurrencesEqual(String s) {
    
        HashMap<Character, Integer> strmap =new  HashMap<Character,Integer>();
        
        for(int i=0; i<s.length();i++)
        {
            strmap.put(s.charAt(i), strmap.getOrDefault(s.charAt(i),0)+1);
           
        }
        
        Set<Integer> mapset =new HashSet<Integer>(strmap.values());
       
        if(mapset.size()==1)
        {
        	return true;
        }
        return false;
    }
}
