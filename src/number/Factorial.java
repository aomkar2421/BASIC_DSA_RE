package number;

public class Factorial {
	public static void main(String[] args) {
		
		int n = 5;
		function(n);
//		System.out.println(function(n));
		
	}

	private static void function(int n) {

		int fact = 1;
		for (int i = n; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
