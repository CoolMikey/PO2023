package pl.edu.pw.mini.po.zadanieoceniana_2023_1a;

import java.util.Random;

public class But extends ObiektZRodzajem {

	public But() {
		this.setWartosc(0);
		this.setRodzaj("Kalosz");
	}

	
	@Override
	public int distance() {
		Random rand = new Random();
		return 2+rand.nextInt(2);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "@";
	}
}
