package br.com.icev.estruturadedados.cotrole;

public class Roupas extends Produto{
	public String genero;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Roupas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roupas(String nome, double preco, double estoque,String genero) {
		super(nome, preco, estoque);
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		this.genero = genero;
		// TODO Auto-generated constructor stub
	}
	

}
