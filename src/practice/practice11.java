package practice;

import javax.swing.JOptionPane;

public class practice11 {
	public static void main(String[] args) {
		
		String qtd = JOptionPane.showInputDialog("Quanto filhos você tem?");
		int filhos = Integer.parseInt(qtd);
		int ct = 1;
		String rel = "";
		
		while (ct <= filhos) {
			String nome = JOptionPane.showInputDialog("Qual nome do" + " " + ct + " " + "filho?");
			String idade = JOptionPane.showInputDialog("Qual idade do" + "\n " + " " + nome + "?");
			rel += "O" + " " + nome + " " + "tem" + " " + idade + " " + "anos." + "\n";
			++ct;
			
		}
		
		JOptionPane.showMessageDialog(null, rel);
		
	}
}

