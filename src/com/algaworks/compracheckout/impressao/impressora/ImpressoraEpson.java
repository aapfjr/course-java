package com.algaworks.compracheckout.impressao.impressora;

import com.algaworks.compracheckout.impressao.Impressora;
import com.algaworks.compracheckout.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(Imprimivel imprimivel) {
			System.out.println("--------------------------------------------------");
			System.out.println(imprimivel.getCabecalhoPagina());
			System.out.println();
			System.out.println("**************************************************");
			System.out.println(imprimivel.getCorpoPagina());
			System.out.println("**************************************************");
			System.out.println();
			System.out.println("==================================================");
			System.out.println("=====            IMPRESSORA EPSON            =====");
			System.out.println("==================================================");
	}

}
