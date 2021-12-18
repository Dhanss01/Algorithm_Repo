package algo_easyproblmes;

import org.junit.Test;

public class RotateString {

	@Test
	public void test1() {
		String  s = "abcde", goal = "cdeab";		
		System.out.println(rotateString(s,goal));
	}
	
 public boolean rotateString(String s, String goal) {
	 
	 	int end=0;
	 	StringBuilder sb= new StringBuilder();
	 	
  for(int i=0;i<s.length();i++) {
	 	String temp=s.substring(i,s.length());
	 	sb.append(temp);
	 	if(i!=0) {
	 	String temp1= s.substring(end, i);
	 	//StringBuilder sb1= new StringBuilder(temp1);
	 	//sb1.reverse();
	 	sb.append(temp1);
	 	}
	 	if(sb.toString().equals(goal))
	 		return true;
	 	sb.delete(0, sb.length());
	 	}
	 return false;
 }
	
	
}
