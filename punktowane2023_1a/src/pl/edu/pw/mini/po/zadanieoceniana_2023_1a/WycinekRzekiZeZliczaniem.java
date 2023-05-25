package pl.edu.pw.mini.po.zadanieoceniana_2023_1a;

public class WycinekRzekiZeZliczaniem extends WycinekRzeki {
	
	private int przesuniecia;

	public WycinekRzekiZeZliczaniem(int szerokosc, int dlugosc) throws Exception {
		super(szerokosc, dlugosc);
		this.przesuniecia = 0;
		
	}
	
	@Override
	public void moveAll() {
		super.moveAll();
		this.przesuniecia += 1;
	}
	
	public int getIloscWywolan() {
		return this.przesuniecia;
	}

}
