package loty;

import java.util.Objects;

public class Przylot extends Lot {
	
	private String skad;
	private boolean wyladowal;
	private int nrWyjscia;

	public Przylot(String godzina, String skad, String idLotu, String linia, boolean wyladowal, int nrWyjscia) {
		super(godzina, idLotu, linia);
		this.skad = skad;
		this.wyladowal = wyladowal;
		this.nrWyjscia = nrWyjscia;
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
