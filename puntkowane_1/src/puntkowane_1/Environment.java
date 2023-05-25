package puntkowane_1;

import java.util.Random;

public class Environment {

	ObiektZiemny[][] ogrod; 
	final int wartOdzywczaDzdzownicy = 3;
	
	
	public Environment(int m,int n, int liczbaLarw, int liczbaDzdzownic) {
		int liczbaWylosowanych = 0;
		int liczbaWszystkich = liczbaLarw+liczbaDzdzownic;
		Random rand = new Random();
		ogrod = new ObiektZiemny[n][m];
		
		
		while(liczbaWylosowanych<liczbaWszystkich) {
			
			int x = rand.nextInt(m);
			int y = rand.nextInt(n);
			if(ogrod[y][x] == null) { //sprawdza czy pole jest juz wypełnione - jak jest, to nic nie dodaje
				int wybor = rand.nextInt(2);
				if(liczbaWylosowanych < liczbaLarw) {
					ogrod[y][x] = new Larwa(rand.nextInt(3)+3);
					System.out.println("Larwa");
				} else  {
					ogrod[y][x] = new Dzdzownica(wartOdzywczaDzdzownicy);
					System.out.println("Dzdzownica");
				}
				liczbaWylosowanych += 1;
			}
		}
		
		for(int y=0; y<n; y++) {
			for(int x = 0; x<m; x++) {
				if (ogrod[y][x]==null) {
					ogrod[y][x] = new Gleba();					
				}
				
			}
		}
		
		
	}

	public void wypiszOgrod() {
		if (ogrod == null){
			System.out.println(" ");
			return;
		}
		System.out.println("Stan ogrodu:");
		
		Dzdzownica dzdzownica = new Dzdzownica(wartOdzywczaDzdzownicy);
		Larwa larwa = new Larwa(3);
		Gleba gleba = new Gleba();
		
		int n = ogrod.length;
		if (n>0) {
			int m = ogrod[0].length;
			for (int y=0; y<n; y++) {
				for (int x=0; x<m; x++) {
					String wynik = "";
//					ObiektZiemny aktualnaKomorka = ;
//					System.out.println(aktualnaKomorka.getClass().toString());
					if (ogrod[y][x]==null) {
						wynik = " ";
					} else if (ogrod[y][x].getClass().equals(dzdzownica.getClass())) {
						wynik = "{}";
					} else if (ogrod[y][x].getClass().equals(gleba.getClass())) {
						wynik = "#";
					} else if (ogrod[y][x].getClass().equals(larwa.getClass())){
						wynik = "@";
					}  
					System.out.print(wynik);
				}
				System.out.println();
				
			}
			return;
		} else {
			System.out.println(" ");
			return;
		}
		
	}
	
	
	public static void main(String[] args) {
		Environment environment = new Environment(3,3,2,2);
		environment.wypiszOgrod();
	}

}
