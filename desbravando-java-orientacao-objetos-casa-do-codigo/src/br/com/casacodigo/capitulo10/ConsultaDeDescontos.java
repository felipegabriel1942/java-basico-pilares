package br.com.casacodigo.capitulo10;

public class ConsultaDeDescontos {
	
	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		Double desconto = gerenciador.validaCupom("cab11");
		
		if(desconto != null) {
			System.out.println("Cupom de desconto v�lido.");
			System.out.println("Valor " + desconto);
		} else {
			System.out.println("Esse cupom n�o existe.");
		}
	}
}
