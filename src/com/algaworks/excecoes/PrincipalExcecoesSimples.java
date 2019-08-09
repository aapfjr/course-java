package com.algaworks.excecoes;

public class PrincipalExcecoesSimples {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(150);
		
		try {
			contaCorrente.depositar(0);
		} catch (IllegalArgumentException e) {
			System.out.println("Você executou uma operação ilegal ao depositar. " + e.getMessage());
		}
		
		contaCorrente.depositar(50);
		contaCorrente.imprimirSaldo();
		
	}
	
}