package number;

public class PrimeInRange {
	
	public static void main(String[] args) {

		int n = 100;
		function(n);

	}

	private static void function(int n) {

		for (int i = 2; i <= n; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i%j == 0) {
					flag = false;
					break;
				}	
			}
			if (flag == true) {
				System.out.print(i+" ");
			}
		}

	}
		
}
