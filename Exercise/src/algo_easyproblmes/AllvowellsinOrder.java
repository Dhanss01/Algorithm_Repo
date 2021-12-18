package algo_easyproblmes;

import org.junit.Test;

public class AllvowellsinOrder {
	


public int longestBeautifulSubstring(String word) {
	
	char[] arr= {'a','e','i','o','u'};
	int start=0,end=0; 
	StringBuilder sb = new StringBuilder();
	int index=0;
	for(end=0;end<word.length();end++) {
		char c= word.charAt(end);
		if(c==arr[index]||c==arr[index+1])
		{
		sb=sb.append(c);
		 if(c==arr[index+1]) {
				index++;
			}
		}		
		else{
			start=end;
			sb=sb.delete(0, sb.length());
			index=0;
		}
	}
	
	int k = sb.length()-1;
	return k;
       
}
///
/*

if(index==arr.length-1 && c==arr[arr.length-1]) {
	sb.append(c);
}


*/

}
