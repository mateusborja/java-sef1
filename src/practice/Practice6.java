package practice;

import java.util.Scanner;

//Abreviation Name app
public class Practice6 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o nome completo: ");
		String nomeCompleto = input.nextLine();

		String nomePedacos[] = nomeCompleto.split(" ");
		
		for (String letra : nomePedacos){

			System.out.print(letra.substring(0, 1) + ".");	
		}

	}
	
}
