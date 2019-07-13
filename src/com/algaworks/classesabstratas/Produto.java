package com.algaworks.classesabstratas;

public abstract class Produto {

	protected String descricao;
	
	public abstract void imprimirDescricaoProduto();
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}