//java switch with break
package javasef1;

public class Exer28 {
	public static void main(String[] args) {
		int valor = 20;

		switch (valor) {

		case 10: {
			System.out.println("o valor é 10");
			System.out.println("-> case 1" + "\n");
			//use break
			break;
		}

		case 20: {
			System.out.println("o valor é 20");
			System.out.println("-> case 2" + "\n");
			//use break
			break;
		}

		case 30: {
			System.out.println("o valor é 30");
			System.out.println("-> case 3" + "\n");
			//use break
			break;
		}

		default: {
			System.out.println("não é nenhum valor" + "\n");
		}

		}

		System.out.println("o programa continua..." + "\n");
	}

}
