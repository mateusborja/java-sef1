//java for example
package javasef1;

import javax.swing.JOptionPane;

public class Exer24 {
	public static void main(String[] args) {
		String qtd = JOptionPane.showInputDialog("Quantos filhos você tem?");
		String rel = "";
		int filhos = Integer.parseInt(qtd);
		
		//childs name and age
		for (int ct = 1; ct <= filhos; ct++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do" + " " + ct + " " + "filho?");
			String idade = JOptionPane.showInputDialog("Digite a idade do" + "  " + ct + " " + "filho?");
			String res = "nome = " + nome + "idade = " + idade + "\n";
			rel += res;
		}
			
		JOptionPane.showMessageDialog(null, rel);
		System.exit(0);
		
		
	}
	

}
