package br.com.fatec.app;

import br.com.fatec.control.*;
import br.com.fatec.model.Produto;


public class App {

	public static void main(String[] args) {

		  ModuloDePagamento pagm;
		  Produto produto;
	      
		  produto = new Produto("Produto 1", 1200);
		  pagm = new ModuloDePagamento();
	      pagm.valorTotal("desconto", produto);
	      
	      pagm = new ModuloDePagamento();
	      produto = new Produto("Produto 2", 200);
	      pagm.valorTotal("", produto);
	      
	  }
}
