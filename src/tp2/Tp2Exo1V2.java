package tp2;

import javax.swing.JOptionPane;

public class Tp2Exo1V2 {

	public static void main(String[] args) {
		String text = JOptionPane.showInputDialog("Taper une valeur");
		JOptionPane.showMessageDialog(null, text);
		
		String chaine ="123";
		int valeur = Integer.parseInt(chaine);
		JOptionPane.showMessageDialog(null, valeur);
		
	}

}
