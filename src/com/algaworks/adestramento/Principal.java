package com.algaworks.adestramento;

public class Principal {

	public static void main (String[] args) {
		
		Jogador jogador = new Jogador();
		jogador.setNome("Amarildo Aparecido Ferreira Junior");
		jogador.setIdade(29);
		jogador.setAindaJoga(true);
		
		jogador.seApresentar();
		jogador.seAindaJoga();
	}
	
}