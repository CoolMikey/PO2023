package puntkowane_1;

import java.util.Random;

public class Larwa extends ZwierzeZMasa {
	public Larwa(int wartoscOdzywcza) {
		Random rand = new Random();
		this.masa = rand.nextFloat()+2;
		this.wartoscOdzywcza = wartoscOdzywcza;
	}
}
