package Control;

import java.util.ArrayList;

import Model.BDSimulado;
import Model.Musica;
import View.ViewExibeMusica;
import View.ViewSolicitaGenero;

public class ControleBuscaGenero {

	// Atributo
	private BDSimulado bds;

	public ControleBuscaGenero(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void BuscaGenero() {

		ArrayList<Musica> musicas = bds.getMusicas();

		// solicita o nome do genero musical
		ViewSolicitaGenero sg = new ViewSolicitaGenero();

		// recupera a String recebida
		String genero = sg.getNome();

		String s = "\t" + "\t" + "<<< " + "Musicas do Genero " + genero + " >>>\n";
		for (int i = 0; i < musicas.size(); i++) {
			if (musicas.get(i).getGenero().equalsIgnoreCase(genero)) {
				s += "-------------------\n" + musicas.get(i).getNome() + " - " + musicas.get(i).getArtistas() + " - "
						+ musicas.get(i).getDataComoString() + "\n";
			}
		}
		ViewExibeMusica em = new ViewExibeMusica(s);
	}
}
