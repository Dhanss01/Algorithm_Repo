package algo_easyproblmes;

import org.junit.Test;

public class SummationofTwoWords {

	@Test
	public void test1()
	{
      String f= "acb", s="cba", target="cdb";
      System.out.println(getSummationofWords(f,s,target));
      
	}
	
	public boolean getSummationofWords(String f, String s,String t)
	{
		int result=0;
		String fsum= getSummofword(f);
		String ssum =getSummofword(s);
		String tsum= getSummofword(t);
	 	result=Integer.parseInt(fsum)+Integer.parseInt(ssum);
	 	if(result==Integer.parseInt(tsum)) return true;
	 	else	 	
		return false;
	}
	
	public String getSummofword(String str) {
		String sum="";
		for(int i=0;i<str.length();i++) {			
			char ch=str.charAt(i);
			int temp= ch-'a';
			sum=sum+temp;
			
		}
		
		return sum;
		
	}
}
