package number;

public class Fabinocci {
	public static void main(String[] args) {

		int n = 37;
		function(n);
		//		System.out.println(function(n));

	}

	private static void function(int n) {

		int a = 0;
		int b = 1;
		System.out.print(a+" "+b);
		
		for (int i = 0; i < n; i++) {
			int j = a + b;

			System.out.print(" "+j);
			a = b;
			b = j;
		}
		
	}
}