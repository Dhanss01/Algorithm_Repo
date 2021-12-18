package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class CountLargestGroup {

	//@Test
	/*public void test1()
	{
		//[1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9]
		int n=13;
		getCountLargestGroup(n);
	}*/
	//@Test
	public void test2()
	{
		int n=13;
		System.out.println(getCountLargestGroup1(n));
		
	}
	@Test
	public void test3()
	{
		int n=46;
		System.out.println(getCountLargestGroup(n));
		
	}
	//@Test
	public void test4()
	{
		int n=2;
		System.out.println(getCountLargestGroup1(n));
		
	}
	
	
	 public int getCountLargestGroup1(int n) {
	
		 int result=0, reminder=0;
		 if(n>9)
		 {
			 int i=n;
			 while(i>0)
				 {
					 reminder=i%10;
					 i=i/10;
					break;
				 }
			 String s =String.valueOf(i-1)+9;
			 int r= Integer.parseInt(s);
			 result= n-r;
		 }
		 else if(n<9)
		 {
			result=n; 
		 }
		 return result;
	 }
	
	
	
	 public int getCountLargestGroup(int n) {
		Map<String, Integer> map= new LinkedHashMap<String,Integer>();
		int index=1;int count=0;
		if(n>9)
		{
		 while(index<=n)
		 {
			 int k=0;
			 int sum=0;
			 int i=index;
			 while(i>0)
				 {
					 k=i%10;
					 i=i/10;
					 sum=sum+k;
				 }
				 String s=String.valueOf(sum);
				 
				 if(map.containsKey(s)) {				
					 map.put(s,map.getOrDefault(s, 0)+1);
					// count++;
					
				 }
				 else
				 {
					 map.put(s,0); 
				 }				 
				  index++;
			 }	
			int max=Integer.MIN_VALUE;
			for(Map.Entry<String, Integer> entry : map.entrySet())
			{
				if(max<entry.getValue()) {
					max=entry.getValue();
				}
			}
			for(Map.Entry<String, Integer> entry : map.entrySet())
			{
				if(entry.getValue()==max)
				{
					count++;
				}
			}
			
		}
		else if(n<=9)
			count=n;
	
		
		System.out.println(count);
		 return count;
	    }
}
