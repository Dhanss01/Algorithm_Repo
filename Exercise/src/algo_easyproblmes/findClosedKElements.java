package algo_easyproblmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class findClosedKElements {

	/*
	 * 
	 * //[1,1,1,10,10,10]
		1
		9
	 */
	
	//@Test
  public void test1() {
	  int[] nums= {1,2,3,4,5};
	  int k=4;
	  int x=3;
	  System.out.println(findClosestElements(nums,k,x));
  }
  
  public void test3() {
	  int[] nums= {1,1,1,10,10,10};
	  int k=1;
	  int x=9;
	  System.out.println(findClosestElements(nums,k,x));
  }
	@Test
	public void tes2() {
		int[] nums= {1,2,3,4,5};
		int k=4;
		int x=-1;
		System.out.println(findClosestElements(nums,k,x));
	}
	
	
public List<Integer> findClosestElements(int[] arr, int k, int x) {
		   
		List<Integer> list= new ArrayList<Integer>();
			
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
			
			 
			List<Integer> out= new ArrayList<Integer>();
			
			int start=0;
			int end=0;
			int index= list.indexOf(x);
			if(index==-1) {
				for(int i=list.size()-1;i>0;i--) {
					if(list.get(i)<x) {
						start=i;
						end=i+1;
						break;
					}
					else {
						start=0;
						end=start+1;
					}
				}		
			}
			else {
				start=index;
				end=index+1;
			}
			
			while(out.size()<k) {
			if(start>=0) {
			while(start>=0 && out.size()<k) {
				
				out.add(list.get(start));
				start--;
			}
			}
			else if(start<0 &&out.size()<k) {
				while(end<list.size() && out.size()<k) {
					out.add(list.get(end));
					end++;
				}
			}
			}
		
 
			
			Collections.sort(out);
 return out;
	}

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
