package uebungsblatt5;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Dozent extends Person {
	private int kostenstelle;
	
	public Dozent(String vorname, String nachname, char geschlecht, int kostenstelle) {
		super(vorname, nachname, geschlecht);
		this.kostenstelle = kostenstelle;
	}

	//parameterloser konstruktor
	public Dozent() {
		System.out.println("Warnung @Dozent");
	}

	@Override
	public String toString() {
		return "Dozent [kostenstelle=" + kostenstelle + ", toString()=" + super.toString() + "]";
	}
	
}
