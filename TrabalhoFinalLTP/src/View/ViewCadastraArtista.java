package View;

import javax.swing.JOptionPane;

import Model.BDSimulado;

public class ViewCadastraArtista {

	private String nome;
	private String data;
	private String nascionalidade;
	@SuppressWarnings("unused")
	private BDSimulado bds;

	public ViewCadastraArtista(BDSimulado bds) {
		// instancia o objeto BDsimulado
		this.bds = bds;
	}

	// Metodos Get's e Set's
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascionalidade() {
		return nascionalidade;
	}

	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void obterDadosArtista() {

		this.setNome(JOptionPane.showInputDialog(null, "infome o nome do artista/Banda: "));
		this.setNascionalidade(JOptionPane.showInputDialog(null, "Informe a Nascionalidade"));
		this.setData(JOptionPane.showInputDialog(null, "infome a data de nascimento: "));
	}

}
