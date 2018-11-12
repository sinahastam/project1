package uebungsblatt6;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Toilettenpapier extends Warensorte {
	private final static String NAME = "Toilettenpaier";
	
	//parameterloser konstruktor
	public Toilettenpapier() {
		System.out.println("Warnung @Toilettenpapier");
	}

	public Toilettenpapier(double preis, String typ) {
		super(NAME, preis, typ);
	}

	@Override
	public String toString() {
		return "Toilettenpapier [toString()=" + super.toString() + "]";
	}

}
