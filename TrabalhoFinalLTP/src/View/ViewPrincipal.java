package View;

import javax.swing.JOptionPane;

public class ViewPrincipal {

	// Atributo
	private String opcao;

	// Metodo para exibir a lista de op�oes
	public String getOpcao() {

		this.opcao = JOptionPane
				.showInputDialog("\t" + "<<<< Estolha uma op��o >>>>\n" + " 1 - Buscar m�sica por nome\n"
						+ " 2 - Buscar m�sica por letra\n" + " 3 - Busca M�sica por palavra Chave\n"
						+ " 4 - Busca musicas do artista\n" + " 5 - Busca Musica por Genero\n"
						+ " 6 - Cadastrar artista\n" + " 7 - cadastrar m�sica\n" + " 8 - Exibe artistas Cadastrados\n"
						+ " 9 - Excluir m�sica\n" + "10 - Excluir Artista\n" + "11 - Sair");
		return this.opcao;
	}

}
