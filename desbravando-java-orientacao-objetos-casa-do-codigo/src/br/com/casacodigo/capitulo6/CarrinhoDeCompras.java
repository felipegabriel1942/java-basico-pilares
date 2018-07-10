package br.com.casacodigo.capitulo6;

public class CarrinhoDeCompras {
	private double total;
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		this.total += produto.getValor();
	}
		
	public double getTotal() {
		return total;
	}
	
}
