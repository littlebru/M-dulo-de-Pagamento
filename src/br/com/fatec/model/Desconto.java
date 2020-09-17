package br.com.fatec.model;

public abstract class Desconto{
	
private double valorDesconto;
	
	public double getValorDesconto() {
		return valorDesconto;
	}
	
	public abstract double valorDesconto(Produto produto);
	
}
