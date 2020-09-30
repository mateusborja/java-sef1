package javasef1;

import javax.swing.JOptionPane;

public class Exer18 {
	
	public static void main(String[] args) {
		
		String v1 = JOptionPane.showInputDialog("Digite o numero 1?");
		String v2 = JOptionPane.showInputDialog("Digite o numero 2?");
		
		//conversao de string para primitivos
		int vlr1 = Integer.parseInt(v1);
		int vlr2 = Integer.parseInt(v2);
		
		String relatorio = " ";
		
		if (vlr1 > vlr2) {
			relatorio += v1; 
		} else {
			
			if (vlr2 > vlr1) {
				relatorio += vlr2;
			} else {
				relatorio = "Iguais" + vlr1;

			}

		}
		
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);
		
	}
	
}
	


