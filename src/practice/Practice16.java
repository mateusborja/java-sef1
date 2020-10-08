//age app
package practice;

import javax.swing.JOptionPane;

public class Practice16 {
	public static void main(String[] args) {
		String seunome = JOptionPane.showInputDialog("Qual seu Nome?");
		String qtd = JOptionPane.showInputDialog(seunome + " quantos filhos você tem?");
		int filhos = Integer.parseInt(qtd);
		int ct = 1;
		String rel = "";

		while (ct <= filhos) {
			String nomefilhos = JOptionPane.showInputDialog(seunome + "\n" + "Qual nome do seu " + ct + " filho?");
			String idadefilhos = JOptionPane.showInputDialog(seunome + "\n" + "Qual a idade do seu " + ct + " filho?");
			rel += "o nome do seu " + ct + " filho é " + nomefilhos + ", e sua idade é " + idadefilhos + "." + "\n";
			ct++;
		}
		
		JOptionPane.showMessageDialog(null, "Relatório" + " \n" + rel);
		
		

	}

}
