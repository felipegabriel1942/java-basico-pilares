package br.com.casacodigo.capitulo3;

public class Autor {
	
	String nome;
	String cpf;
	String email;
	
	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do autor ");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
	}
	
	
}
