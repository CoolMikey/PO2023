package pl.edu.pw.mini.po.zadanieoceniana_2023_1a;

import java.util.Random;

public class Moneta extends BlyszczacyObiekt {

	public Moneta() {
		Random rand = new Random();
		float wart = 1+rand.nextInt(5000);
		this.setWartosc(wart);
		this.setPolysk(rand.nextBoolean());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "O";
	}
}
