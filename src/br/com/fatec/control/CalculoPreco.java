package br.com.fatec.control;

import br.com.fatec.model.*;

public class CalculoPreco{
	
private Desconto desconto;
	
	public void valorComDesconto(int taxaDeDesconto, Produto produto) {
		
		// definindo o retorno do valor de desconto no formato de porcentagem
		desconto = new Porcentagem(taxaDeDesconto);
				
		produto.setValor(desconto.valorDesconto(produto)); 
				
	}
	
	public void valorSemDesconto(double valor, Produto produto) {
		produto.setValor(valor);
	}
}
