package uebungsblatt5;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Person {
	private String nachname;
	private String vorname;
	private char geschlecht;
	
	public Person(String vorname, String nachname, char geschlecht) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geschlecht = geschlecht;
	}

	//parameterloser konstruktor
	public Person() {
		System.out.println("Warnung @Person");
	}
	
	//getter nachname
	public String getNachname() {
		return nachname;
	}
	
	//getter geschlecht
	public char getGeschlecht() {
		return geschlecht;
	}

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", geschlecht=" + geschlecht + "]";
	}
	
}
