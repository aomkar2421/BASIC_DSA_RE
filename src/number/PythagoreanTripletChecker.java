package number;

public class PythagoreanTripletChecker {

	public static void main(String[] args) {

		int a=3, b=4, c=5;

		if (isPythagoreanTriplet(a, b, c)) {
			System.out.println(a + ", " + b + ", and " + c + " form a Pythagorean triplet.");
		} else {
			System.out.println(a + ", " + b + ", and " + c + " do not form a Pythagorean triplet.");
		}
	}

	public static boolean isPythagoreanTriplet(int x, int y, int z) {

		int a = Math.min(x, Math.min(y, z));
		int c = Math.max(x, Math.max(y, z));
		int b = x + y + z - a - c;  // b is the remaining number

		return c * c == a * a + b * b;
	}
}
