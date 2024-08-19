package number;

public class LCM3 {
	public static void main(String[] args) {
		int n1=25, n2=15;
		System.out.println(findLCM(n1, n2));
	}

	//use formula 
	// a x b = LCM(a, b) * GCD (a, b)
	// LCM(a, b) = (a x b) / GCD(a, b)
	private static int findLCM(int n1, int n2) {

		int gcd = findGCD(n1, n2);

		return (n1 * n2)/gcd ;
	}

	private static int findGCD(int n1, int n2) {

		if (n2==0) {
			return n1;
		}
		else {
			return findGCD(n2, Math.abs(n1-n2));
		}

	}
}
