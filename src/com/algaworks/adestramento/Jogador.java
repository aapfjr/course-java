package com.algaworks.adestramento;

public class Jogador extends Pessoa {

	private Boolean aindaJoga = false;
	
	protected void seAindaJoga() {
		System.out.println("Ainda joga? " + aindaJoga);
	}
	
	public Boolean getAindaJoga() {
		return aindaJoga;
	}
	public void setAindaJoga(Boolean aindaJoga) {
		this.aindaJoga = aindaJoga;
	}
	
}