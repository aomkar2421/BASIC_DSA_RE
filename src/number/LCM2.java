package number;

public class LCM2 {
	public static void main(String[] args) {
		int n1=10, n2=15;
		System.out.println(findLCM(n1, n2));
	}

	// Here LCM always gets hence we have return 0, but if we dont need to return 0 after for loop
	//then we can follow method 2 which run infinte loop hence dont need return after for loop

	private static int findLCM(int n1, int n2) {

		int max = Math.max(n1, n2);
		int min = Math.min(n1, n2);

		for (int i = max; i <= n1*n2 ; i+=max) {
			if( i%min == 0 ) {
				return i;
			}
		}
		return 0;
	}
	
	/*this method contains a for loop with a condition that always holds true 
	(for (int i = greater;; i += greater)), meaning the loop is infinite unless interrupted by 
	the return statement inside. Java can detect that this loop will continue until a value is 
	returned, so it doesn't require a return statement outside the loop. This is why the 
	compiler does not raise an error here.*/
	
	private static int findLCM2(int n1, int n2) {

		int max = Math.max(n1, n2);
		int min = Math.min(n1, n2);

		for (int i = max; ; i+=max) {
			if( i%min == 0 ) {
				return i;
			}
		}
	}
	
	
	
}
