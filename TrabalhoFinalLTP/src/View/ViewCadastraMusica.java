package View;

import java.io.IOException;

import javax.swing.JOptionPane;

import Control.ControleCadastroArtista;
import Model.BDSimulado;

public class ViewCadastraMusica {

	private String musica;
	private String genero;
	private String data;
	private String artista;
	private BDSimulado bds;
	private ControleCadastroArtista cca;

	public ViewCadastraMusica(BDSimulado bds) throws IOException {

		// Instanciar o objeto BDSimulado
		this.bds = bds;

		// Instancia a ViewPrincipal
		this.cca = new ControleCadastroArtista(bds);
	}

	// Metodos Get e Set
	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public void obterDadosMusica() throws IOException {
		// Obtendo dados da Musica
		this.setMusica(JOptionPane.showInputDialog(null, " Informe o nome da música: "));
		this.setGenero(JOptionPane.showInputDialog(null, " Informe o genero: "));
		this.setData(JOptionPane.showInputDialog(null, " Informe a data de lançamento: "));
		this.setArtista(JOptionPane.showInputDialog(null, " Informe o nome do artista: "));

		if (bds.testaNomeArtista(artista) == false) {
			JOptionPane.showMessageDialog(null, "<<< Cadastro de Artista >>>");
			this.cca.cadastroArtista();
		}

	}

}
