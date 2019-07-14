package com.algaworks.compracheckout.pagamento.operadora;

import com.algaworks.compracheckout.pagamento.Autorizavel;
import com.algaworks.compracheckout.pagamento.Cartao;
import com.algaworks.compracheckout.pagamento.Operadora;

public class Visa implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValor() < 100;
	}

}
