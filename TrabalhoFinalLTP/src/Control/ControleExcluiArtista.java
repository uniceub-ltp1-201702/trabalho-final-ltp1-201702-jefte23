package Control;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Model.Artista;
import Model.BDSimulado;
import View.ViewExcluirArtista;
import View.ViewMensagemErro;
import View.ViewSolicitaArtista;

public class ControleExcluiArtista {

	private BDSimulado bds = new BDSimulado();

	public ControleExcluiArtista(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void excluirArtista() throws IOException {

		// cria a variavel e inicializa com o nome do arquivo
		String FileName = "artistas.txt";

		// Recupera Valores do ArrayList
		ArrayList<Artista> artista = bds.getArtistas();

		// Solicita o nome do artista a ser exluido
		ViewSolicitaArtista sn = new ViewSolicitaArtista();

		// recupera nome pasado pelo usu�rio
		String nome = sn.getNome();

		String listaArtista = "";
		if (bds.testaNomeArtista(nome)) {
			// percorre ArrayList
			for (int i = 0; i < artista.size(); i++) {
				// compara nome passado com os existentes na lista
				if (artista.get(i).getNome().equals(nome)) {
					// se encontrado remove os dados na possi��o
					artista.remove(i);
				}
			}

			// grava arquivo atualizado
			for (int i = 0; i < artista.size(); i++) {

				if (i == (artista.size() - 1)) {
					// transforma o Array em String
					listaArtista += artista.get(i).getNome() + ";" + artista.get(i).getNascionalidade() + ";"
							+ artista.get(i).getDataComoString();

				} else {
					// transforma o Array em String
					listaArtista += artista.get(i).getNome() + ";" + artista.get(i).getNascionalidade() + ";"
							+ artista.get(i).getDataComoString() + "\n";
				}
			}

			FileWriter fw = new FileWriter(FileName, false);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(listaArtista);
			pw.close();

			ViewExcluirArtista ea = new ViewExcluirArtista();
		} else {
			ViewMensagemErro me = new ViewMensagemErro();
		}

	}
}
