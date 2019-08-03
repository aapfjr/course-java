package com.algaworks.corretoradeseguro.objetos;

import com.algaworks.corretoradeseguro.Seguravel;

public class Barco implements Seguravel {

	private String nomeBarco;
	private double valor;

	public Barco() {
	}
	
	public Barco(String nomeBarco, double valor) {
		this.nomeBarco = nomeBarco;
		this.valor = valor;
	}
	
	@Override
	public double calcularValorApolice() {
		
		double valorApolice = getValor();
		
		if (valorApolice < 10000) {
			valorApolice += (valorApolice * 0.01);
		} else {
			valorApolice += (valorApolice * 0.025);
		}
		
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Barco: " + getNomeBarco() + " --- R$" + getValor();
	}

	public String getNomeBarco() {
		return nomeBarco;
	}

	public void setNomeBarco(String nomeBarco) {
		this.nomeBarco = nomeBarco;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
