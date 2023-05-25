package pl.edu.pw.mini.po.zadanieoceniana_2023_1a;

import java.util.Random;

public class Zegarek extends BlyszczacyObiekt {
	
	protected static int ostatniNumerSeryjny = 10;
	private int numerSeryjny;

	public Zegarek() {
		this.numerSeryjny = ostatniNumerSeryjny;
		this.ostatniNumerSeryjny += 10;
		Random rand = new Random();
		float wart = 20000+rand.nextInt(5001)/100;
		this.setWartosc(wart);
		this.setPolysk(rand.nextBoolean());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "*";
	}

}
