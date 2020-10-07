/*
 * possibles sum two numbers
 */
//app 50
package practice;

public class practice18 {
	public static void main(String[] args) {
		int i,j;
		
		for (i = 0; i < 100; i++) {
			for (j = 0; j < 1000; j++) {
				int n = i + j;
				if (n==50) {
					System.out.println(i + " + " + j + " = " + n);
				}
			}
		}
	}

}
