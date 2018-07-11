package br.com.casacodigo.capitulo10;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	private double total;
	private ArrayList<Produto> produtos;
		
	public CarrinhoDeCompras(Produto[] produtos) {
		this.produtos = new ArrayList<>();
	}
		
	public double getTotal() {
		return total;
	}

	public void adiciona(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}
	
	public ArrayList<Produto> getProdutos(){
		return produtos;
	}
	
}
