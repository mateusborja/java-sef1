package practice;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class practice1 {
	
	public static void main(String[] args) {
		
		   JFrame frame = new JFrame("JOptionPane exemplo");

		   int resposta = JOptionPane.showConfirmDialog(frame,"escolha um", "escolha dois", JOptionPane.YES_NO_OPTION);

			if (resposta == JOptionPane.YES_OPTION) {
		        JOptionPane.showMessageDialog(null, "Olá");
		      }
		      else {
		         JOptionPane.showMessageDialog(null, "Adeus");
		         System.exit(0);
		      }
		    System.exit(0);
		  }

	}
	
		



