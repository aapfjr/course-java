package com.algaworks.corretoradeseguro.objetos;

import com.algaworks.corretoradeseguro.Seguravel;

public class Notebook implements Seguravel {

	private String modelo;
	private String marca;
	private double valor;

	public Notebook() {
	}

	public Notebook(String modelo, String marca, double valor) {
		this.modelo = modelo;
		this.marca = marca;
		this.valor = valor;
	}

	@Override
	public double calcularValorApolice() {

		double valorApolice = getValor();

		if (valorApolice < 2000) {
			valorApolice += (valorApolice * 0.015);
		} else {
			valorApolice += (valorApolice * 0.1);
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Notebook: " + getModelo() + " --- " + getMarca() + " --- " + getValor();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}