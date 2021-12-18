package algo_EasyProblmes;

import org.junit.Test;

public class SubstringmPatternOccurances {
	
	
	@Test
	public void test1() {
		String s="dhimanman";
		String t="man";
		System.out.println(getSubstringoccurances(s,t));
	}
	
	@Test
	public void test2() {
		String t="NullPointerException";
		String s="NullPointerExceptionsdkfjlNullPointerExceptionjlksdjNullPointerException";
		System.out.println(getSubstringoccurances(s,t));
	}
	
	public int getSubstringoccurances(String s, String t) {
		int end=0; int count=0; String temp="";
		//System.out.println(s.length()-t.length());
		
		for(int i=0;i<s.length()-t.length();i++) {
			end=1;
			while(temp.length()<t.length()) {
				
			temp=s.substring(i,i+end);	
			if(temp.length()==t.length() && temp.equalsIgnoreCase(t)) {
					count++;
					end++;
				}
				else
					end++;				
			}
			temp="";
			
		}
		temp=s.substring((s.length()-t.length()), s.length());
		if(temp.equalsIgnoreCase(t)) count++;
		return count;
	}

}
