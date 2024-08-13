package gfg.string;

public class DecimalToRoman {
	public static void main(String[] args) {
		int num = 3449;
		System.out.println(num);
		
		System.out.println(function(num));
		
	}

	private static String function(int num) {

		String m[] = { "", "M", "MM", "MMM" };
        String c[] = { "",  "C",  "CC",  "CCC",  "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String x[] = { "",  "X",  "XX",  "XXX",  "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String i[] = { "",  "I",  "II",  "III",  "IV", "V", "VI", "VII", "VIII", "IX" };
        
        String thousands = m[num/1000];
        String hundreds = c[(num%1000)/100];
        String tens = x[(num%100)/10];
        String ones = i[num%10];
        
        String ans = thousands + hundreds + tens + ones;
		
		return ans;
	}
}
