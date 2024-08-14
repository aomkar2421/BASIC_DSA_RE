package number;

public class FactorialRecursion {
	public static void main(String[] args) {
		
		int n = 6;
//		function(n);
		System.out.println(function(n));
		
	}

	private static int function(int n) {
		if (n==1) {
			return 1;
		}
		
		int a = function(n-1);
		return n*a;
		
	}
}
