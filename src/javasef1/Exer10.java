package javasef1;

import javax.swing.JOptionPane;

public class Exer10 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String sobrenome = JOptionPane.showInputDialog("Digite seu Sobrenome");
		String digitou = "Voce digitou ";
		JOptionPane.showMessageDialog(null, digitou + nome + sobrenome);
		System.exit(0);
		
	}
	
	
}
