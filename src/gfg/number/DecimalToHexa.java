package gfg.number;

public class DecimalToHexa {
	public static void main(String[] args) {
		
		int n = 2545;
		function(n);
//		System.out.println(function(n));
		
	}

	private static void function(int n) {
		int rem;
		char ch = 0;
		int i = 0;
        StringBuilder temp = new StringBuilder();

		while (n!=0) {
			rem = n%16;
			
			if (rem < 10) {
				ch = (char) (rem+48);
			}
			else  if (rem >= 10) {
				ch = (char) (rem+55);
			} 
			
			temp.append(ch);
			i++;
			n = n/16;
		}
		
        System.out.println(temp);
		
	}
}
