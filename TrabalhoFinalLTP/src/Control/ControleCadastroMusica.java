package Control;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import Model.BDSimulado;
import Model.Musica;
import View.ViewCadastraMusica;

public class ControleCadastroMusica {

	// Atributos
	private BDSimulado bds;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");

	public ControleCadastroMusica(BDSimulado bds) {
		this.bds = bds;
	}

	public void cadastraMusica() throws IOException {

		// Recupera o Array de Musicas
		// ArrayList<Musica> musicas = bds.getMusicas();

		// Instancia a view
		ViewCadastraMusica vcm = new ViewCadastraMusica(bds);

		// Chamar metodo para obter os dados
		vcm.obterDadosMusica();

		// Instancisar um objeto da classe cliente com os dados digitais

		Musica incluir = new Musica(vcm.getMusica(), vcm.getGenero(), LocalDate.parse(vcm.getData(), formatter),
				vcm.getArtista());

		if (bds.testaMusicaExiste(incluir)) {
			JOptionPane.showMessageDialog(null, "Musica já exite no banco de dados");
		} else {
			bds.gravarMusica(incluir);
			JOptionPane.showMessageDialog(null, "Música incluida com sucesso");
		}

	}
}
