package br.com.arthurdias;

public class Main {

	public static void main(String[] args) {
		Pato pato = new Pato();
		Aviao aviao = new Aviao();
		SuperHomem superman = new SuperHomem();
		
		Voador[] voadores = {pato, aviao, superman};
		
		TorreDeControle controlador = new TorreDeControle(voadores);
		
		int i = 0;
		do {
			System.out.println("Voo Nº: " + (i+1));
			controlador.voemTodos();
			i++;
		} while (i < 22);
	}

}
