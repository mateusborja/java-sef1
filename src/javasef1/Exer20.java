package javasef1;

// annual salary
import javax.swing.JOptionPane;

public class Exer20 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu Nome?");
		String espaco = " ";
		int ct = 1;
		double totais = 0;

		while (ct <=12) {
		String salario = JOptionPane.showInputDialog("Digite seu " + ct + espaco +"salário");
		double valor = Double.parseDouble(salario);
		totais += valor;

		++ct;

		}
		double media = totais / 12;
		JOptionPane.showMessageDialog(null, " O 13 salário do" + espaco + nome  + espaco + "é" + espaco + media);
		System.exit(0);

	}

	
}

