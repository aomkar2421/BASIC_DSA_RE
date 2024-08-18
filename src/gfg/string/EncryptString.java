package gfg.string;

public class EncryptString {

	public static void main(String[] args) {
		String str = "aaaabbbc";
		encrypt(str);
	}

	private static void encrypt(String str) {

		int n = str.length();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			int count = 0;

			while (i<n && str.charAt(i)==ch) {
				count++;
				i++;
			}
			i--;
			sb.append(ch);
			sb.append(convertToHex(count));

		}	
		sb.reverse();
		System.out.println(sb);
	}

	static String convertToHex(int n) {
		int rem;
		char ch = 0;
		int i = 0;
		StringBuilder temp = new StringBuilder();

		while (n!=0) {
			rem = n%16;

			if (rem < 10) {
				ch = (char) (rem+48);
			}
			else  if (rem >= 10) {
				ch = (char) (rem+55);
			} 

			temp.append(ch);
			i++;
			n = n/16;
		}
		return temp.toString();
	}

}
