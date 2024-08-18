package number;

import java.util.HashSet;

public class HappyNumber {
	public static void main(String[] args) {
		int num = 82;
		System.out.println(ishappy(num));
	}

	private static boolean ishappy(int num) {

		HashSet<Integer> st = new HashSet<Integer>();

		while (true) {
			int n = squareNum(num);
			if (n == 1)
				return true;
			if (st.contains(n))
				return false;
			st.add(n);
			num = n;
		}

	}

	static int squareNum(int num) {

		int n = num;
		int ans = 0;

		while (n != 0) {
			int rem = n%10;
			ans = ans + rem*rem;
			n = n/10;
		}

		return ans;
	}
}
