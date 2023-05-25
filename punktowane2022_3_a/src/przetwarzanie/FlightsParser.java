package przetwarzanie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import loty.Lot;
import loty.Odlot;
import loty.Przylot;
import loty.Statusy;
import pl.edu.pw.mini.po.files.a.FirstClass;

public class FlightsParser {

	public FlightsParser() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Lot> parseFlights(String nazwaPliku) throws BladDanychException {

		String currentWorkingDirectory = System.getProperty("user.dir");
		String filePath = currentWorkingDirectory + File.separator + nazwaPliku;
		
		
		
		InputStream inputStream = FlightsProcessor.class.getResourceAsStream(filePath);
		
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {

		    BufferedReader reader = new BufferedReader(new FileReader(filePath));
		    System.out.println(reader.lines());
		    String linijka;
		    while((linijka = reader.readLine()) != null){
		    	Scanner scanner = new Scanner(linijka);
		    	System.out.println("Linijka " + linijka);
			    scanner.useDelimiter("###");
			    int ktoreDane = 0;
			    List<String> dane = new ArrayList<String>();
			    boolean puste = true;
			    while(scanner.hasNext()) {
			    	dane.add(scanner.next());
			    	puste = false;
			    }
			    if(puste) {
			    	throw new BladDanychException("Błąd w danych");
			    }
			    
			    if(dane.size() == 0) {
			    	throw new BladDanychException("Cos nie tak z liczba danych");
			    }
			    System.out.println(dane.toString());
			    System.out.println(dane.get(0).equals("O"));
			    Lot lot = new Lot();
			    if(dane.get(0).equals("O")) {
			    	if(dane.size()!= 7) {
			    		throw new BladDanychException("Zla liczba danych");
			    	}
			    	Scanner scanner2 = new Scanner(dane.get(6));
			    	scanner2.useDelimiter("-");
			    	int start = scanner2.nextInt();
			    	int stop = scanner2.nextInt();
			    	if(start< stop) {
			    		throw new BladDanychException("Ostatnia bramka mniejsza od pierwszej");
			    	}
			    	lot = new Odlot(dane.get(1), dane.get(2), dane.get(3), dane.get(4),Statusy.valueOf(dane.get(5)), start, stop);
			    	
			    	
			    } else if(dane.get(0).equals("P")) {
			    	if(dane.size() != 7) {
			    		throw new BladDanychException("Zla liczba danych");
			    	}
			    	
			    	lot = new Przylot(dane.get(1), dane.get(2),dane.get(3),dane.get(4),Boolean.parseBoolean(dane.get(5)), Integer.parseInt(dane.get(6)));
			    	
			    } else {
			    	throw new BladDanychException("Jakas inna pierwsza literka");
			    }
			    
			    
			    
			    reader.close();
		    }
		    
		} catch (IOException e) {
		    System.out.println("Błąd");
		    e.printStackTrace();
		}
		System.out.print("skonczylem");
		return null;
	}

	public static void main(String[] args) {
		FlightsParser fp = new FlightsParser();
		try {
			fp.parseFlights("loty.txt");
		} catch (BladDanychException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
