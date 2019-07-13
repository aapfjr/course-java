/*
   author aapfjr 
*/

package com.algaworks.maquinadecafe;

public class PrincipalMaquinaCafe {
	
	public static void main(String[] args) {
		MaquinaCafe maquinaCafe = new MaquinaCafe(30);
		
		// Ok, café realizado!    Restando 20g
		maquinaCafe.fazerCafe();
		
		// Ok, café realizado!    Restando 10g
		maquinaCafe.fazerCafe(10);
		
		// Erro, café não realizado!    Só resta 10g
		maquinaCafe.fazerCafe(15);
		
		// Ok, café realizado!    Zerado a quantidade de café!
		maquinaCafe.fazerCafe();
		
		// Ok, café realizado!    Porém sem açúcar, pois o estoque de açúcar já acabou!
		maquinaCafe.fazerCafe();
	}

}