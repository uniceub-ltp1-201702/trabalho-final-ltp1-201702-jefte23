package Control;

import java.util.ArrayList;

import Model.BDSimulado;
import Model.Musica;
import View.ViewExibeMusica;
import View.ViewSolicitaChave;
import View.ViewSolicitaLetra;

public class ControleBuscaMusicaString {

	// Atributos
	private BDSimulado bds;

	public ControleBuscaMusicaString(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void buscaPorLetra() {

		// Recupera ArrayList Musicas
		ArrayList<Musica> musicas = bds.getMusicas();

		// Chama Classe View que solicita letra para usuario
		ViewSolicitaLetra sn = new ViewSolicitaLetra();

		// Recupera a letra passada pelo usuario
		String nome = sn.getNome();

		// armazena a primeira posição da palavra passada pelo usuario
		String letra = nome.substring(0, 1).toUpperCase();

		String a = "\t" + "<<< Musicas com a Letra " + letra + " >>>\n";
		for (int i = 0; i < musicas.size(); i++) {

			if (musicas.get(i).getNome().toUpperCase().contains(letra)) {
				a += "-------------------\n" + musicas.get(i).getNome() + "\n" + musicas.get(i).getGenero() + "\n"
						+ musicas.get(i).getDataRegistro() + "\n" + musicas.get(i).getArtistas() + "\n";
			}
		}
		ViewExibeMusica em = new ViewExibeMusica(a);
	}

	@SuppressWarnings("unused")
	public void buscaPalavraChave() {

		// Recupera ArrayList de musicas
		ArrayList<Musica> musicas = bds.getMusicas();

		// Chama Classe View que solicita a letra para o usuario
		ViewSolicitaChave sn = new ViewSolicitaChave();

		// Recupera letra/palavra passada por Usuario
		String nome = sn.getNome().toUpperCase();

		String a = "<<< Musicas com a '" + nome + "' >>>\n";

		for (int i = 0; i < musicas.size(); i++) {
			if (musicas.get(i).getNome().toUpperCase().contains(nome)) {
				a += "-------------------\n" + musicas.get(i).getNome() + "\n" + musicas.get(i).getGenero() + "\n"
						+ musicas.get(i).getDataRegistro() + "\n" + musicas.get(i).getArtistas() + "\n";

			}
		}
		ViewExibeMusica em = new ViewExibeMusica(a);
	}
}
