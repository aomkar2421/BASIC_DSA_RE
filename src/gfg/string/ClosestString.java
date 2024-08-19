package gfg.string;

final class ClosestString {
	public static void main(String[] args) {
		String[] S = { "the", "quick", "brown", "fox", "quick" };
		String word1 = "the", word2 = "fox";

		System.out.println(shortestDistance(S, word1, word2));
	}

	private static int shortestDistance(String[] s, String word1, String word2) {
		
		int d1=-1, d2=-1;
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == word1) {
				d1 = i;
			}else if (s[i] == word2) {
				d2 = i;
			}else if (d1 != -1 && d2 != -1) {
				ans = Math.min(ans, Math.abs(d1-d2));
			}
		}
		
		return ans;
	}
}