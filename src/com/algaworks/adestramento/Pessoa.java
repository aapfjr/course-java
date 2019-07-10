package com.algaworks.adestramento;

public class Pessoa {

	private String nome;
	private int idade;

	public void seApresentar() {
		System.out.println("Prazer sou o " + getNome() + ", tenho " + getIdade() + " anos.");
	}

	public Pessoa() {
	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}