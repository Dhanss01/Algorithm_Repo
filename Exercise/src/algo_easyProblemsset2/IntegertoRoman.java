package algo_easyProblemsset2;
import org.junit.Test;

public class IntegertoRoman {

	public String[] Thousands = { "", "M", "MM", "MMM" };
	public String[] Hundreds = { "", "C", "CCC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
	public String[] Tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
	public String[] Ones = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

	@Test
	public void Test1() {
		int number = 3999;
		System.out.println(IntegerToRoman(number));
	}

	@Test
	public void Test2() {
		int number = 1994;
		System.out.println(IntegerToRoman(number));
	}
	private String IntegerToRoman(int number) {
		if (number == 0)
			return "Zero";
		if (number < 0 || number > 3999)
			return "invalid input";
		if (number >= 1000) {
			String roman = IntegerToRoman(number % 1000);
			String string = Thousands[number / 1000];

			return Thousands[number / 1000] + IntegerToRoman(number % 1000);
		}
		if (number >= 100)
			return Hundreds[number / 100] + IntegerToRoman(number % 100);
		if (number >= 10)
			return Tens[number / 10] + IntegerToRoman(number % 10);
		return Ones[number];
	}
	
}
