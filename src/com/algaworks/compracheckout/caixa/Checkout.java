package com.algaworks.compracheckout.caixa;

import com.algaworks.compracheckout.impressao.Impressora;
import com.algaworks.compracheckout.pagamento.Cartao;
import com.algaworks.compracheckout.pagamento.Operadora;

public class Checkout {

	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout (Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if (autorizado) {
			this.impressora.imprimir(compra);
		} else {
			System.out.println("Sua compra foi negada babaiiiiii!!!");
		}
	}
	
}