package br.com.casacodigo.capitulo10;

/**
 * Colocando a palavra reservada default no inico da declara��o do m�todo de interface ele 
 * consegue assim ter c�digo implementado.
 * Interface com apenas um metodo � chamada de interface funcional
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
