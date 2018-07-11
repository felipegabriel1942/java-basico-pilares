package br.com.casacodigo.capitulo9;


/**
 * Classe abstrata não pode mais ser instanciada
 * Se a classe tiver um metodo abstrato a mesma tambem devera ser abstrata
 * @author pinhe
 *
 */
public abstract class Livro implements Produto{
	
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	private boolean impresso;
	
	public Livro(Autor autor) {
		
		if(autor == null) {
			throw new AutorNuloException("O autor do Livro não pode ser nulo");
		}
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
		this.impresso = true;
	}
	
	public Livro() {
		
	}
	
	void mostrarDetalhes() {
		String mensagem = "Mostrando detalhes do livro ";
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if(this.temAutor()) {
			autor.mostrarDetalhes();
		}
		
		System.out.println("--");
		
	}
	
	@Override
	public int compareTo(Produto outro) {
		
		if(this.getValor() < outro.getValor()) {
			return -1;
		}
		
		if(this.getValor() > outro.getValor()) {
			return 1;
		}
		return 0;
	}
	
	boolean temAutor() {
		return this.autor != null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	
	
}
