package algo_easyProblemsset2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MonthDate {
	
	@Test
	public void test1()
	{
		String s= "Mon";
		int k= 12;
		System.out.println(returnDayOfWeek(s,k));
		
	}
	
	private String returnDayOfWeek(String s, int k){
        List<String> days = new ArrayList<String>(Arrays.asList("Mon","Thur","Staturday"));
        int dayofWeek=0;
        if(k<=500 && k>=0){
        	dayofWeek = (days.indexOf(s)+k)%7; 
        }
        return days.get(dayofWeek);
    }

}
