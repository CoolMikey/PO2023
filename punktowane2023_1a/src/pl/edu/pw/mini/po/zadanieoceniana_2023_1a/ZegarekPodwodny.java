package pl.edu.pw.mini.po.zadanieoceniana_2023_1a;

import java.util.Random;

public class ZegarekPodwodny extends Zegarek {

	private boolean dziala;
	
	public ZegarekPodwodny() {
		super();
		Random rand = new Random();
		this.dziala = rand.nextBoolean();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "-*-";
	}

}
