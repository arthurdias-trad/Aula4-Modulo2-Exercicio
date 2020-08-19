package br.com.arthurdias;

public class Pato implements Voador {

	private int energia = 100;
	
	@Override
	public void voar() {
		if (energia >= 5) {
			energia -= 5;
			System.out.println("Estou voando como um pato");
		} else {
			System.out.println("Não tenho energia suficiente para voar");
		}
	}

}
