// java ternary operator
package javasef1;

public class Exer37 {
	public static void main(String[] args) {
		int var = 10;
		int a;
		
		if (var > 20) {
			a = 50;
		} else {
			a = 100;
		}

		System.out.println("O valor de a = " + a + "\n");
		
		//ternary operator
		int b = var > 20 ? 30 : 50;
		System.out.println(b);
		
		//ternary operator
		int c = var >= 10 ? 50 : 150;
		System.out.println("\n" + "O valor de c = " + c);
		
	}
	
	

}
