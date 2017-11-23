package Control;

import java.util.ArrayList;

import Model.BDSimulado;
import Model.Musica;
import View.ViewExibeMusica;
import View.ViewSolicitaMusica;

public class ControleBuscaMusicaArtista {

	// Atributo
	private BDSimulado bds;

	public ControleBuscaMusicaArtista(BDSimulado bds) {
		// Guarda o BDSimulado
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void exibeMusicaArtista() {

		// Recupera todas as clientes
		ArrayList<Musica> musicas = this.bds.getMusicas();

		// View que solicita o nome do artista
		ViewSolicitaMusica sn = new ViewSolicitaMusica();

		// recupera nome digitado pelo usuario
		String nome = sn.getNome();

		String a = "<<< " + nome + ">>>\n";
		for (int i = 0; i < musicas.size(); i++) {
			if (musicas.get(i).getArtistas().equalsIgnoreCase(nome)) {
				a += "-------------------\n" + musicas.get(i).getNome() + "\n" + musicas.get(i).getGenero() + "\n"
						+ musicas.get(i).getDataComoString() + "\n";
			}
		}
		ViewExibeMusica em = new ViewExibeMusica(a);
	}

}
