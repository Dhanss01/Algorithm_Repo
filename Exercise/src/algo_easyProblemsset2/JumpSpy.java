package algo_easyProblemsset2;

import java.util.ArrayList;

public class JumpSpy {

	
	/*# 1. If a word in the string is after a comma, insert a comma before every duplicate of the same word
		# 2. If a word in the string is before a comma, insert a comma after every duplicate of the same word 
		# Write a method to change text according to the rules until no more commas can be added.
		# Input:
		#pray, jump spy. jump spy, jump. spy, ally now, ally.
		# Output:
		# pray, jump spy. jump spy, jump. spy, ally now, ally.
	 * 
	 * 
	 * pray, jump, spy. jump spy, jump. spy, ally now, ally.
	 * 
	 * 
	 */
	    
	/*Init a ArrayList
	 *from a given sentence , based on  ' ' and ' .' split a word and add it in to arrayList
	 *if a word contains a comma at S.CharAt(end-1) 
	 *  ---> yes get the next word (i+1) and search for the duplicates of the same word in each lisit  add ',' before the word
	 * if before a comma word exist, then 
	 *   -->   Yes get the next word (i+1) and search for the duplicates of the same word in each lisit  add ',' before the word
	 * 
	 * 
	 * 
	 * 
	 */
	    public String commaduplicates(String s)
	    {
	    	ArrayList<String> words = new ArrayList<String>();
	    	String[] words1 = s.split("[ ,]+\")");
	    	
	    	return " ";
	    }
}
