package Control;

import java.io.IOException;

import javax.swing.JOptionPane;

import Model.BDSimulado;
import View.ViewPrincipal;

public class ControlePrincipal {

	// Atributos
	private BDSimulado bds;
	private ViewPrincipal vp;
	private ControleBuscaMusicaNome cbmn;
	private ControleBuscaMusicaString cbms;
	private ControleBuscaMusicaArtista cbma;
	private ControleCadastroArtista cca;
	private ControleCadastroMusica ccm;
	private ControleExcluiMusica cem;
	private ControleExcluiArtista cea;
	private ControleExibeArtistas ca;
	private ControleBuscaGenero cbg;

	// Metodo construtor
	public ControlePrincipal() throws IOException {
		// Instanciar o objeto BDSimulado
		this.bds = new BDSimulado();

		// Instancia a ViewPrincipal
		this.vp = new ViewPrincipal();

		// Cria constroles
		this.cbmn = new ControleBuscaMusicaNome(bds);
		this.cbms = new ControleBuscaMusicaString(bds);
		this.cbma = new ControleBuscaMusicaArtista(bds);
		this.cca = new ControleCadastroArtista(bds);
		this.ccm = new ControleCadastroMusica(bds);
		this.cem = new ControleExcluiMusica(bds);
		this.cea = new ControleExcluiArtista(bds);
		this.ca = new ControleExibeArtistas(bds);
		this.cbg = new ControleBuscaGenero(bds);

		// Exibe a janela de opções pela primeira vez
		tratarOpcao(this.vp.getOpcao());
	}

	public void tratarOpcao(String opcao) throws IOException {

		while (true) {
			switch (opcao) {
			case "1":
				this.cbmn.exibeMusicaNome();
				break;
			case "2":
				this.cbms.buscaPorLetra();
				break;
			case "3":
				this.cbms.buscaPalavraChave();
				break;
			case "4":
				this.cbma.exibeMusicaArtista();
				break;
			case "5":
				this.cbg.BuscaGenero();
				break;
			case "6":
				this.cca.cadastroArtista();
				break;
			case "7":
				this.ccm.cadastraMusica();
				break;
			case "8":
				this.ca.ExibeArtistas();
				break;
			case "9":
				this.cem.ExcluirMusica();
				break;
			case "10":
				this.cea.excluirArtista();
				break;
			case "11":
				JOptionPane.showMessageDialog(null, "Até Breve");
				return;
			default:
				JOptionPane.showConfirmDialog(null, "Digite um número válido");
			}
			opcao = this.vp.getOpcao();
		}
	}

}
