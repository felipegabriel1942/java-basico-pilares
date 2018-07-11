package br.com.casacodigo.capitulo10;

/**
 * Colocando a palavra reservada default no inico da declaração do método de interface ele 
 * consegue assim ter código implementado.
 * Interface com apenas um metodo é chamada de interface funcional
 * @author pinhe
 *
 */
@FunctionalInterface
public interface Promocional {
	
	boolean aplicaDescontoDe(double porcentagem);
	
	default boolean aplicaDescontoDe10Porcento() {
		return aplicaDescontoDe(0.2);
	}
}
