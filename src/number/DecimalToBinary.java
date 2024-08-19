package number;

import java.util.ArrayList;

public class DecimalToBinary {
	public static void main(String[] args) {
		int n = 17;
		convert(n);
	}

	private static void convert(int n) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		int num = n;
		while (num>0) {
			 int a = num%2;
			 aList.add(a);
			 num /=2;
		}
		
		for (int i = aList.size()-1; i >=0; i--) {
			System.out.print(aList.get(i)+" ");
		}
	}
}
