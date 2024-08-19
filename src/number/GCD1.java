package number;

public class GCD1 {
	public static void main(String[] args) {
		int n1=15, n2=45;
		System.out.println(findGCD(n1, n2));
	}

	private static int findGCD(int n1, int n2) {
		
		int i =Math.min(n1, n2);
		
		for (i = i; i >0; i--) {
			if (n1%i == 0 && n2%i == 0) {
				return i;
			}
		}
		
		return 1;
	}
}
