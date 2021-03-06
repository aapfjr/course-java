/*
   author aapfjr
*/

package com.algaworks.sistemafinanceiro;

public class ContaReceber extends Conta {

	private Cliente cliente;

	public void receber() {
		if (!getSituacaoConta().equals(SituacaoConta.PENDENTE)) {
			System.out.println("Não é possível ser recebida, pois sua conta encontra-se: " + getSituacaoConta());
		} else {
			setSituacaoConta(SituacaoConta.PAGA);
			System.out.println("Sua conta foi recebida com sucesso!");
		}
	}

	public void cancelar() {
		if (getValor() < 50000D && !getSituacaoConta().equals(SituacaoConta.CANCELADA)) {
			setSituacaoConta(SituacaoConta.CANCELADA);
			System.out.println("Sua conta " + getDescricao() + " -- " + getValor() + ", foi cancelada com sucesso!");
		} else {
			System.out.println("Desculpe, mas seu recebimento não é possível cancelar. Procure seu gerente!");
		}
	}
	
	public void exibirDetalhes() {
		System.out.println("CONTAS À RECEBER");
		System.out.println("Cliente: " + getCliente().getNome());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Data de Vencimento: " + getDataVencimento());
		System.out.println("Valor: " + getValor());
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
