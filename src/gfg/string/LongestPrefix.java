package gfg.string;

import java.util.Arrays;

public class LongestPrefix {
	public static void main(String[] args) {
		String[] s1 = {"geeksforgeeks", "geeks", "geek", "omkar"};

		System.out.println(function(s1));		
	}

	private static String function(String [] s) {

		int n = s.length;

		if(s.length == 0)
			return "";

		if (s.length == 1) {
			return s[0];
		}

		Arrays.sort(s);

		int min= Math.min(s[0].length(), s[n-1].length());
		int i = 0;

		while (i < min && s[0].charAt(i)==s[n-1].charAt(i) ) {
			i++;
		}

		String res = s[0].substring(0, i);

		if (res.length() != 0) {
			return res;
		}
		return null;
	}
}
