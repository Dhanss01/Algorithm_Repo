package algo_easyProblemsset2;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SortByparity {
	



	@Test
	public void test1()
	{
		int[] nums= {4,2,5,7};
		System.out.print(sortArrayByParityII(nums));
	}
	
	

public int[] sortArrayByParityII(int[] nums) {
	
 new  SortByparity();
        
        int[] output = new int[nums.length];
        int k=0,m=1; int i=0; int j=0;
        while(i<nums.length && k<nums.length)
        {
            if(nums[i]%2==0)
            output[k]=nums[i];
            i++;
            k=k+2;
        }
        while(j<nums.length && m<nums.length)
        {
            if(nums[j]%2!=0)
            {
            output[m]=nums[j];
            m=m+2;
            }
             j++;

           
        }
        return output;
}
public int lengthOfLongestSubstring1(String s) {
    int currentlength=0, maxlength=0;
	Map<Character,Integer> seenmap= new HashMap<Character,Integer>();
	int startingindex=0,endingindex=0;
	
	for(endingindex=0;endingindex<s.length();endingindex++)
	{
		char c= s.charAt(endingindex);
		if(seenmap.containsKey(c)) {
			seenmap.remove(c);
			startingindex++;
		}
		
		seenmap.put(c, 1);
		currentlength=endingindex-startingindex+1;
		maxlength=Math.max(currentlength, maxlength);
	}
   System.out.println(maxlength);
	return maxlength;
    
}

}
