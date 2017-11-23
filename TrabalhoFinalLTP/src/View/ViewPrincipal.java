package View;

import javax.swing.JOptionPane;

public class ViewPrincipal {

	// Atributo
	private String opcao;

	// Metodo para exibir a lista de opçoes
	public String getOpcao() {

		this.opcao = JOptionPane
				.showInputDialog("\t" + "<<<< Estolha uma opção >>>>\n" + " 1 - Buscar música por nome\n"
						+ " 2 - Buscar música por letra\n" + " 3 - Busca Música por palavra Chave\n"
						+ " 4 - Busca musicas do artista\n" + " 5 - Busca Musica por Genero\n"
						+ " 6 - Cadastrar artista\n" + " 7 - cadastrar música\n" + " 8 - Exibe artistas Cadastrados\n"
						+ " 9 - Excluir música\n" + "10 - Excluir Artista\n" + "11 - Sair");
		return this.opcao;
	}

}
