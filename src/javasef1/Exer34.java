//java array length
package javasef1;

public class Exer34 {
	public static void main(String[] args) {
		int[] collection = new int[5];
		System.out.println(collection.length + "\n");

		for (int i = 0; i < collection.length; i++) {
			collection[i] = i;
			System.out.println(collection[i]);

		}

		String[] cars = { "Volvo", "Mercedez", "Gol", "Fusca" };
		System.out.println("\n" + cars[2] + "\n");

		// test array values
		int[] myArr = { 6, 42, 3, 7 };
		int sum = 0;

		for (int x = 0; x < myArr.length; x++) {
			sum += myArr[x];
		}

		System.out.println("\n" + sum);
	}

}
