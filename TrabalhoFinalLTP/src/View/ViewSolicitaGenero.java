package View;

import javax.swing.JOptionPane;

public class ViewSolicitaGenero {

	private String nome;

	public ViewSolicitaGenero() {
		nome = JOptionPane.showInputDialog(null, "infome o genero musical: ");
	}

	public String getNome() {
		return nome;
	}

}
