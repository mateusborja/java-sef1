//sum number 888
package practice;

public class practice15 {
	public static void main(String[] args) {

//		int i;
		int j;

		int[] range1 = new int[100], range2 = new int[999];

		int sum = 1;

		int total = 0;

		for (int i : range1) {
			total++;
			total += i;
			System.out.printf("Total de elementos range1: %d\n", total);

		} 

	}

}
