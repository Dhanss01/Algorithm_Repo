package algo_easyProblemsset2;

import org.junit.Test;

public class LargestSubstringtwoEqualCharacters {

	@Test
   public void test1()
   {
		String s="cabbac";
		System.out.println(maxLengthBetweenEqualCharacters(s));
   }
	
	
	 public int maxLengthBetweenEqualCharacters(String s) {
	     
		   int left=0,right=s.length()-1;
		   int temp=0,max=Integer.MIN_VALUE;
		 while(left<right)
		 {
			 char c= s.charAt(left);
			 char l =s.charAt(right);
			 
			 if(c==l)
			 {
				temp=right-left+1;				
				left++;
				right--;
			 }
			max=Math.max(max,temp-2);
		 }
		 return max;
		 }
}
