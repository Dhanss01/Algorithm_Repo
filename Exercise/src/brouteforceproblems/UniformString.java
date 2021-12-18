package brouteforceproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class UniformString {
	
	/*
	 * 1) Did I understand the problem? 
	 * 
	 * 2) What is the input(s)? What is the expected output? Do I have constraints to
	 * solve the problem? 
	 * 
	 * Input- int[] nums =
	 *  Output -int[] nums =
	 *  Constraint- 
	 * 
	 * 3) Test data set
	 * 
	 * Positive- : s =[0,0,1,1,2,2]
	     Negative -: s=[0]
	      Edge -: s=[]
	 * 
	 * 
	 * 4) Do I know how to solve it?
	 * 
	 * Yes - great, is there an alternate? 
	 * 4) Ask for hint if don't know to solve? 
	 * 
	 * 5) Do i know any alternate solution? 
	 *    -> No, Solve with the known solution
	 *    
	 *    Pseudo code
	 */

		
		
		//@Test
		public void test1() {
			
			String s = "abbccaadf";
			int[] targetedvalue = {4,2,5,3,7};
			int numoftarget= 5;
			uniformstring1(s,targetedvalue,numoftarget);
			
		}
		@Test
		public void test2() {
			
			String s = "daaaf";
			int[] targetedvalue = {4,1,2,3,6};
			int numoftarget= 5;
			uniformstring1(s,targetedvalue,numoftarget);
		}
	
		//7 mins 
		//initialize the map and based on character key value will be a=1,b=2, ....f=6;
		//initialize left and right pointer to 0
	    /*increment the right pointer if both right and left is equal  add the values from map and if its matches with target index then return true
	    * increment the right pointer again if left and right is not equal then increment left by 1 
	   *  ,  
	   * 
	   */
		
		

/*
 * get the attached value of each character from string s.chartAt(i)-96;
 * initialize left =0 and right=0, 
 * if left and right is not equal then get the attached value and check if that vaue is available in targeted value array
 * increment left and right;   
 * if left and right are same then , read the s.charAt(right) and count the continuous frequency
 * based on the count multiply attach value with count 
 * and take that result and ensure its available in given target value
 * if so return true else return false
 * 
 * 
 * abbcc
 *  l
 *	 r
 */
public void uniformstring1(String s, int[] targetedvalue, int numoftarget)
{
	int left=0, right=1;
	Boolean[] booleanarray = new Boolean[targetedvalue.length];
	Map<Integer, Boolean> mymap =new HashMap<Integer,Boolean>();
	for( int i : targetedvalue)
	{
		mymap.put(i, null);
	}
		
  	
	while(left<s.length()-1 )
	{			
				int count=0;int sumvalue=0;
				 sumvalue = (int)(s.charAt(left)-96);
				 
					  if(mymap.containsKey(sumvalue))
					  {
						  mymap.put(sumvalue, true);
						 
					  }
					  
				if(left!=0)
				if(s.charAt(left)==s.charAt(left)+1)  
				  {
						  sumvalue = (int)(s.charAt(left)-96)+(int)(s.charAt(left)-96);
						  if(mymap.containsKey(sumvalue))
						  {
							  mymap.put(sumvalue, true);
							 
						  }						 
				  }
				
				
				else {
					sumvalue=0;
				}
			left=left+1;
		}
    
    
    for (Entry<Integer, Boolean> entry :mymap.entrySet()) 
    {
        Integer key = (Integer)entry.getKey();
        Boolean value = entry.getValue();

        System.out.println(key + "=" + value);
    }
	
}


public boolean uniformstring(String s, int[] targetedvalue, int numoftarget)
{
			int left=0, right=0;
			
			int[] targetvalues=new int[targetedvalue.length];
			Map<Character, Integer> mymap =new HashMap<Character,Integer>();
			mymap.put('a',1);
			mymap.put('b',2);
			mymap.put('c',3);
			mymap.put('d',4);
			mymap.put('e',5);
			mymap.put('f',6);
			/*String s = "abbccaadf";
			int[] targetedvalue = {4,2,5,3,7};
			int numoftarget= 5;
			//true,true,false,true,false
			 * 
			 */
	for(int i=0; i<targetvalues.length;i++)
	{
			while(left<s.length()-1)
			{
				
				char m=s.charAt(right);
				if(m!=s.charAt(left))
				{
					int sum=0;int k=0;
					if(mymap.containsKey(s.charAt(right)))
					{
						for(Map.Entry entry:mymap.entrySet())
						{
							 k = (int) entry.getValue(); 
						}
						
					}
					sum = sum+k;
					if(sum==targetvalues[i])
					{
						return true;
					}
				}
				
				if(s.charAt(left)==s.charAt(right))
				{
					int sum=0;int k=0;
					if(mymap.containsKey(s.charAt(right)))
					{
						for(Map.Entry entry:mymap.entrySet())
						{
							 k = (int) entry.getValue(); 
						}
						
					}
					sum = sum+(k*2);
					if(sum==targetvalues[i])
					{
						return true;
					}
					}				
			}
		
	}
			
			return false;
			
			
		}	



}


