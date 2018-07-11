package br.com.casacodigo.capitulo10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestandoPerformance {
	
	public static void main(String[] args) {
		
		
		//Utilizando arrayList
		List<String> colecao = new ArrayList<String>();
		
		for(int i = 0; i < 100000; i++) {
			colecao.add("Item " + i);
		}
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			colecao.contains("Item " + i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		System.out.println("Demorou " + tempo + "MS para executar com List");
		
		
		
		//Utilizando hashSet
		Set<String> colecaoHash = new HashSet<>();
		

		for(int i = 0; i < 100000; i++) {
			colecaoHash.add("Item " + i);
		}
		
		long inicio2 = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			colecaoHash.contains("Item " + i);
		}
		
		long fim2 = System.currentTimeMillis();
		long tempo2 = fim2 - inicio2;
		
		System.out.println("Demorou " + tempo2 + "MS para executar com Hash");
		
	}	
}
