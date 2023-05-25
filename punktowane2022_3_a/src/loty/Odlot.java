package loty;

import java.util.Objects;

public class Odlot extends Lot {
	
	
	private Statusy status;
	private int nrWyjscia, nrWyjsciaStop;

	public Odlot(String godzina, String dokad, String idLotu, String linia, Statusy status, int nrWyjsciaStart, int nrWyjsciaStop) {
		super(godzina, idLotu, linia);
		this.status = status;
		this.nrWyjscia = nrWyjsciaStart;
		this.nrWyjsciaStop = nrWyjsciaStop;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lot other = (Lot) obj;
		return Objects.equals(idLotu, other.idLotu);
	}
	
}
