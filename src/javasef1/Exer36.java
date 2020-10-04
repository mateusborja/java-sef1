//super for
package javasef1;

public class Exer36 {
	public static void main(String[] args) {
		int[] collection = {10, 20, 30, 40};
		int sum = 0;
		
		for (int values: collection) {
			//sum array values
			sum += values; 
			System.out.println(values);
			
			
		}
		System.out.println("\n" + sum);
		
	}

}
