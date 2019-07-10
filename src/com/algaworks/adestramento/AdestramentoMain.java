package com.algaworks.adestramento;

public class AdestramentoMain {

	public static void main(String[] args) {
		
		Animal cachorro = new Animal("Shih-tzu", "Thor");
		Treinador treinadorCachorro = new Treinador();
		treinadorCachorro.setNome("Godofredú");
		treinadorCachorro.setIdade(39);
		treinadorCachorro.setEspecialidade("Adestrador");
		
		treinadorCachorro.seApresentar();
		treinadorCachorro.ensinarSentar(cachorro);
	}
	
}