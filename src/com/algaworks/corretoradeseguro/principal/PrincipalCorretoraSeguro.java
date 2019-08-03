package com.algaworks.corretoradeseguro.principal;

import com.algaworks.corretoradeseguro.CorretoraSeguro;
import com.algaworks.corretoradeseguro.objetos.Barco;
import com.algaworks.corretoradeseguro.objetos.Carro;
import com.algaworks.corretoradeseguro.objetos.Imovel;
import com.algaworks.corretoradeseguro.objetos.Notebook;

public class PrincipalCorretoraSeguro {

	public static void main(String[] args) {

		Barco barco = new Barco("Véi do Rio", 16500);
		CorretoraSeguro corretoraSeguro = new CorretoraSeguro();
		corretoraSeguro.fazerPropostaSeguro(barco);

		Carro carro = new Carro("Corsa Hatch", "AJR-1313", 21500);
		corretoraSeguro.fazerPropostaSeguro(carro);

		Imovel imovel = new Imovel("My house Ferreira's", 12, 160000);
		corretoraSeguro.fazerPropostaSeguro(imovel);
		
		Notebook notebook = new Notebook("Inspiron", "Dell", 2500);
		corretoraSeguro.fazerPropostaSeguro(notebook);
	}

}