package pl.edu.pw.mini.po.punktowane01_a;

import java.util.Random;

public class Larwa extends ZiemnyZMasa {

	public Larwa(int wartoscOdzywcza) {
		this.setWartoscOdzywcza(wartoscOdzywcza);
		Random rand = new Random();
		this.setMasa((float) (2+(rand.nextFloat())/2));
	}
	
	@Override
	public String toString() {
		return "@";
	}

}
