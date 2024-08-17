package gfg.number;

import array.PrintArray;

public class DecimalToHexa {
	public static void main(String[] args) {
		
		int n = 2545;
		function(n);
//		System.out.println(function(n));
		
	}

	private static void function(int n) {
		int temp;
		char [] hexa = new char[100];
		int i = 0;
		
		while (n!=0) {
			temp = n%10;
			
			if (temp < 10) {
				hexa[i] = (char) (temp+48);
				i++;
			}
			else  if (temp >= 10) {
				hexa[i] = (char) (temp+55);
				i++;
			} 
		}
		
		for
		
	}
}
