package dowodyZakupow;

import java.util.Objects;

public class Paragon extends PotwierdzenieZakupu {

	private int nrParagonu;
	private boolean czyFiskalny;
	private String nipWystawiajacego;
	
	
	
	public Paragon(int nrParagonu, boolean czyFiskalny, String nipWystawiajacego, String opis, float kwota, String data) {
		super(opis, data, kwota);
		
		this.nrParagonu = nrParagonu;
		this.czyFiskalny = czyFiskalny;
		this.nipWystawiajacego = nipWystawiajacego;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paragon other = (Paragon) obj;
		return nrParagonu == other.nrParagonu;
	}

	
	
}
