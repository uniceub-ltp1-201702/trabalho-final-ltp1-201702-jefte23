package Control;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Model.BDSimulado;
import Model.Musica;
import View.ViewExcluiMusica;
import View.ViewSolicitaArtista;
import View.ViewSolicitaMusica;

public class ControleExcluiMusica {

	// Atributo BDSimulado
	private BDSimulado bds;

	public ControleExcluiMusica(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings({ "unused" })
	public void ExcluirMusica() throws IOException {

		// cria a variavel e inicializa com o nome do arquivo
		String FileName = "musicas.txt";

		// Recupera Valores do ArrayList
		ArrayList<Musica> musicas = bds.getMusicas();

		// Solicitar nome da musica e do artista para exclussao
		ViewSolicitaMusica snm = new ViewSolicitaMusica();
		ViewSolicitaArtista sna = new ViewSolicitaArtista();

		// Recupera nome da musica e do artista
		String mus = snm.getNome();
		String art = sna.getNome();

		// percorre ArrayList
		for (int i = 0; i < musicas.size(); i++) {
			// compara nome passado com os existentes na lista
			if (musicas.get(i).getNome().equals(mus) && musicas.get(i).getArtistas().equals(art)) {
				// Se musica e nome de artista for igual aos passados pelo usuario
				musicas.remove(i);
			}
		}

		// Percorre lista para montagem de String a ser gravada no arquivo
		String listaMusicas = "";
		for (int i = 0; i < musicas.size(); i++) {

			if (i == (musicas.size() - 1)) {
				listaMusicas += musicas.get(i).getNome() + ";" + musicas.get(i).getGenero() + ";"
						+ musicas.get(i).getDataComoString() + ";" + musicas.get(i).getArtistas();
			} else {
				listaMusicas += musicas.get(i).getNome() + ";" + musicas.get(i).getGenero() + ";"
						+ musicas.get(i).getDataComoString() + ";" + musicas.get(i).getArtistas() + "\n";

			}
		}

		FileWriter fw = new FileWriter(FileName, false);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(listaMusicas);
		pw.close();

		ViewExcluiMusica em = new ViewExcluiMusica();
	}
}
