package pl.edu.pw.mini.po.zadanieoceniana_2023_1a;

import java.lang.Exception;
import java.util.Random;

public class WycinekRzeki {

	ObiektZWartoscia[][] obrazDna;
	
	public WycinekRzeki(int szerokosc, int dlugosc) throws Exception {
		if(szerokosc < 1 | szerokosc >100 | dlugosc <1 | dlugosc > 100) {
			throw new Exception("Niepoprawne parametry wykonania, koniec wykonania");
		}
		this.obrazDna = new ObiektZWartoscia[szerokosc][dlugosc];
		Random rand = new Random();
		for(int y = szerokosc-1; y>1; y--) {
			for(int x = dlugosc-1; x>1; x--) {
				if(rand.nextFloat()<0.1) {
					int obiekt = rand.nextInt(5);
					if(obiekt == 0) {
						this.obrazDna[y][x] = new Moneta();						
					} else if(obiekt == 1) {
						this.obrazDna[y][x] = new Zegarek();						
					} else if(obiekt == 2) {
						this.obrazDna[y][x] = new ZegarekPodwodny();						
					} else if(obiekt == 3) {
						this.obrazDna[y][x] = new Butelka();						
					} else  {
						this.obrazDna[y][x] = new But();						
					}
					 
				}				
			}
		}
	}
	
	public void moveAll(){
		for(int y = 0; y<this.obrazDna.length; y++) {
			for(int x = 0; x<this.obrazDna[0].length; x++) {
				if(this.obrazDna[y][x]!=null) {
					int odleglosc = this.obrazDna[y][x].distance();
					int nowy_x =  x + odleglosc;
					if(nowy_x<this.obrazDna[0].length) {
						if(this.obrazDna[y][nowy_x] == null) {
							this.obrazDna[y][nowy_x] = this.obrazDna[y][x];
							this.obrazDna[y][x] = null;
						}
					} else { //obiekt przesunal sie poza nasze pole widzenia
						this.obrazDna[y][x] = null;
					}
				}
				
			}
		}
	}

}
