package com.algaworks.adestramento;

public class Treinador extends Pessoa {

	private String funcao;

	public void seApresentar() {
		super.seApresentar();
		System.out.println("Tenho a função de " + getFuncao() + "!");
	}
	
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
