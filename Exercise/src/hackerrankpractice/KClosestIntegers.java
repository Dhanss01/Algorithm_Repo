package hackerrankpractice;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class KClosestIntegers {
	@Test
	public void test1()
	{
		int[] arr = {1,2,3,4,5};
		int k=3,x=3;
		findingKClosestelements(arr,k,x);
	}

	
	/* left =0, right=nums.length-1, mid = left+right/2;
	 * if mid == x then return mid and based on mid take the left as mid-1 and right as mid+1
	 * 
	 * if arr[mid] > x  && arr[mid+1]	  
	 * a = Math.abs(arr[mid]-k)
	 * b=Math.abs(Arr[mid]-k)
	 * if(a<b)
	 * add  a that to the list else add  b to the list
	 * 
	 * 
	 * if mid!=x
	 *  if arr[mid] > x  && arr[mid+1] right will be mid and keep left as it is
	 * if 
	 * 
	 * 
	 * 
	 */
	
	int right=0;
	int left=0;
	int mid=0;
	private void findingKClosestelements(int[] arr, int k, int x) {
		// TODO Auto-generated method stub
		
		int left =0, right = arr.length-1;
		
		List<Integer> result =new ArrayList();
		for(int i=0; i< arr.length;i++)
		{ 
		  mid =right+left/2;
		  
		  if(arr[mid]==x)
		  {
			  result.add(mid);			  
			  findingclosestleftright(result,mid,left,right, k);
		  }	
		  
		  else if(arr[mid]> x && arr[mid-1]<x) {
			  
			  result.add(mid);
			  findingclosestleftright(result,mid,left,right, k);	  
			
			}
		  else if(arr[mid]< x && arr[mid+1]<x)
			  {
			  result.add(mid);
			  findingclosestleftright(result,mid,left,right, k);			 
			  }
		  
		  else if(arr[mid]>x)
		  {
			  right=mid-1;
		  }
		  left=mid+1;
			
		}		
	}

	public List<Integer> findingclosestleftright(List<Integer> result,int left, int right, int mid, int k)
	{
		 int j =0;
		 right=mid+1;
		  left=mid-1;
			while(j<k)
			{
				if(right<left)
				  {
					 result.add(right);
				     right++;
				  }
				  else
				  {
					  result.add(left);  
					  left--;
				  }			  
				  
			}
			return result;
	}
}
