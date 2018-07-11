package br.com.casacodigo.capitulo10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class NovidadesDoJava8 {

	public static void main(String[] args) {

		// Classifcar por nome
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");

		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O.O.");

		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 Prático");

		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");

		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);

		Collections.sort(livros, new ComparadorPorNome());

		// ForEach
		livros.forEach(l -> System.out.println(l.getNome()));

		// Enhanced-for
		/*
		 * for(Livro livro : livros) { System.out.println(livro.getNome()); }
		 */

		System.out.println("-----------------");
		List<Livro> filtrados = new ArrayList<>();

		for (Livro livro : livros) {
			if (livro.getNome().contains("Java")) {
				filtrados.add(livro);
			}
		}

		for (Livro livro : filtrados) {
			System.out.println(livro.getNome());
		}

		System.out.println("-----------------");

		// Filtragem com stream e for each
		Stream<Livro> stream = livros.stream();
		livros.stream().filter(l -> l.getNome().contains("Java")).forEach(l -> System.out.println(l.getNome()));
	}

}
