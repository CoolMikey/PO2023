package pl.edu.pw.mini.po.punktowane01_a;

import java.util.Random;

import pl.edu.pw.mini.po.punktowane01_a.Kret.gatunek;

public class Environment {

	private ObiektZiemny[][] ogrod;
	private static int wartoscOdzywczaDzdzownicy=3;
	private MoleMotion moleMotion;
	
	public Environment(int m,int n,int iloscLarw, int iloscDzdzownic) {
		Random rand = new Random();
		int liczbaDoUzupelnieniaLarw = iloscLarw;
		int liczbaDoUzupelnieniaDzdzownic = iloscDzdzownic;
		this.ogrod = new ObiektZiemny[m][n];
		while(liczbaDoUzupelnieniaLarw>0 || liczbaDoUzupelnieniaDzdzownic>0) {
			int x = rand.nextInt(m);
			int y = rand.nextInt(n);
			if(this.ogrod == null || this.ogrod[y] == null || this.ogrod[y][x] == null) {
				if(liczbaDoUzupelnieniaLarw>0) {
					this.ogrod[y][x] = new Larwa(3+rand.nextInt(3));
					liczbaDoUzupelnieniaLarw -= 1;
				} else if(liczbaDoUzupelnieniaDzdzownic > 0) {
					this.ogrod[y][x] = new Dzdzownica(this.wartoscOdzywczaDzdzownicy);
					liczbaDoUzupelnieniaDzdzownic -= 1;
				}
				
			}
		}
		
		for(int y=0; y<m; y++) {
			for(int x=0; x<n; x++) {
				if(this.ogrod[y][x] == null) {
					this.ogrod[y][x] = new Gleba(0);
				}
			}
		}
	}
	
	public Environment(int m,int n,int iloscLarw, int iloscDzdzownic, gatunek species) {
		this(m, n, iloscLarw, iloscDzdzownic);
		this.moleMotion = new Kret(species, 0, this.ogrod);
	}
	
	public void pokazOgrod() {
		String wynik = "";
		for(int y=0; y<this.ogrod.length; y++) {
			for(int x=0; x<this.ogrod[y].length; x++) {
				if(this.ogrod[y][x] != null) {
					wynik += this.ogrod[y][x];
				} else {
					wynik += " ";
				}
			}
			wynik += "\n";
		}
		System.out.println(wynik);
		
	}
	
	public void runMole() {
		for(int i=0; i<10; i++) {
			this.moleMotion.goMole();
			this.pokazOgrod();
		}
	}
	

}
