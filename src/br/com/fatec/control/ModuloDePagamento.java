package br.com.fatec.control;

import br.com.fatec.model.*;

public class ModuloDePagamento {
	
	private CalculoPreco cp;
	private Leitor leitor = new Leitor();
	int taxa;
	boolean desconto = true;
	
	public void valorTotal(String tipoDePreco, Produto produto) {
		cp = new CalculoPreco();
		double valor = produto.getValorProduto();
		
		if(tipoDePreco.equals("desconto")) {
			System.out.print("\nDesconto de (%): ");
			taxa = leitor.getValor();
			
			cp.valorComDesconto(taxa, produto);
		}
		else{
			cp.valorSemDesconto(valor, produto);
			desconto = false;
		}
		
		imprimeValorTotal(valor, produto);
	}
	
	public void imprimeValorTotal(double valor, Produto produto) {
		
		System.out.println("------------- NOTA FISCAL --------------\n");
		System.out.println("   Produto: " + produto.getNome());
		System.out.println("   Preco: R$ " + valor);
		if (desconto == true) {
			System.out.println("   Desconto: " + this.taxa + "%");

		}else {
			System.out.println("   Produto Sem Desconto!");

		}
		
		System.out.println("-----------------------------------------\n");
		System.out.println("   Total à Pagar: R$ "+ produto.getValorProduto());
		System.out.println("-----------------------------------------\n");
	}
}
