package View;

import javax.swing.JOptionPane;

public class ViewSolicitaLetra {

	private String letra;

	public ViewSolicitaLetra() {
		letra = JOptionPane.showInputDialog("Infome a Letra: ");
	}

	public String getNome() {
		return letra;
	}
}
