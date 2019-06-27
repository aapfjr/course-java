package com.algaworks.adestramento;

public class Treinador extends Pessoa {

	private String especialidade;

	public void seApresentar() {
		System.out.println(
				"Prazer sou o " + getNome() + ", tenho " + getIdade() + " anos e sou " + getEspecialidade() + "!");
	}

	public void ensinarSentar(Animal animal) {
		System.out.println(animal.getNome() + ", hora de sentar! ... Isso muito bem!");
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
