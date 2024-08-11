package gfg.string;

public class RomanToDecimal {
	public static void main(String[] args) {
		String s1 = "XXXVII";
		System.out.println(s1);
		
		System.out.println(function(s1));
		
	}

	private static int function(String str) {

		int res = 0;
		int n = str.length();
		
		for (int i = 0; i < n; i++) {

			int s1 = value(str.charAt(i));
			if (i+1 < n) {
				
				int s2 = value(str.charAt(i+1));
				if (s1 >= s2) {
					res += s1;
				} else {
					res += (s2-s1);
					i++;
				}
				
			} else {
				res += s1;
			}
			
		}
		
		return res;
	}
	
	public static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
}
