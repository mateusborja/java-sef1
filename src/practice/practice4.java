package practice;

public class practice4 {
	public static void main(String[] args) {
		int v1 = 10;
		String result1 = "Valor maior ou igual a " + v1;
		String result2 = "Valor menor ou igual a " + v1;
		String result3 = "Valor não é maior ou igual a  " + v1;
		
		if (v1 > 5) {
			System.out.println(result1);
			System.out.println("bloco 1");
			
		} else {
			System.out.println(result2);
			System.out.println("bloco 2");

		}
		System.out.println("\n" + "O programa continua..." + "\n");

		if (v1 > 20) {
			System.out.println(result2);
			System.out.println("bloco 3");
			
		} else {
			System.out.println(result3);
			System.out.println("bloco 4");
		}

		System.out.println("\n" + "O programa continua..." + "\n");
	}

}
