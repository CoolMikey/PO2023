package puntkowane_1;

import java.util.Random;

public class Dzdzownica extends ZwierzeZMasa{
	
	static int wartOdzywcza;
	
	public Dzdzownica(int wartOdzywcza) {
		Random rand = new Random();
		this.masa = (float) ((rand.nextFloat()/2)+0.5);
		this.wartOdzywcza = wartOdzywcza;
	}
	
	public void setWartOdzywcza(int wart) {
		this.wartOdzywcza = wart;
	}
}
