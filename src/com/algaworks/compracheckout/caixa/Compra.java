package com.algaworks.compracheckout.caixa;

import com.algaworks.compracheckout.impressao.Imprimivel;
import com.algaworks.compracheckout.pagamento.Autorizavel;

public class Compra implements Imprimivel, Autorizavel {

	private String nomeCliente;
	private String produto;
	private double valor;

	@Override
	public String getCabecalhoPagina() {
		return "Cliente: " + getNomeCliente();
	}

	@Override
	public String getCorpoPagina() {
		return getProduto() + " --- " + "R$" + getValor();
	}

	@Override
	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

}