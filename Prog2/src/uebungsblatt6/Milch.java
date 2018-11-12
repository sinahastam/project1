package uebungsblatt6;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

import java.util.GregorianCalendar;

public class Milch extends MilchProdukt {
	private final static String NAME = "Milch";
	
	//parameterlose konstruktor
	public Milch() {
		System.out.println("Warnung @Milch");
	}

	public Milch(double preis, String typ, GregorianCalendar verfallsdatum, double max_lagertemperatur) {
		super(NAME, preis, typ, verfallsdatum, max_lagertemperatur);
	}

	@Override
	public String toString() {
		return "Milch [toString()=" + super.toString() + "]";
	}
	
	
}
