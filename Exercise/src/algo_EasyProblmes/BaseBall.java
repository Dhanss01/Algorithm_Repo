package algo_EasyProblmes;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BaseBall {
	@Test
	public void test1()
	{
		String[] ops= {"5","2","C","D","+"};
		System.out.println(baseballcount(ops));
	}
	
	/*"C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
"D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score
	 * 
	 * 
	 * 
	 */
	public int baseballcount(String[] ops ) {
		
		List<String> list =new ArrayList<String>();
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<ops.length;i++)
		{
			if(ops[i]=="C")
			{
				list.remove(list.size()-1);
			}
			else if(ops[i]=="D")
			{
				int value = Integer.parseInt(list.get(list.size()-1));		
				value=value*2;				
				list.add(String.valueOf(value));
				
			}
			else if(ops[i]=="+") {
				int sum=0; 
				String j=list.get(list.size()-1);
				String j2=list.get(list.size()-2);
					int value=Integer.parseInt(j);
					int value1=Integer.parseInt(j2);
					sum=value+value1;			
				list.add(String.valueOf(sum));
				
			}
			else
				list.add(ops[i]);
			
		}
		
		int result=0;
		for(int i=0;i<list.size();i++){
			
			//String s = list.get(i);
			int value=Integer.parseInt(list.get(i));
			result=result+value;
		}
		
		return result;
	}

}
