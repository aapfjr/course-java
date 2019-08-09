/*
   author aapfjr
*/

package com.algaworks.contacorrente;

public class Conta {

	protected String descricao;
	protected Double valor;
	protected String dataVencimento;
	protected SituacaoConta situacaoConta;

	public Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	public Conta(String descricao, Double valor, String dataVencimento, SituacaoConta situacaoConta) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.situacaoConta = situacaoConta;
	}
	
	public void cancelar() throws OperacaoContaException {
		if (getSituacaoConta().equals(SituacaoConta.PAGA)) {
			throw new OperacaoContaException("ERROR, não pode cancelar uma conta que se encontra PAGA!");
		} else if(getSituacaoConta().equals(SituacaoConta.CANCELADA)) {
			throw new OperacaoContaException("ERROR, não pode cancelar uma conta que se encontra CANCELADA!");
		} else {
			setSituacaoConta(SituacaoConta.CANCELADA);
			System.out.println("OK, sua conta " + getDescricao() + ", foi cancelada com sucesso!");
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
	}

}