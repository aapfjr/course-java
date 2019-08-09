/*
   author aapfjr
*/

package com.algaworks.contacorrente;

public class ContaReceber extends Conta {

	private Cliente cliente;

	public void receber() throws OperacaoContaException {
		if (!getSituacaoConta().equals(SituacaoConta.PENDENTE)) {
			throw new OperacaoContaException(
					"Não é possível ser recebida, pois sua conta encontra-se: " + getSituacaoConta());
		} else {
			setSituacaoConta(SituacaoConta.PAGA);
			System.out.println("Sua conta foi recebida com sucesso!");
		}
	}

	public void cancelar() throws OperacaoContaException {
		if (getValor() < 50000D && !getSituacaoConta().equals(SituacaoConta.CANCELADA)) {
			setSituacaoConta(SituacaoConta.CANCELADA);
			System.out.println("Sua conta " + getDescricao() + " -- " + getValor() + ", foi cancelada com sucesso!");
		} else {
			throw new OperacaoContaException(
					"Desculpe, mas seu recebimento não é possível cancelar. Procure seu gerente!");
		}
	}

	public ContaReceber() {
	}

	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		this.cliente = cliente;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}