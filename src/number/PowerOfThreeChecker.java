package number;

public class PowerOfThreeChecker {

	public static void main(String[] args) {

		int number = 10;

		if (isPowerOfThree(number)) {
			System.out.println(number + " is a power of three.");
		} else {
			System.out.println(number + " is not a power of three.");
		}

	}

	// Function to check if the number is a power of three
	public static boolean isPowerOfThree(int n) {
		if (n < 1) {
			return false;
		}

		while (n % 3 == 0) {
			n /= 3;
		}

		return n == 1;  //After the loop, if the number is reduced to 1, the original number was a power of three. Otherwise, it wasn't.
	}
}
