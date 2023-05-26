package br.com.icev.estruturadedados.cotrole;

public class Eletronicos extends Produto {
	private String tipo;
	private String modelo;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Eletronicos(String nome, double preco, double estoque,String tipo, String modelo) {
		super(nome,preco,estoque);
		this.tipo = tipo;
		this.modelo = modelo;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

}
