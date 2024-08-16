package number;

public class Armstrong {
	public static void main(String[] args) {
		
		int n = 9474;
		function(n);
		
	}

	private static void function(int num) {
		
		int n = num;

		int l = Integer.toString(num).length();
		int sum = 0;
		
		while (n > 0) {
			int digit = n%10;
			sum += Math.pow(digit, l);
			n = n/10;
		}
		System.out.println( sum == num );
	}
}
