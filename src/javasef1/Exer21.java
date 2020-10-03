package javasef1;

import javax.swing.JOptionPane;

//exercise child number and name
public class Exer21 {
	public static void main(String[] args) {
		String qtd = JOptionPane.showInputDialog("Digite quantos filhos você tem?");

		int filhos = Integer.parseInt(qtd);
		int ct = 1;
		String space = " ";
		String rel = "";

		while (ct <= filhos) {
			String nome = JOptionPane.showInputDialog(" Digite o nome do" + space + ct + " " + "filho?");
			String idade = JOptionPane.showInputDialog(" Digite a idade do" + space + ct + " " + "filho?");
			rel += "O nome do" + space + ct + space + "filho é" + space + nome + space + "e sua idade é " + space
					+ idade + "\n";
			ct++;
		}

		JOptionPane.showMessageDialog(null, rel);
		System.exit(0);

	}

}
