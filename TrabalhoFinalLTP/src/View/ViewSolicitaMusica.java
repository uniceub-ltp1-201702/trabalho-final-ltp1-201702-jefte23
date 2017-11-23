package View;

import javax.swing.JOptionPane;

public class ViewSolicitaMusica {

	private String nome;

	public ViewSolicitaMusica() {
		nome = JOptionPane.showInputDialog("Infome a Musica: ");
	}

	public String getNome() {
		return nome;
	}
}
