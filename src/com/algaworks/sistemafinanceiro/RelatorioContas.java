package com.algaworks.sistemafinanceiro;

public class RelatorioContas {

	public void listarContas(Conta[] contas) {
		
		System.out.println("*************************************");
		System.out.println("RELATÓRIO DE CONTAS À PAGAR E RECEBER");
		System.out.println("*************************************");
		System.out.println();

		for (int i = 0; i < contas.length; i++) {
			contas[i].exibirDetalhes();
			System.out.println();
		}

	}
}
