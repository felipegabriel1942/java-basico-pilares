package br.com.casacodigo.capitulo9;

public class Operacoes {
	
	public static void main(String[] args) {
		
		long round = Math.round(3.99);
		long max = Math.max(100,10);
		int min = Math.min(100,10);
		int abs = Math.abs(-5);
		double sqrt = Math.sqrt(4);
		
		System.out.println("Arredondar: " + round);
		System.out.println("Maximo: " + max);
		System.out.println("Minimo: " + min);
		System.out.println("Negativo para positivo: " + abs);
		System.out.println("Raíz quadrada: " + sqrt);
	}
}
