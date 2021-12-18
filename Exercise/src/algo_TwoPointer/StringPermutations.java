package algo_TwoPointer;

public class StringPermutations {

	public  void checkStringPermutationsisexist(String s1, String s2)
	
	{

		int[] count = new int[128];
		 int left=0; int right =0, 
		 for( right =0 ;right < s2.length();right++ )
		 {
			 if(count[s2.charAt(right)]++==1)
				 
				 while(count[s2.charAt(right)] >1)	 
				 {
					 
					 --count[s2.charAt(left++)];
					 
				 }
		
		
	}
}
	
}
