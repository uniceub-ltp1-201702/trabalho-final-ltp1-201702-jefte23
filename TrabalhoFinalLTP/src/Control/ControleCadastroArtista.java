package Control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import Model.Artista;
import Model.BDSimulado;
import View.ViewCadastraArtista;

public class ControleCadastroArtista {

	// Atributo
	private BDSimulado bds = new BDSimulado();
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");

	public ControleCadastroArtista(BDSimulado bds) {
		this.bds = bds;
	}

	public void cadastroArtista() {

		// Instancia a view
		ViewCadastraArtista vca = new ViewCadastraArtista(bds);

		// Chama Metodo para obter dados
		vca.obterDadosArtista();

		// Instanciar um objeto da classe cliente com os dados digitado
		Artista incluir = new Artista(vca.getNome(), vca.getNascionalidade(),
				LocalDate.parse(vca.getData(), formatter));

		if (bds.testaArtistaExiste(incluir)) {
			JOptionPane.showMessageDialog(null, "Artista já exite no banco de dados");
		} else {
			bds.gravarArtista(incluir);
			JOptionPane.showMessageDialog(null, "Artista cadastrado com sucesso");
		}
	}
}
