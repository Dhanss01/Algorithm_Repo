package algo_easyproblmes;

import org.junit.Test;

public class MaximumRepeatingSubstring {
	@Test
	public void test1() {
		
		String sequence="ababc";
		String word="ba";
		int count=0;
		//maxRepeating(sequence,word);
	}
	
	
	public int maxRepeatingword(String sequence, String word,int count) {
		 int length=word.length()-1;
	      int r=sequence.indexOf(word);  
	      if(r>=0) {
	      count++;
	      int k=word.length()-r;
	      sequence=sequence.substring(k,sequence.length());
	      maxRepeatingword(sequence,word,count);
	      }
	     //System.out.println(count);
	     return count;
    }
	
	 public int maxRepeating1(String sequence, String word) {
	      int count=0;
	        if(sequence.length()==word.length()){
	            if(sequence.equals(word))
	                return 1;
	        }
	        
	        if(sequence.length()<word.length()){
	            
	                return -1;
	        }
		        for(int i=0;i<sequence.length()-1;i++){
		            String temp= "" +sequence.charAt(i)+""+sequence.charAt(i+1);
		            if(temp.equals(word)){
		                count++;
		            }
		            
		        }
		        return count;
	        
	    }
	        
	    
}
