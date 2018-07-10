package br.com.casacodigo.capitulo5;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");

		Livro livro = new Livro();
		livro.setValor(59.90);

		System.out.println("Valor atual: " + livro.getValor());

		if (!livro.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto n�o pode ser maior do que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.getValor());
		}

		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if (!ebook.aplicaDescontoDe(0.15)) {
			System.out.println("Desconto no ebook n�o pode ser maior do que 15%");
		} else {
			System.out.println("Valor do ebook com descontro: " + ebook.getValor());

		}

	}

}
