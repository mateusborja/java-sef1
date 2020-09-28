package javasef1;

import javax.swing.JOptionPane;

public class Exer17 {
	public static void main(String[] args) {
		
		String idade = JOptionPane.showInputDialog("Digite sua idade?");
		String relatorio = " ";
		int var1 = Integer.parseInt(idade);
		
		
		if (var1 > 18) {
			relatorio = "Voce ja pode tirar sua carteira de Motorista";
		} else {
			relatorio = "Voce não pode tirar sua carteira de Motorista";

		}
		
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);
		
	}

}
