package com.algaworks.polimorfismo;

public class PrincipalPolimorfismo {

	public static void main(String[] args) {
		
		Conta conta = new Conta(3500);
		imprimirSaldo(conta);
		System.out.println();
		
		// -----------------------------
		
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(7000);
		imprimirSaldo(contaCorrente);
		System.out.println();
		
		// -----------------------------
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(1000);
		imprimirSaldo(contaPoupanca);
		System.out.println();
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Seu saldo em conta é de: R$" + conta.getSaldo());
		
		if (conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("Seu limite em conta é de: R$" + cc.getLimite());
		}
		
		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cc = (ContaPoupanca) conta;
			System.out.println("Sua % de rendimento na poupança é de: " + cc.getRendimento() + "%");
			double rendimento = cc.getRendimento();
			rendimento = cc.getSaldo() * (rendimento/100);
			System.out.println("Seu redimento foi de: R$" + rendimento);
		}
	}
	
}