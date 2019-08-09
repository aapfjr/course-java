package com.algaworks.excecoes;

public class ContaCorrente {

	private double saldo;

	public ContaCorrente() {
	}

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valorDepositado) {
		
		if (valorDepositado <= 0) {
			throw new IllegalArgumentException("O valor depositado não pode ser menor que 0!");
		}
		
		this.saldo += valorDepositado;
		System.out.println("Depósito R$" + valorDepositado + ", realizado com sucesso!");
		imprimirSaldo();
	}

	public void sacar(double valorSacado) throws SaldoInsuficienteException {
		double saldoTemp = this.saldo - valorSacado;
		if(saldoTemp <= 0 ) {
			throw new SaldoInsuficienteException("ERROR, entre em contato com o suporte! ");
		}
		this.saldo -= valorSacado;
		System.out.println("Saque de R$" + valorSacado + ", realizado com sucesso!");
		imprimirSaldo();
	}
	
	public void imprimirSaldo() {
		System.out.println("Seu saldo em Conta Corrente R$" + getSaldo());
	}

	public double getSaldo() {
		return saldo;
	}

}