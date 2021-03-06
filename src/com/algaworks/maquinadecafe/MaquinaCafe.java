/*
   author aapfjr 
*/

package com.algaworks.maquinadecafe;

public class MaquinaCafe {

	private int acucarDisponivel;

	public void fazerCafe() {
		fazerCafe(10);
	}

	public void fazerCafe(int quantidade) {
		if (acucarDisponivel < quantidade) {
			System.out.println("Desculpe mais seu café saiu s/ açúcar! Pois sobraram apenas " + acucarDisponivel + "g de açúcar!");
		} else {
			acucarDisponivel -= quantidade;
			System.out.println("Seu cafezinho está sendo feito com " + quantidade + "g de açúcar!");
		}
	}

	public MaquinaCafe() {
	}

	public MaquinaCafe(int acucarDisponivel) {
		this.acucarDisponivel = acucarDisponivel;
	}

	public int getAcucarDisponivel() {
		return acucarDisponivel;
	}

	public void setAcucarDisponivel(int acucarDisponivel) {
		this.acucarDisponivel = acucarDisponivel;
	}

}