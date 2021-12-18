package algo_TwoPointer;

import java.util.ArrayList;

import org.junit.Test;

public class SpitStringsandRevers {
	
	@Test
	public void eg1()
	{
		String s = "Ding dong";
		reverseWordsusingTwopointer(s);		
	}
	
public void reverseWords(String s) {
        
	
        String[] split = s.split(" ");
        String reverse="";
        for (int i = 0; i < split.length; i++)
        {
           
            String current=split[i];
        
        for(int j=current.length()-1; j>=0;j--)
        {
        	 reverse = reverse + current.charAt(j);
        	 
        }
        reverse = reverse + " ";
        
        
        }
        System.out.println(reverse.trim());
    }

public void reverseWordsusingTwopointer(String s) {
    
	
    String[] split = s.split(" ");
    String reverse="";
    for (int i = 0; i < split.length; i++)
    {
       
        char[] chararray =split[i].toCharArray();
    
        int left =0, right= chararray.length-1;
    while(left <=right)
    {
    	char temp = chararray[right];
    	chararray[right]=chararray[left];
    	chararray[left]=chararray[right];
    	 
    }
    reverse = reverse + String.valueOf(chararray)+" ";
    
    
    }
    System.out.println(reverse.trim());

//append method using string builder that will reduce the time of execution



}

}
