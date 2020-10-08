//java for
package practice;

import javax.swing.JOptionPane;

public class Practice14 {
	public static void main(String[] args) {
		String qtd = JOptionPane.showInputDialog("Quanto filhos você tem?");
		int filhos = Integer.parseInt(qtd);
		String space = " ";
		String rel = "";

		for (int ct = 1; ct <= filhos; ct++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do" + space + ct + space + "filho");
			String idade = JOptionPane.showInputDialog("Digite a idade do" + space + ct + space + "filho");
			String result = "O nome do" + space + ct + space + "filho" + space + "é " + space + nome + space
					+ "e sua idade é " + space + idade + "\n";
			rel += result;
		}

		JOptionPane.showMessageDialog(null, rel);
		System.exit(0);

	}

}
