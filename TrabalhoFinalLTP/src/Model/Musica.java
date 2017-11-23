package Model;

import java.time.LocalDate;

public class Musica {

	// Atributo
	private String nome;
	private String genero;
	private LocalDate dataRegistro;
	private String artistas;

	// Metodo ToString
	@Override
	public String toString() {
		return "Musica: " + nome + "\nGenero: " + genero + "\nData Registro: " + getDataComoString() + "\nArtista: "
				+ artistas + "\n\n";
	}

	// Metodo Construtor
	public Musica(String nome, String genero, LocalDate dataRegistro, String linhaMusica) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.dataRegistro = dataRegistro;
		this.artistas = linhaMusica;
	}

	// Metodos Get's e Set's
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDate dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public String getArtistas() {
		return artistas;
	}

	public void setArtistas(String artistas) {
		this.artistas = artistas;
	}

	// Metodo para formatação da saida do LocalDate
	public String getDataComoString() {
		return dataRegistro.getDayOfMonth() + "-" + dataRegistro.getMonthValue() + "-" + dataRegistro.getYear();
	}
}
