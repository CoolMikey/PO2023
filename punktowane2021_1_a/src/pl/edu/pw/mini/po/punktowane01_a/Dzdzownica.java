package pl.edu.pw.mini.po.punktowane01_a;

import java.util.Random;

public class Dzdzownica extends ZiemnyZMasa{

	public Dzdzownica(int wartoscOdzywcza) {
		this.setWartoscOdzywcza(wartoscOdzywcza);
		Random rand = new Random();
		this.setMasa((float) (0.5+(rand.nextFloat())/2));
	}
	
	@Override
	public String toString() {
		return "{}";
	}

}
