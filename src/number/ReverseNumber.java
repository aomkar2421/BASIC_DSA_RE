package number;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 1234;
		reverse(num);
	}

	private static void reverse(int num) {
		int n = num;
		int ans = 0;
		while (n > 0) {
			int rem = n%10;
			ans = ans*10 + rem;
			n = n/10;
		}
		System.out.println(ans);
	}
}
