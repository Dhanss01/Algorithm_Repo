package algo_easyproblmes;

import org.junit.Test;

public class stringreverseuptospecialchar {

	
	@Test
	public void test1() {
		String s= "stri_ng;%val_u#e";
		//irts_gn;%lav_u#e
		System.out.println(getReversed(s));
	}
	
	public String getReversed(String s) {
		StringBuilder sb= new StringBuilder();
		String output="";
		int start=0,  end=0;
		for(end =0;end<s.length();end++) {
			char c=s.charAt(end);
			if(Character.isAlphabetic(c)) {
				sb.append(c);
			}
			else if(!(Character.isAlphabetic(c) || Character.isDigit(c))){
				output+=sb.reverse().toString();
				sb.delete(0, sb.length());
				output=output+c;
				start=end+1;				
			}
		}
		
		return output;
			
	}
}
