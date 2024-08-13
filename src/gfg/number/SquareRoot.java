package gfg.number;

public class SquareRoot {
	public static void main(String[] args) {
		
		int num = 39;
		System.out.println(num);
		System.out.println(function(num));
		
	}

	private static int function(int n) {
		
		if (n == 0 || n == 1) {
            return n;
        }

		int s = 1;
		int e = n/2;
		int ans=0;
		
		while (s<=e) {
			int mid = (s+e)/2;
			
			if (mid * mid == n) {
				return mid;
			}
			else if (mid*mid < n) {
				s = mid+1;
				ans = mid;
			}
			else {
				e = mid-1;
			}
			
		}
		
		return ans;
	}
}
