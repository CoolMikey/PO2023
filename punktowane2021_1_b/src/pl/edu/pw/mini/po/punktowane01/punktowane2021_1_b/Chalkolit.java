package pl.edu.pw.mini.po.punktowane01.punktowane2021_1_b;

import java.util.Random;

public class Chalkolit extends SkalaRadioaktywna {

	public Chalkolit(float wartoscRynkowa) {
		Random rand = new Random();
		this.setRadioaktywnosc(700+rand.nextInt(251));
		this.setWartoscRynkowa(wartoscRynkowa);
	}

}
