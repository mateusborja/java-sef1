//java continue
package javasef1;

public class Exer26 {
	public static void main(String[] args) {
		int i;
		for (i=0; i<=10; i++) {
			//continue
			if (i == 5) {
				continue;
			}
			System.out.println("\n" + "System operation -> " + i);
			
		}
		
		System.out.println("\n" + "Operation Over");
	}
}
