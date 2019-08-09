package com.algaworks.excecoes;

public class PrincipalExcecoesChecadas {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(100);
		
		try {
			contaCorrente.sacar(60);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage() + "Saldo insuficiente.");
		}
		
		try {
			contaCorrente.sacar(50);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage() + "Saldo insuficiente.");
		}
		/* Podemos adicionar quantos "CATCH" quisermos! */
		finally {
			System.out.println();
			System.out.println("Obrigado por utilizar nosso Software!");
		}
		
	}
	
}