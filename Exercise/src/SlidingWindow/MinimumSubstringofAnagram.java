package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MinimumSubstringofAnagram {
	
	@Test
	public void Test1() {
		
		String s ="ABBAACDBCAB";
		String target= "ABC";
		System.out.println(minimumsubstring(s,target));
	}

	@Test
	public void Test2() {
		
	}

	@Test
	public void Test3() {
		
	}
	public String minimumsubstring(String s, String  target)
	{
		
		Map<Character, Integer> targetwindowmap = new HashMap<Character, Integer>();
		
		for(int i =0; i<target.length(); i++)		
		{
			//char c =target.charAt(i);
			targetwindowmap.put(target.charAt(i), targetwindowmap.getOrDefault(target.charAt(i), 0)+1);
			
		}
		
		int targetwindowcount =targetwindowmap.size();
		int left = 0, right = 0,matchingcount=0;
		int[] result={-1,0,0};
		Map<Character, Integer> mimimumwindow = new HashMap<Character, Integer>();
		
		while(right<s.length())
		{
			mimimumwindow.put(s.charAt(right),mimimumwindow.getOrDefault(s.charAt(right), 0)+1);
			if(targetwindowmap.containsKey(s.charAt(right))&& mimimumwindow.get(s.charAt(right)).intValue()==targetwindowmap.get(s.charAt(right)).intValue())
			{
				matchingcount++;	
			}
			
			while(left<right && matchingcount==targetwindowcount )
			{
				if(result[0]>(right-left)+1)
				{
					result[0]=(right-left)+1;
					result[1]=left;
					result[2]=right;
				}
				mimimumwindow.put(s.charAt(right),mimimumwindow.get(s.charAt(right))-1);
				if(targetwindowmap.containsKey(s.charAt(right))&& mimimumwindow.get(s.charAt(right)).intValue()<targetwindowmap.get(s.charAt(right)).intValue())
				{
					matchingcount--;	
			
				}
				right++;
			}
			left++;
		}
		return result[0]==-1?null:s.substring(result[1],result[2]+1);
	}

}
