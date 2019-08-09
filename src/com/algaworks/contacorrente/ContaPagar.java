/*
   author aapfjr
*/

package com.algaworks.contacorrente;

public class ContaPagar extends Conta {

	private Fornecedor fornecedor;

	public ContaPagar() {
	}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public void pagar() throws OperacaoContaException {
		if (!this.getSituacaoConta().equals(SituacaoConta.PENDENTE)) {
			throw new OperacaoContaException("Não é possível pagar, pois sua conta encontra-se: " + getSituacaoConta());
		} else {
			setSituacaoConta(SituacaoConta.PAGA);
			System.out.println("Sua conta foi paga com sucesso!");
		}
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}