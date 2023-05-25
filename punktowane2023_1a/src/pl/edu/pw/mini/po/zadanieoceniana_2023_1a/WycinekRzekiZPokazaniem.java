package pl.edu.pw.mini.po.zadanieoceniana_2023_1a;

public class WycinekRzekiZPokazaniem extends WycinekRzeki {

	public WycinekRzekiZPokazaniem(int szerokosc, int dlugosc) throws Exception {
		super(szerokosc, dlugosc);
	}
	
	@Override
	public void moveAll() {
		super.moveAll();
		String wynik = "";
		for(int y = 0; y<this.obrazDna.length; y++) {
			for(int x = 0; x<this.obrazDna[0].length; x++) {
				if(this.obrazDna[y][x] != null) {
					wynik += this.obrazDna[y][x];
				} else {
					wynik += " ";
				}
			}
			wynik += "\n";
		}
		System.out.println(wynik);
	}

}
