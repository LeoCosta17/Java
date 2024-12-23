package entities;

import entities.enums.TipoPessoa;

public class Pessoa {
	private String nome;
	private Integer idade;
	private Double altura;
	private TipoPessoa tipo;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, Integer idade, Double altura, TipoPessoa tipo) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", tipo=" + tipo + "]";
	}
	
	
}
