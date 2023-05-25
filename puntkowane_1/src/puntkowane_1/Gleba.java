package puntkowane_1;

import java.util.Random;

public class Gleba extends ObiektZiemny {
	float gestosc;
	public Gleba() {
		Random rand = new Random();
		this.gestosc = rand.nextFloat()+1;
		
	}
}
