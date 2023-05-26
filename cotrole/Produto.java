package br.com.icev.estruturadedados.cotrole;

public class Produto extends Object {

	protected String nome;
	protected double preco;
	protected double estoque;
	
	public Produto() {
		super();
	}

	public Produto(String nome, double preco, double estoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public void vender(double quantidade) {
		if(this.getEstoque()>= quantidade) {
			double novoEstoque = this.estoque-quantidade;
			this.setEstoque(novoEstoque);
		}
	}
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getEstoque() {
		return this.estoque;
	}

	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}
}
