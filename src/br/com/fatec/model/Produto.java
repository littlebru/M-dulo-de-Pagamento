package br.com.fatec.model;

import br.com.fatec.control.*;

public class Produto {
	private String nome;
	private double valor;
	public ModuloDePagamento calculo;
	
	
	public Produto(String nome, int valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public Produto() {}

	public String getNome() {
		return nome;
	}
	
	public double getValorProduto() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}
