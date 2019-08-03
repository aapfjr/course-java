package com.algaworks.classemath;

import static java.lang.Math.PI;
import static java.lang.Math.min;

public class TestandoClasseMath {

	public static void main(String[] args) {

		// Exemplo de calculo do comprimento da área 2 x raio * PI (Utilizando uma
		// variável static da classe MATH)
		double raio = 4;
		double comprimentoArea = 2 * raio * PI;
		System.out.println("O comprimento da área = " + comprimentoArea);

		// PULANDO LINHA
		System.out.println();

		// Exemplo de como identificar o menor e maior número! (Utilizando um método da
		// static da classe MATH)
		int numeros[] = { 10, 13 };
		int menor = min(numeros[0], numeros[1]); // importamos como static a função "min", sendo assim não precisamos
													// colocar o "Math".
		int maior = Math.max(numeros[0], numeros[1]); // já este método não deixamos ele como static, por isso tivemos
														// que adicionar o "Math".

		System.out.println("Menor número = " + menor);
		System.out.println("Maior número = " + maior);

		// PULANDO LINHA
		System.out.println();

		// Exemplo de potência .. 5³ (Cinco elevado à 3)
		int numeroPotencia = 5;
		System.out.println("5³ = " + Math.pow(numeroPotencia, 3));

		// PULANDO LINHA
		System.out.println();

		// Calculando Raíz Quadrada de 5, 9, 81
		System.out.println("5 = " + Math.sqrt(5));
		System.out.println("9 = " + Math.sqrt(9));
		System.out.println("81 = " + Math.sqrt(81));

		// PULANDO LINHA
		System.out.println();

		// Somando
		System.out.println("5 + 10 = " + Math.addExact(5, 10));

		// PULANDO LINHA
		System.out.println();
		
		// Gerando um número aleatório!
		double numeroAleatorio = Math.random() * 100;
		System.out.println("Número aleatório = " + numeroAleatorio);
		System.out.println("Arredondando o NÚMERO ALEATÓRIO para o MENOR INTEIRO = " + Math.floor(numeroAleatorio));
		System.out.println("Arredondando o NÚMERO ALEATÓRIO para o MAIOR INTEIRO = " + Math.ceil(numeroAleatorio));
		System.out.println("Arredondando o NÚMERO ALEATÓRIO de DOUBLE para o INTEIRO = " + Math.round(numeroAleatorio));
		
		
		
	}

}