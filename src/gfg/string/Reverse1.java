package gfg.string;

public class Reverse1 {
	public static void main(String[] args) {
		String s1 = "omkar";
		System.out.println(s1);
		
		function(s1);
		
	}

	private static void function(String s1) {

		String rev = "";
		
		for (int i = s1.length() - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }
		System.out.println(rev);
		
	}
}
