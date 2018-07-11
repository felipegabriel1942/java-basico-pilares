package br.com.casacodigo.capitulo9;
/**
 * Atraves desta inteface � possivel acessar metodos em classes que implementam
 * esta interface.
 * Interface com apenas um metodo � chamada de interface funcional
 * @author pinhe
 *
 */
public interface Produto extends Comparable<Produto>{
	
	public abstract double getValor();
}
