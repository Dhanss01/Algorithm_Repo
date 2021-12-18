package algo_TwoPointer;

import org.junit.Test;

public class ReverseVowels {
	
/*	
	34) Write a solution to reverse only the vowels of a string.
	Input: "hello"
	Output: "holle"
	aeiou
	uoiea
	testliaaf
	tastlaief
*/
	
	//get the string fix start index as left, and end index as right
	//check if right and left both are the vowels
	 // then left[i] =right[i] swap it out by using temp
	//if left is not vowel  & right is vowel increment the left and keep right as it is
	//if right is not vowel  & left is vowel decrement the right and keep left as it is
	//if both are not vowel then 
	//  left++, right--;
	
	@Test
	public void input1()
	{
		String s ="hello";
		reversevowels(s);
	}
	
	
	private boolean isVowel(char ch)
	{
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		return true;
		else 
			return false;
	}
	
	public String reversevowels(String s)
	
	{
		
		
		char[] ch=s.toCharArray();
		 
		int left =0;
		int right =ch.length-1;
		char temp;
		while(left<right)
		{
			if(isVowel(ch[left]) &&isVowel(ch[right]))
			{
				temp=ch[left];
				ch[left]=ch[right];
				ch[right]=temp;
				left++;
				right--;
			}
			else if(isVowel(ch[left]))
			{
				right--;
			}
			
			
			
			left++;
			
		}
		s.valueOf(ch).toLowerCase();
		return s;
	}
	
}
