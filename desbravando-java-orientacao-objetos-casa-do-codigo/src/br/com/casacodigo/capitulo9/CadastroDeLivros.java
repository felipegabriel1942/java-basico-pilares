package br.com.casacodigo.capitulo9;

/**
 * Esse pacote mostra a utilização de metodo
 * e a fora de instanciar metodos em Objetos com
 * instancias diferentes podendo assim a mesma classe java 
 * ser utilizada para representar diferentes livros.
 * @author pinhe
 *
 */
public class CadastroDeLivros {
	
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789.10");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		livro.setAutor(autor);
		
				
		livro.mostrarDetalhes();
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Paulo Silveira");
		outroAutor.setEmail("paulo.silveira@caelum.com.br");
		outroAutor.setCpf("123.456.789.10");
		
		
		Livro outrolivro = new LivroFisico(outroAutor);
		outrolivro.setNome("Lógica de Programação");
		outrolivro.setDescricao("Crie seus primeiros programas");
		outrolivro.setValor(59.90);
		outrolivro.setIsbn("978-85-66250-22-0");
		outrolivro.setAutor(outroAutor);
		
		outrolivro.mostrarDetalhes();
		
		
		
		
	}
}
