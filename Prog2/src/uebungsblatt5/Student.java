package uebungsblatt5;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Student extends Person {
	private int matrikelnummer;
	
	public Student(String vorname, String nachname, char geschlecht, int matrikelnummer) {
		super(vorname, nachname, geschlecht);
		this.matrikelnummer = matrikelnummer;
	}

	//parameterloser konstruktor
	public Student() {
		System.out.println("Warnung @Student");
	}

	@Override
	public String toString() {
		return "Student [matrikelnummer=" + matrikelnummer + ", toString()=" + super.toString() + "]";
	}
	
}
