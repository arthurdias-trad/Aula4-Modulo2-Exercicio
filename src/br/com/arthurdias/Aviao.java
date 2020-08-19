package br.com.arthurdias;

public class Aviao implements Voador {
	
	private long horasDeVoo = 0l;
	
	@Override
	public void voar() {
		this.horasDeVoo += 13;
		System.out.printf("Estou voando como um avião, e tenho %d horas de voo\n", this.horasDeVoo);
	}
}
