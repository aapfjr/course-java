package com.algaworks.classesabstratas;

public class ProdutoIndustrializado extends Produto {

	private boolean enlatado;

	public void imprimirDescricaoProduto() {
		System.out.println("Descrição: " + super.getDescricao());
		System.out.println("Enlatado: " + getEnlatado());
	}

	public boolean getEnlatado() {
		return enlatado;
	}
	
	public void setEnlatado(boolean enlatado) {
		this.enlatado = enlatado;
	}

}