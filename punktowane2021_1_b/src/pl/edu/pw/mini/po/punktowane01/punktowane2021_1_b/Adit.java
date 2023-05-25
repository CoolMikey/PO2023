package pl.edu.pw.mini.po.punktowane01.punktowane2021_1_b;

import java.util.Random;

public class Adit {

	Skala[][] szyb;
	
	public Adit(int maxDystansMiedzyKorytarzami, int dlKorytarzy, int iloscKorytarzy) {
		this.szyb = new Skala[maxDystansMiedzyKorytarzami*iloscKorytarzy+1][]; 
		Random rand = new Random();
		int glebokoscOstatniegoSzybu = 0;
		for(int i=0; i<iloscKorytarzy; i++) {
			int odleglosc = rand.nextInt(maxDystansMiedzyKorytarzami) + 1;
			glebokoscOstatniegoSzybu += odleglosc;
			for(int x=0; x<dlKorytarzy; x++) {
				float wart = rand.nextFloat();
				if(wart<0.7) {
					this.szyb[glebokoscOstatniegoSzybu][x] = new Skala();
				} else if(wart<0.9) {
					this.szyb[glebokoscOstatniegoSzybu][x] = new Chalkolit(50);
				} else {
					this.szyb[glebokoscOstatniegoSzybu][x] = new Uraninit(50);
				}
			}
		}
	}
	
	public void wypiszStrukture() {
		String wynik ="";
		for(int i = 0; i<this.szyb.length; i++) {
			if(this.szyb[i] != null) {
				wynik = wynik + "->";
				for(int x = 0; x<this.szyb[i].length; x++) {
					wynik = wynik + this.szyb[i][x];
				}
				
			} else {
				wynik += " ";
			}
			wynik = wynik + "\n";
		}
		System.out.println(wynik);
	}
	
	
	

}
