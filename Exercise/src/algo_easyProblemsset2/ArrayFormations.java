package algo_easyProblemsset2;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayFormations {

//	@Test
	public void test1()
	{
		int[] arr= {85};
		int[][] arr1 = {{85}};
	}
	//@Test
	public void test2()
	{
		int[] arr= {15,88};
		int[][] arr1 = {{88},{15}};
		 System.out.println(canFormArray( arr,arr1));
	}
	//@Test
	public void test3()
	{
		int[] arr= {49,18,16};
		int[][] arr1 = {{16,18,49}};
		 System.out.println(canFormArray( arr,arr1));
	}
	
	@Test
	public void test4()
	{
		int[] arr= {91,64,4,78};
		int[][] arr1 = {{78},{1,64},{91}};
		 System.out.println(canFormArray( arr,arr1));
	}
    public boolean canFormArray(int[] arr, int[][] pieces) {
       ArrayList<Integer>  listarray = new ArrayList<Integer>();
     
       for(int i :arr)
       {
    	   listarray.add(i);
       }
       
       int[] outarray = new int[arr.length];
       int r=0;
       boolean[] flag= new boolean[arr.length];
      for(int i=0;i<pieces.length;i++)
      {
    	  int[] temp = pieces[i];
    	  listarray.contains(temp[i]);
    	  int m=0;
    	  while(m<temp.length)
    	  {
    		  int l = temp[m];
    		  m++;
    		  //listarray.add(l);
    		  outarray[r]= l;
    		  flag[r]=true;
    		  r++;
    	  }
    	  
    	  
      }
      
      for(int x=0;x<outarray.length;x++)
      {
    	  
      }	  
    	  
       
      for(boolean f : flag)
      {
    	  if(!f==true) return false;
      }
 
        
        return true;
    }
	
}
