package com.algaworks.geradordecartelasmegasena;

import java.util.Scanner;

public class GerandoJogos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("=================================");
		System.out.println("+ GERADOR DE JOGOS DA MEGA-SENA +");
		System.out.println("=================================");
		
		System.out.println();
		
		System.out.print("Quantos jogos da MEGA-SENA deseja gerar? ");
		int quantidadeJogos = entrada.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < quantidadeJogos; i++) {
			MegaSena megaSena = new MegaSena();
			megaSena.sortear();
			megaSena.exibirNumeros();
		}
		
		System.out.println();
		System.out.println("Boa sorte!!! .. Não esqueça de nós! kkkkkkk");
	}
	
}