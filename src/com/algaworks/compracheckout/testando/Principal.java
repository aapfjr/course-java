package com.algaworks.compracheckout.testando;

import com.algaworks.compracheckout.caixa.Checkout;
import com.algaworks.compracheckout.caixa.Compra;
import com.algaworks.compracheckout.impressao.Impressora;
import com.algaworks.compracheckout.impressao.impressora.ImpressoraEpson;
import com.algaworks.compracheckout.pagamento.Cartao;
import com.algaworks.compracheckout.pagamento.Operadora;
import com.algaworks.compracheckout.pagamento.operadora.Visa;

public class Principal {

	public static void main(String[] args) {
		Operadora operadora = new Visa();
		Impressora impressora = new ImpressoraEpson();

		Cartao cartao = new Cartao();
		cartao.setNomeCartao("Fulano da S. Machado");
		cartao.setNumeroCartao("123");

		Compra compra = new Compra();
		compra.setNomeCliente("Fulano da Silva Machado");
		compra.setProduto("Feijão de Corda");
		compra.setValor(50);

		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}

}