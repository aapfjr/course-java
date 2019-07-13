package com.algaworks.classesabstratas;

public class PrincipalClassesAbstratas {

	public static void main(String[] args) {
		
		Produto produtoP = new ProdutoPerecivel();
		produtoP.setDescricao("Bolo de Banana");

		ProdutoPerecivel pp = (ProdutoPerecivel) produtoP;
		pp.setDataFabricacao("07/07/2019");
		pp.setDataValidade("13/07/2019");
		
		produtoP.imprimirDescricaoProduto();
		System.out.println();
		
		// ------------------------------------------------------------
		
		Produto produtoI = new ProdutoIndustrializado();
		produtoI.setDescricao("Milho Verde");
		ProdutoIndustrializado pi = (ProdutoIndustrializado) produtoI;
		pi.setEnlatado(true);
		
		produtoI.imprimirDescricaoProduto();
	
	}
	
}