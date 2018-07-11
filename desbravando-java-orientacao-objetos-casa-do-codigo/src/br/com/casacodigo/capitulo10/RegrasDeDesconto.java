package br.com.casacodigo.capitulo10;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");

		Livro livro = new MiniLivro(autor);
		livro.setValor(39.90);

		System.out.println("Valor atual: " + livro.getValor());

		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if (!ebook.aplicaDescontoDe(0.15)) {
			System.out.println("Desconto no ebook não pode ser maior do que 15%");
		} else {
			System.out.println("Valor do ebook com descontro: " + ebook.getValor());

		}

	}

}
