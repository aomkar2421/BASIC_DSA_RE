package gfg.string;

import java.util.HashMap;

public class SubstringWithoutRepeating {
	public static void main(String[] args) {
		String s1 = "abcdbbcfbbcd";
		System.out.println(s1);
		
		System.out.println(function(s1));
		
	}

	private static int function(String s) {

		HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) {
            	left = Math.max(mpp.get(s.charAt(right)) + 1, left);
            }
            mpp.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
	}
}
