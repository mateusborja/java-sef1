package practice;

//anual salary
import javax.swing.JOptionPane;

public class practice9 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu Nome?");
		
		int ct =1;
		double total = 0;
		
		while (ct <= 12) {
			String salario = JOptionPane.showInputDialog("Digite seu" + " " + ct + " " + "salário");
			double valorSalario = Double.parseDouble(salario);
			total += valorSalario;
			ct++;
					
		}
		
		double media = total / 12;
		JOptionPane.showMessageDialog(null, nome + " " + "Seu 13 salário é" + " " + media);
		System.exit(0);


	}

}