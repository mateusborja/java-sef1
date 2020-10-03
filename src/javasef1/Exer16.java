package javasef1;

public class Exer16 {
	public static void main(String[] args) {
		int v1 = 10;
		
		if (v1 > 5) {
			System.out.println("é maior");
			System.out.println("bloco1" + "\n");
		} else {
			System.out.println("é menor");
			System.out.println("bloco2");
		}
		
		System.out.println("o programa continua..." + "\n");
		
		if (v1 > 20) {
			System.out.println("e maior");
			System.out.println("bloco 3");
			
		} else {
			System.out.println("é menor");
			System.out.println("bloco 4" + "\n");
		}
		
		System.out.println("o programa continua" + "\n");
		
		
		//example 02
		int var1 = 10;
		int var2 = 20;
		String solution1 = "Solução Verdadeira";
		String solution2 = "Solução Falsa";
		
		if (var1 > var2) {
			System.out.println(solution1); 
		} else {
			System.out.println(solution2); 
		}
		
		int var3 = 10;
		if (var3 > 5) {
			System.out.println(solution1);
		} else {
			System.out.println(solution2);

		}
	}
	


}
