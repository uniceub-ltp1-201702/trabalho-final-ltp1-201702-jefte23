package Control;

import java.util.ArrayList;

import Model.Artista;
import Model.BDSimulado;
import View.ViewExibeArtista;

public class ControleExibeArtistas {

	private BDSimulado bds = new BDSimulado();

	public ControleExibeArtistas(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void ExibeArtistas() {

		ArrayList<Artista> artistas = bds.getArtistas();
		String a = "<<< Artistas >>>\n";

		for (int i = 0; i < artistas.size(); i++) {
			a += "-------------------\n" + artistas.get(i).getNome() + "  -  " + artistas.get(i).getNascionalidade()
					+ "  -  " + artistas.get(i).getDataNascimento() + "\n";
		}

		ViewExibeArtista ea = new ViewExibeArtista(a);
	}
}