package algo_easyProblemsset2;

import org.junit.Test;

public class BackspaceSubstring {

	//@Test
	public void test1()
	{
		String s = "ab#cd";
		String s1 ="ad#cd";
		//System.out.println(backspaceCompare(s,s1));
	}
	
	@Test
	public void test2()
	{
		String s = "ab##";
		String s1 ="c#d#";
		System.out.println(backspaceCompare1(s,s1));
	}
	
	
	
	public boolean backspaceCompare1(String s, String t) {
        //corner case;
        if(s == "" || t == "" ) return false;
        
        //s = helper(s);
        //t = helper(t);

        return s.equals(t);
    }
   
	
   /* public boolean backspaceCompare(String s, String t) {
        
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        
        for(int i=0;i<s.length();i++)
        {
        	int count=0;
            if(s.charAt(i)!='#')
                sb1.append(s.charAt(i));
            else if(s.charAt(i)=='#')
            	count++;
            else if(sb1.length()>=count
            		)
                sb1.deleteCharAt(sb1.length()-1);
        }
    	
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)!='#')
                sb2.append(t.charAt(i));
            else if(sb2.length()>=1)
                sb2.deleteCharAt(sb2.length()-1);
            
        }
       
        if(sb1.equals(sb2))
        {
        	return true;
        }
        
       else 
        	return false;
    }*/
}
