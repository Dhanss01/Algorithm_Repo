package hackerrankpractice;

import org.junit.Test;

public class CicularPrinterDistance {
	
	@Test
	public void test1()
	{
		String s = "BZA";
		System.out.print(findifference(s));		
	}

	

	@Test
	public void test2()
	{
		String s = "CBA";
		System.out.print(findifference(s));		
	}
	/*get the each char from given string 	 
	 * get the ascii value of particular char and store it in array
	 * find the first character distance with A  (26-distance)
	 * store it in a sum
	 * find the distance betweens.chartaAt(i+1)-S.charAt(i-1) and (26-distance) and keep adding them in sum 
	 * 
	 * 
	 */
	
	
	private int findifference(String str) {
		int distance = 0;
		// TODO Auto-generated method stub

		for (int i = 0; i < str.length(); i++) {
			int ascii = 0;
			if (i == 0) 
				ascii = Math.abs((int) str.charAt(i) - 65);
			else 
				ascii = Math.abs((int) str.charAt(i) - (int) str.charAt(i - 1));
			int freq = 26 - ascii;
			int min = Math.min(ascii, freq);
			distance += min;
		}
		return distance;
	}
	private int finddiffofcircular1(String s) {
	      int sum=0; 
	      int[] arr= new int[26];
	      int[] temparr = new int[26];
	      for(int i=0; i<s.length();i++)
	          temparr[i]=s.charAt(i)- 'A';
	      if(s.charAt(0) >= 'Z') 
	          arr[0]=Math.abs(26-temparr[0]);
	      else  arr[0]=Math.abs(temparr[0]);
	      sum = arr[0];
	        for(int i=1; i<s.length();i++) {
	            if(s.charAt(i) == 'A') 
	                arr[i]= Math.abs(26+((temparr[i]) -(temparr[i-1])));
	            else if(s.charAt(i) > 'A' && s.charAt(i) <= 'M')
	                arr[i]= Math.abs(((temparr[i]) -(temparr[i-1])));
	            else
	                arr[i]= Math.abs(26-((temparr[i]) -(temparr[i-1])));  
	            sum+=arr[i];
	        }
	        return sum;
	    }

}
