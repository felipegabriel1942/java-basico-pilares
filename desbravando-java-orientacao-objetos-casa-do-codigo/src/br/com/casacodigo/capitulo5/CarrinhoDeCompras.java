package br.com.casacodigo.capitulo5;

public class CarrinhoDeCompras {
	private double total;
	
	public void adiciona(Livro livro) {
		System.out.println("Adicionando: " + livro);
		livro.aplicaDescontoDe(0.05);
		this.total += livro.getValor();
	}
	
	public double getTotal() {
		return total;
	}
	
}
