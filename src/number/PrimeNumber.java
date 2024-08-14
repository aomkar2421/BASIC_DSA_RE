package number;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int n = 37;
		System.out.println(function(n));
		
	}

	private static int function(int n) {

		if (n <= 1) {
            return 0; // 0 and 1 are not prime numbers
        }
        
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) { 
                return 0;
            }
        }
		
		return 1;
	}
}
