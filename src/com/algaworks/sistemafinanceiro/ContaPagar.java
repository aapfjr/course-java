/*
   author aapfjr
*/

package com.algaworks.sistemafinanceiro;

public class ContaPagar extends Conta {

	private Fornecedor fornecedor;

	public void pagar() {

	}

	public void exibirDetalhes() {
		System.out.println("CONTAS À PAGAR");
		System.out.println("Fornecedor: " + getFornecedor().getNome());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Data de Vencimento: " + getDataVencimento());
		System.out.println("Valor: " + getValor());
	}

	public ContaPagar() {
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
