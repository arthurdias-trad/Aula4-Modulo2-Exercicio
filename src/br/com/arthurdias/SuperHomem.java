package br.com.arthurdias;

public class SuperHomem implements Voador {
	
	private int experiencia = 0;
	
	@Override
	public void voar() {
		experiencia += 3;
		System.out.println("Estou voando como um campeão");
	}

}
