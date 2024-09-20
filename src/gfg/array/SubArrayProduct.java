package gfg.array;

public class SubArrayProduct {
	public static void main(String[] args) {
        int[] a = { 1, -4, -6, 0, 1, -8, 4 };
        System.out.println("Maximum Product sum is " + maxProductSum(a));
	}

	private static int maxProductSum(int[] arr) {
		
		int pre=1;
		int suf=1;
		int n = arr.length;
		int maxProduct = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			pre = pre*arr[i];
			suf = suf*arr[n-i-1];
			
			maxProduct = Math.max(maxProduct, Math.max(pre,suf));
			
			if (pre==0) pre=1;
			if (suf==0) suf=1;
		}
		
		return maxProduct;
	}
}
