package br.com.fatec.model;

public class Porcentagem extends Desconto{
	
	public double taxaDePorcentagem;

	public Porcentagem (double valorTaxa) {
		this.taxaDePorcentagem = valorTaxa/100;
	}
	
	@Override
	public double valorDesconto(Produto produto) {
		double valorProduto = produto.getValorProduto(); 
		return valorProduto - (valorProduto * taxaDePorcentagem);
	}
	
}
