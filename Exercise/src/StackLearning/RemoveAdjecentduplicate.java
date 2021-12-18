package StackLearning;


/*Remove the adjacent duplicates in a string
abbaaba = aba
abccba  = empty string
 * 
 * 
 * 
 */



public class RemoveAdjecentduplicate {
	@Test
	public void test1()
	{
		String s = "abbaaba";	
	}

	@Test
	public void test2()
	{
		String s = "abccba";	
	}
	@Test
	public void test3()
	{
		String s = "ababa";	
	}
	
	   private String removeAdjacentDuplicates(String s) {
           if(s.length() == 0)
               return s;
           char[] ch = s.toCharArray();
           Stack<Character> stack = new Stack<Character>();
           for(int i = 0; i < ch.length; i++) {
               if(stack.isEmpty() || stack.peek()!=ch[i])
                   stack.push(ch[i]);
               else
                   stack.pop();
           }
           StringBuilder output = new StringBuilder();
           while(!stack.isEmpty())
               output.append(stack.pop());
           return output.toString();
       }

}
