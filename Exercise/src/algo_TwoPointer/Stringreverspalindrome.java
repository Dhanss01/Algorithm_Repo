package algo_TwoPointer;

import org.junit.Assert;
import org.junit.Test;


/*
 * 1) Did I understand the problem? Yes or No !! -> If No, Ask the person to
 * provide more detail with example(s) -> If yes, go to next step !!
 * 
 * Yes
 * 
 * What is the input(s)? What is the expected output? Do I have constraints to
 * solve the problem? Do I have all informations to go to next step!! How big is
 * your test data set will be?
 * 
 * Input- String /char []
 *  Output -String /char [] 
 *  Constraint- should not remove the space and special characters
 * 
 * 2) Test data set
 * 
 * Minimum of 3 data set !! Positive, Edge, Negative Validate with the
 * interviewer if the data set is fine by his/her assumptions - Comparision
 * between
 * 
 * Positive- : s = "ab-cd"
     Negative -: s=""
      Edge -: s="c"
 * 
 * 
 * 3) Do I know how to solve it?
 * 
 * Yes - great, is there an alternate? 
 * 4) Ask for hint if don't know to solve? 
 * 
 * 5) Do i know any alternate solution? 
 *    -> No, Solve with the known solution
 *    
 * 6) If alternate solution found -> Find the O notation 
 *     -> Explain either or the best one depends on time
 *     -> Approach 01 : Starts with worst(Brute force)
 *     -> Approach 02: Write the options and benefits of it 
 *     -> Always start from worst to best
 *     
 * 7) Proceed with pseudocode 
 * 
 * 8) Implement code in editor
 * 
 * 9) Test against data set
 * 
 * 10) Debug if it fails    
 */


/*    * Pseudo Code:
 * 1.Get the string and convert it to char array 
 * 2.intialise pointer left =0 right = str.length
 * 3.run through below condition till loop till it reaches to length
 * 4.if alphabet
 *     a.swap left and right 
 *     b.left++ right --
 * 5.if(str[left] not alphabet)
 *     a.left++ 
 *     b.right is retained
 *     else if(str[right] not alphabet)
 *     a.right --
 *     b.left is retained
 * 
 * 6.Retrun String
 */
/**
 * Time Complexity - O(n)
 * Space Complexity- O(n)
 * 
 * 
 */
	
public class Stringreverspalindrome {
	

	@Test
    public void test1() {
        String str = "a-bC-dEf-ghIj";
        Assert.assertEquals("j-Ih-gfE-dCba",chkPalindrome(str));
        
    }
	@Test
    public void test2() {
        String str = "ab-cd";
        Assert.assertEquals("dc-ba",chkPalindrome(str));
        
    }
	
	@Test
    public void test3() {
        String str = "Test1ng-Leet=code-Q";
        Assert.assertEquals("Qedo1ct-eeLg=ntse-T!",chkPalindrome(str));
        
    }
	
	@Test
    public void tes41() {
        String str = ",--";
        Assert.assertEquals(",--",chkPalindrome(str));
        
    }
	
    private String chkPalindrome(String str) {
        // TODO Auto-generated method stub
        char chs[] = str.toCharArray();
        int left = 0, right = 0;
        while (left < str.length() && left < str.length()) {
            if ((chs[left] != ' ') || (chs[left] != '-') || (chs[left] != ',')
                    || (chs[left] != ';') || (chs[right] != ' ') || (chs[right] != '-') || (chs[right] != ',')
                    || (chs[right] != ';'))
            {            
            
            char tmp = chs[left];
            chs[left] = chs[right];
            chs[right] = tmp;
            left++;
            right--;
        }
            else if ((chs[left] == ' ') || (chs[left] == '-') || (chs[left] == ',')
                    || (chs[left] == ';')  && (chs[right] != ' ')||(chs[right] != '-') || (chs[right] != ',')
                    || (chs[right] != ';')) 
            {
                right= right-1;          
        
                
            }
            else if ((chs[right] == ' ')||(chs[right] == '-') || (chs[right] == ',')
                    || (chs[right] == ';') && (chs[left] != ' ') || (chs[left] != '-') || (chs[left] != ',')
                    || (chs[left] != ';')) 
            {
                left = left+1;
            } 
        
        		
    }
        return new String (chs);
}}
