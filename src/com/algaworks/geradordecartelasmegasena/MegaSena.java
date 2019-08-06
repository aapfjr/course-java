package com.algaworks.geradordecartelasmegasena;

public class MegaSena {

	public static final int NUMERO_MAXIMO = 60;
	public static final int QUANTIDADE_NUMEROS = 6;
	
	private int[] numerosSorteados;
	
	public void sortear() {
		this.numerosSorteados = new int[QUANTIDADE_NUMEROS];
		
		for (int i = 1; i <= QUANTIDADE_NUMEROS; i++) {
			
			int numeroSorteado = (int) Math.round(Math.random() * NUMERO_MAXIMO);
			
			if (!jaFoiSorteado(numeroSorteado) && numeroSorteado != 0) {
				this.numerosSorteados[i-1] = numeroSorteado;
			} else {
				i--;
			}
		}
	}
	
	public void exibirNumeros() {
		
		for (int numeroSorteado : numerosSorteados) {
			System.out.print(numeroSorteado + " ");
		}
		
		System.out.println();
	}
	
	private boolean jaFoiSorteado(int numero) {
		
		boolean resultado = false;
		
		for (int i = 0; i < numerosSorteados.length; i++) {
			if (numerosSorteados[i] == numero) {
				resultado = true;
				break;
			}
		}
	
		return resultado;
	
	}
	
}