//java array declaration
package javasef1;

public class Exer35 {
	public static void main(String[] args) {
		int valor = 10;
		int[] collection1 = new int[6];
		collection1[0] = 1;
		collection1[1] = 2;
		collection1[2] = 3;
		collection1[3] = 4;
		collection1[4] = valor;
		collection1[5] = 20;

		// new java array declaration
		int[] collection = { 1, 2, 3, 4, valor, 20 };

		for (int i = 0; i < collection.length; i++) {
			System.out.println(collection[i] + "\n");
		}

		int sum = 0;
		for (int x = 0; x < collection.length; x++) {
			sum += collection[x];

		}
		System.out.println(sum);
	}

}
