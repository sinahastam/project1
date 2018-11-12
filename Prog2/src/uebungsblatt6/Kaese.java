package uebungsblatt6;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

import java.util.GregorianCalendar;

public class Kaese extends MilchProdukt {
	private final static String NAME = "Kaese";
	
	//parameterloser konstruktor
	public Kaese() {
		System.out.println("Warnung @Kaese");
	}

	public Kaese(double preis, String typ, GregorianCalendar verfallsdatum, double max_lagertemperatur) {
		super(NAME, preis, typ, verfallsdatum, max_lagertemperatur);
	}

	@Override
	public String toString() {
		return "Kaese [toString()=" + super.toString() + "]";
	}

}
