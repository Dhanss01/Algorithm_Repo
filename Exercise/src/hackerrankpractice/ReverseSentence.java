package hackerrankpractice;

import org.junit.Test;

public class ReverseSentence {
	
	@Test
	public void test1()
	{
		String s = "today is a beautiful day";
		reverseEachWord(s);		
	}
	
   @Test
	public void test2()
	{
		String s = "today is a beautiful day";
		reverseEachWord(s);		
	}
	
   @Test
	public void test3()
	{
		String s = "today is a beautiful day";
		reverseEachWord(s);		
	}
	
	/* create a string array 
	 * split string based on  space or special character
	 * initialize two pointer left as 0, right as length-1;
	 * swap the left and right strings
	 * append all string using string builder
	 * 
	 * Ensure every characters are converted in .toLowercase();
	 * 
	 */

	private String reverseEachWord(String s) {
		// TODO Auto-generated method stub
    s.toLowerCase();
	String[] split = s.split(" ");
	StringBuilder sb= new StringBuilder();
	
	int left=0, right=split.length-1;
	
	while(left<right) {
	 String temp= split[left];
	 split[left]=split[right];
	 split[right]=temp;
	 left++;
	 right--;
		
	}
		
		return split.toString();
	}

	/*without additional space
	 * reverse the string 
	 * and iterate through the string  till you find the  " "  thenreverse it 
	 * convert string in to lowercase
	 * init two pointer left=0, right=length-1;
	 * traverse through the string length
	 * if(character == "/"||"")
	 
	private String reverseEachWord1(String s) {
		// TODO Auto-generated method stub
    s.toLowerCase();	
	StringBuilder sb= new StringBuilder();	
	int left=0, right=s.length()-1;
	
	while(left<right) {


	 char temp= s.charAt(left);
	 s.charAt(left)=s.charAt(right);
	 s.charAt(right)=temp;
	 left++;
	 right--;
		
	}*/
	
	
}
