package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Util.DocumentReader;
import Util.DocumentWriter;

public class BDSimulado {

	// Atributo
	private ArrayList<Musica> musicas;
	private ArrayList<Artista> artistas;
	private String fileMusicas = "musicas.txt";
	private String FileArtista = "artistas.txt";
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");

	// Metodo Construtor
	public BDSimulado() {

		// Instancia ArrayList
		this.artistas = new ArrayList<Artista>();
		this.musicas = new ArrayList<Musica>();

		// Instanciar o DocumentReader
		DocumentReader dr1 = new DocumentReader();
		DocumentReader dr2 = new DocumentReader();

		// Ler linhas do arquivo artistas.txt
		ArrayList<String> leitura1 = dr1.read(FileArtista);

		// Ler linhas do arquivo musicas.txt
		ArrayList<String> leitura2 = dr2.read(fileMusicas);

		/*------------------------------------------------*/

		// Percorre o ArrayList Criando artistas
		for (int i = 0; i < leitura1.size(); i++) {
			// Separa a linha em um array de String
			String[] linhaArtista = leitura1.get(i).split(";");

			// Cria artista com os dados da linha
			Artista a = new Artista(linhaArtista[0], linhaArtista[1], LocalDate.parse(linhaArtista[2], formatter));

			// coloca o artista no Arraylist
			this.artistas.add(a);
		}

		// Percorre o Arraylist criando musicas
		for (int i = 0; i < leitura2.size(); i++) {

			// Separa a linha em um array ed String
			String[] linhaMusica = leitura2.get(i).split(";");

			// Cria Musica com dados da linha
			Musica m = new Musica(linhaMusica[0], linhaMusica[1], LocalDate.parse(linhaMusica[2], formatter),
					linhaMusica[3]);

			// Coloca a musica no ArrayList
			this.musicas.add(m);
		}
	}

	// Metodo para gravar artista em arquivo artista.txt
	public void gravarArtista(Artista a) {
		this.artistas.add(a);

		// Transforma artista em String
		String artista = a.getNome() + ";" + a.getNascionalidade() + ";" + a.getDataComoString();

		// Instanciar o DocumentWriter
		DocumentWriter dw = new DocumentWriter();

		// Grava artista no arquivo
		dw.write(FileArtista, artista);
	}

	// Metodo para gravar musicas em arquivo musicas.txt
	public void gravarMusica(Musica m) {
		this.musicas.add(m);

		// Transforma artista em String
		String musica = m.getNome() + ";" + m.getGenero() + ";" + m.getDataComoString() + ";" + m.getArtistas();

		// Instanciar o DocumentWriter
		DocumentWriter dw = new DocumentWriter();

		// Grava artista no arquivo
		dw.write(fileMusicas, musica);
	}

	// Testa se nome do artista passado já existe e retorna um booleano
	public boolean testaArtistaExiste(Artista artista) {
		// Variavel booleana para teste
		boolean resultado = false;
		for (int i = 0; i < artistas.size(); i++) {
			if (artistas.get(i).getNome().equalsIgnoreCase(artista.getNome())) {
				return resultado = true;
			}
		}
		return resultado;
	}

	// Testa se nome do artista passado já existe e retorna um booleano
	public boolean testaNomeArtista(String nome) {
		// Variavel booleana para teste
		boolean resultado = false;
		for (int i = 0; i < artistas.size(); i++) {
			if (artistas.get(i).getNome().equalsIgnoreCase(nome)) {
				return resultado = true;
			}
		}
		return resultado;

	}

	// Testa se musica já existe com o mesmo artista
	public boolean testaMusicaExiste(Musica musica) {
		// Variavel booleana para teste
		boolean resultado = false;

		for (int i = 0; i < musicas.size(); i++) {
			if ((musicas.get(i).getNome().equalsIgnoreCase(musica.getNome()))
					&& (musicas.get(i).getGenero().equalsIgnoreCase(musica.getGenero()))
					&& (musicas.get(i).getArtistas().equalsIgnoreCase(musica.getArtistas()))
					&& (musicas.get(i).getDataComoString().equalsIgnoreCase(musica.getDataComoString()))) {
				resultado = true;
			}

		}
		return resultado;

	}

	// Metodo Get
	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

}
