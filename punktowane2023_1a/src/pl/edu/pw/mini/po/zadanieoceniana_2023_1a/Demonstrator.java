package pl.edu.pw.mini.po.zadanieoceniana_2023_1a;

public class Demonstrator {

	public Demonstrator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		WycinekRzekiZPokazaniem wycinekRzeki1 = new WycinekRzekiZPokazaniem(10, 100);
		for(int i=0; i<10; i++) {
			wycinekRzeki1.moveAll();
		}

	}

}
