package br.com.icev.estruturadedados.cotrole;

public class ControleEstoque {
	private Produto[] produtos;

	public ControleEstoque() {
		this.produtos = new Produto[5];
		this.produtos[0] = new Produto("Produto1", 30.0, 6);
		this.produtos[1] = new Produto("Produto2", 30.0, 6);
		this.produtos[2] = new Produto("Produto3", 30.0, 6);
		this.produtos[3] = new Produto("Produto4", 30.0, 6);
		this.produtos[4] = new Produto("Produto5", 30.0, 6);
	}

}
