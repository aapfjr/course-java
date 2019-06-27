package com.algaworks.adestramento;

public class Animal {

	private String raca;
	private String nome;
	
	public Animal() {
	}
	
	public Animal(String raca, String nome) {
		this.raca = raca;
		this.nome = nome;
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}