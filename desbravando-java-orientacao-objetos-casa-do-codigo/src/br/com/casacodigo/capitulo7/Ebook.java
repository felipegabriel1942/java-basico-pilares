package br.com.casacodigo.capitulo7;

public class Ebook extends Livro implements Promocional{
	
	private String marcaDagua;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	
	
	public String getMarcaDagua() {
		return marcaDagua;
	}

	public void setMarcaDagua(String marcaDagua) {
		this.marcaDagua = marcaDagua;
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}
		this.setValor(this.getValor() - (this.getValor() * porcentagem));
		return true;
	}
	
	
	
	
}
