package com.algaworks.corretoradeseguro.objetos;

import com.algaworks.corretoradeseguro.Seguravel;

public class Imovel implements Seguravel {

	private String nome;
	private int numero;
	private double valor;

	public Imovel() {
	}

	public Imovel(String nome, int numero, double valor) {
		this.nome = nome;
		this.numero = numero;
		this.valor = valor;
	}

	@Override
	public double calcularValorApolice() {
		
		double valorApolice = getValor();
		
		if (valorApolice < 140000) {
			valorApolice += (valorApolice * 0.03);
		} else {
			valorApolice += (valorApolice * 0.10);
		}
		
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Imóvel: " + getNome() + " --- " + getNumero() + " --- " + getValor();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}