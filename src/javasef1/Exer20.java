package javasef1;

import javax.swing.JOptionPane;

public class Exer20 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu Nome?");
		String espaco = " ";
		int ct = 1;
		double totais = 0;

		while (ct <=12) {
		String salario = JOptionPane.showInputDialog(nome + espaco + "Digite seu " + ct + espaco +"salário");
		double valor = Double.parseDouble(salario);
		totais += valor;

		++ct;

		}
		double media = totais / 12;
		JOptionPane.showMessageDialog(null, nome + "Seu 13 sal�rio �" + espaco + media);
		System.exit(0);

	}

	
}

