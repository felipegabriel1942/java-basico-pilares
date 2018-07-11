package br.com.casacodigo.capitulo10;

import java.util.Comparator;

public class ComparadorPorNome implements Comparator<Livro>{

	@Override
	public int compare(Livro l1, Livro l2) {
		return l1.getNome().compareTo(l2.getNome());
	}
	
	

}
