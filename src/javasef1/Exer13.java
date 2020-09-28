package javasef1;

public class Exer13 {
	public static void main(String[] args) {
		int nove = 9;
		int dez = 10;
		
		System.out.println(dez > nove && dez < 8); //&& equivale a and
		System.out.println(dez < nove || dez < 8); // || equivale a ou
		System.out.println(dez > nove || dez > 8); // || equivale a ou
		System.out.println(dez > nove); // || equivale a ou
		System.out.println(!(dez > nove)); // 
		
	}

}
