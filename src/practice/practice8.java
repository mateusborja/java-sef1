package practice;

import javax.swing.JOptionPane;

public class practice8 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu Nome");
		
		int ct = 1;
		double total = 0;
		
		while (ct <= 12) {
			String salario = JOptionPane.showInputDialog(nome + " " + "digite seu" + " " + ct + "º" + " " + "salário?");
			double valor = Double.parseDouble(salario);
			total += valor;
			ct++;
		}
		
		double media = total / 12;
		JOptionPane.showMessageDialog(null, nome + " " + "seu 13 salário é" + " " + media);
		System.exit(0);
		
	}

}
