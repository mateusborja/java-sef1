package practice;

import javax.swing.JOptionPane;


//child qtde
public class practice10 {
	public static void main(String[] args) {
		String qtd = JOptionPane.showInputDialog("Quanto filhos você tem?");
		int filhos = Integer.parseInt(qtd);
		int ct = 1;
		String rel = "";

		// condicao name and age
		while (ct <= filhos) {
			String nome = JOptionPane.showInputDialog("Qual o nome do" + " " + ct + " " + "filho?");
			String idade = JOptionPane.showInputDialog("Qual a idade do" + " " +  ct + " " + "filho?");
			rel += "O" + " " + nome + " " + "tem" + " " + idade + "\n";
			++ct;
		}
		
		JOptionPane.showMessageDialog(null, rel);

	}

}
