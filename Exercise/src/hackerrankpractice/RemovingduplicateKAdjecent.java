package hackerrankpractice;

import java.util.Stack;

import org.junit.Test;

public class RemovingduplicateKAdjecent {
	
	@Test
	public void test1()
	{
		String s = "deeedbbcccbdaa";
		int k=3;
		System.out.println(removeDuplicates(s,k));
	}
//
	
	
	
/*pseudo code
 * iterate till the string.length
 * create two stacks 
 * first push each character in to tempstack 
 * when 
 * 
 */
	
    public String removeDuplicates(String s, int k) {
        Stack<Character> result = new Stack<>();
        
        for(char c: s.toCharArray()){
            Stack<Character> current = new Stack<>();
            current.push(c);
            
            while(!result.isEmpty() && result.peek()==c){
                current.push(result.pop());
            }
            
            if(current.size()!=k){
                while(!current.isEmpty()){
                    result.push(current.pop());
                }
            }
        }
        
        StringBuilder sb= new StringBuilder();
        
        while(!result.isEmpty()){
            sb.append(result.pop());
        }
        
        return sb.reverse().toString();
    }
    
    
    
	/*public String RemoveduplicatesadjecentK(String s, int k )
	{
		Stack<Character> str = new Stack<Character>();
		
		for(int i =0; i<s.length();i++)
		{
				int count=0;
				if(str.peek()==s.charAt(i))
				{
				str.push(s.charAt(i));	
				count++;
				if(count==k)
				 {
					while(count<=k)
					{
						str.pop();
					}
				 }
				}
				else
				{
					str.push(s.charAt(i));
				}
						
					
		}
		
		
		return str.toString();
	}*/
}
