package pl.edu.pw.mini.po.punktowane01_a;

import java.util.Random;

public class Gleba extends ObiektZiemny {

	float gestosc;
	
	public Gleba(int wartoscOdzywcza) {
		this.setWartoscOdzywcza(wartoscOdzywcza);
		Random rand = new Random();
		this.gestosc = (float)1.4+rand.nextFloat();
		
	}
	
	@Override
	public String toString() {
		return "#";
	}

}
