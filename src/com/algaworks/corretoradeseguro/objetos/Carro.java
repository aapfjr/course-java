package com.algaworks.corretoradeseguro.objetos;

import com.algaworks.corretoradeseguro.Seguravel;

public class Carro implements Seguravel {

	private String modelo;
	private String placa;
	private double valor;

	public Carro() {
	}

	public Carro(String modelo, String placa, double valor) {
		this.modelo = modelo;
		this.placa = placa;
		this.valor = valor;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = getValor();

		if (valorApolice < 15000) {
			valorApolice += (valorApolice * 0.07);
		} else {
			valorApolice += (valorApolice * 0.15);
		}

		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Carro: " + getModelo() + " --- R$" + getPlaca() + " --- R$" + getValor();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}