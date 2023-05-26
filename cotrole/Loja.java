package br.com.icev.estruturadedados.cotrole;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja{
	Scanner input = new Scanner(System.in);
	
	ArrayList<Produto> produtos = new ArrayList<>();
	
	public void ExibeMenu() {
		System.out.println("\t Escolha uma das opções abaixo:");
		System.out.println("1 - Registrar produto\n2 - Editar produto\n3 - excluir produto");
	}
	
	public void CriarProduto() {
		System.out.println("Digite o n´mero correspondete a categoria do produto:\n1 - Eletrônico"
				+ "\n2 - Alimento \n3 - Roupa");
		int tipoProduto = input.nextInt();
		
		System.out.println("Digite o nome do produto:");
		String nomeProduto = input.nextLine();
		
		System.out.println("Digite o preço do produto:");
		double precoProduto = input.nextDouble();
		
		System.out.println("Digite a quantidade de produtos:");
		double quantidadeProduto =input.nextDouble();
		
		
		if(tipoProduto == 1) {
			System.out.println("Digite o tipo de Eletronico(ex: smartphone, TV...):");
			String tipoEletronico = input.nextLine();
			System.out.println("");
			String modeloEletronico = input.nextLine();
			Eletronicos novoProduto = new Eletronicos(nomeProduto,precoProduto,quantidadeProduto,
					tipoEletronico,modeloEletronico);
			produtos.add(novoProduto);
		}
		else if (tipoProduto == 2) {
			System.out.println("");
			
		}
		else if (tipoProduto == 3) {
			
		}
	}
	public void EditarProduto() {
		
	}
	public void ExluirProduto() {
	
	}
}