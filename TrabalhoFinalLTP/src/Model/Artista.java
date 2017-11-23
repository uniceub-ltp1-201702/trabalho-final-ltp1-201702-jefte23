package Model;

import java.time.LocalDate;

public class Artista {
	// Atributos
	private String nome;
	private String nascionalidade;
	private LocalDate dataNascimento;

	// Metodo ToString
	@Override
	public String toString() {
		return "Nome: " + nome + "\nnascionalidade=" + nascionalidade + "\nNascimento=" + dataNascimento;
	}

	// Metodo Construtor
	public Artista(String nome, String nascionalidade, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.nascionalidade = nascionalidade;
		this.dataNascimento = dataNascimento;
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	// Metodo para formatação da saida do LocalDate
	public String getDataComoString() {
		return dataNascimento.getDayOfMonth() + "-" + dataNascimento.getMonthValue() + "-" + dataNascimento.getYear();
	}
}
