/*
   author aapfjr
*/

package com.algaworks.sistemafinanceiro;

public class Principal {

	public static void main(String[] args) {

		Fornecedor imobiliaria = new Fornecedor("Imobiliária Enfia Faca");
		Fornecedor mercado = new Fornecedor("Mercadinho Não Tem Nada");
		Fornecedor funeraria = new Fornecedor("Funerária Sua Morte Nossa Alegria");

		Cliente gilZagueiro = new Cliente("Gil Zagueiro do Timão");
		Cliente neyBosta = new Cliente("Ney Bosta Só Cai");
		Cliente griesmann = new Cliente("Griesmann do Barça Agora");

		ContaPagar contaPagarImobiliaria = new ContaPagar(imobiliaria, "Mais velha não dá", 200000D, "07/07/2019");
		ContaPagar contaPagarMercado = new ContaPagar(mercado, "Compra o que tem!", 4.5, "13/07/2019");
		ContaPagar contaPagarFuneraria = new ContaPagar(funeraria, "Seélouco! kkkkk", .50, "../../....");

		ContaReceber contaReceberGilZagueiro = new ContaReceber(gilZagueiro, "Bate nela!", 1000D, "08/07/2019");
		ContaReceber contaReceberNeyBosta = new ContaReceber(neyBosta, "Cai cai", 0D, "24/11/2024");
		ContaReceber contaReceberGriesmann = new ContaReceber(griesmann, "Pipoca do Real", 50D, "12/07/2019");

		RelatorioContas relatorioContas = new RelatorioContas();
		Conta[] contas = new Conta[] { contaPagarImobiliaria, contaPagarMercado, contaPagarFuneraria,
				contaReceberGilZagueiro, contaReceberNeyBosta, contaReceberGriesmann };
		
		relatorioContas.listarContas(contas);
	}

}