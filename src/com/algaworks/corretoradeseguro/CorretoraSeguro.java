package com.algaworks.corretoradeseguro;

public class CorretoraSeguro {

	public void fazerPropostaSeguro(Seguravel objetoSeguravel) {
		System.out.println("------------------------------------");
		System.out.println("-- CORRETORA DE SEGURO - PROPOSTA --");
		System.out.println("------------------------------------");
		System.out.println();
		System.out.println(objetoSeguravel.obterDescricao());
		System.out.println();
		System.out.println("Valor da Apolice: R$" + objetoSeguravel.calcularValorApolice());
		System.out.println();
		System.out.println("------------------------------------");
	}

}