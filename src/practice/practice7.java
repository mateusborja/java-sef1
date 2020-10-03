package practice;

import javax.swing.JOptionPane;

// annual salary
public class practice7 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome?");
		int ct = 1;
		double total = 0;
		
		while (ct <= 12) {
			String salario = JOptionPane.showInputDialog("Digite seu" + " " + ct + " " +"salário");
			double valor = Double.parseDouble(salario);
			total += valor;
			ct++;
			
		}
		
		double media = total / 12;
		
		JOptionPane.showMessageDialog(null, "Seu 13 salário é" + " " + media);
		System.exit(0);
				
		
	}

}
