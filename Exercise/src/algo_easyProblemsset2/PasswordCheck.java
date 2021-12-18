package algo_easyProblemsset2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class PasswordCheck {

	/**
	 * The Main class implements an application that reads lines from the standard
	 * input and prints them to the standard output.
	 */

	/**
	 * A Iterate through each line of input. Nj1@3knui) strong
	 * 
	 * weak nh jk invalid nhuiedml9 weak amdjA1 weak Aa3$ medium
	 * 
	 */
/*	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			// Sstem.out.println(line);
			System.out.println(pwdChk(line));
		}
	}*/
	@Test
	public void test1()
	{
		String s= "Nj1@3knui)";
		System.out.println(pwdChk(s));;
	}

	private static String pwdChk(String line) {
		
		if (line.contains(" ")) 
		{
			return "invalid";
		}
		
		 final String strongregx = "^(?=.*\\d)(?=\\S+$)(?=.*[@#$%^&+=])(?=.*[a-z])(?=.*[A-Z]).{8,10}$";
		 final String mediumregex= "^(?=.*[a-z])(?=.[A-Z])(?=.*\\d).+$";
		  
		 final Pattern strongpattern = Pattern.compile(strongregx);
		 final Pattern mediumpattern = Pattern.compile(mediumregex);
		 Matcher s = strongpattern.matcher(line);
		 Matcher m = mediumpattern.matcher(line);
		  
		 if (s.matches() && line.length() >= 10) return "strong ";		
		 else if (s.matches() || m.matches() && line.length() < 10) return "medium ";
		 else
			return "week";
	}
	
	
				
	 
}
