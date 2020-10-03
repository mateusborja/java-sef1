package javasef1;

import javax.swing.JOptionPane;

public class Exer17 {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu Nome?");
		String idade = JOptionPane.showInputDialog(nome + " " + "qual sua Idade?");
		String relatorio = "";
		
		int age = Integer.parseInt(idade);
		
		
		if (age <=18) {
			relatorio = nome + ", " + "você não pode tirar sua Habilitação.";
		} else {
			relatorio = nome + ", " + "você já pode tirar sua Habilitação.";
		}
		
		JOptionPane.showMessageDialog(null, relatorio);
		
		System.exit(0);
		
	}

}
