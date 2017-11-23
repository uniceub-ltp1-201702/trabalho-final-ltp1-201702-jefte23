package View;

import javax.swing.JOptionPane;

public class ViewSolicitaArtista {

	private String nome;

	public ViewSolicitaArtista() {
		nome = JOptionPane.showInputDialog("Infome o Artista/Banda: ");
	}

	public String getNome() {
		return nome;
	}
}
