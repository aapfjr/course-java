package com.algaworks.classesabstratas;

public class ProdutoPerecivel extends Produto {

	private String dataFabricacao;
	private String dataValidade;

	public void imprimirDescricaoProduto() {
		System.out.println("Descrição: " + super.getDescricao());
		System.out.println("Data de Fabricação: " + getDataFabricacao());
		System.out.println("Data de Validade: " + getDataValidade());
	}

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

}
