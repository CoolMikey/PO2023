package pl.edu.pw.mini.po.zadanieoceniana_2023_1a;

import java.util.Random;

public class Butelka extends ObiektZRodzajem {

	public Butelka() {
		Random rand = new Random();
		
		int rodzaj = rand.nextInt(3);
		this.setWartosc((float) 0.25);
		if(rodzaj == 0) {
			this.setRodzaj("Zwrotna");
			this.setWartosc((float) 0.50);
		} else if(rodzaj == 1) {
			this.setRodzaj("Bezzwrotna");
		} else {
			this.setRodzaj("Brak danych");
		}
	}
	
	@Override
	public int distance() {
		Random rand = new Random();
		return 2+rand.nextInt(3);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "()";
	}

}
