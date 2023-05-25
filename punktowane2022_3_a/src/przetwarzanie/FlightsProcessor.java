package przetwarzanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import loty.Lot;
import loty.Przylot;

public class FlightsProcessor {

	List<Lot> allFlights;
	
	public FlightsProcessor(List<Lot> allFlights) {
		this.allFlights = allFlights;
	}

	public List<Przylot> getExpectedArrivals(){
		List<Przylot> wynik = new ArrayList<Przylot>();
		for(int i = 0; i < this.allFlights.size(); i++) {
			if(this.allFlights.get(i) instanceof Przylot) {
				wynik.add((Przylot) this.allFlights.get(i));
			}
		}
		return wynik;
	}
	
	public List<Lot> getFlightsOrdered() {
        List<Lot> flightsOrdered = new ArrayList<>(allFlights);
        Collections.sort(flightsOrdered, (f1, f2) -> f1.getId().compareTo(f2.getId()));
        return flightsOrdered;
    }
	
}
