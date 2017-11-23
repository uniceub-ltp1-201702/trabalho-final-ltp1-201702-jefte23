package View;

import javax.swing.JOptionPane;

public class ViewSolicitaChave {

	private String nome;

	public ViewSolicitaChave() {
		nome = JOptionPane.showInputDialog("Infome a palavra Chave para busca: ");
	}

	public String getNome() {
		return nome;
	}
}
