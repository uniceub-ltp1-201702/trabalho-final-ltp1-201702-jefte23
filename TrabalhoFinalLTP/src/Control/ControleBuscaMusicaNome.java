package Control;

import java.util.ArrayList;

import Model.BDSimulado;
import Model.Musica;
import View.ViewExibeMusica;
import View.ViewSolicitaMusica;

public class ControleBuscaMusicaNome {

	// Atributos
	private BDSimulado bds;

	public ControleBuscaMusicaNome(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void exibeMusicaNome() {

		// Recupera todas as musicas
		ArrayList<Musica> musicas = this.bds.getMusicas();

		// View que solicina o nome do artista
		ViewSolicitaMusica sn = new ViewSolicitaMusica();

		// Recupera nome digitado pelo usuario
		String nome = sn.getNome();

		String a = "\t" + "<<< " + nome + " >>>\n";
		for (int i = 0; i < musicas.size(); i++) {
			if (musicas.get(i).getNome().equalsIgnoreCase(nome)) {

				a += "-------------------\n" + musicas.get(i).getArtistas() + "\n" + musicas.get(i).getGenero() + "\n"
						+ musicas.get(i).getDataComoString() + "\n";
			}
		}
		ViewExibeMusica em = new ViewExibeMusica(a);
	}

}
