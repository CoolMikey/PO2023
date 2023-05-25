package loty;

import java.util.Objects;

public class Lot {

	protected String godzina, idLotu, linia;
	
	
	public Lot(String godzina, String idLotu, String linia) {
		this.godzina = godzina;
		this.idLotu = idLotu;
		this.linia = linia;
	}



	public Lot() {
		
	}
	
	public String getId() {
		return this.idLotu;
	}
	
	

}
