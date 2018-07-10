package br.com.casacodigo.capitulo5;

public class LivroFisico extends Livro{
	
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
}
