package przetwarzacze;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

import dowodyZakupow.Faktura;
import dowodyZakupow.Paragon;
import dowodyZakupow.PotwierdzenieZakupu;

public class AccountingProofParser {
	

	public AccountingProofParser() {
		
	}
	
	public Set<PotwierdzenieZakupu> parseAccountingProofs(String fileName) throws BladDanychException, FileNotFoundException, IOException{
		
		Set<PotwierdzenieZakupu> dowody = new HashSet<>();
		
		LocalDate currentDate = LocalDate.now();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String linijka;
			while ((linijka = br.readLine())!= null) {
				String[] parts = linijka.split("---");
				if (parts.length == 6) {
					
					String pierwszaDana = parts[0];
					if(!pierwszaDana.contains("/")) {
						int nrParagonu = Integer.parseInt(pierwszaDana);
						boolean czyFiskalny = Boolean.parseBoolean(parts[1]);
						String nipWystawiajacego = parts[2];
						String opis = parts[3];
						float kwota = Float.parseFloat(parts[4]);
						String data = parts[5];
						
						LocalDate dataPoprawnie = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
						if (dataPoprawnie.isAfter(currentDate)) {
							throw new BladDanychException("Data niepoprawna!");
						}
						Paragon paragon = new Paragon(nrParagonu, czyFiskalny, nipWystawiajacego, opis, kwota, data);
						dowody.add(paragon);
					} else { //faktura
						String idFaktury = parts[0];
						String nip = parts[1];
						String opis = parts[2];
						float kwota = Float.parseFloat(parts[3]]);
						float kwotaVAT = Float.parseFloat(parts[4]);
						String data = parts[5];
						
						LocalDate dataPoprawnie = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
						if (dataPoprawnie.isAfter(currentDate)) {
							throw new BladDanychException("Data niepoprawna!");
						}
						
						Faktura faktura = new Faktura(idFaktury, nip, opis, kwota, kwotaVAT, data);
						dowody.add(faktura);
					}
					
					
				} else {
					throw new BladDanychException("Cos nie tak z liczba danych w linijce");
				}
			}
		} 
		return dowody;
	}

}
