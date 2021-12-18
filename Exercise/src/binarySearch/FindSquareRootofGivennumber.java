package binarySearch;

import org.junit.Test;

public class FindSquareRootofGivennumber {
	
	@Test
	public void test1()
	{
		int nums= 9;
		squarerootofk(nums);
	}

	
	 public int squarerootofk(int num)
	 {
		 int low=0;  
		 int[] n = new int[9];
		 int high=n.length-1;
		 int mid= (high+low)/2;
		 for(int i=0; i<num;i++)
		 {
			 n[i]=i;
		 }
		 while(low<high)
		 {
		 if(n[mid]*n[mid]==num)
		 {
			 return mid;
		 }
		 else if(n[mid]*n[mid]<num)
		 {
			 low=mid+1;
			 
		 }
		 high=mid-1; 
			 
		 }
		 System.out.println(mid);
	 return -1;
	 }
}
