package number;

public class GCD2 {
	public static void main(String[] args) {
		int n1=10, n2=15;
		System.out.println(findGCD(n1, n2));
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
