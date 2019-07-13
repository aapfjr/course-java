/*
   author aapfjr 
*/

package com.algaworks.maquinadecafe;

public class PrincipalMaquinaCafe {
	
	public static void main(String[] args) {
		MaquinaCafe maquinaCafe = new MaquinaCafe(30);
		
		maquinaCafe.fazerCafe();
		maquinaCafe.fazerCafe(10);
		maquinaCafe.fazerCafe(15);
	}

}