package number;

public class LCM1 {
	public static void main(String[] args) {
		int n1=10, n2=15;
		System.out.println(findGCD(n1, n2));
	}

	private static int findGCD(int n1, int n2) {
		
		int i = Math.max(n1, n2);
		
		for (i = i; i <= n1*n2 ; i++) {
			if(i%n1==0 && i%n2==0) {
				return i;
			}
		}
		
		return 1;
	}
}
