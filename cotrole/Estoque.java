package br.com.icev.estruturadedados.cotrole;

public class Estoque {

	private Produto[] produtos;

	public double calculaValorEstoque() {
		double valorTotal = 0;

		for (int i = 0; i < produtos.length; i++) {
			Produto p = produtos[i];
			double valorParcial = p.getEstoque() * p.getPreco();
			valorTotal += valorParcial;
		}
		return valorTotal;
	}
}
