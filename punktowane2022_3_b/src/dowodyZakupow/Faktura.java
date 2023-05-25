package dowodyZakupow;

import java.util.Objects;

public class Faktura extends PotwierdzenieZakupu {

	private String idFaktury, nip;
	private float kwota, kwotaVat;
	
	
	public Faktura(String idFaktury, String nip, String opis, float kwota, float kwotaVat, String data) {
		super(opis, data, kwota);
		this.idFaktury = idFaktury;
		this.nip = nip;
		this.kwota = kwota;
		this.kwotaVat = kwotaVat;
		
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faktura other = (Faktura) obj;
		return Objects.equals(idFaktury, other.idFaktury);
	}

	
	
}
