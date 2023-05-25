package pl.edu.pw.mini.po.punktowane01_a;

import java.util.Random;

public class Kret implements MoleMotion{
	
	public enum gatunek {
		cinerea,
		europaea,
		valessiensis
	}

	private int wartoscOdzywcza = 0;
	private ObiektZiemny[][] ogrod;

	public Kret(gatunek gatunek, int watoscOdzywcza, ObiektZiemny[][] ogrod) {
		this.wartoscOdzywcza = wartoscOdzywcza;
		this.ogrod = ogrod;
	}
	


	@Override
	public void goMole() {
		Random rand = new Random();
		int y = rand.nextInt(this.ogrod.length);
		int x = rand.nextInt(this.ogrod[y].length);
		if(this.ogrod[y][x]==null) {
			System.out.println("Pusto :(");
		} else {
			this.wartoscOdzywcza += this.ogrod[y][x].getWartoscOdzywcza();
			System.out.println("Mniam!, " + this.ogrod[y][x].getWartoscOdzywcza() + ", ("+ y +"," + x + ")");
			this.ogrod[y][x] = null;
		}
	}

	@Override
	public String getNutritionalValue() {
		return Integer.toString(this.wartoscOdzywcza);
	}

}
