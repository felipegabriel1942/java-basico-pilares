package br.com.casacodigo.capitulo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplos {
	public static void main(String[] args) {
		
		//Ordenação de listas
		List<String> nomes = new ArrayList<>();
		nomes.add("Felipe Gabriel");
		nomes.add("Maristela Viana");
		nomes.add("Eduardo Gabriel");
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
	}
}
