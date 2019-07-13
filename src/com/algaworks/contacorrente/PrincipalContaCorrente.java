/*
   author aapfjr
*/

package com.algaworks.contacorrente;

public class PrincipalContaCorrente {

	public static void main(String[] args) {
		Cliente aapfjr = new Cliente();
		aapfjr.setNome("Amarildo Junior");
		
		ContaReceber celularXiaomi = new ContaReceber(aapfjr, "Mi 9", 50000D, "28/06/2019");
		
		// Irá receber normalmente!
		celularXiaomi.receber();
		
		// Não irá cancelar, pois o valor é 50.000
		celularXiaomi.cancelar();
		
		// Não irá receber, pois a conta encontra-se PAGA
		celularXiaomi.receber();
		
		// Subtraímos 5000 do valor da Conta
		celularXiaomi.setValor(celularXiaomi.getValor() - 5.000D) ;
		
		// Irá cancelar normalmente!
		celularXiaomi.cancelar();
		
	}
	
}