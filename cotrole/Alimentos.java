package br.com.icev.estruturadedados.cotrole;

public class Alimentos extends Produto{

	public Alimentos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alimentos(String nome, double preco, double estoque) {
		super(nome, preco, estoque);
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		// TODO Auto-generated constructor stub
	}

}
